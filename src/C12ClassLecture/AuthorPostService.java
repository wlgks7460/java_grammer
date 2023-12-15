package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1)회원가입
//2)게시글 작성
//3)회원목록조회 : 회원 email을 출력
//4)회원상세조회 : 아이디로 찾기 ,회원명, 회원 email, 회원 작성 글수
//5)게시글 상시조회 : 제목, 작성자 email 주소
public class AuthorPostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.회원가입 2.게시글작성 3.회원목록조회 4.회원상세조회 5.게시글상세조회");
            int number =Integer.parseInt(sc.nextLine());

            switch (number){
                case 1 :
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();
                    Author author1 = new Author(name, email, password);
                    authors.add(author1);
                    break;
                case 2 :
                    System.out.println("이메일을 입력해주세요.");
                    String input_email = sc.nextLine();
                    Author temp_author = null;
                    for(Author a : authors) {
                        if (a.getEmail().equals(input_email)){
                            temp_author = a;
                            System.out.println("글 제목을 입력해주세요.");
                            String title = sc.nextLine();
                            System.out.println("내용 입력해주세요.");
                            String contents = sc.nextLine();
                            Post post1 = new Post(title, contents, a);
                            posts.add(post1);
                        } else {
                            System.out.println("회원가입부터 하시오");
                        }
                    }
                    break;
                case 3 :
                    for(Author a : authors){
                        System.out.println(a.getEmail());
                    }
                    break;
                case 4 :
                    //4)회원상세조회 : 아이디로 찾기 ,회원명, 회원 email, 회원 작성 글수
                        System.out.println("author email를 입력해주세요.");
                        String author_email2 = sc.nextLine();
                        Author temp_author2 = null;
                        for(Author a : authors){
                            if(a.getEmail().equals(author_email2)){
                                temp_author2 = a;
                                break;
                            }

                        }
                        System.out.println(temp_author2.getName() + " 이고 " + temp_author2.getPosts().size());
                        break;

                case 5 :
                    //5)게시글 상시조회 : 제목, 작성자 email 주소
                    System.out.println("post id를 입력해주세요.");
                    Long post_id = Long.parseLong(sc.nextLine());
                    for(Post p : posts){
                        if(p.getId() == post_id){
                            System.out.println(p.getTitle() + " " + p.getAuthor_email());
                        }
                    }

                    break;


            }


        }
    }
}

class Author{
        private Long id;
        private String name;
        private String email;
        private String password;
        private List<Post> posts;
        static Long static_id = 0L;

        Author(String name, String email, String password){
            static_id +=1;
            this.id = static_id;
            this.name = name;
            this.email = email;
            this.password = password;
            this.posts = new ArrayList<>();
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }


        Author(){

        }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post){
            this.posts.add(post);
        }

}
    class Post{
        private Long id;
        private String title;
        private String contents;
        private Author author;

        static Long static_id=0L;

        Post(String title,String contents, Author author){
            static_id += 1;
            this.author = author;
            this.author.addPost(this);
            this.id = static_id;
            this.title = title;
            this.contents = contents;

        }

        public Long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getContents() {
            return contents;
        }

        public Author getAuthor() {
            return this.author;
        }
        public String getAuthor_email(){
            return author.getEmail();
        }
    }

