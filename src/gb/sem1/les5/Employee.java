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
    private String fullName;

    public Integer getAge() {
        return age;
    }

    private String position;
    private String email;
    private String number;
    private Long salary;
    private Integer age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public Long getSalary() {
        return salary;
    }

    public Employee(String fio, String position, String email, String number, Long salary, Integer age) {
        this.fullName = fio;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
 public void printInfo(){
     System.out.println("ФИО: "+ this.fullName);
     System.out.println("Должность: "+ this.position);
     System.out.println("Электронная почта: "+this.email);
     System.out.println("Телефонный номер: "+this.number);
     System.out.println("Зарплата: "+this.salary);
     System.out.println("Возраст: "+ this.age);
 }

}
