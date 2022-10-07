package Lab_5;
import javax.swing.*;
import java.awt.*;
import java.lang.RuntimeException;
import java.util.Vector;

 /* 8. Se întroduc N parametri de la consolă. Aceşti parametri -sunt elemente ale vectorului
        detip double, şi in baza vectorului – se creaza clasa cu obiectul DoubleVector. Apoi,
        programul afisiaza la consola valorile vectorului în formă: Vector: 2.3 5.0 7.3. */

/* Введите N параметров с консоли. Эти параметры являются элементами вектора
        double, а на основе вектора - создается класс с объектом DoubleVector. Далее ,
        программа выводит на консоль значения вектора в виде: Вектор: 2.3 5.0 7.3. */

public class lb5 extends javax.swing.JFrame {

    private JTextField input1    = new JTextField("" , 20);
    private JTextField input2    = new JTextField("" , 20);
    private JTextField input3    = new JTextField("" , 20);
    private JTextField input4    = new JTextField("" , 20);
    private JTextField input5    = new JTextField("" , 20);
    private JLabel     label1    = new JLabel("");
    private JLabel     label2    = new JLabel(" Функции модификации данных :  ");
    private JLabel     label3    = new JLabel(" Изменеие элементов : ");
    private JLabel     label4    = new JLabel(" Удаление элементов : ");
    private JLabel     label5    = new JLabel(" Укажите индекс элемента , который хотели бы удалить - ");
    private JLabel     label8    = new JLabel( " Введите индекс элемента , которого вы хотели бы изменить - ");
    private JLabel     label9    = new JLabel( " Введите данные , на котороые вы хотели бы изменить - ");
    private JLabel     label10   = new JLabel( " Добавление элементов : ");
    private JLabel     label11   = new JLabel( " Введите пожалуйста элемент , который хотели бы добавить - ");
    private JLabel     label12   = new JLabel( " Введите пожалуйста элементы вектора - ");
    private JButton    button1   = new JButton(" Получить вектор ");
    private JButton    button2   = new JButton(" Размер / Ёмкость вектора ");
    private JButton    button3   = new JButton(" Изменить ");
    private JButton    button4   = new JButton(" Удалить  ");
    private JButton    button5   = new JButton(" Добавить  ");
    private JButton    button6   = new JButton(" Очистить вектор  ");
    private JButton    button7   = new JButton(" Обрезать ёмкость вектора до текущего размера вектора  ");

    public lb5() {
        super(" Lab 5 - Double Vector ");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input1.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        jTextArea1KeyPressed(evt);
                    } });

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked1(evt); } });

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked2(evt); } });

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

        label1.setForeground(new java.awt.Color(255, 51, 51));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        this.setLayout(null);
        getContentPane().setBackground(new Color(255 , 204 , 255	));  //Whatever color
        this.setBounds(100 , -15 , 540 , 830 );
        this.setResizable(false);

        add(label12);
        label12.setBounds(10, 10, 500, 20);
        add(input1);
        input1.setBounds(10, 40, 500, 20);
        add(label1);
        label1.setBounds(10, 70, 500, 20);
        add(button1);
        button1.setBounds(10, 100, 500, 20);
        add(button2);
        button2.setBounds(10, 130, 500, 20);
        add(label2);
        label2.setBounds(160, 160, 500, 20);
        add(label3);
        label3.setBounds(190, 190, 500, 20);
        add(label8);
        label8.setBounds(10, 220, 500, 20);
        add(input2);
        input2.setBounds(10, 250, 500, 20);
        add(label9);
        label9.setBounds(10, 280, 500, 20);
        add(input4);
        input4.setBounds(10, 310, 500, 20);
        add(button3);
        button3.setBounds(10, 340, 500, 20);
        add(label4);
        label4.setBounds(190, 370, 500, 20);
        add(label5);
        label5.setBounds(10, 400, 500, 20);
        add(input3);
        input3.setBounds(10, 430, 500, 20);
        add(button4);
        button4.setBounds(10, 460, 500, 20);
        add(label10);
        label10.setBounds(190, 490, 500, 20);
        add(label11);
        label11.setBounds(10, 520, 500, 20);
        add(input5);
        input5.setBounds(10, 550, 500, 20);
        add(button5);
        button5.setBounds(10, 580, 500, 20);
        add(button6);
        button6.setBounds(10, 610, 500, 20);
        add(button7);
        button7.setBounds(10, 640, 500, 20);
    }

    private int jButton1MouseClicked1(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText().trim());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        String mes = c.create_String_of_myVector();
        input1.setText(mes);
        JOptionPane.showMessageDialog(null,"Ваш вектор : " + mes, "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked2(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        String message = "";
        message += " Размер ветора =  " + c.get_Vector().size() +"\n";
        message += " Емкость ветора = " + c.get_Vector().capacity() +"\n";
        JOptionPane.showMessageDialog(null , message , "Результат работы " , JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked3(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        try{
            int a = Integer.parseInt(input2.getText().trim());
            Double b = Double.parseDouble(input4.getText().trim());
            c.modification(a , b );
        }
        catch(RuntimeException e ) {
            String tmp = " Вы вышли за границы вектора , либо ввели объект отличный от типа Double :( ";
            label1.setText("При изменении элемента возникла ошибка , возможно вы ошиблись с индексом ");
            JOptionPane.showMessageDialog(null, tmp , "Результат", JOptionPane.PLAIN_MESSAGE);
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        String mes = c.create_String_of_myVector();
        input1.setText(mes);
        JOptionPane.showMessageDialog(null,"Ваш вектор : " + mes, "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked4(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        try{
            int a = Integer.parseInt(input3.getText().trim());
            c.del_el(a);
        }
        catch(RuntimeException e ){
            String tmp = " Вы вышли за границы вектора , либо ввели индекс отличный от типа int :( ";
            label1.setText( "При удалении элемента возникла ошибка , возможно вы ошиблись с индексом " );
            JOptionPane.showMessageDialog(null,tmp , "Результат", JOptionPane.PLAIN_MESSAGE);
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        String mes = c.create_String_of_myVector();
        input1.setText(mes);
        JOptionPane.showMessageDialog(null,"Ваш вектор : " + mes, "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked5(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText(" Проверьте введеные данные ( в вашей строке лишние символы ) ");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        try{
            Double a = Double.parseDouble(input5.getText().trim());
            c.get_Vector().add(a);
        }
        catch(RuntimeException e ){
            String tmp = " Вы ввели элемент отличный от типа Double :( ";
            label1.setText(" При добавлении нового элемента возникла ошибОчка ");
            JOptionPane.showMessageDialog(null, tmp , "Результат", JOptionPane.PLAIN_MESSAGE);
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке
        String mes = c.create_String_of_myVector();
        input1.setText(mes);
        JOptionPane.showMessageDialog(null,"Ваш вектор : " + mes, "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked6(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке

        try {
            c.get_Vector().clear();
        }
        catch ( RuntimeException exception ) {
            String tmp = " При попытке удаления всех элементов вектора , возникла ошибОчка :( ";
            JOptionPane.showMessageDialog(null,tmp , "Результат", JOptionPane.PLAIN_MESSAGE);
            return -1; // выход с ошибкой
        }
        input1.setText("");
        JOptionPane.showMessageDialog(null,"Ваш вектор был успешно очищен ", "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private int jButton1MouseClicked7(java.awt.event.MouseEvent evt) {
        My_DoubleVector c = new My_DoubleVector();
        try{
            c.fill_double_vector(input1.getText());
        }
        catch(RuntimeException e ){
            label1.setText("Проверьте введеные данные (в вашей строке лишние символы)");
            return -1; // выход с ошибкой
        }
        label1.setText(" "); // очищаем информацию о прошлой ошибке

        try {
            c.get_Vector().trimToSize();
        } catch ( RuntimeException exception ) {
            String tmp = " При попытке урезать ёмкость возникла ошибка ";
            JOptionPane.showMessageDialog(null,tmp, "Результат", JOptionPane.PLAIN_MESSAGE);
            return -1; // выход с ошибкой
        }
        String tmp = "";
        tmp += " Ёмкость вектора была успешна уменьшена до текщуего размера : \n";
        tmp += " Размер ветора =  " + c.get_Vector().size() +" \n";
        tmp += " Емкость ветора = " + c.get_Vector().capacity() +" \n";
        JOptionPane.showMessageDialog(null,tmp, "Результат", JOptionPane.PLAIN_MESSAGE);
        return 0;
    }

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {
        try{
            if(evt.getKeyCode()>=48 && evt.getKeyCode()<=57||evt.getKeyCode()==32){
                label1.setText(""+evt.getKeyChar());
            }
            else throw new RuntimeException();
        }
        catch(RuntimeException e){
            label1.setText("Вы вввели не число !");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new lb5().setVisible(true); } });
    }
}

class My_DoubleVector {
    private Vector<Double> DoubleVector = new Vector(); // создаем объект типа DoubleVector - в котором будем хранить числа введеные с клавиатуры
    String message = "Ваш вектор : ";

    public void fill_double_vector(String text) { // метод для заполнения вектора
        String s[] = text.split(" ");
        for (var x : s) {
            Double a = Double.parseDouble(x);
            DoubleVector.add(a);
        }
        for (var x : DoubleVector) {
            message += x + " ";
        }
    }

    public Vector get_Vector () { // пкбличный гетер , который возврщает DoubleVector
        return DoubleVector ;
    }

    public void del_el (int index) { // метод , который удаляет элемент , и возвращает " обновленый " вектор
        DoubleVector.remove(index);
    }

    public void modification(int index , Double obj ) { // метод , который изменяет элемент , и возвращает " обновленый " вектор
        DoubleVector.set(index , obj);
    }

    public String create_String_of_myVector () { // метод , который возвращает строковое представление вектора
        String mes = "";
        for (var i: DoubleVector ) {
            mes += i + " ";
        }
        return mes;
    }
}

