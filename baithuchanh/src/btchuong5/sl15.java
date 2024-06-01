package btchuong5;
import java.io.IOException;
public class sl15 {
    void m() throws IOException{
        throw  new IOException("loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
void p(){
    try{
    n();
}catch (Exception e){
    System.out.println("ngoai le duoc xu ly");
}
}
public static void main(String[] args) {
    sl15 sl = new sl15();
    sl.p();
    System.out.println("luong binh thuong...");
}
}