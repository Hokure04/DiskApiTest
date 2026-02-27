package org.example.Utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsoParser {

    private static final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static <T> T parse(String path, Class<T> clazz) throws IOException {
        Path pathObj = Path.of(path);

        if(!Files.exists(pathObj)){
            throw new FileNotFoundException("Файл не найден: " + path);
        }

        String json =Files.readString(pathObj);
        return mapper.readValue(json, clazz);
    }
}
