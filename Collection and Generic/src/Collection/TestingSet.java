package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        System.out.println(names.add("Shivam"));
        System.out.println(names.add("Singh"));
        System.out.println(names.add("singh"));
        Utility.print(names);
        System.out.println(names.add("Shivam"));
        System.out.println(names.size());
        Utility.print(names);

    }
}
