package gb.sem1.les5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employeeArray[] = new Employee[5];
        employeeArray[0] = new Employee("Shtrih Mih Puh", "Enginer", "shtih@gg.ru", 79787623456L, 4500L, 32);
        employeeArray[1] = new Employee("Nikolyay  ROlyada", "Manager",
                "sqweh@gg.ru", 79787632451L, 4500L, 24);
        employeeArray[2] = new Employee("Shtrih Mih Puh", "Worker",
                "dvsebydethorosho@gg.ru", 79782676347L, 12500L, 45);
        employeeArray[3] = new Employee("Shtrih Mih Puh", "Bedolaga",
                "lakaluka@gg.ru", 79759836327L, 7500L, 55);
        employeeArray[4] = new Employee("Shtrih Mih Puh", "Junior",
                "jithorosho@gg.ru", 797809836313L, 6500L, 35);
        for(Employee empl:employeeArray){
            System.out.println("======================================");
            empl.printInfo();
        }for(Employee empl:employeeArray){
            System.out.println("----------------------------------------");
            if (empl.getAge() > 40) empl.printInfo();
        }

    }
}
