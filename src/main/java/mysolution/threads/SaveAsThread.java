package main.java.mysolution.threads;


import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

class SaveAsThreadFile implements Runnable{
    private int [] arraiInput;
    private Thread tr;
    private String fileName;
    private String nameThread;

    public SaveAsThreadFile(int[] arraiInput, String fileName, String nameThread) {
        this.arraiInput = arraiInput;
        this.fileName = fileName;
        this.nameThread = nameThread;
        this.tr = new Thread(this);
    }

    public void start(){
        this.tr.start();
    }


    @Override
    public void run() {

        String cwd = System.getProperty("user.dir"); //получаем текущий рабочий каталог

        File f = new File(fileName);
        if (!f.isFile()) { // создаем новый файл если его нет
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileOutputStream fileOut  = new FileOutputStream(f,true);
            System.out.println(fileOut);
            PrintStream ps = new PrintStream(fileOut);
            for (int i = 0; i < arraiInput.length; i++) {
                ps.println(arraiInput[i]);

            }
            fileOut.close();
            ps.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
public class SaveAsThread {
    public static void main(String[] args) {
        int[] arr1 = {-1,2,3,4,5,6,7,2,3,4,234,};
        int[] arr2 = {-1,2,3,4,5,6,7,};
        int[] arr3 = {-1,2,3,4,5,6,7,};
SaveAsThreadFile f1 = new SaveAsThreadFile(arr1,"file2.txt","ThreadF1");
f1.start();

    }
}
