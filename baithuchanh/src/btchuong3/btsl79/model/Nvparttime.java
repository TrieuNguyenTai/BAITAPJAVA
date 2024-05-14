package btchuong3.btsl79.model;

import btchuong3.btsl79.model.until.configs;

public class Nvparttime extends Nhanvien {
    private int giolamviec;
    public Nvparttime(String Ten,int giolamviec){
      this.Ten = Ten;
      this.giolamviec = giolamviec;
    }
    @Override
    public String loaiNhanvien(){
        return " nhan vien parttime đấy";
    }
    public void tinhluong(){
        Luong = configs.Luong_nv_part_time_moi_gio * giolamviec;
    }
    }

