package Lab_7;

import javax.swing.*;
import java.awt.*;
import java.lang.RuntimeException;
import java.util.LinkedList;
import Lab_4.Polynom;

// 8 ) Înmulţiţi două polinoame de grad fix, în cazul în care coeficienţii de polinoame sunt stocate în List.
// 8 ) Умножьте два многочлена фиксированной степени, если коэффициенты многочленов сохранены в списке.

public class Lab7 extends javax.swing.JFrame {

    private JLabel     label1    = new JLabel( " Первый список ( полином )  :\n");
    private JLabel     label2    = new JLabel( " Второй список ( полином )  :");
    private JTextField input1    = new JTextField("" , 20);
    private JTextField input2    = new JTextField("" , 20);
    private JLabel     label3    = new JLabel("");
    private JLabel     label4    = new JLabel("");
    private JLabel     label5    = new JLabel("");
    private JButton    button3   = new JButton(" Произведение полиномов ");
    private JButton    button4   = new JButton(" Сумма полиномов ");
    private JButton    button5   = new JButton(" Разность полиномов ");
    private JLabel     label6    = new JLabel( " Программа разделенна на 2 части :");
    private JLabel     label7    = new JLabel( " ( Функции для работы с полиномами | Функции для работы со списками )");
    private JLabel     label8    = new JLabel( " 1) Функции для работы с полиномами ");
    private JLabel     label9    = new JLabel( " 2) Функции для работы со списками " );
    private JLabel     label10   = new JLabel( " Добавление элемента в список " );
    private JLabel     label11   = new JLabel( " В какой список , вы хотите добавить чсло ? ( 1 или 2 ) - " );
    private JTextField input3    = new JTextField("" , 20);
    private JLabel     label12   = new JLabel( " Введите пожалуйста какое число вы хотите добавить - " );
    private JLabel     label13   = new JLabel( " Под каким индексом , вы хотите добавить число - " );
    private JTextField input5    = new JTextField("" , 20);
    private JButton    button6   = new JButton(" Добавить ");
    private JTextField input4    = new JTextField("" , 20);
    private JLabel     label17   = new JLabel( "Удаление элемента из списка  " );
    private JLabel     label14   = new JLabel( " Из какого списка , вы хотите удалить чсло ? ( 1 или 2 ) - " );
    private JTextField input6    = new JTextField("" , 20);
    private JLabel     label16   = new JLabel( " Под каким индексом , вы хотите удалить число - " );
    private JTextField input7    = new JTextField("" , 20);
    private JButton    button7   = new JButton(" Удалить ");


    public Lab7() {
        super(" Lab 7 - умножение полиномов ");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed1(evt);
                    } });

        input2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed2(evt);
            } });

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked3(evt); } });

        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked4(evt); } });

        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked5(evt); } });

        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked6(evt); } });

        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked7(evt); } });

        label3.setForeground(new java.awt.Color(255, 51, 51));
        label4.setForeground(new java.awt.Color(255, 51, 51));
        label5.setForeground(new java.awt.Color(255, 51, 51));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        this.setLayout(null);
        getContentPane().setBackground(new Color(255 , 204 , 255	));  //Whatever color
        this.setBounds(100 , -20 , 555 , 705 );
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_VERT);

        add(label1);
        label1.setBounds(10, 10, 500, 20);
        add(input1);
        input1.setBounds(10, 30, 500, 20);
        add(label3);
        label3.setBounds(10, 50, 500, 20);
        add(label2);
        label2.setBounds(10, 70, 500, 20);
        add(input2);
        input2.setBounds(10, 90, 500, 20);
        add(label4);
        label4.setBounds(10, 115, 500, 20);
        add(label6);
        label6.setBounds(150, 135, 500, 20);
        add(label7);
        label7.setBounds(40, 155, 500, 20);
        add(label8);
        label8.setBounds(150, 185, 500, 20);
         add(button3);
         button3.setBounds(10, 225, 500, 20);
        add(button4);
        button4.setBounds(10, 255, 500, 20);
        add(button5);
        button5.setBounds(10, 285, 500, 20);

        add(label9);
        label9.setBounds(150, 325, 500, 20);
        add(label10);
        label10.setBounds(169, 355, 500, 20);
        add(label11);
        label11.setBounds(10, 375, 500, 20);
        add(input3);
        input3.setBounds(10, 395, 500, 20);
        add(label12);
        label12.setBounds(10, 415, 500, 20);
        add(input4);
        input4.setBounds(10, 435, 500, 20);
        add(label13);
        label13.setBounds(10, 455, 500, 20);
        add(input5);
        input5.setBounds(10, 475, 500, 20);
        add(button6);
        button6.setBounds(10, 505, 500, 20);

        add(label17);
        label17.setBounds(169, 535, 500, 20);
        add(label14);
        label14.setBounds(10, 560, 500, 20);
        add(input6);
        input6.setBounds(10, 580, 500, 20);
        add(label16);
        label16.setBounds(10, 600, 500, 20);
        add(input7);
        input7.setBounds(10, 620, 500, 20);
        add(button7);
        button7.setBounds(10, 645, 500, 20);

    }

    private void jTextArea1KeyPressed1 (java.awt.event.KeyEvent evt) {
        try{
            if(evt.getKeyCode()>=48 && evt.getKeyCode()<=57||evt.getKeyCode()==32){
                label3.setText(""+evt.getKeyChar());
            }
            else
                throw new RuntimeException();
        }
        catch(RuntimeException e){
            label3.setText("Вы вввели не число !");
        }
    }

    private void jTextArea1KeyPressed2 (java.awt.event.KeyEvent evt) {
        try{
            if(evt.getKeyCode()>=48 && evt.getKeyCode()<=57||evt.getKeyCode()==32){
                label4.setText(""+evt.getKeyChar());
            }
            else
                throw new RuntimeException();
        }
        catch(RuntimeException e){
            label4.setText("Вы вввели не число !");
        }
    }

    private int jButton1MouseClicked3 (java.awt.event.MouseEvent evt) {
        Double_LinkedList c = new Double_LinkedList();

        LinkedList<Double> one ;
        LinkedList<Double> two ;

        try{
           one = c.create_double_list(input1.getText());
        }
        catch(RuntimeException e ){
            label3.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // если словоили исключение - вывести сообщение об ошибке , и выйти из функции
        }
        label3.setText(""); // нужно очистить инфрмацию об прошлой ошибке

        Double_LinkedList d = new Double_LinkedList();
        try{
           two = d.create_double_list(input2.getText());
        }
        catch(RuntimeException e ){
            label4.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1;  // если словоили исключение вывести сообщение об ошибки , и выйти из функции
        }
        label4.setText(""); // если произошел выход - нужно очистить инфрмацию об прошлой ошибке

        try {
            if ( one.size() != two.size() )
                throw new RuntimeException();
        } catch (RuntimeException e) {
            label4.setText(" Степени полиномов не совпадают (попробуйте снова) ");
            JOptionPane.showMessageDialog(null, " Степени полиномов должны быть одинаковые :( ", "Результат - ", JOptionPane.PLAIN_MESSAGE);
            return -1; // Выход с ошибкой
        }
        label4.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        c.multiplication_of_polynomials( one , two ); // если исключение не было выброшенно - вызываем функцию цмножения полиномов
        return 0;
    }

    private int jButton1MouseClicked4 (java.awt.event.MouseEvent evt) {
        Double_LinkedList c = new Double_LinkedList();

        LinkedList<Double> one ;
        LinkedList<Double> two ;

        try{
            one = c.create_double_list(input1.getText());
        }
        catch(RuntimeException e ){
            label3.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // если словоили исключение вывести сообщение об ошибки , и выйти из функции
        }
        label3.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        Double_LinkedList d = new Double_LinkedList();
        try{
            two = d.create_double_list(input2.getText());
        }
        catch(RuntimeException e ){
            label4.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1;  // если словоили исключение вывести сообщение об ошибки , и выйти из функции
        }
        label4.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        try {
            if ( one.size() != two.size() )
                throw new RuntimeException();
        } catch (RuntimeException e) {
            label4.setText(" Степени полиномов не совпадают (попробуйте снова) ");
            JOptionPane.showMessageDialog(null, " Степени полиномов должны быть одинаковые :( ", "Результат - ", JOptionPane.PLAIN_MESSAGE);
            return -1; // Выход с ошибкой
        }
        label4.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        c.summ( one , two ); // если исключение не было выброшенно - вызываем функцию цмножения полиномов
        return 0;
    }

    private int jButton1MouseClicked5 (java.awt.event.MouseEvent evt) {
        Double_LinkedList c = new Double_LinkedList();

        LinkedList<Double> one ;
        LinkedList<Double> two ;

        try{
            one = c.create_double_list(input1.getText());
        }
        catch(RuntimeException e ) {
            label3.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // если словоили исключение вывести сообщение об ошибки , и выйти из функции
        }
        label3.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        Double_LinkedList d = new Double_LinkedList();
        try{
            two = d.create_double_list(input2.getText());
        }
        catch(RuntimeException e ){
            label4.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1;  // если словоили исключение вывести сообщение об ошибки , и выйти из функции
        }
        label4.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        try {
            if ( one.size() != two.size() )
                throw new RuntimeException();
        } catch (RuntimeException e) {
            label4.setText(" Степени полиномов не совпадают (попробуйте снова) ");
            JOptionPane.showMessageDialog(null, " Степени полиномов должны быть одинаковые :( ", "Результат - ", JOptionPane.PLAIN_MESSAGE);
            return -1; // Выход с ошибкой
        }
        label4.setText(""); // сли произошел выход - нужно очистить инфрмацию об прошлой ошибке

        c.difference( one , two ); // если исключение не было выброшенно - вызываем функцию цмножения полиномов
        return 0;
    }

    private int jButton1MouseClicked6 (java.awt.event.MouseEvent evt) {
        try {
            int a = Integer.parseInt(input3.getText().trim());
            switch ( a ) {
            case 1: {
                Double_LinkedList c = new Double_LinkedList();
                try {
                    c.create_double_list(input1.getText()); // заполняем наш список
                } catch (RuntimeException e) {
                    label3.setText("Проверьте введеные данные (в вашей строке лишние символы)");
                    return -1; // если словоили исключение вывести сообщение об ошибки , и выйти из функции
                }
                label3.setText("");
                try {
                    Double b = Double.parseDouble(input4.getText().trim()); // парсим число , котрое хотим добавить
                    int index = Integer.parseInt(input5.getText().trim()); // парсим индекс , для добавления
                    c.add(b, index); // добавляем элемент во внутрений Doublelist
                    input1.setText( c.get_Linked_List() ); // добавляем строковое представление списка список в поле 1
                    JOptionPane.showMessageDialog(null, " Число " + b + " было успешно добавленно в первый список , под индексом " + index + " :) \n Результат - " + c.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                }
                catch (RuntimeException exception ) {
                    String tmp = " Вы ввели объект отличный от типа Double , либо вышли за границы списОчка :( ";
                    JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
                }
            }
            break;
            case 2: {
                Double_LinkedList d = new Double_LinkedList();
                try {
                    d.create_double_list(input2.getText()); // заполняем наш Doublelist
                } catch (RuntimeException  e) {
                    label4.setText("Проверьте введеные данные (в вашей строке лишние символы)");
                    return -1;  // если словоили исключение вывести сообщение об ошибки , и выйти из функции
                }
                label4.setText(""); // очистить информацию о прошлой ошибке
                try {
                    Double b = Double.parseDouble(input4.getText().trim()); // парсим число , котрое хотим добавить
                    int index = Integer.parseInt(input5.getText().trim());
                    d.add(b, index); // добавляем элемент в наш внутрений doublelist
                    input2.setText( d.get_Linked_List()) ; // добавляем его в поле 1
                    JOptionPane.showMessageDialog(null, " Число " + b + " было успшно добавленно во второй список , под индексом " + index + " :) \n Результат - " + d.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                }
                catch (RuntimeException exception ) {
                    String tmp = " Вы ввели объект отличный от типа Double , либо вышли за границы списОчка :( ";
                    JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
                }
            }
            break;
            default: {
                JOptionPane.showMessageDialog(null, " Такого списка не существует :( \n Введите цифру 1 - если хотите выбрать первый список \n Введите цифру 2 - если хотите выбрать второй список \n", "Результат - ", JOptionPane.PLAIN_MESSAGE);
            }
            }
        }
        catch ( RuntimeException exception ) {
            String tmp = " Вы ввели номер списка , отличный от типа int ";
            JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
        }
        return 0;
    }

    private int jButton1MouseClicked7 (java.awt.event.MouseEvent evt) {
        try {
            int a = Integer.parseInt(input6.getText().trim());
            switch (a) {
                case 1: {
                    Double_LinkedList c = new Double_LinkedList();
                    try {
                        c.create_double_list(input1.getText()); // заполняем внутрениый Doublelist
                    } catch (RuntimeException e) {
                        label3.setText("Проверьте введеные данные (в вашей строке лишние символы)");
                        return -1; // если словоили исключение вывести сообщение об ошибки , и выйти из функции
                    }
                    label3.setText("");
                    try {
                    int b = Integer.parseInt(input7.getText().trim());
                    c.del(b); // удаляем элемент из внутреннего double list
                    input1.setText(c.get_Linked_List()); // добавляем его в поле 1
                    if (c.get_Linked_List() == "")
                        JOptionPane.showMessageDialog(null, " Элемент под индексом " + b + " был успшно удален из первого списка :) \n Результат - в вашем списке не присутсвует элементов" + c.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, " Элемент под индексом " + b + " был успшно удален из первого списка :) \n Результат - " + c.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception ) {
                        String tmp = " Вы ввели индекс отличный от типа int , либо вышли за границы списОчка :( ";
                        JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
                        return -1;
                    }
                }
                break;
                case 2: {
                    Double_LinkedList d = new Double_LinkedList();
                    try {
                        d.create_double_list(input2.getText()); // заполняем внтрений double list
                    } catch (RuntimeException e) {
                        label4.setText("Проверьте введеные данные (в вашей строке лишние символы)");
                        return -1;  // если словоили исключение вывести сообщение об ошибки , и выйти из функции
                    }
                    label4.setText("");
                    try {
                        int b = Integer.parseInt(input7.getText().trim());
                        d.del(b);
                        input2.setText(d.get_Linked_List()); // добавляем его в поле 1
                        if (d.get_Linked_List() == "")
                            JOptionPane.showMessageDialog(null, " Элемент под индексом " + b + " было успшно удален из второго списка :) \n Результат - в вашем списке не присутсвует элементов" + d.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                        else
                            JOptionPane.showMessageDialog(null, " Элемент под индексом " + b + " было успшно удален из второго списка :) \n Результат - " + d.get_Linked_List(), "Результат - ", JOptionPane.PLAIN_MESSAGE);
                    }
                    catch (RuntimeException exception) {
                        String tmp = " Вы ввели индекс отличный от типа int , либо вышли за границы списОчка :( ";
                        JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
                        return -1;
                    }
                }
                break;
                default: {
                    JOptionPane.showMessageDialog(null, " Такого списка не существует :( \n Введите цифру 1 - если хотите выбрать первый список \n Введите цифру 2 - если хотите выбрать второй список \n", "Результат - ", JOptionPane.PLAIN_MESSAGE);
                    return -1; // ыход с ошибкой
                }
            }
        }
        catch ( RuntimeException exception ) {
            String tmp = " Вы ввели номер списка , отличный от типа int ";
            JOptionPane.showMessageDialog(null, tmp , "Результат - ", JOptionPane.PLAIN_MESSAGE);
        }
        return 0;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Lab7().setVisible(true);
            } });
    }
}

class Double_LinkedList {

    private LinkedList<Double> DoubleList =  new LinkedList();

    public LinkedList getList () { // геттер для получени DoubleList
        return DoubleList;
    }

    public LinkedList add (double element , int index ) { // пубилчный метод add , который возвращает "обновленый" private DoubleList
        DoubleList.add(index, element );
        return DoubleList;
    }

    public LinkedList del ( int index ) { // пубилчный метод del , который возвращает "обновленый" private DoubleList
        DoubleList.remove(index);
        return DoubleList;
    }

    public String get_Linked_List () { // возвращает строковое представление DoubleList
        String tmp = "";
        for( var x : DoubleList ) {
            tmp += x + " ";
        }
        return tmp;
    }

    public LinkedList create_double_list(String text) { // заполняет DoubleList , и возвращает его
        String s[] = text.split(" ");

        for (var x : s) {
            Double a = Double.parseDouble(x);
            DoubleList.add(a);
        }

        return DoubleList;
    }

    public Polynom filling_polynomials (LinkedList<Double> some_one ) {
        int n = some_one.size() ;

        Polynom obj = new Polynom(n);

        for ( int i= 0 ; i < n ; i ++) {
            obj.setCoeff( n-i , some_one.get(i) );
        }
        return obj ;
    }

    public void multiplication_of_polynomials ( LinkedList<Double> one1 , LinkedList<Double> two2 ) {

        String message = "";

        Polynom one = filling_polynomials( one1 );
        Polynom two = filling_polynomials( two2 );

        message +=  "Первый полином : \n " + one.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Второй полином : \n " + two.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Произведение полиномов : \n " + Polynom.multiply(one, two) + "\n";
        message +=  "------------------------------------------------ \n";

        JOptionPane.showMessageDialog(null, message, "Результат - ", JOptionPane.PLAIN_MESSAGE);
        }

    //Возвращает полином с суммой соотвутствующих коэффициентов
    public void summ( LinkedList<Double> one1 , LinkedList<Double> two2) {

        String message = "";

        Polynom one = filling_polynomials( one1 );
        Polynom two = filling_polynomials( two2 );

        message +=  "Первый полином : \n " + one.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Второй полином : \n " + two.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Cумма полиномов : \n " + Polynom.summ(one, two) + "\n";
        message +=  "------------------------------------------------ \n";

        JOptionPane.showMessageDialog(null, message, "Результат - ", JOptionPane.PLAIN_MESSAGE);

    }

    //Возвращает полином с суммой соотвутствующих коэффициентов
    public void difference( LinkedList<Double> one1 , LinkedList<Double> two2) {

        String message = "";

        Polynom one = filling_polynomials( one1 );
        Polynom two = filling_polynomials( two2 );

        message +=  "Первый полином : \n " + one.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Второй полином : \n " + two.output() +"\n";
        message +=  "------------------------------------------------ \n";
        message +=  "Разность полиномов : \n " + Polynom.difference(one, two) + "\n";
        message +=  "------------------------------------------------ \n";

        JOptionPane.showMessageDialog(null, message, "Результат - ", JOptionPane.PLAIN_MESSAGE);
    }
    }
