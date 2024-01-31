import java.util.Scanner;
public class bai8trang95 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    float sum = 0;
    System.out.print("nhap vao so cac so nguyen: ");
    n = sc.nextInt();
    for(int i=0;i<n;i++){
        System.out.print("so nguyen thu "+(i+1)+": ");
        int x;
        x = sc.nextInt();
        sum += x;
    }
    System.out.print("trung binh cong cac so nguyen la: "+(sum/n ));
    sc.close();
    }
}