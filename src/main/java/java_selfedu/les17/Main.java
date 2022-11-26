package java_selfedu.les17;

public class Main {
    public static void main(String[] args) throws Exception {
//    Properties p1 = new Properties(5,10,new int[]{255,125,125});
//    Properties p3 = new Properties(50,100,new int[]{255,255,255});
//    p1.printProp();
//    p3.printProp();
        MusicInstrument m = new MusicInstrument(1001, 123L, 1999, 100, 159);
        MusicInstrument m1 = new MusicInstrument(1001, 223L, 2009, 152, 100);
        MusicInstrument m2 = new MusicInstrument(3456, 323L, 1899, 200, 100);
        MusicInstrument m3 = new MusicInstrument(3456, 423L, 1789, 100, 123);
        MusicInstrument m4 = new MusicInstrument(5678, 523L, 1456, 129, 50);
        m.printInfo();
        m1.printInfo();
        m2.printInfo();
        m3.printInfo();
        m4.printInfo();
        m.checkStat();



    }
}
