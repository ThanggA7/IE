import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int doanhthu;
        Scanner Key = new Scanner(System.in);
        System.out.print("Nhap doanh thu: ");
        doanhthu = Key.nextInt();
    if (doanhthu <=100){
        System.out.print("Huong 5% tien hoa hong!");
    } else if (doanhthu >100 && doanhthu <=300 ) {
        System.out.print("Huong 10% tien hoa hong!");
    } else {
        System.out.print("Huong 20% tien hoa hong!");
    }


    }
}