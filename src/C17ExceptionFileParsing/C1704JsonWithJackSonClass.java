package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1704JsonWithJackSonClass {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File myPath = Paths.get("src/C17ExceptionFileParsing/test-data2.json").toFile();
        try {

            JsonNode data1 = mapper.readTree(myPath);
            JsonNode students = data1.get("students");
            List<Students> studentsList = new ArrayList<>();
            for(JsonNode j : students) {
                Students myStudent = mapper.readValue(j.toString(), Students.class);
                studentsList.add(myStudent);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Students{
    int id;
    String name;
    String classNumber;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

}
