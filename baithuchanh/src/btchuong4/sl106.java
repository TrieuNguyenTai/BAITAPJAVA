package btchuong4;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
public class sl106 {
public static void main(String[] args) {
    TreeMap< Integer, String> treemap = new TreeMap<>();
    treemap.put(3, "Văn");
    treemap.put(4, "Sử");
    treemap.put(5, "Địa");
    Set<Map.Entry<Integer, String>> settreemap = treemap.entrySet();
    System.out.println("các entry có trong settreemap là:");
    System.out.println(settreemap);
}
}
