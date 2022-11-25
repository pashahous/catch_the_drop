package mysolution.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.File;

/*клас для подсчета количества слов в файле и
 *  с возможностью фильтрации*/
public class WordCount {
    /**
     * @param dir
     * @param printListFiles
     * @return
     */

    String inputDirForFile;
    Map<String, Integer> countWords = new HashMap<>();


    public static String[] listDir(String dir, boolean printListFiles) {

        File file = new File(dir);
        String[] listFiles = file.list();
        if (printListFiles) {
            for (String str : listFiles) {
                System.out.println(str);
            }
        }

        return listFiles;
    }

    public static String[] listDir(String dir) {
        File file = new File(dir);
        String[] listFiles = file.list();
        return listFiles;
    }


}
