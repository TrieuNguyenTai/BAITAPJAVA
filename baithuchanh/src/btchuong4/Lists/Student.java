package btchuong4.Lists;

import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien la:");
        FullName =sc.nextLine();
        System.out.println("Nhaop tuoi cua sinh vien:");
        Age = sc.nextInt();
    }
    public void InThongTin(){
       System.out.println("Ho va Ten sinh vien la:"+FullName);
       System.out.println("Tuoi sinh vien la:"+Age);
    }
    public void addThongTin(){

    }public void reThongTin(){
        
    }

}
