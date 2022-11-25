package mysolution.string;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String dirForFile = "./src/main/java/mysolution/string/voyna-i-mir-tom-1.txt";
//        WordCount wrdc = new WordCount();
//        WordCount.listDir("./src/main/java/mysolution/string",true);
        WordCount.count(dirForFile);
    }

}
