import java.util.Scanner;
public class baitaptrang35 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu nhat la a:");
           a=sc.nextInt();
        System.out.println("nhap so thu hai la b:");
           b=sc.nextInt();
if(a>b){
    System.out.println("so be hon la: "+ a);
}
else if ( b>a){
    System.out.println("so be hon la: "+ a);
}
else{
    System.out.println("hai so bang nhau : "+a );
    sc.close();
}
 }
}

