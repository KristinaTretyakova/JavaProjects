package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2 {

    public static void main(String[] args) {
        writer("src/main/java");
    }

    public static void writer(String pathDir) {
        File file = new File(pathDir);

        String[] textHundred = file.list();
        StringBuilder sb = new StringBuilder();
        sb.append("TEST ".repeat(100));

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("D:\\Кристина\\JavaProjects\\JavaProjects\\src\\main\\resources\\File.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();;
        }
        pw.print(sb);
        pw.close();
    }
}

