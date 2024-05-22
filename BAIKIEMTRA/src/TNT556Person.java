import java.util.Scanner;

public class TNT556Person {

    public String ten;
     public int tuoi;
    public int lop;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten=sc.nextLine();

        System.out.println("nhap tuoi: ");
        tuoi=sc.nextInt ();
        System.out.println("nhap lop: ");
        lop= sc.nextInt();

    }
    public void xuat(){
        System.out.println("ten:"+ ten);
        System.out.println("tuoi: " +tuoi);
        System.out.println("lop: ");
    }
    public static void main(String[] args) {
    TNT556Person tn = new TNT556Person();
    tn.nhap();
    tn.xuat();
    }
}