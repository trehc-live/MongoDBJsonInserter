package me.trenchlive.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static JsonNode convertToJNode(String source) {
        try {
            return mapper.readTree(source);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
