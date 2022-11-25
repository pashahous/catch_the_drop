package gb.sem1.les6;

/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет
плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/
public abstract class Animal {
    private String name;
    private Integer age;
    public static Integer countOfAllAnimal = 0; // подсчет общего количества животных
    private boolean canSwim;
    private Integer maxDistWalk;
    private Integer maxDistSwim;

    public Animal(String name, Integer age, boolean canSwim, Integer maxDistWalk, Integer maxDistSwim) {
        this.name = name;
        this.age = age;
        this.canSwim = canSwim;
        this.maxDistWalk = maxDistWalk;
        this.maxDistSwim = maxDistSwim;

        countOfAllAnimal += 1;
    }

    public void walk(int dist) { // метод бежать
        if (dist > this.maxDistWalk) {
            System.out.println(getClassName() + "  " + this.name + " пробежал " + this.maxDistWalk);
            System.out.println("Больше к сожалению он не может");
        } else  System.out.println( getClassName() + " " +this.name + " пробежал " + dist);
    }

    public void swim(int dist) {// метод плыть
        if (canSwim) {
            if (dist > this.maxDistSwim) {
                System.out.println(getClassName() + "  " + this.name + " проплыл " + this.maxDistSwim);
            }else System.out.println(getClassName() +" " +this.name + " проплыл " + dist);
        }
    }
    abstract public void getCount();// реализация получения числа животных одного класса
    public static
    void getCountAllAnnimal(){
        System.out.println("Общее количество созданных животных =" + countOfAllAnimal);
    }

    String getClassName(){
        String clasName = "";
        if (this instanceof Cat){
            clasName = "Кот";
        }
        if (this instanceof Dog){
            clasName = "Собака";
        }
        return  clasName;
    }
}
