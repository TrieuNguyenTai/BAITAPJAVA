package btchuong4;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class sl60 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
            Set<String> linkedHashSet = new LinkedHashSet<String>();
            linkedHashSet.add("php");
            linkedHashSet.add("pascal");
            linkedHashSet.add("go");
            for (String str: linkedHashSet){
                System.out.println(str);
            }
            System.out.println("nhập các phân tử cần xoá:");
            name = sc.nextLine();
            if(linkedHashSet.contains(name)){
            linkedHashSet.remove(name);
            System.out.println("phần tử đã xoá thành công");
            System.out.println("các phần tử còn lại là:");
            System.out.println(linkedHashSet);
            } else {
                System.out.println("xoá các phần tử thành công");
            }
    }     
    }
    
