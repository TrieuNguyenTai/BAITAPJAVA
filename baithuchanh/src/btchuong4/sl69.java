package btchuong4;
import java.util.TreeSet;
import java.util.Scanner;

public class sl69 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        treeSetIntegers.add(1);
        treeSetIntegers.add(25);
        treeSetIntegers.add(3);
        treeSetIntegers.add(4);
        treeSetIntegers.add(9);
        System.out.println("các phần tử trong mảng là:");
        System.out.println(treeSetIntegers);
        System.out.println("nhập các phần tử cần thêm vào mảng:");
        number = sc.nextInt();
        if(!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("thêm thành công");
            System.out.println("các phần tử trong mảng sau khi thêm là:");
            System.out.println(treeSetIntegers);
        } else{
            System.out.println("phần tử thêm  "+ number +" da ton tai ");
        }
    }
    
}
