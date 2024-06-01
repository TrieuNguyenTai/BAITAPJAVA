package btchuong5;

public class sl8 {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]= 30/0;
        }catch(ArithmeticException e){
            System.out.println("nhiem vu 1");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("nhiem vu 2");
        }catch(Exception e){
            System.out.println("da hoan thanh het nhiem vu");
        }
        System.out.println("phan con lai cua doan code");
    }
    
    }
    

