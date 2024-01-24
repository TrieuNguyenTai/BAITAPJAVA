import java.util.Scanner;
public class giaiphuongtrinhbac1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    double a;
    double b;
    double x;
    Scanner sc = new Scanner(System.in);
   System.out.println("nhap he so a=");
     a = sc.nextDouble();
    System.out.println("nhap he so b=");
     b = sc.nextDouble();
    if ( a==0){
     System.out.println(" khong phai ngiem phuong trinh.");
    }else{
        x = -b/a;
    System.out.println("phuong trinh co nghiem x1= " + x);}
     sc.close();
}
}

