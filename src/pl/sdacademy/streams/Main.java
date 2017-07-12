package pl.sdacademy.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("abcd");
        stringList.add("rerg");
        stringList.add("rthstrh");
        stringList.add("yukyuk");

        System.out.println("Wyrzucamy elementy rozpoczynajace się od \"a\"");
        List<String> result1 = stringList.stream()
                // za pomocą metody filter ze strumienia możemy pozbyć się elementów
                .filter(s -> !s.startsWith("a"))
                // za pomocą metody collect możemy zebrać elementy, przez które strumień przebiega
                // (w tym przypadku zbieramy do listy)
                .collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("Mapujemy łańcuchy znaków do ich długości");
        // Listę stringów "przerobimy" na listę długości tych stringów
        List<Integer> result2 = stringList.stream()
                // za pomocą metody map mapujemy (przeobrażamy) elementy
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(result2);

        // Jeśli chcemy wywołać instrukcje dla każdego elementu, przez który przebiega strumień, możemy skorzystać
        // z metody forEach.
        stringList.stream()
                .forEach(s -> System.out.println(s));
    }


}
