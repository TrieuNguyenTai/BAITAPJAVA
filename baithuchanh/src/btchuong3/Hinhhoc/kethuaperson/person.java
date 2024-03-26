/*tạo một class person đầy đủ các phương thức, tạo class employee kế thừa 
class person, tạo class employee part và fulltime kế thừa lớp employee(có tinh lương)*/
package btchuong3.Hinhhoc.kethuaperson;

import java.util.Scanner;

public class person {
    public String hoTen;
    public int tuoiTac;
    public float chieuCao;
    public float canNang;
    public void nhapthongtin(){
        System.out.println("ho ten:");
        System.out.println("tuoi:");
        System.out.println("chieu cao:");
        System.out.println("can nang:");
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        tuoiTac = sc.nextInt();
        chieuCao = sc.nextFloat();
        canNang = sc.nextFloat();
    }
    public void inthongtin(){
    System.out.println(hoTen + " - " +tuoiTac+ " - " +chieuCao+ "-" +canNang );
    }
    public void inthongtin(String hoTen, int tuoitac, Float chieuCao, Float canNang){
        System.out.println(hoTen + "-"+tuoiTac +"-"+chieuCao+ "-" +canNang);
      }
}
