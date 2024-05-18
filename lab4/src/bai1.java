import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> So = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao so luong phan tu trong arr:");
        n = sc.nextInt();
        System.out.println("nhap vao cac so:");
        for (int i = 0; i < n; i++) {
            So.add(sc.nextInt());
        }
        int Solonnhat = Collections.max(So);
        System.out.println("so lon nhat trong arr vua nhap la: " + Solonnhat);
        System.out.println("phan tu ban muon xoa khoi arr la:");
        int delete;
        delete  = sc.nextInt();
        if(So.contains(delete)){
        So.removeIf(num -> num == delete);
        System.out.println("sau khi xoa arr con lai la: " + So);}
        else {
         System.out.println("khong ton tai phan tu " + delete + " trong arr.");
        }
        Collections.sort(So);
        System.out.println("arr sau khi sap xep: " + So);
    }
}
