import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("В ведите любоче число от -2147483648 до 2147483647 ");

        int a = in.nextInt();

        if (a > 999999999 || a < -999999999) System.out.println("Число " + a + " Десятизначное");
        else if (a > 99999999 || a < -99999999) System.out.println("Число " + a + " Девятизначное");
        else if (a > 9999999 || a < -9999999) System.out.println("Число " + a + " Восьмизначное");
        else if (a > 999999 || a < -999999) System.out.println("Число " + a + " Семизначное");
        else if (a > 99999 || a < -99999) System.out.println("Число " + a + " Шестизначное");
        else if (a > 9999 || a < -9999) System.out.println("Число " + a + " Пятизначное");
        else if (a > 999 || a < -999) System.out.println("Число " + a + " Четырехзначное");
        else if (a > 99 || a < -99) System.out.println("Число " + a + " Трехзначное");
        else if (a > 9 || a < -9) System.out.println("Число " + a + " Двузначное");
        else System.out.println("Число " + a + " однозначное");
    }
}