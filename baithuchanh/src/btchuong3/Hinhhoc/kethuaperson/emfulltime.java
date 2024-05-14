package btchuong3.Hinhhoc.kethuaperson;

import java.util.Scanner;

public class emfulltime extends employee {
    public int socong;
    public emfulltime(){
        chucVu = "nhan vien";
        Luong = 900000 ;
    }
    public void nhapsongaycong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so ngay cong la: ");
        socong = sc.nextInt();
    }
    public void tinhluong(){
        Luong = Luong*socong;
}
}
