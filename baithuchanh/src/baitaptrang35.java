import java.util.Scanner;
public class baitaptrang35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat : ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu hai");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("So lon nhat la : "+ b);
        }else{
                System.out.println("So lon nhat la : " + a);
            }
        sc.close();
    }
}