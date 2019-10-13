package praca_domowa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class PracaDomowa1 {

    public static void main(String[] args) throws IOException {
        readCSVFile().values().forEach(System.out::println);
    }

    private static Map<Stream<String>, List<String>> readCSVFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("2019-10-11_akcje.csv"))) {
            return br.lines()
                .collect(
                    groupingBy(String::lines, LinkedHashMap::new, Collectors.toList())
                );
        }
    }
}
