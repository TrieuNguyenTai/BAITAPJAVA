package btchuong3.btsl79.model;

public class App {
    public static void main(String[] args) {
        Nvfulltime sep = new Nvfulltime("Trieu Nguyen Tai");
        sep.xetloaichucvu(1);
        Nvfulltime linh = new Nvfulltime("Do Van Trung");
        linh.xetloaichucvu(2);
        Nvparttime thoivu = new Nvparttime("Nguyen Manh Dung",140);
        sep.tinhluong();
        linh.tinhluong();
        thoivu.tinhluong();
        sep.intt();
        linh.intt();
        thoivu.intt();

    }
}
