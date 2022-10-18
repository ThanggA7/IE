import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double can2,delta,no1,no2;
        Scanner Key = new Scanner(System.in);
        System.out.println("Phuong trinh: ax2 + bx + c = 0");
        System.out.print("Nhap a: ");
        a = Key.nextInt();
        System.out.print("Nhap b: ");
        b = Key.nextInt();
        System.out.print("Nhap c: ");
        c = Key.nextInt();
        delta = (b*b - 4*a*c);
        can2 = Math.sqrt(delta);
        no1 = (-b - can2)/(2*a);
        no2 = (-b + can2)/(2*a);
        if (a == 0 && b == 0){
            System.out.print("Phuong trinh vo nghiem!");
        } else if (a == 0) {
            System.out.print("Phuong trinh co nghiem la: " + (-c/b));
        } else if (b*b - 4*a*c < 0){
            System.out.print("Phuong trinh vo nghiem!");
        } else {
            System.out.print("Phuong trinh co 2 nghiem la " + no1 +" va "+ no2 );
        }

    }
}
