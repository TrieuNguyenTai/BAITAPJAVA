package btchuong5;

public class sl9 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("thuc hien phep toan");
                int b = 40/0;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]= new int[5];
                a[5]= 4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("khoi lenh khac");
        }catch(Exception e){
            System.out.println("xu ly ngoai le");
        }
        System.out.println("tiep tuc chuong trinh..");
    }
}
