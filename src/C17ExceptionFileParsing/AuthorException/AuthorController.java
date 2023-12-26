package C17ExceptionFileParsing.AuthorException;

import java.util.*;

class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
//        메모리 DB에 데이터를 추가/삭제 부분은 repository로 분리
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.회원가입 2.로그인");
            int number =Integer.parseInt(sc.nextLine());

            switch (number){
                case 1 :
                    System.out.println("회원가입하실 이름을 입력해주세요.");
                    String name = sc.nextLine();
                    System.out.println("회원가입하실 이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();
                    Author author1 = new Author(name, email, password);
                    try {
                        authorService.register(author1);
                    }catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2 :
                    System.out.println("login하실 이메일을 입력해주세요.");
                    String author_email = sc.nextLine();
                    System.out.println("login하실 password를 입력해주세요.");
                    String author_password = sc.nextLine();
                    Optional<Author> loginedAuthor = Optional.empty();
                    try{
                        loginedAuthor = authorService.login(author_email,author_password);
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch (NoSuchElementException e){
                        System.out.println(e.getMessage());
                    }
                    if(loginedAuthor.isPresent()){
                        System.out.println(loginedAuthor.get().getName() + "님 환영합니다.");
                    }
                    break;


            }


        }
    }
}