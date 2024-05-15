package btchuong4;

import java.util.HashSet;
import java.util.Scanner;

public class sl54 {
    public static void main(String[] args) {
        HashSet<String> hashSetsStrings = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetsStrings.add("java");
        hashSetsStrings.add("c++");
        hashSetsStrings.add("python");
        hashSetsStrings.add("sql");
        hashSetsStrings.add("htmt");
        hashSetsStrings.remove("java");
        hashSetsStrings.size();
        System.out.println("các phần tử của mảng là:");
        System.out.println(hashSetsStrings);
        System.out.println(hashSetsStrings.size());
    }
    
}
