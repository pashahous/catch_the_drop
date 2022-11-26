package java_selfedu.les18;

import java.util.ArrayList;

public class Main {
//    ArrayList<Mebel> arrMebel = new ArrayList<>();
public static void main(String[] args) {
    Stol m1 = new Stol("Stol",123,123.5,100,4,100);
    Mebel m2 = new Polka("polka",450,56.7,34.5,5,34,12);
    Mebel m3 = new Shkaf("shkaf",555,12.2,45.2,"derevo",4,12);
    Mebel m4 = new Styl("Styl",777,54.6,23.5,4,122.4f,true);
    m1.printInfo();
    m2.printInfo();
    m3.printInfo();
    m4.printInfo();

}



}
