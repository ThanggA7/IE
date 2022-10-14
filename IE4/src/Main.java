import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float dauthang,cuoithang,chiso;
        Scanner Key = new Scanner(System.in);
        System.out.print("Nhap chi so cong to dau thang:");
        dauthang = Key.nextFloat();
        System.out.print("Nhap chi so cong to cuoi thang:");
        cuoithang = Key.nextFloat();
        chiso = cuoithang - dauthang;
        if(chiso >= 0 && chiso <= 50){
            System.out.print("So tien dien phai tra la: "+  chiso*1.484);
        } else if (chiso >= 51 && chiso <=  100) {
            System.out.print("So tien dien phai tra la: "+  chiso*1.53  3);
        } else if (chiso >= 101 && chiso <=  200) {
            System.out.print("So tien dien phai tra la: "+  chiso*1.786);
        } else if (chiso >= 201 && chiso <=  300) {
            System.out.print("So tien dien phai tra la: "+  chiso*2.242);
        } else if (chiso >= 301 && chiso <=  400) {
            System.out.print("So tien dien phai tra la: "+  chiso*2.242);
        } else {
            System.out.print("So tien dien phai tra la: "+  chiso* 2.587);
        }
    }
}