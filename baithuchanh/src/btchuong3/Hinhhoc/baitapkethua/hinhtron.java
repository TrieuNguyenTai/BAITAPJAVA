package btchuong3.Hinhhoc.baitapkethua;

import java.util.Scanner;

public class hinhtron extends hinhhoc{
    public float bankinh;
    public hinhtron(){
        Ten = "hinh tron";
    }
 public void nhapbanKinh(){
    System.out.println("nhap ban kinh:");
    Scanner sc = new Scanner(System.in);
    bankinh = sc.nextFloat();
 }
 public void tinhchuvi(){
    Chuvi = 2 * PI *bankinh;
 }
 public void tinhdientich(){
    Dientich = PI * bankinh *bankinh;
 }    
}
