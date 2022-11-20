package artem_vorov.les14;
/*
Создать класс Robot с параметрами: name, age, power
Реализовать метод booleanfight(RobotanotherRobot): реализовать механизм драки роботов в зависимости от силы. Метод должен
определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет, т.е. возвращать true, если выиграли и
 false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
*/
class Robot {
    public String  name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public int getPower(){
        return this.power;
    }

    public boolean fight(Robot robot) { // check who win, win that who has more power
        System.out.println("Robot " + this.name+ " fight with robot " + robot.name);
        boolean f = this.power > robot.getPower();
        String result = (f)? "Выигралл":"Проигралл";
        System.out.println("Robot " + this.name+ " " + result);
        return f;
    }

}