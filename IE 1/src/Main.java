import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner Key = new Scanner(System.in);
        System.out.print("Input a: ");
        a = Key.nextInt();
        System.out.print("Input b: ");
        b = Key.nextInt();
        System.out.print("Input c: ");
        c = Key.nextInt();
        if (a > b && a > c){
            System.out.print(a +" La so lon nhat !");
        } else if (b > a && b > c) {
            System.out.print(b+" La so lon nhat");
        }else {
            System.out.print(c+" La so lon nhat");
        }
    }
}