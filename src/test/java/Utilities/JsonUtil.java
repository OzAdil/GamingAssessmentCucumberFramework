package Utilities;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();

    }

    //Let's create a method to convert Java Object to Json (Serialization)
    public static String convertJavaToJson(Object obj) {
        String jsonResult = "";
        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (JsonGenerationException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());

        } catch (JsonMappingException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());

        } catch (IOException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());
        }
        return jsonResult;
    }

    //Let's create a method to convert Json To Java Object (De-Serialization)
    public static <T> T convertJsonToJava(String json, Class<T> cls) {

        T javaResult = null;

        try {
            javaResult = mapper.readValue(json, cls);
        } catch (JsonGenerationException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());

        } catch (JsonMappingException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());

        } catch (IOException e) {
            System.out.println("Expected occurred while serialization" + e.getMessage());

        }
        return javaResult;
    }
}
