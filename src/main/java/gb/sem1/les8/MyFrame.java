package gb.sem1.les8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private final JTextField textField;
    private char operation;
    private double total;
    private boolean isFirstDigit;
    private String lastSymbol = "null";

    public MyFrame() {
        setTitle("Calculator"); //задаём имя окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// дефолтная опервция при закрытии окна
        setBounds(300, 300, 250, 250); // установка положения и размер окна
        setVisible(true);// видимость окна
        isFirstDigit = true; // переменная для понятия первое ли число при парсинге

        total = 0;

        JPanel jPanel = new JPanel();

        textField = new JTextField(15);
        textField.setEditable(false);

        jPanel.add(textField);

        JButton[] jbs = new JButton[9];
        for (int i = 0; i < jbs.length; i++) { // создаем в цыкле кнопки и добавляем для них прослыушинвание событий о нажатии
            jbs[i] = new JButton(String.valueOf(i + 1));
            jbs[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    action(e);
                }
            });
            jPanel.add(jbs[i]); // добавляем их на панель
        }

        JButton buttonZero = new JButton("0");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonDiv = new JButton("/");
        JButton buttonMult = new JButton("*");
        JButton buttonEquals = new JButton("=");
        JButton buttonPow = new JButton("p");
        JButton buttonPoint = new JButton(".");
        JButton buttonClear = new JButton("c"); // clear text field
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculating(e);
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });

        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });
        buttonPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        });


        jPanel.add(buttonZero);
        jPanel.add(buttonPlus);
        jPanel.add(buttonMinus);
        jPanel.add(buttonEquals);
        jPanel.add(buttonMult);
        jPanel.add(buttonDiv);
        jPanel.add(buttonPow);
        jPanel.add(buttonPoint);
        jPanel.add(buttonClear);
        add(jPanel);
    }

    /**
     * 1) Берём текст из текстового поля
     * 2) Идём по каждому символу пока не встретим + или -
     * 3) Затем переводим наше число из String в Double
     * 4) Записываем текущий символ(+ или -)
     * 5) Если у нас уже записано одно число, проводим операцию и переходим на шаг 2, иначе переходим на шаг 2
     *
     * @param e
     */

    private void calculating(ActionEvent e) {
        String text = textField.getText();
        String digit = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '-' || c == '+' || c == '/' || c == '*' || c == 'p') { // пока не встретили знак операции выделяем числа и записываем их в digit
                double currentValue = Double.parseDouble(digit); //  конвертируем аккумулируемыые символы чисел в число
                if (isFirstDigit) {
                    total += currentValue;
                    isFirstDigit = false;
                } else {
                    if (operation == '-') {
                        total -= currentValue;
                    } else if (operation == '+') {
                        total += currentValue;
                    } else if (operation == '*') {
                        total *= currentValue;
                    } else if (operation == '/') {
                        total /= currentValue;
                    } else if (operation == 'p') {
                        total = Math.pow(total, currentValue);
                    }
                }

                digit = "";
                operation = c;
                continue;
            }

            digit += c; // аккумулируем числа в одну строку
        }
        double currentValue = Double.parseDouble(digit);
        if (operation == '-') {
            total -= currentValue;
        } else if (operation == '+') {
            total += currentValue;
        } else if (operation == '*') {
            total *= currentValue;
        } else if (operation == '/') {
            total /= currentValue;
        } else if (operation == 'p') {
            total = Math.pow(total, currentValue);
        }

        isFirstDigit = true;
        textField.setText(String.valueOf(total));
        total = 0;
    }

    public void action(ActionEvent event) { // добавление текста в поле textfield
        String newSymbol = event.getActionCommand();
        if (newSymbol == "c") {
            textField.setText(""); // очищаем техт фиелд
            return;
        }
        if (newSymbol == "+" || newSymbol == "-" || newSymbol == "*" || newSymbol == "/" || newSymbol == "." || newSymbol == "p") {
            //защита от повторного ввода знаков операции
            if (lastSymbol == newSymbol) return;

        }
        textField.setText(textField.getText() + newSymbol);
        lastSymbol = newSymbol;
    }
}
