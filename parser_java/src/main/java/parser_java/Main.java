package parser_java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }
        String inputPath = args[0];
        String outputPath = args[1];
        String text = FileReaderUtilite.fileread(inputPath);
        Map<String, Integer> map = CSVLogic.word_counter(text);
        List<Map.Entry<String, Integer>> sorted =
                CSVLogic.sortByFreq(map);
        CSVWriter.write(outputPath, sorted);
    }
}
