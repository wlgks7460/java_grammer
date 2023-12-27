package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

//text파일 parsing
public class C1702FileParsing {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");

//        파일 쓰기
//        버퍼기능이 구현돼있고, nio패키지에서는 non-blocking 방식 사용
//        기본이 StnadardCharsets.UTF-8
//        Create new 이후에 Append로 실행가능
        try {
            if(Files.exists(filePath)){
                Files.write(filePath,"손흥민\n".getBytes(), StandardOpenOption.APPEND);
            }else{
                Files.write(filePath,"".getBytes(), StandardOpenOption.CREATE_NEW);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        파일 읽기 : readString, readAllLines(List 형태)
        try {
//            String mySt = Files.readString(filePath);
//            System.out.println(mySt);
//            readAllLines를 가지고 for문을 돌려 출력
            List<String> myList = Files.readAllLines(filePath);
            for(String a : myList){
                System.out.println(a + "선수");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
