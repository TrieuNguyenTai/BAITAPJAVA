package btchuong3.Hinhhoc.kethuaperson;

import java.util.Scanner;

public class emparttime extends employee {
    public int socong;
    public emparttime(){
        chucVu = "nhan vien";
        Luong = 800000;
    }
    public void nhapsogiocong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so cong:");
        socong =sc.nextInt();
    }
    public void tinhluong(){
        Luong = socong*Luong;
    }
}
