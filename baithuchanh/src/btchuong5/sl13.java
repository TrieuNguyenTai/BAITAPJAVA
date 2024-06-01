package btchuong5;

public class sl13 {
    public static void validate(int tuoi){
        try{
        if(tuoi < 18)
        throw new ArithmeticException("khong hop le");
        else
        System.out.println("chao mung");
    }catch(ArithmeticException ex){
        System.out.println(ex.getMessage());
    }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("phan con lai cua doan code...."
        );
    }
}