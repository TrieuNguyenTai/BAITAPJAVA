import java.util.Scanner;
public class bai4trang94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
         System.out.println("nhap thang: ");
         thang = sc.nextInt();
        switch (thang) {
            case 1:
                System.out.println("Thang 1 ");
                break;
            case 2:
                System.out.println("Thang 2 ");
                break;
            case 3:
                System.out.println("Thang 3");
                break;
            case 4:
                System.out.println("Thang 4 ");
                break;
            case 5:
                System.out.println("Thang 5 ");
                break;
            case 6:
                System.out.println("Thang 6");
                break;
            case 7:
                System.out.println("Thang 7");
                break;
            case 8:
                System.out.println("Thang 8");
                break;
            case 9:
                System.out.println("Thang 9");
            case 10:
                System.out.println("Thang 10");
            case 11:
                System.out.println("Thang 11");
            case 12:
                System.out.println("Thang 12");
            default:
                System.out.println("khong co thang nay trong 12 thang");
                break;
        }
        sc.close();
    }
}


