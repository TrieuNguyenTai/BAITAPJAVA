package btchuong3.Hinhhoc.baitapkethua;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    
    public float chieucao;
    public hinhtru(){
        Ten = "hinh tru";
    }
    public void nhapchieucao(){
        nhapbanKinh();
        System.out.println("chieu cao la:");
        Scanner sc = new Scanner (System.in);
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        Thetich = Dientich * chieucao;
    }
}
