package lesson2;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {
        ShowTypeFilesInDir("D:\\Кристина\\JavaProjects\\JavaProjects\\src\\main\\resources");
    }

    public static void ShowTypeFilesInDir(String pathDir) {
        File file = new File("D:\\Кристина\\JavaProjects\\JavaProjects\\src\\main\\resources");

        String[] dirListNames = file.list();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dirListNames.length; i++){
            String fileName = dirListNames[i];
            if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != -0 ){
                sb.append(i+1).append(" Расширение файла: ").
                        append(fileName.substring(fileName.lastIndexOf(".") + 1)).
                        append(System.lineSeparator());
            }
            else sb.append(i + 1).append(" Расширение файла: ").append(" ").append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
