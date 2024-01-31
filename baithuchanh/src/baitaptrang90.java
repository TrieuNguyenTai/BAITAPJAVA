import java.util.Scanner;

public class baitaptrang90 {
    public static void main(String[] args) {
       String chuoi;
       char kytu;
       Scanner sc = new Scanner(System.in);
       System.out.println("nhap vao chuoi:" );
       chuoi = sc.nextLine();
       System.out.println("cac ky tu cua chuoi la:");
        for(int i =0;i <chuoi.length();i++){
            kytu = chuoi.charAt(i);
        System.out.println(kytu);
        sc.close();
        }
    }
}
