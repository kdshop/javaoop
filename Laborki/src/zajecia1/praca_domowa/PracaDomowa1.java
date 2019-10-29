package zajecia1.praca_domowa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PracaDomowa1 {

    public static void main(String[] args) throws IOException {
        Dane dane = readCSVFile();

        dane.getData().forEach(strings -> strings.forEach(System.out::println));
    }

    private static Dane readCSVFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("2019-10-11_akcje.csv"))) {
            String[] header = br.readLine().split(",");

            List<ArrayList<String>> dane = br.lines()
                .map(s -> new ArrayList<>(Arrays.asList(s.split(","))))
                .collect(
                    Collectors.toList()
                );

            return new Dane(header, dane);
        }
    }
}

class Dane {
    private String[] header;
    private List<ArrayList<String>> data;

    Dane(String[] header, List<ArrayList<String>> data) {
        this.header = header;
        this.data = data;
    }
    String[] getHeader() {
        return this.header;
    }
    List<ArrayList<String>> getData() {
        return this.data;
    }
}