package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestingCollection {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(-72);
        Utility.print(arr);
        Collections.sort(arr);
        Utility.print(arr);
        Collections.reverse(arr);
        Utility.print(arr);


    }
}
