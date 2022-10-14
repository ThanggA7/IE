import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    float point;
        Scanner Key = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        point = Key.nextFloat();
        if(point >= 9){
            System.out.print("Hoc sinh dat hang A");
        } else if (point >=7 && point <9) {
            System.out.print("Hoc sinh dat hang B");
        } else if (point >=5 && point < 7) {
            System.out.print("Hoc sinh dat hang C");
        }else {
            System.out.print("Hoc sinh dat hang F");
        }

    }
}