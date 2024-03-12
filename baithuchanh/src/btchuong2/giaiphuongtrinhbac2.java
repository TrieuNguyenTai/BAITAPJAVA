package btchuong2;

import java.util.Scanner;
public class giaiphuongtrinhbac2 {
/**
     * @param args
     */
    
    public static void main(String[] args) {
        double a, b,c, x1,x2, dental;
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhap a:");
        a = sc.nextDouble();
        System.out.println("nhap b:");
        b = sc.nextDouble();   
        System.out.println("nhap c:");
        c = sc.nextDouble();
        if (a != 0){
        dental = b*b - 4*(a*c);
        if (dental < 0){
            x1 =-b/(2*a);
            System.out.println("phuong trinh vo nghiem");
        } else if ( dental == 0) {
            x1 = -b/(2*a);
            System.out.println("phuong trinh co nghiem x1 = x2 ="+x1);
        } else{
            x1 = (-b + Math.sqrt(dental))/(2*a);
            x2 = (-b - Math.sqrt(dental))/(2*a);
          System.out.println("phuong trinh co 2 nghiem x1 = "+x1 + " va X2 = "+ x2);
        }
            }
            else{ System.out.println("khong phai phuong trinh bac 2");
        }
        sc.close();
        }
    }
