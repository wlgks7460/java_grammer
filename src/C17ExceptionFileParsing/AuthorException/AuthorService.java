package C17ExceptionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;
    AuthorService(){
        authorRepository = new AuthorRepository();
    }
    void register(Author author) throws IllegalArgumentException{
//        만약에 password 5자리 이하면 예외 발생(IllegalArgu)

        if(author.getPassword().length()<5){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다");
        }

        Optional<Author> author1 =authorRepository.getAuthorByEmail(author.getEmail());
        if(author1.isPresent()){
            throw new IllegalArgumentException("이미 같은 회원이 존재합니다.");
        }
        authorRepository.register(author);
    }

    Optional<Author> login(String email,String password) throws IllegalArgumentException, NoSuchElementException{

//        email이 존재하지 않으면 예외발생(NosuchElementException)
//        password가 틀리면 예외발생(IllegalArgu)
        Optional<Author> author = authorRepository.getAuthorByEmail(email);
        if(author.isPresent()){
            if(author.get().getPassword().equals(password)){
                return author;
            }else{
                throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
            }
        }else{
            throw new NoSuchElementException("email이 존재하지 않습니다");
        }


    }
}