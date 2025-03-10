package soucre;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {

    public static ArrayList<Pathway> readFile()  throws IOException {
        // Array of Pathways
        ArrayList<Pathway> pathways = new ArrayList<>();
        // Read from the file
        String contents = Files.readString(Path.of("SupTable4.csv"));
        // Spilt it up into lines
        List<String> lines = List.of(contents.split("\n"));
        // Separate the comments at the top from the data
        lines =lines.stream()
                .skip(1)
                .toList();

        int index = 0;  // index for the iterations

        // Creates each pathway for the array of pathways
        for(String line : lines) {
            List<String> words = List.of(lines.get(index).split(","));
            Pathway p = new Pathway(words.get(0), words.get(1), words.get(2), words.get(3), words.get(4), words.get(5), words.get(6), words.get(7),
                    words.get(8), words.get(9), words.get(10), words.get(11), words.get(12), words.get(13), words.get(14));
            pathways.add(p);
            index++;
        }



        return pathways;
    }
}
