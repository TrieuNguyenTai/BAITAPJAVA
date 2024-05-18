package btchuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class sl88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("T", "Toán");
        hashMap.put("V", "Văn");
        hashMap.put("A", "Anh");
        hashMap.put("A", "Âm nhạc");
        System.out.println("danh sách các môn học trong hashMap là: ");
        Set<Map.Entry< String, String >> Setsubject = hashMap.entrySet();
        System.out.println(Setsubject);
        System.out.println("T: " + hashMap.get("T"));
        System.out.println("V: "+ hashMap.get("V"));
        System.out.println("A: "+ hashMap.get("A"));
        System.out.println("N: "+ hashMap.get("N"));
        if (hashMap.containsValue("Văn")){
            System.out.println("có môn này trong danh sách môn học");
        }else {
            System.out.println("không có môn này trong danh sách môn học");
        }

    }
    
}
