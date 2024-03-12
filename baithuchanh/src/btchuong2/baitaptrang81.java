package btchuong2;

import java.util.Scanner;

public class baitaptrang81 {
    public static void main(String[] args) {
        int m,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao so dong cua mtrx:");
    m = sc.nextInt();
    System.out.println("nhap vao so cot cua mtrx:");
    n = sc.nextInt();
    int A[][]= new int [m][n];
    System.out.println("nhap cac phan tu mtrx:");
    for (int i=0;i<m;i++){
        for (int j= 0;j<n;j++){
            System.out.println("A[" +i+"]["+j+"]=");
          A[i][j] = sc.nextInt();
        }
    }
    int max = A[0][0];
    for(int i =0;i<m;i++){
        for(int j=0;j<n;j++){
            if(max < A[i][j]){
                max = A[i][j];
            }
        }
    }
    System.out.println("phan tu lon nhat trong mtrx = " +max);
    sc.close();
    }
}