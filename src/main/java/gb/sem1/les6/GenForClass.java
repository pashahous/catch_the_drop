package gb.sem1.les6;

import java.util.Random;

public class GenForClass {
    // класс для генерации случайных данных для классов Dog Cat
    private static final String [] nameOfAnimals = new String[]{"Crindle","Brit","Arittany","Brodi","Brook","Guffy","Brownie",
            "Cherokee","Vasper"};
    private static final String [] nameOfHumans = new String[]{"Sysanna","Peter","Boris","Kostya","Fedya","Andrey","Polina","Marina","Pavel",};
    private static final String [] nameOfCompany = new String[]{"Apply","Samsung","Audi","Toyota","EPUM","Great Wall","Xiaomi","Ford","GAZPROM","ASHAN"};

    static Random random = new Random();
//    String inputString;
//    ArrayList<String> exitParams = new ArrayList<String>(3);

//    public GeneratorDataForClass(String inputString){
//        this.inputString = inputString;
//    }

    public static String getHumanName(){//получаем случайное имя человека
        int indx = random.nextInt(nameOfHumans.length);
        return nameOfHumans[indx];
    }
    public static String getAnimalName(){ // получяем случайное имя животного
        int indx = random.nextInt(nameOfAnimals.length);
        return nameOfAnimals[indx];
    }

    public static Integer getRandomNum(int maxAge){
        return random.nextInt(maxAge)+1;
    }
    public static String getCompany(){
        int indx = random.nextInt(nameOfCompany.length);
        return nameOfCompany[indx];

    }
}
