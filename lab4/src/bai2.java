import java.util.LinkedList;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> avg = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vap so luong phan tu:");
        n = sc.nextInt();
        System.out.println("nhap vao cac so:");
        int So;
        for (int i = 0; i < n; i++) {
            So = sc.nextInt();
            if (So > 0) {
                avg.add(So);
            } 
        }        
        int sum = 0;
        int count = 0;
        for (int number : avg) {
            if (number % 2 == 0) {
                sum += number;
                count++;
            }
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("trung binh cong cua cac so chan la: " + average);
        } else {
            System.out.println("khong co so chan nao trong danh sach.");
        }
    }
}