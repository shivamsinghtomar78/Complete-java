package Challenge.convertArrrayIntoStream;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<String> names = List.of("Prashant", "Sanchit", "Kg Coding");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
