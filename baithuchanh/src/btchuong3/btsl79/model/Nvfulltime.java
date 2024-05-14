package btchuong3.btsl79.model;

import btchuong3.btsl79.model.until.configs;

public class Nvfulltime extends Nhanvien {
    public int Ngaylamthem;
    public int Loaichucvu;

public Nvfulltime (String Ten){
    this.Ten= Ten;
}
public Nvfulltime(String Ten , int Ngaylamthem){
    this.Ten = Ten;
    this.Ngaylamthem = Ngaylamthem;
}
public void  xetloaichucvu(int Loaichucvu){
    this.Loaichucvu = Loaichucvu;
}
@Override
public String loaiNhanvien(){
    return " nhan vien fulltime đấy";
}
public void tinhluong(){
    if(Loaichucvu == configs.Nhan_vien_sep){
     Luong = configs.Luong_nv_fulltime_sep * configs.Luong_lam_them_moi_ngay;
    } else Luong = configs.Luong_nv_fulltime_linh * configs.Luong_lam_them_moi_ngay;
    }

}