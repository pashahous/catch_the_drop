package java_selfedu.Les8_1;


public class StringLes {

    public static void test1(){
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
    }

    public static void splitText(String str){
        //разбитие строки по пробелам

        String[] words = str.split(" ");
        for (String word: words) {
            System.out.println(word);

        }

    }
    public static String replace(String strInput,char [] listOfSymbols){
        //проходим по списку символов и заменяем их на пробел
        if (listOfSymbols == null && listOfSymbols.length == 0){ return strInput; }
        for ( char symbol: listOfSymbols){
            strInput = strInput.replace(symbol, ' ');
        }
        return strInput;


    }


}
