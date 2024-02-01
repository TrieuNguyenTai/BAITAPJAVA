import java.util.Scanner;
public class baitaptrang74 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
          do {
           System.out.println("nhap cac phan tu cua mang: ");
           n = sc.nextInt();
          } while (n < 0);
        int A[] = new int[n];
        System.out.println("nhap mang: ");
        for (int i = 0; i < n; i++) {
        System.out.print("nhap phan tu thu "+i + ": ");
         A[i] = sc.nextInt();
    }
    int sum =0;
    for (int i = 0; i < n; i++){
        if (A[i] % 2 == 0) {
            sum+=A[i];
        }
    }
    System.out.println("Tong: " + sum);
    sc.close();
   }
}

