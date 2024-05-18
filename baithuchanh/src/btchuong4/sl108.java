package btchuong4;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class sl108 {
    public static void main(String[] args) {
        TreeMap< Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Hoá");
        treeMap.put(2, "Vật lý");
        treeMap.put(3, "Sử");
        treeMap.put(4, "Địa");
        treeMap.put(5,"GDCD");
        System.out.println("các phần tử có trong treeMap là: ");
        Set<Map.Entry< Integer, String>> settreemap = treeMap.entrySet();
        System.out.println(settreemap);
        treeMap.replace(1,"Thể Dục");
        treeMap.replace(5,"Công Nghệ");
        System.out.println("các phần tử sau khi thay thế là:");
        System.out.println(settreemap);
    }
    
}