import java.util.Scanner;
import java.util.Arrays;
public class bai11trang97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap mang: ");
            n = sc.nextInt();
        }while(n<=0);
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("nhap phan tu thu:"+(i+1)+" ");
            A[i]=sc.nextInt();
        }
        for(int i= 0;i<n-1;i++){
            for(int j= i+1;j<n;j++){
                if (A[i]>A[j]){
                   int temp = A[j] ;
                    A[j]=A[i];
                    A[i]= temp;
                }
            } 
        }   
          System.out.print("mang da duoc sap xep la: " + Arrays.toString(A));
          sc.close();
      }
}