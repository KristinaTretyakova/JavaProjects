package lesson1.Homework1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            helloName();
        }
        private static void helloName() {
            System.out.printf("Как к вам обращаться? ");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            scan.close();

            Calendar calendar = new GregorianCalendar();

            if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                    && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
                System.out.printf("Доброе утро, %s!", name);
            }
            if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                    && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
                System.out.printf("Добрый день, %s!", name);
            }
            if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                    && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
                System.out.printf("Добрый вечер, %s!", name);
            }
            if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                    && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
                System.out.printf("Доброй ночи, %s!", name);
            }
        }
}

