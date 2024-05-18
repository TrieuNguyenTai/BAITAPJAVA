package btchuong4;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class sl86 {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("HTTT", "Hệ thống thông tin");
        hashmap.put("KHMT", "Khoa học máy tính");
        hashmap.put("CNPM", "Công nghệ phần mềm");
        Set<Map.Entry<String, String>> setHashmap = hashmap.entrySet();
        System.out.println("Các entry có trong setHashmap: ");
        System.out.println(setHashmap);
    }
}