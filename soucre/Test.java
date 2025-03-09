package soucre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<Pathway> pathways = FileReader.readFile();
        System.out.println(pathways.size());
    }
}
