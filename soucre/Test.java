package soucre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Pathway> pathways = FileReader.readFile();

        // Print out all of the attributes.
        // I didn't want to use a newline everytime but there is a "\r" at the end of the last attribute so i cannot sout a comma after.
        // Open to suggestions
        System.out.println("--- Attributes of the first data item ---");
        for(String attribute : pathways.get(0).getAttributes()) {
            System.out.println(attribute);

        }

        // Print out all of the attributes for the 10th item
        System.out.println("--- Attributes of the 10th data item ---");
        for(String attribute : pathways.get(9).getAttributes()) {
            System.out.println(attribute);

        }

        // Print the number of entries in the data
        System.out.println("--- Total number of entries in the data ---");
        System.out.println(pathways.size());


    }
}
