package artem_vorov.les14;

public class BasePet {
    String namePet;
    int age;
    Woman owner; // владедец

    public BasePet(String name, int age) { // если не задан воладелец то null
        this.namePet = name;
        this.age = age;
        this.owner = null; // хозяин
    }

    public BasePet(String name, int age, Woman owner) {
        this.namePet = name;
        this.age = age;
        this.owner = owner; // хозяин
//        System.out.println("Create pet with name " + this.namePet);
//        System.out.println("Add to owner with name " + this.owner);
    }

    public Woman getOwner() { // возвращает владельца
        return this.owner;
    }

    public void setOwner(Woman owner) {
        this.owner = owner;
        this.owner.addPet(this);

    }

    @Override // переопределение метода вывода на экран
    public String toString(){
        String ow = (this.owner == null)? "--Хозяина пока нет--" : this.owner.name; //check is null?
        return " У питомца по имени \""+this.namePet+
                "\" есть Хозяин по имени =\"" + ow+"\"";
    }
}
