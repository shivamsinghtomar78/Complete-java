package Challenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UNiqueCharacter {
    public static void main(String[] args) {
        Set<Character> unique=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your String:");
        String userStr=sc.next();
        for (char ch:userStr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("Your String has %d unique characters",unique.size());
    }
}
