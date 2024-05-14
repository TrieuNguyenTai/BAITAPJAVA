package btchuong2;

import java.util.Scanner;

public class baitaptrang30 {
    public static void main(String[] args) {
        int n;
        int du;
        int sum = 0;
        Scanner sc = new Scanner(System.in);  
      System.out.println("nhap vao so nguyen duong bat ky la n:");
       n = sc.nextInt();
     while (n>0){
        du = n%10;
        n = n/10;
        sum += du;
     }
     System.out.println("tong cac chu so la:" + sum);
     sc.close();
    }
}