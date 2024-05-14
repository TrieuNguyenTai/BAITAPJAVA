package btchuong3.Hinhhoc.kethuaperson;

import java.util.Scanner;

public class employee extends person {
public int Manv;
public String chucVu;
public String phongBan;
public float Luong;
public void nhapttn(){
    System.out.println("ma nhan vien la:");
    Scanner sc = new Scanner(System.in);
    Manv = sc.nextInt();
    super.nhapthongtin();
}
public void inttn(){
    super.inthongtin();
        System.out.print("\nma nhan vien: " +Manv);
        System.out.print("\nchuc vu: " +chucVu);
        System.out.print("\nphong ban: " +phongBan);
        System.err.println("luong:" +Luong);
    }
} 

