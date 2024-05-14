package btchuong3;
import java.util.Scanner;
public class Student {
public String hoTen;
public String gioiTinh;
public int tuoi;
public String MSV ;
public void nhapHoten(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ho Ten : ");
    hoTen = sc.nextLine();
    sc.close();
 }
  public void nhapGioitinh(){
    Scanner sc = new Scanner(System.in);
    System.out.print("gioi tinh : ");
    gioiTinh = sc.nextLine();
    sc.close();
 }
 public void  nhaptuoi(){
    Scanner sc = new Scanner(System.in);
    System.out.println("tuoi:");
    tuoi = sc.nextInt();
    sc.close();
}
  public void nhapMSV(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ma sinh vien : ");
    MSV = sc.nextLine();
    sc.close();
 }
 public int tinhTuoi(){
    tuoi = 2024-tuoi;
    return tuoi;
}
  public void inthongtin(){
    System.out.println("Ho ten : "+hoTen);
    System.out.println("Gioi tinh: "+gioiTinh);
    System.out.println("So tuoi:"+tuoi);
    System.out.println("Ma sinh vien: " +MSV);
}
    public static void main(String[] args) {
        Student hs  = new Student();
        System.out.println("nhap vao thong tin sinh vien la:");
        hs.nhapHoten();
        hs.nhapGioitinh();
        hs.nhaptuoi();
        hs.nhapMSV();
        hs.inthongtin();
 }
}
