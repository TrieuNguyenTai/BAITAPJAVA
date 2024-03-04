public class App {
    public static void main(String[] args) throws Exception {
        HinhTron  ht = new HinhTron();
        ht.nhapbanKinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
        System.out.println("nhap ht 2:");
        HinhTron ht2 = new HinhTron();        
        ht2.nhapbanKinh();
        ht2.tinhchuvi();
        ht2.tinhdientich();
        ht2.inchuvi();
        ht2.indientich();
    }
}
