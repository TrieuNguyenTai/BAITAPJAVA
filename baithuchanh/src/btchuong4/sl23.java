package btchuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class sl23 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListIntegers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int So;
        System.out.println("Nhap vao phan tu cho mang la:");
        int n = sc.nextInt();
        for( int i =0; i < n;i++){
            System.out.println("Nhap vao phan tu thu:");
            So = sc.nextInt();
            arrayListIntegers.add(So);
        }
        int max = arrayListIntegers.get(0);
        for(int i = 1; i < arrayListIntegers.size();i++){
            if(arrayListIntegers.get(i).compareTo(max)>0){
                max= arrayListIntegers.get(i);
            }
        }
        System.out.println("so lon nhat trong mang la:"+max);
    }
}
