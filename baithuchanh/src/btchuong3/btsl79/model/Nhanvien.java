package btchuong3.btsl79.model;

public class Nhanvien {
    protected String Ten;
    protected long Luong;
    public Nhanvien(){

    }
    public Nhanvien(String Ten){
        this.Ten = Ten;
    }
   public String loaiNhanvien(){
       return "";
    }
    public void intt(){
        System.out.println("nhân viên:  " +Ten);
        System.out.println("loại nhân viên:  "+loaiNhanvien());
        System.out.println("lương:  " + Luong + "VND");
    }
}
