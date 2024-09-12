package Collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Shivam");
        arr.add("Tomar");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");

        }
        System.out.println();
        arr.add(1, "Singh");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");

        }
        System.out.println();
//        arr.remove(2);
        arr.remove("Tomar");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
