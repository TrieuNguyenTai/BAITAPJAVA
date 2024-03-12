package btchuong3;


public class Person {
    public String Ten;
    public int Tuoi;
    public String ngheNghiep;
    public String gioiTinh;
    public Person(){
        Ten = "TRIEU NGUYEN TAI";
        Tuoi = 19;
        ngheNghiep = "sinh vien";
        gioiTinh = "nam";

    }
public void inthongtin(){
   System.out.println(Ten + " - "+Tuoi+" - " + ngheNghiep +" - "+gioiTinh );
}
  public void inthongtin(String Ten, int Tuoi, String ngheNghiep, String gioiTinh){
    System.out.println(Ten + "-"+Tuoi+"-" + ngheNghiep +"-"+gioiTinh);
  }
}


