package me.trenchlive.json;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileReader {
    private static final String regex = "\\\"_id\\\" : ObjectId\\(\\\"\\w+\\\"\\), ";
    private static final Pattern pattern = Pattern.compile(regex);

    public static List<String> read(String filepath){
        List<String> ret = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(new File(filepath).toPath())) {
                if(line.isEmpty())
                    continue;
                Matcher matcher = pattern.matcher(line);
                ret.add(matcher.replaceFirst(""));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ret;
    }
}
