package btchuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class sl41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("tuổi thân");
        linkedList.add("tuổi dậu");
        linkedList.add("tuổi mão");
        linkedList.add("tuổi ngọ");
        linkedList.add("tuổi thìn");
        linkedList.add("tuổi tỵ");
        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        System.out.println("phần tử đầu tiên trong danh sách là:" + firstNode );
        System.out.println("phần tử cuối cùng trong danh sách là:"+ lastNode);
    }
}
