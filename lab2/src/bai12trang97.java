import java.util.Scanner;
public class bai12trang97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        int max;
        do{
            System.out.print("nhap so cot cua mtrx: ");
            n = sc.nextInt();
           }while(n <= 0);
        do{
            System.out.print("nhap so hang cua mtrx: ");
            m = sc.nextInt();
           }while(m <= 0);
        int arr[][]=new int[n][m];
        for(int i=0;i< n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("nhap phan tu thu ["+i+","+j+"]:");
                arr[i][j]=sc.nextInt();
          }
        }
        max =arr[0][0];
        for(int i = 0; i< n; i++){
            for(int j = 0; j < m; j++){
                if(max < arr[i][j])
                max = arr[i][j];
            }
        }
        System.out.print("so lon nhat trong mtrx la: "+max);
        sc.close();
}
}