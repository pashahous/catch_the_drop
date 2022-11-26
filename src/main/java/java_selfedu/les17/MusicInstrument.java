package java_selfedu.les17;

import java.util.HashMap;
import java.util.Map;

public class MusicInstrument {
    private Integer typeOfInstrument;
    private long price;
    private int yearBurn;
    private Gabaritu gabaritu;


    public MusicInstrument(int typeOfInstrument, long price, int yearBurn, int w, int h) {
        this.typeOfInstrument = typeOfInstrument;
        this.price = price;
        this.yearBurn = yearBurn;
        this.gabaritu = new Gabaritu(w,h);
        checkTypeInstrumentAndPutInMap(typeOfInstrument);
    }

    static void checkTypeInstrumentAndPutInMap(int type){
        if (Stat.typeCount.containsKey(type)){
            Integer count = Stat.typeCount.get(type);
            Stat.typeCount.put(type,count + 1);
        } else{
            Stat.typeCount.put(type,1);
        }
    }
    public void printInfo(){
        System.out.printf("Тип инструмента= %d\nЦена= %d\nГод производства=%d\n Габариты: Ширина: %d Высота: %d \n",
                this.typeOfInstrument,this.price,this.yearBurn,this.gabaritu.width,this.gabaritu.height);
    }
    public void checkStat(){
        for (Map.Entry<Integer,Integer> entry:Stat.typeCount.entrySet()) {
            System.out.printf("Тип инструмента: %d  Его количество %d",entry.getKey(),entry.getValue());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
    }
    class Gabaritu{ // вспомогательный класс свойство - габариты
        Integer width,height;

        public Gabaritu(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
    static class Stat{
        public static Map<Integer,Integer> typeCount = new HashMap<>();

    }
}
