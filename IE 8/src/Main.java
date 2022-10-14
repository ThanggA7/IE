import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, year;
        Scanner Key = new Scanner(System.in);
        System.out.print("Input month: ");
        month = Key.nextInt();
        System.out.print("Input year: ");
        year = Key.nextInt();
        if (year % 4 == 0 && month == 2) {
            System.out.print("29 ngay!");

        } else if (year % 4 != 0 && month == 2) {
            System.out.print("28 ngay!");
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.print("31 ngay!");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.print("30 ngay!");
            }
        }
    }
}