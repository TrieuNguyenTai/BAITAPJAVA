import btchuong3.Hinhhoc.HinhTron;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         HinhTron ht1 = new HinhTron();
         ht1.nhapbanKinh();
         ht1.inchuvi();
         ht1.indientich();
         ht1.tinhchuvi();
         ht1.tinhdientich();
         System.out.println(" nhap thong tin hinh tron 2:");
         HinhTron ht2 = new HinhTron();
         ht2.nhapbanKinh();
         ht2.inchuvi();
         ht2.indientich();
         ht2.tinhchuvi();
         ht2.tinhdientich();
        
        }
}
