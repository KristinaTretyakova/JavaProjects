package lesson2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(isPalindromOrNot(string));
        in.close();
    }

    public static boolean isPalindromOrNot(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
        }

}

