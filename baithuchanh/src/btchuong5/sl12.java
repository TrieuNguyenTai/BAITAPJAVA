package btchuong5;
public class sl12 {
public static void main(String[] args) {
 try{
    int tinh = 27;
    if( tinh %2 !=0){
        System.out.println(tinh + " la so le");
        return;
    }
 }catch(ArithmeticException e ){
    System.out.println(e);
 }finally{
    System.out.println("khoi lenh cuoi cung luon duoc thuc hien");
 }
 System.out.println("phan con lai cua doan code ..");
}
}
