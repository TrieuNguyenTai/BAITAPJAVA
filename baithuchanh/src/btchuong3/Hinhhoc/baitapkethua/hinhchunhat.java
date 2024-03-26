package btchuong3.Hinhhoc.baitapkethua;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float chieurong;
    public float chieudai;
    public hinhchunhat(){
        Ten = "hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai:");
        Scanner sc = new Scanner(System.in);
        chieudai =sc.nextFloat();
    } 
    public void nhapchieurong(){
        System.out.println("chieu rong:");
        Scanner sc = new Scanner(System.in);
        chieurong =sc.nextFloat();
    } 
    public void tinhchuvi(){
        Chuvi = (chieudai + chieurong) * 2;
    }
    public void tinhdientich(){
        Dientich = chieudai * chieurong;
    }

}
