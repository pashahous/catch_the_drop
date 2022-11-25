package mysolution.string;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*клас для подсчета количества слов в файле и
 *  с возможностью фильтрации*/
public class WordCount {


    String inputDirForFile;
    Map<String, Integer> countWords = new HashMap<>();

    public static void count(String dirToFile) throws IOException {
        File file = new File(dirToFile);
//        FileInputStream fileIn = new FileInputStream(file);
//        int lenghtFile = fileIn.available(); //  узнаем размер файла
//        byte[] data = new byte[lenghtFile]; // create  array of bytes for input data
//        fileIn.read(data);// записываем  в data данные из потока
//        String text = new String(data);
//        String[] linesData = text.split("\n");
//        int count = 0; // для вывода части текста
//        for (String str : linesData) {
//            if (count > 20) break;
//            System.out.println(count + "   " + str);
//            count++;
//        }
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF8"));
        String text = in.toString();
        System.out.println(text);
//        String[] linesData = text.split("\n");
//        int count = 0; // для вывода части текста
//        for (String str : linesData) {
//            if (count > 20) break;
//            System.out.println(count + "   " + str);
//            count++;
//        }

//        return ;
    }

    public static String[] listDir(String dir, boolean printListFiles) {
/**
 * @param dir dir for file
 * @param printListFiles if true -> print list else not print
 * @return listFiles
 */
        File file = new File(dir);
        String[] listFiles = file.list();
        if (printListFiles) { //вывод путей к файлам
            for (int i = 0; i < listFiles.length; i++) {
                System.out.println(i + "  " + listFiles[i]);
            }
        }
        return listFiles;
    }

    public static String[] listDir(String dir) { //  возврат всех файлов
        File file = new File(dir);
        String[] listFiles = file.list();
        return listFiles;
    }


}
