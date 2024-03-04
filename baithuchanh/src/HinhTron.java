import java.util.Scanner;

public class HinhTron {
     public float banKinh;
     public float dienTich;
     public float chuVi;
     final float Pi = 3.14f;
      public void nhapbanKinh(){
        System.out.println("nhap ban kinh = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc. nextFloat();
}
   public void tinhchuvi(){
    chuVi = 2 * Pi * banKinh;
   }
public void tinhdientich(){
    dienTich = Pi * banKinh * banKinh;
}
void inchuvi(){
    System.out.println("chu vi =" + chuVi);
}
void indientich(){
    System.out.println("dien tich ="+ dienTich);
}
}

