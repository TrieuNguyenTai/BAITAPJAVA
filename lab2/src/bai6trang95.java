import java.util.Scanner;
public class bai6trang95 {
  public static void main(String[] args) {
    int n, temp = 1;
    long gt = 1;
    Scanner sc = new Scanner(System.in);
    do {
           System.out.println("nhap vao mọt so bat ky la:");
              n = sc.nextInt();
        } while (n < 0);
            while (temp <= n) {
               gt *= temp;
               temp ++;
    }
      System.out.println(n + " ! = " + gt);
      sc.close();
    }
} 