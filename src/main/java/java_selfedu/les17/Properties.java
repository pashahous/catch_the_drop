package java_selfedu.les17;

public class Properties {
    private int width_line = 0;
    private int type_line = 0;
    private Color color;


    public Properties(int width_line, int type_line, int[] color) throws Exception {
        this.width_line = width_line;
        this.type_line = type_line;
        this.color = new Color(color);
    }

    public void printProp(){
        System.out.printf("Толщина линии %d; \n Тип линии %d; \n Цвета R=%d G=%d B=%d", this.width_line, this.type_line,
                this.color.r,this.color.g,this.color.b);
    }
    class Color{
        private int r;
        private int g;
        private int b;

        public Color(int[] rgb) throws Exception {
            this.r = checkValue(rgb[0]);
            this.g = checkValue(rgb[1]);
            this.b = checkValue(rgb[2]);
        }
        private int checkValue(int value) throws Exception {
            if (value >= 0 && value <= 255){
                return value;
            } else {
                throw new Exception(" Данные должны быть в диапозоне 0 - 255");
            }
        }

    }
}
