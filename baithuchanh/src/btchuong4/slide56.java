package btchuong4;

import java.util.HashSet;
import java.util.Scanner;

public class slide56 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSetiIntegers = new HashSet<>();
        hashSetiIntegers.add(1);
        hashSetiIntegers.add(3);
        hashSetiIntegers.add(5);
        hashSetiIntegers.add(7);
        hashSetiIntegers.add(9);
        System.out.println("các phân tử của mảng là:");
        System.out.println(hashSetiIntegers);
        System.out.println("phần tử cần xoá là:");
        number = sc.nextInt();
        if(hashSetiIntegers.contains(number)){
            hashSetiIntegers.remove(number);
            System.out.println("đã xoá phần tử thành công");
            System.out.println("các phần tử còn lại của mảng là:");
            System.out.println(hashSetiIntegers);
        } else {
            System.out.println("xoá phần tử thành công");
        }
       }
    }
