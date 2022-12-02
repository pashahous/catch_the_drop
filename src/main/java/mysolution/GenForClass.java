package mysolution;

import java.util.*;

public class GenForClass {
    // класс для генерации случайных данных
    private static final String[] NAME_OF_ANIMALS = new String[]{"Crindle", "Brit", "Arittany", "Brodi", "Brook", "Guffy", "Brownie",
            "Cherokee", "Vasper"};
    private static final String[] NAME_OF_HUMANS = new String[]{"Sysanna", "Peter", "Boris", "Kostya", "Fedya", "Andrey", "Polina", "Marina", "Pavel","Leha","Fedya"};
    private static final String[] NAME_OF_COMPANY = new String[]{"Apply", "Samsung", "Audi", "Toyota", "EPUM", "Great Wall", "Xiaomi", "Ford", "GAZPROM", "ASHAN"};
    private static final String[] NAME_OF_TYPE_PENCIL = new String[]{"Prostoy", "Tverdui", "Myagkii", "Srednii",};
    private static final String[] COLOR = new String[]{"green", "white", "black", "yellow", "red", "blue","pink"};

    private static final Map<String, String[]> DICT_OF_VALUES_BOOKS = new HashMap<String, String[]>(){{
        // словарь для генерации названия книг
        //имя
        put("n", new String[]{"Алексей", "Дмитрий", "Руслан", "Павел", "Александр", "Николай", "Аркадий", "Инакентий"});
        // прилагательное
        put("p", new String[]{"аннигилирует", "разрывает", "атакует", "наказывает"});
        //существительное
        put("s", new String[]{"врагов", "иноплонетян", "атакующих", "невидимок", "пиратов", "динозавров"});
    }};

    private static final Map<String, String[]> DICT_OF_FIO = new HashMap<String, String[]>(){{
        //словарь для генерации ФИО
        //имя
        put("1", new String[]{"Алексей", "Дмитрий", "Руслан", "Павел", "Александр", "Николай", "Аркадий", "Инакентий"});
        // отчество
        put("2", new String[]{"Андреевич", "Романович", "Алексеевич", "Васильевич","Владимирович","Прокофьевич","Борисович"});
        //фамилия
        put("3", new String[]{"Иванов", "Петров", "Сидоров", "Хребтов", "Ющенков", "Егоров","Лапушков","Бодров","Финов"});
    }};
    private static final Map<String, String[]> DICT_ADRESS  = new HashMap<String, String[]>(){{
        //Страна
        put("c", new String[]{"Россия", "Украина", "Беларусия", "Казахсан", "Латвия", "Татарстан", "Литва", "Армения"});
        // Город
        put("t", new String[]{"Севастополь", "Ростов", "Курган", "Тамбов","Керчь","Белогорск","Симферополь"});
        //Улица
        put("s", new String[]{"Воронежская", "Софиевка", "КОсмическая", "Маленькая", "Большая", "Синяя","Партизан",
                "Восточная","Центральная"});
    }};




    static Random random = new Random();
//    String inputString;
//    ArrayList<String> exitParams = new ArrayList<String>(3);

//    public GeneratorDataForClass(String inputString){
//        this.inputString = inputString;
//    }


    public  String randomPhone(int lenghtPhone){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < lenghtPhone; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
    private   String randomStrFromMapArray(String inputSymbol,Map<String, String[]> map) { //
        String[] strArray = map.get(inputSymbol);
        int randomChois = random.nextInt(strArray.length);
        return strArray[randomChois];
    }

    public  String getAdress(String args){
        //c - страна
        //t - город
        //s - улица

        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < args.length(); i++) {
            String chr = Character.toString(args.charAt(i));
            if (DICT_ADRESS.containsKey(chr)) {
                if (chr.equals("c")){
                    strBuild.append("Страна: ");
                } else if (chr.equals("t")) {
                    strBuild.append("Город: ");
                } else if (chr.equals("s")){
                    strBuild.append("Улица:  ");
                }
                strBuild.append(randomStrFromMapArray(chr, DICT_ADRESS));
                strBuild.append(" ");
            }
        }
        return strBuild.toString();
    }
    public  String getFIO(String args){
        //1 - имена
        //2 - Отчествао
        //3 - Фамилии
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < args.length(); i++) {
            String chr = Character.toString(args.charAt(i));
            if (DICT_OF_FIO.containsKey(chr)) {
                strBuild.append(randomStrFromMapArray(chr, DICT_OF_FIO));
                strBuild.append(" ");
            }
        }
        return strBuild.toString();
    }
    public  String getNameOfBook(String args) {
        //n - имена
        //p - глаголы
        //s - существительные

        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < args.length(); i++) {
            String chr = Character.toString(args.charAt(i));
            if (DICT_OF_VALUES_BOOKS.containsKey(chr)) {
                strBuild.append(randomStrFromMapArray(chr, DICT_OF_VALUES_BOOKS));
                strBuild.append(" ");
            }
        }
        return strBuild.toString();
    }


    public  String getColor() {
        Integer indx = random.nextInt(COLOR.length);
        return COLOR[indx];
    }

    public  String getPencilType() {
        int indx = random.nextInt(NAME_OF_TYPE_PENCIL.length);
        return NAME_OF_TYPE_PENCIL[indx];
    }

    public  String getHumanName() {//получаем случайное имя человека
        int indx = random.nextInt(NAME_OF_HUMANS.length);
        return NAME_OF_HUMANS[indx];
    }
    public static int getRandomNumber(int number){

        return random.nextInt(number);
    }
    public  int getRandomNumFromAToB(int a,int b){

        return (random.nextInt(b-a)) + a;
    }

    public  String getAnimalName() { // получяем случайное имя животного
        int indx = random.nextInt(NAME_OF_ANIMALS.length);
        return NAME_OF_ANIMALS[indx];
    }

    public  Integer getRandomNum(int maxAge) {
        return random.nextInt(maxAge) + 1;
    }

    public  String getCompany() {
        int indx = random.nextInt(NAME_OF_COMPANY.length);
        return NAME_OF_COMPANY[indx];

    }
}
