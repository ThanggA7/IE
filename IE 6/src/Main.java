import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner Key = new Scanner(System.in);
        System.out.print("Input year: ");
        year = Key.nextInt();
    if (year % 4 == 0 ){
        System.out.print("Nam "+ year + " la nam nhuan!");
    }else {
        System.out.print("Nam "+ year + " khong la nam nhuan!");
    }
    }
}