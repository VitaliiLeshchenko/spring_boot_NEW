package com.leshchenko.review.service.impl;

import com.leshchenko.review.service.FileReaderService;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FileReaderWithoutMapping implements FileReaderService<String> {
    @Override
    public List<String> getContent(String path) {
        Path filePath = Paths.get(path);
        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            List<String> result = new ArrayList<>();
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                result.add(currentLine);
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException("Can't read file at path : " + path, e);
        }
    }
}
