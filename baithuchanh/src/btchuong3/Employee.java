package btchuong3;
import java.util.Scanner;

public class Employee {
    public String hoTen;
    public String gioiTinh;
    public String chucVu;
    public int tuoi;

    public void nhaphoten() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va Ten: ");
        hoTen = sc.nextLine();
    }

    public void nhapgioitinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gioi tinh: ");
        gioiTinh = sc.nextLine();
    }

    public void nhaptuoi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuoi: ");
        tuoi = sc.nextInt();
    }

    public void nhapchucvu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuc vu: ");
        chucVu = sc.nextLine();
    }
        void inthongtin() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Tuoi: " + tuoi);
    }

    public static void main(String[] args) {
        Employee nv = new Employee();
        System.out.println("Nhap vao thong tin cua nhan vien:");
        nv.nhaphoten();
        nv.nhapgioitinh();
        nv.nhapchucvu();
        nv.nhaptuoi();
        nv.inthongtin();
    }
}
