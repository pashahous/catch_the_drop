package gb;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class GameWindow extends JFrame { // создаем класс окна который расширяем (наследуем) от базового класса жейФрейм
    private static GameWindow game_window; //переменная для окна (приватный статический тип переменно - переменнея)

    public  static void main (String[] args){
        game_window = new GameWindow(); // создали объект гэим виндов и ссылку на него положили в переменную
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200,100);
        game_window.setSize(900,600);
        game_window.setResizable(false);
        game_window.setVisible(true);
        game_window.setTitle("Поймай каплю");
    }

    private static void dd() {

    }


}
