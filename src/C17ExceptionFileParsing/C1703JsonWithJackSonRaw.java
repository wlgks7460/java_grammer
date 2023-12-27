package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C1703JsonWithJackSonRaw {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            readTree를 통해서 json을 계층적 트리구조 형태로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/test-data1.json").toFile();
            JsonNode data1 = mapper.readTree(myPath);
            Map<String,String> studentMap = new HashMap<>();
            studentMap.put("id", data1.get("id").asText());
            studentMap.put("name", data1.get("name").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());
            System.out.println(studentMap);

//            key:value중에 value의 타입이 예상되지 않을때는 Object타입으로도 받을 수 있다.

            Map<String,String> studentMap2 = mapper.readValue(myPath, Map.class);
            System.out.println(studentMap2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
