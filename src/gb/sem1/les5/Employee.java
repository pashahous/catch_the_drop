package gb.sem1.les5;
/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Employee {
    private String fio;

    public Integer getAge() {
        return age;
    }

    private String position;
    private String email;
    private Long number;
    private Long salary;
    private Integer age;

    public Employee(String fio, String position, String email, Long number, Long salary, Integer age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
 public void printInfo(){
     System.out.println("ФИО: "+ this.fio);
     System.out.println("Должность: "+ this.position);
     System.out.println("Электронная почта: "+this.email);
     System.out.println("Телефонный номер: "+this.number);
     System.out.println("Зарплата: "+this.salary);
     System.out.println("Возраст: "+ this.age);
 }

}
