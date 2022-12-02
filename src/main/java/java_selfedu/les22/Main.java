package java_selfedu.les22;

import mysolution.GenForClass;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        GenForClass g = new GenForClass();
        List<Person> listOfCompany = new ArrayList<>();
        for (int i =0; i <10 ; i++) {

            listOfCompany.add(new Clients(g.getFIO("123"),g.getRandomNumFromAToB(1980,2005),
                    "Клиент",g.randomPhone(9),g.getAdress("cts")));
        }
        for (int i = 0; i <2 ; i++) {

            listOfCompany.add(new Supervisors(g.getFIO("123"),g.getRandomNumFromAToB(1980,2005),
                    "Начальник",g.randomPhone(9),g.getAdress("cts")));
        }
        for (int i = 0; i <5 ; i++) {

            listOfCompany.add( new Jobs(g.getFIO("123"),g.getRandomNumFromAToB(1980,2005),
                    "Трудяга",g.randomPhone(9),g.getAdress("cts")));
        }

        for (Person person:listOfCompany ) {

            System.out.println(person.getInfo());
            System.out.println(person.getSubdivision());

        }
        System.out.println(listOfCompany.get(2).getCountEmploy());
        System.out.println(listOfCompany.get(3).getCountClients());







    }
}