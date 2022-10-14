import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Input age: ");
        age = Keyboard.nextInt();
        if (age >= 16){
            System.out.print("Hoc sinh da du dieu kien vao lop 10!");
        } else {
            System.out.print("Hoc sinh chua du dieu kien vao lop 10");
        }
    }
    }

    