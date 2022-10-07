package Lab_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
// 8. Создайте объекта класса «Текст», используя класс «Абзац».
// Перегрузить и переопределить три метода (используя класс свозможности другого класса).

class gui_for_lab3 {
    public static void main(String[] args) {
        ComPolFram1 fram = new ComPolFram1();
        fram.setVisible(true);
    }
}

class ComPolFram1 extends JFrame {

    private JLabel label1 =       new JLabel("Введите пожалуйста колличество абзацев :\n");
    private JLabel label2 =       new JLabel("Для начала образуем объект класса Text , используя вспомогательный базовый класс Paragraf ");
    private Container container = this.getContentPane();
    private TextField input2 =    new TextField();
    private JButton button2 =     new JButton("Выделить память под абзацы");
    private JButton button3 =     new JButton("Считать");
    private static int size ; // переменная , которая будет хранить колличетсов абзацев в тексте

    public static int get_Size () {
        return size;
    }

    public ComPolFram1() {
        super(" Lab 1 -  Text  +  Paragraf ");
        this.setBounds(120, 100, 615, 200);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 204, 255));  //Whatever color
        container.setLayout(null);

        add(label2);
        label2.setBounds(10, 10, 750, 20);
        add(label1);
        label1.setBounds(170, 40, 300, 20);
        add(input2);
        input2.setBounds(200, 80, 200, 20);
        add(button2);
        button2.setBounds(190, 120, 220, 20);

        button2.addActionListener(new ButtonEventListiner1());
    }

    class ButtonEventListiner1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            try {
                size = Integer.parseInt(input2.getText().trim());
                if (size == 0 ) {
                    throw new RuntimeException();
                }
                    ComPolFram2 f = new ComPolFram2();
                    f.setVisible(true);
            }
            catch ( RuntimeException exception ) {
                JOptionPane.showMessageDialog(null, " Вы ввели ноль , или объект отличный от типа int :( " , "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                return ;
            }
        }
    }
}

class ComPolFram2 extends JFrame {

    private JLabel mas[];
    private TextField input1[];
    private String arr[];
    private int size =  ComPolFram1.get_Size() ; // переменная , которая будет хранить колличетсов абзацев в тексте
    private Container container = this.getContentPane();
    private JButton button2 =   new JButton("Выделить память под абзацы");
    private JButton button3 =   new JButton("Получить данные из абзацев и создать объект текст");
    private JLabel label1 =     new JLabel("Ваш текст будет состоять из - " + size + " абзацев / (а) ");
    private JLabel label2 =     new JLabel(" Общая информация о вашем тексте и абзацах : ");
    private JLabel label3 =     new JLabel(" Функции для работы с текстом : ");
    private JLabel label4 =     new JLabel(" Поиск подстроки в тексте : ");
    private JLabel label5 =     new JLabel(" Введите пожалуйста слово , которое хотите найти : ");
    private JTextField input2 = new JTextField("", 20);
    private JButton button4 =   new JButton("Выполнить поиск");
    private JLabel label6 =     new JLabel(" Удалить данные из абзаца  : ");
    private JLabel label8 =     new JLabel(" Введите пожалуйта номер абзаца , который хотите очистить : ");
    private JTextField input3 = new JTextField("", 20);
    private JButton button5 =   new JButton("Очистить");
    private JLabel label9 =     new JLabel(" Изменить регистр текста : ");
    private JButton button6 =   new JButton("Изменить регистр на нижний");
    private JButton button7 =   new JButton("Изменить регистр на верхний");
    private JLabel label12 =    new JLabel("Изменить абзац : ");
    private JLabel label13 =    new JLabel("Введите пожалуйта номер абзаца , который хотите изменить : ");
    private JTextField input5 = new JTextField("", 20);
    private JButton button8 =   new JButton("Изменить");
    private JLabel label14 =    new JLabel("Введите пожалуйта данные на которые хотите изменить : ");
    private JTextField input6 = new JTextField("", 20);
    private JLabel label15 =    new JLabel("Инверсия текста : ");
    private JButton button9 =   new JButton("Инвертировать");

    public ComPolFram2() {
        super(" Ваш текст  ");
        this.setBounds(110, 10, 1055, 650/* 150 + (size * 35) */ );
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 204, 255));  //Whatever color
        container.setLayout(null);

        add(label2);
        label2.setBounds(145, 10, 500, 20);
        add(label1);
        label1.setBounds(155, 30, 300, 20);
        add(label3);
        label3.setBounds(700, 10, 300, 20);
        add(label4);
        label4.setBounds(720, 30, 300, 20);
        add(label5);
        label5.setBounds(650, 60, 400, 20);
        add(input2);
        input2.setBounds(620, 90, 400, 20);
        add(button4);
        button4.setBounds(620, 120, 400, 20);
        add(label6);
        label6.setBounds(720, 150, 400, 20);
        add(label8);
        label8.setBounds(620, 180, 400, 20);
        add(input3);
        input3.setBounds(620, 210, 400, 20);
        add(button5);
        button5.setBounds(620, 240, 400, 20);
        add(label9);
        label9.setBounds(730, 270, 400, 20);
        add(button6);
        button6.setBounds(620, 300, 400, 20);
        add(button7);
        button7.setBounds(620, 330, 400, 20);
        add(label12);
        label12.setBounds(760, 370, 400, 20);
        add(label13);
        label13.setBounds(620, 400, 400, 20);
        add(input5);
        input5.setBounds(620, 430, 400, 20);
        add(label14);
        label14.setBounds(620, 460, 400, 20);
        add(input6);
        input6.setBounds(620, 490, 400, 20);
        add(button8);
        button8.setBounds(620, 520, 400, 20);
        add(label15);
        label15.setBounds(760, 550, 400, 20);
        add(button9);
        button9.setBounds(620, 580, 400, 20);

        input1 = new TextField[size];
        mas = new JLabel[size];
        int j = 0; int w = 0;
        for (int i = 0; i < size; i++) {
            j += 30;
            mas[w] = new JLabel(1 + w + " Абзац");
            input1[i] = new TextField(0);
            container.add(mas[w]);
            container.add(input1[i]);
            input1[i].setBounds(90, 30 + j, 400, 20);
            mas[w].setBounds(10, 30 + j, 60, 20);
            w++;
        }

        add(button3);
        button3.setBounds(90, 60 + j, 400, 20);

        button2.addActionListener(new ButtonEventListiner1());
        button3.addActionListener(new ButtonEventListiner1());
        button4.addActionListener(new ButtonEventListiner1());
        button5.addActionListener(new ButtonEventListiner1());
        button6.addActionListener(new ButtonEventListiner1());
        button7.addActionListener(new ButtonEventListiner1());
        button8.addActionListener(new ButtonEventListiner1());
        button9.addActionListener(new ButtonEventListiner1());
    }

    class ButtonEventListiner1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            arr = new String[size];
            if (e.getActionCommand() == "Получить данные из абзацев и создать объект текст") {
                for (int i = 0; i < size; i++) {
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                // Для начала покажем как наша программа образует текст из абзацев.
                // Делаем так , чтобы база ссылалась на своего наследника -
                // А далее приведем небольшой пример полиморфизма , и покажем работу наших переопределных методов -
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                // Далее выводим в спецальном окне все наши парагрфафы , сформировав таким образом объект Text
                // Сейчас у нас вызовется переопределеный метод getData класса Text1 (наследника)
                JOptionPane.showMessageDialog(null, "Ваш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
            }
            if (e.getActionCommand() == "Выполнить поиск") {
                for (int i = 0; i < size; i++) {
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                try {
                    if (  input2.getText().trim().isEmpty() == true ) {
                        throw new RuntimeException();
                    }
                }
                catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null,  " Вы ввели пустую строку в поле для поиска :(", "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                    return ;
                }
                String tmp = your_text.Finder(input2.getText().trim());
                JOptionPane.showMessageDialog(null, "Поиск был успешно выполнен :\n" + tmp, "Результат работы ", JOptionPane.PLAIN_MESSAGE);
            }
            if (e.getActionCommand() == "Очистить") {
                try {
                    int num = Integer.parseInt(input3.getText().trim());
                    if (num <= 0 || num >= size+1 ) {
                        throw new RuntimeException();
                    }
                    try {
                        if (input1[num - 1].getText().trim().isEmpty() == true )
                            throw new RuntimeException();
                    }
                    catch (RuntimeException exception) {
                        JOptionPane.showMessageDialog(null, " Этот парагрфа и так пуст :) " , "Результат работы " , JOptionPane.PLAIN_MESSAGE);
                        return ;
                    }
                input1[num - 1].setText("");
                for (int i = 0; i < size; i++) {
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                JOptionPane.showMessageDialog(null, "Все данные из " + num + " параграфа , были успешно удаленны.\n --------------------------------------------\nВаш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                return ;
                }
                catch ( RuntimeException exception ) {
                    JOptionPane.showMessageDialog(null, "Вы ввели index отличный от типа int , либо вышли за границы массива абзацев ", "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                    return ;
                }
            }
            if (e.getActionCommand() == "Изменить регистр на нижний") {
                for (int i = 0; i < size; i++) {
                    input1[i].setText(input1[i].getText().toLowerCase(Locale.ROOT));
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                JOptionPane.showMessageDialog(null, "Ваш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
            }
            if (e.getActionCommand() == "Изменить регистр на верхний") {
                for (int i = 0; i < size; i++) {
                    input1[i].setText(input1[i].getText().toUpperCase(Locale.ROOT));
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                JOptionPane.showMessageDialog(null, "Ваш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
            }
            if (e.getActionCommand() == "Изменить") {
                try {
                    int num = Integer.parseInt(input5.getText().trim());
                    if (num < 0 || num >= size+1) {
                        throw new RuntimeException();
                    }
                    input1[num - 1].setText(input6.getText());
                    for (int i = 0; i < size; i++) {
                        arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                    }
                    Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                    JOptionPane.showMessageDialog(null, "Ваш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception ) {
                    JOptionPane.showMessageDialog(null, "Вы ввели index отличный от типа int , либо вышли за границы массива абзацев ", "Результат работы ", JOptionPane.PLAIN_MESSAGE);
                    return ;
                }
            }
            if (e.getActionCommand() == "Инвертировать") {
                for (int i = 0; i < size; i++) {
                    String d = new StringBuilder(input1[i].getText()).reverse().toString();
                    input1[i].setText(d); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                    arr[i] = input1[i].getText(); // пользователь вводит колличество абзацев , а далее последовательно заполняет их
                }
                Paragraf your_text = new Text1(size, arr); // выделяем память под объект типа Text1 - который представляет собой "обертку" над массивом абзацев
                JOptionPane.showMessageDialog(null, "Ваш текст :\n" + your_text.getData(), "Результат работы ", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    class Paragraf {
        // В задании было сказаанно , перегрузить и переопределить 3 метода.
        //В качестве перегруженых методов , у нас будут выступать методы setProp , и конструкторы класса.
        // А в качестве метдов , которые мы переопределяем в наследнике - будут выступать методы - getData , Length , Finder
        public String[] arr; // массив предложений типа String, которые формируют наш абзац
        private int size;     // колличство предложений в нашем массиве

        public Paragraf() {    // ctor по умолчанию
            arr = null;
            size = 0;
        }

        public Paragraf(String[] arr) { // ctor , который принимает массив строк , а далее  переданный массив строк - мы копируем в наш внутрений массив
            this.size = arr.length; // копируем размер
            arr = new String[this.size]; // выделяем память под наш массив
            System.arraycopy(arr, 0, this.arr, 0, this.size); // копируем переданый массив в наш
        }

        public Paragraf(String s) {  // ctor , который принимает одну строку
            size++;
            arr = new String[this.size]; // выделяем память
            arr[size - 1] = s; // записываем элемент в наш массив строк на нулевое место
        }

        public String getData() { // геттер ,который мы переопределим в наследнике
            String tmp = "";       // он возвращает массив строк , из которых состоит наш параграф
            for (var x : arr) {
                tmp += x;
            }
            return tmp;
        }

        public int Length() { // функцию Length - мы так же переопределим
            int count = 0; // счетчик
            for (var x : arr) {
                count++; // при каждой итерации увеличиваем на 1
            }
            return count; // возвращаем колличество строк в абзаце
        }

        public String Finder(String in) { // и функция Finder - так же будет переопределена в наслденике
            // Данная функция , нужна для поиска подстроки в абзаце

            // Scanner in = new Scanner(System.in);
            System.out.println("Введите пожалуйста подстроку , которую вы хотели-бы найти - ");
            String substring = in;
            int index = 0;
            boolean some = false;
            for (int i = 0; i < arr.length; i++) { // Перебираем каждую строку из абзаца.
                // Если нашли подстроку - то сообщаем пользователю номер строки и + индекс вхождения подстроки
                if (arr[i].indexOf(substring) != -1) {
                    System.out.println("Подстрока начинается с " + arr[i].indexOf(substring) + " символа в " + (i + 1) + " строке абзаца ");
                    some = true;
                }
                if (some == false) {
                    System.out.println("Подстрока не была найдена в абзаце ");
                }
            }
            return "";
        }

        public void setProp(String[] arr) { // сеттер , который прнимает массив строк
            this.size = arr.length; // копируем размер
            arr = new String[this.size]; // выделяем память под наш массив
            System.arraycopy(arr, 0, this.arr, 0, this.size); // копируем переданый массив в наш
        }

        public void setProp() { // сеттер - который мы переопределим в наследнике Text1
            arr = null;
            size = 0;
        }

        public void setProp(String s) { // сеттер , который принимает строку , и записывает ее во внутрений массив . Ее мы так же переопределим в наследнике
            size = 1;
            arr = new String[this.size]; // выделяем память
            arr[size - 1] = s; // записываем элемент в наш массив
        }

        @Override
        public String toString() { // функция , которая выводит наш объект в удобном для восприятия формате
            String str = String.join(" . ", arr);
            return str;
        }
    }

    class Text1 extends Paragraf {
        private Paragraf[] prop; // массив параграфов , которые формируют наш текст
        private int numParagraf; // колличество параграфов

        public Text1() { // ctor по умолчанию
            numParagraf = 0;
            prop = null;
        }

        public Text1(String s) { // сtor , который принимает объект типа String , и записывает его во внутрений массив абзацев
            numParagraf++;
            prop[numParagraf - 1] = new Paragraf(s);
        }

        public Text1(Paragraf[] s) { // ctor , который принимает массив параграфов
            numParagraf = s.length; // копируем размер
            prop = new Paragraf[numParagraf]; // выделяем память под наш массив
            System.arraycopy(s, 0, prop, 0, numParagraf); // копируем переданый массив в наш
        }

        public Text1(int size, String[] mas) { // ctor , котоорый принимает параметр - колличество абзацев , из которых состоит наш текст , и массив строк . 1 строка соотвествует одноу объекту Paragraf
            numParagraf = size;
            prop = new Paragraf[numParagraf];
            for (int i = 0; i < prop.length; i++) {
                //     prop[i] = new Paragraf(in.nextLine());
                prop[i] = new Paragraf(mas[i]);// при каждой иттерации цикла , в наш внтуреный массив абзацев , записываем объект типа Paragraf.
            }
        }

        public void setParagraf(Paragraf[] s) { // сеттер , который принимет массив объектов типа Paragraf
            numParagraf = s.length; // копируем размер
            prop = new Paragraf[numParagraf]; // выделяем память под наш массив
            System.arraycopy(s, 0, prop, 0, numParagraf); // копируем переданый массив в наш
        }

        @Override
        public void setProp() { // сеттер
            numParagraf = 0;
            prop = null;
        }

        @Override
        public void setProp(String s) { // сеттер
            numParagraf = 1;
            prop = new Paragraf[numParagraf];
            prop[numParagraf - 1] = new Paragraf(s);
        }

        @Override
        public String toString() { // пергруженный метод toString - который выводит данные в удобном для нас виде
            for (var x : prop) System.out.println("" + x);
            return "";
        }

        @Override
        public String getData() { // переопределеный геттер
            String tmp = "";
            for (var x : prop) {
                tmp += "\n\t" + x;
            }
            if ( tmp.trim().isEmpty() == true ) {
                tmp = "\n В вашем тексте нет информации :( Заполните как минимум один абзац";
                return tmp.trim() ;
            }
            return tmp;
        }

        @Override
        public int Length() { // переопределеная функцию Length
            int count = 0;
            for (var x : prop) {
                count++;
            }
            return count;
        }

        @Override
        public String Finder(String in) { // и функция Finder - так же будет переопределена в наслденике
            // Данная функция , нужна для поиска подстроки в абзаце
            String tmp = "";
            String substring = in;
            boolean some = false;
            for (int i = 0; i < prop.length; i++) { // в первом цикле перебираем объекты (параграфы) - класса Paragraf
                for (int j = 0; j < prop[i].arr.length; j++) { // во втором цикле , обращаемся к каждому объекту типа Paragraf , далее образаемся к его внутренему массиву строк , и ищем совпадение в строках
                    if (prop[i].arr[j].indexOf(substring) != -1) {
                        tmp += "Подстрока начинается с " + prop[i].arr[j].indexOf(substring) + " символа в " /* + j + " строке " */ + (1 + i) + " абзаце \n";
                        some = true;
                    }
                }
            }
            if (some == false) {
                tmp += "Подстрока не была найденна \n";
                System.out.println("Подстрока не была найденна");
            }
            return tmp;
        }
    }
}
