package btchuong4;
import java.util.LinkedHashMap;
public class sl94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer , String> hashMap = new LinkedHashMap<>();
        hashMap.put(9, "Toán");
        hashMap.put(8, "Văn");
        hashMap.put(7, "Anh");
        System.out.println("phần tử trước khi xoá là:");
        System.out.println(hashMap);
        hashMap.remove(7);
        System.out.println("phần tử sau khi xoá là:");
        System.out.println(hashMap);        
    }
    
}
