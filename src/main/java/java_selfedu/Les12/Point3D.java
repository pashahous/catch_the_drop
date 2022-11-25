package java_selfedu.Les12;

public class Point3D {
    int x;
    int y;
    int z;

    public Point3D(){
        System.out.println("Координаты заданы при создании объекта, в случайном порядке");
        this.x = (int)(Math.random() * 200);
        this.y= (int)(Math.random() * 200);
        this.z = (int)(Math.random() * 200);
    }
    public Point3D(int x, int y, int z){
        System.out.println("Координаты заданы при создании объекта, в случайном порядке");
        this.x = x;
        this.y= y;
        this.z = z;
    }


    public  void printXYZ(){
        System.out.printf("x= %d  y= %d  z= %d \n",this.x,this.y,this.z);

    }
}
