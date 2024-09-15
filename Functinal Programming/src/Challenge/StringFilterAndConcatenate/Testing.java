package Challenge.StringFilterAndConcatenate;

import java.util.List;
public class Testing {
    public static void main(String[] args) {

        List<String> strs = List.of("Prashant Jain", "bad",
                "is teaching java", "ghatiya", "ganda",
                "on KG Coding", "Best Youtube programming channel");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);
    }
}
