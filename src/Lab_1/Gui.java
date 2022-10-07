package Lab_1;

import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;

//   8. Показать, сколько раз повторяются слова, встречающиеся в данном тексте.

public class Gui extends JFrame {

    public static void main(String[] args) {
        Gui app = new Gui();
        app.setVisible(true);
    }

    private JLabel label1     = new JLabel("Введите пожалуйста предложение  :\n");
    private JTextField input1 = new JTextField("", 20);
    private JLabel label2     = new JLabel("");
    private JLabel label3     = new JLabel("Поиск подстроки в предложении   : ");
    private JLabel label4     = new JLabel("Введите пожалуйста образец , который хотите найти - ");
    private JTextField input2 = new JTextField("", 20);
    private JButton button1   = new JButton("Посчитать колличество повторений слов ");
    private JButton button2   = new JButton("Найти слово ");
    private JButton button3   = new JButton("Очистить");
    private JButton button4   = new JButton("Посчитать колличество слов в прдложении");
    private JButton button5   = new JButton("Инвертировать строку");
    private JButton button6   = new JButton("Изменить регистр на нижний ");
    private JButton button7   = new JButton("Изменить регистр на верхний ");
    private JLabel label5     = new JLabel("Конкатенцаия строк - ");
    private JTextField input3 = new JTextField("", 20);
    private JButton button8   = new JButton("Сложить ");
    private JLabel label6     = new JLabel("Получить элемент по индексу - ");
    private JTextField input4 = new JTextField("", 20);
    private JButton button9   = new JButton("Получить элемент ");
    private JLabel label7     = new JLabel("Сравнить строки - ");
    private JTextField input5 = new JTextField("", 20);
    private JButton button10  = new JButton("Сравнить ");
    private JLabel label8     = new JLabel("Получить индекс по значению элементу : ");
    private JLabel label9     = new JLabel("Введите элемент строки пожалуйста  - ");
    private JTextField input6 = new JTextField("", 20);
    private JButton button11  = new JButton("Получить индекс ");
    private JLabel label10    = new JLabel("Замена символов в строке :");
    private JLabel label11    = new JLabel("Введите пожалуйста символ(ы) , который хотите заменить -");
    private JTextField input7 = new JTextField("", 20);
    private JLabel label12    = new JLabel("Введите пожалуйста символ(ы) , НА который хотите заменить -");
    private JTextField input8 = new JTextField("", 20);
    private JButton button12  = new JButton("Заменить ");
    private JLabel label13    = new JLabel("Введите индекс ДО которого вы хотите обрезать строку - ");
    private JLabel label14    = new JLabel("Обрезать строку : ");
    private JTextField input9 = new JTextField("", 20);
    private JButton button13  = new JButton("Обрезать ");
    private JLabel label15    = new JLabel("Разбить строку на массив ( введите пожалуйста разделитель ) : ");
    private JTextField input10 = new JTextField("", 20);
    private JButton button14  = new JButton("Разделить ");

    public Gui() {
        super(" Lab 1 ");
        this.setBounds(80, 0, 1125, 680);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        this.getContentPane().setBackground(new Color(255, 204, 255));  //Whatever color
        container.setLayout(null);
//        try {
//            String str = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
//            UIManager.setLookAndFeel(str);
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }

        container.add(label1);
        label1.setBounds(420, 10, 500, 20);
        label1.setFont(new Font("Calibri", Font.BOLD, 20));
        container.add(input1);
        input1.setBounds(320, 40, 500, 20);
        container.add(label2);
        label2.setBounds(440, 70, 500, 20);
        label2.setForeground(new java.awt.Color(255, 51, 51));
        container.add(button1);
        button1.setBounds(320, 100, 320, 20);
        container.add(button3);
        button3.setBounds(660, 100, 160, 20);
        container.add(label3);
        label3.setBounds(160, 130, 500, 20);
      //  label3.setFont(new Font("Calibri", Font.BOLD, 17));
        container.add(label4 );
       // label4.setFont(label4.getFont().deriveFont(Font.ROMAN_BASELINE, 14f));
        label4.setBounds(10, 160, 500, 20);
        container.add(input2);
        input2.setBounds(10, 190, 500, 20);
        container.add(button2);
        button2.setBounds(10, 220, 500, 20);
        container.add(button4);
        button4.setBounds(10, 250, 500, 20);
        container.add(button5);
        button5.setBounds(10, 280, 500, 20);
        container.add(button6);
        button6.setBounds(10, 310, 500, 20);
        container.add(button7);
        button7.setBounds(10, 340, 500, 20);
        container.add(label5);
        label5.setBounds(10, 370, 500, 20);
        container.add(input3);
        input3.setBounds(10, 400, 500, 20);
        container.add(button8);
        button8.setBounds(10, 430, 500, 20);
        container.add(label6);
        label6.setBounds(10, 460, 500, 20);
        container.add(input4);
        input4.setBounds(10, 490, 500, 20);
        container.add(button9);
        button9.setBounds(10, 520, 500, 20);
        container.add(label7);
        label7.setBounds(10, 550, 500, 20);
        container.add(input5);
        input5.setBounds(10, 580, 500, 20);
        container.add(button10);
        button10.setBounds(10, 610, 500, 20);
        container.add(label8);
        label8.setBounds(700, 130, 500, 20);
        container.add(label9);
        label9.setBounds(600, 160, 500, 20);
        container.add(input6);
        input6.setBounds(600, 190, 500, 20);
        container.add(button11);
        button11.setBounds(600, 220, 500, 20);
        container.add(label10);
        label10.setBounds(600, 250, 500, 20);
        container.add(label11);
        label11.setBounds(600, 280, 500, 20);
        container.add(input7);
        input7.setBounds(600, 310, 500, 20);
        container.add(label12);
        label12.setBounds(600, 340, 500, 20);
        container.add(input8);
        input8.setBounds(600, 370, 500, 20);
        container.add(button12);
        button12.setBounds(600, 400, 500, 20);
        container.add(label14);
        label14.setBounds(600, 430, 500, 20);
        container.add(label13);
        label13.setBounds(600, 430, 500, 20);
        container.add(label14);
        label13.setBounds(600, 460, 500, 20);
        container.add(input9);
        input9.setBounds(600, 490, 500, 20);
        container.add(button13);
        button13.setBounds(600, 520, 500, 20);
        container.add(label15);
        label15.setBounds(600, 550, 500, 20);
        container.add(input10);
        input10.setBounds(600, 580, 500, 20);
        container.add(button14);
        button14.setBounds(600, 610, 500, 20);

        UIManager.put("OptionPane.yesButtonText"   , "Да"    );
        UIManager.put("OptionPane.noButtonText"    , "Нет"   );
        UIManager.put("OptionPane.cancelButtonText", "Отмена");
        UIManager.put("OptionPane.okButtonText"    , "Готово");
     ///   swing.defaultlaf=com.jtattoo.plaf.mcwin.McWinLookAndFeel


//        FontUIResource f = new FontUIResource(new Font("Verdana", 0, 12));
//        Enumeration<Object> keys = UIManager.getDefaults().keys();
//        while (keys.hasMoreElements()) {
//            Object key = keys.nextElement();
//            Object value = UIManager.get(key);
//            if (value instanceof FontUIResource) {
//                FontUIResource orig = (FontUIResource) value;
//                Font font = new Font(f.getFontName(), orig.getStyle(), f.getSize());
//                UIManager.put(key, new FontUIResource(font));
//            }
//        }

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked1(evt); } });

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked1(evt);}}
        );

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked2(evt); } });

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked3(evt); } });

        button3.addMouseMotionListener(new java.awt.event.MouseAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt){
                jButton1MouseMoved3(evt); }} );

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt){
                jButton1MouseExited3(evt); }} );

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

        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked8(evt); } });

        button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked9(evt); } });

        button10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked10(evt); } });

        button11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked11(evt); } });

        button12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked12(evt); } });

        button13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked13(evt); } });

        button14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt){
                jButton1MouseClicked14(evt); } });

    }

    public void music (String path ) {
        try {
            File soundFile = new File("C:\\Users\\User\\Downloads\\"+path+".wav"); //Звуковой файл // 5 6

            //Получаем AudioInputStream
            //Вот тут могут полететь IOException и UnsupportedAudioFileException
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            //Получаем реализацию интерфейса Clip
            //Может выкинуть LineUnavailableException
            Clip clip = AudioSystem.getClip();

            //Загружаем наш звуковой поток в Clip
            //Может выкинуть IOException и LineUnavailableException
            clip.open(ais);

            clip.setFramePosition(0); //устанавливаем указатель на старт
            clip.start(); //Поехали!!!

            //Если не запущено других потоков, то стоит подождать, пока клип не закончится
            //В GUI-приложениях следующие 3 строчки не понадобятся
            //clip.setMicrosecondPosition( clip.getMicrosecondLength()/1000);
            //Thread.sleep(clip.getMicrosecondLength()/1000);
            //clip.stop(); //Останавливаем
            // clip.close(); //Закрываем
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } //catch (InterruptedException exc) {}
    }

    int count = 0;
    private void jTextArea1KeyPressed (java.awt.event.KeyEvent evt){
        music("4"); // 5 6
        label2.setText("Колличество символов в предложении = "+input1.getText().length());
//        try {
//            if (  evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_ESCAPE ) {
//                if (count != 0)
//                    throw new RuntimeException();
//            }
//            else {
//                label2.setText("Колличество символов в предложении = " + ++count);
//            }
//        }
//        catch ( RuntimeException e) {
//          label2.setText("Колличество символов в предложении = " + --count);
//        }
    }

    private int jButton1MouseClicked1(java.awt.event.MouseEvent evt) {
        music("6"); // 5 4
        try {
            if (input1.getText().trim().isEmpty() == true) {
                throw new RuntimeException();
            }
        }
         catch ( RuntimeException e )  {
             String tmp = "Вы ввели пустую строку ";
             label2.setText("Введите предложение пожалуйста");
             JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
             return -1;
         }
        Text text = new Text(input1.getText().trim());
        text.opta_sarcina();
        return 0;
    }

    public void jButton1MouseMoved3(java.awt.event.MouseEvent evt) {
        button3.setBackground(Color.RED);
    }

    public void jButton1MouseExited3(java.awt.event.MouseEvent evt) {
        button3.setBackground(Color.LIGHT_GRAY);
    }

    private int jButton1MouseClicked2(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if ( input2.getText().trim().isEmpty() == true || input1.getText().trim().isEmpty() == true ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        Text text = new Text(input1.getText().trim());

      String tmp = "";
      tmp += text.KMP( input1.getText().trim() , input2.getText().trim() );
      JOptionPane.showMessageDialog(null , tmp  );
        return 0;
    }

    private int jButton1MouseClicked3(java.awt.event.MouseEvent evt) {
        music("6");
        int input = JOptionPane. showConfirmDialog (null ,"Вы уверены , что хотите удалить строку ?\nЭто действие нельзя будет отменить :( " , " Подтвердите действие " , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.WARNING_MESSAGE );
        if ( input == 1 || input == 2 )
            return -1;
        try {
            if ( input1.getText().trim().isEmpty() == true ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            count = 0;
            label2.setText("Колличество символов в предложении = " + count);
            String tmp = " Строка и так уже пустая ";
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        input1.setText("");
        count = 0;
        label2.setText("Колличество символов в предложении = " + count);
        return 0;
    }

    private int jButton1MouseClicked4(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if ( input1.getText().trim().isEmpty() == true ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = " Ваша строка пуста ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        int count = 0;
        for (var x :  input1.getText().trim().split(" ")) {
           ++ count;
        }
        String tmp = "";
        tmp += "В вашей строке  - " + count + " cлов / (а) ";
        JOptionPane.showMessageDialog(null , tmp );
        return 0;
    }

    private int jButton1MouseClicked5(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if (input1.getText().trim().equals("")) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        String d = new StringBuilder( input1.getText()).reverse().toString();
        input1.setText(d);
        return 0;
    }

    private int jButton1MouseClicked6(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if (input1.getText().trim().equals("")) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        input1.setText(input1.getText().toLowerCase(Locale.ROOT));
        JOptionPane.showMessageDialog(null , input1.getText().toLowerCase(Locale.ROOT) );

        return 0;
    }

    private int jButton1MouseClicked7(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if (input1.getText().trim().equals("")) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        input1.setText(input1.getText().toUpperCase(Locale.ROOT));
        JOptionPane.showMessageDialog(null , input1.getText().toUpperCase(Locale.ROOT) );

        return 0;
    }

    private int jButton1MouseClicked8(java.awt.event.MouseEvent evt) {
        music("6");
        int input = JOptionPane. showConfirmDialog (null ,"Конкатенация строк может повлечь за собой измение исходных данных ?\nВы уверены , что хотите продолжить ? " , " Подтвердите действие " , JOptionPane.YES_NO_CANCEL_OPTION ); // , JOptionPane.WARNING_MESSAGE
        if ( input == 1 || input == 2 )
            return -1;
        try {
            if ( input3.getText().trim().equals("")  /* || input1.getText().trim().equals("") */ ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        JOptionPane.showMessageDialog(null , "Результат конкатенации :\n" + input1.getText().trim().concat(input3.getText()) );
        input1.setText(input1.getText().concat(input3.getText()));

        return 0;
    }

    private int jButton1MouseClicked9(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if (  input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        String tmp = "";

        try{
            if (input4.getText().trim().isEmpty() == true ) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException exception ) {
            JOptionPane.showMessageDialog(null , "Вы не ввели индекс в input поле :( " , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1; // выход с ошибкой
        }

        try{
            int a = Integer.parseInt(input4.getText().trim());
            tmp += "Элемент под индексом " + a + " равен - ( " + input1.getText().trim().charAt(a) + " ) \n";
        }
        catch(Exception e ) {
            String error = "Вы вышли за границы строки , либо ввели index отличный от типа int :(";
            label2.setText("Проверьте пожалуйста введеный индекс ");
            JOptionPane.showMessageDialog(null , error , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1; // выход с ошибкой
        }

        JOptionPane.showMessageDialog(null , tmp );
        return 0;
    }


    private int jButton1MouseClicked10(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if ( input5.getText().trim().equals("") || input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        String tmp = "";
        label2.setText("");

        if (input5.getText().trim().equals(input1.getText().trim()) )
            tmp += "Строки равны :) ";
        else
            tmp+= "Строки не равны :( ";
        JOptionPane.showMessageDialog(null , tmp  );
        return 0;
    }

    private int jButton1MouseClicked11(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if ( input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        label2.setText("");

        try{
            if (input6.getText().trim().isEmpty() == true ) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException exception ) {
            JOptionPane.showMessageDialog(null , "Вы не ввели элемент строки в input поле :( " , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1; // выход с ошибкой
        }

        if (  ( input1.getText().trim().indexOf( input6.getText().trim() ) ) == -1 ) {
            String tmp = "Элемент - ( " + input6.getText().trim() + " ) не найден в строке :( ";
            JOptionPane.showMessageDialog(null, tmp );
        }
        else {
            String tmp = "Элемент - ( " + input6.getText().trim() + " ) находиться под индексом -  " + input1.getText().trim().indexOf(input6.getText().trim());
            JOptionPane.showMessageDialog(null, tmp );
        }
        return 0;
    }

    private int jButton1MouseClicked12(java.awt.event.MouseEvent evt)  {
        music("6");
        int input = JOptionPane. showConfirmDialog (null ,"Вы уверены , что хотите заменить символы в строке ?\nЭто действие может повлечь за собой потерю данных :( " , " Подтвердите действие " ,  JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if ( input == 1 || input == 2 )
            return -1;

        try {
            if ( input7.getText().trim().equals("") || input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        label2.setText("");
        if (  ( input1.getText().trim().indexOf( input7.getText().trim() ) ) == -1 ) {
            String tmp = " Замена невозможна , так как , элемент - ( " + input7.getText().trim() + " ) не найден в строке :( ";
            JOptionPane.showMessageDialog(null, tmp, "Результат работы ", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try{
                if (input8.getText().trim().isEmpty() == true ) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException exception ) {
                JOptionPane.showMessageDialog(null , "Вы не ввели символы на которые хотите заменить :(" , "Результат работы " , JOptionPane.ERROR_MESSAGE);
                return -1; // выход с ошибкой
            }
            try {
                String tmp = input1.getText().replace( input7.getText().trim(), input8.getText().trim());
                input1.setText(tmp);
                JOptionPane.showMessageDialog(null, "Результат замены - " + tmp.trim() );
            }
            catch ( RuntimeException exception ) {
                JOptionPane.showMessageDialog(null,  " Ошибке при замене символов , попробуйте снова :( " , "Результат работы ", JOptionPane.ERROR_MESSAGE);
            }
        }
        return 0;
    }

    private int jButton1MouseClicked13(java.awt.event.MouseEvent evt) {
        music("6");
        int input = JOptionPane. showConfirmDialog (null ,"Вы уверены , что хотите обрезать строку ?\nЭто действие может повлечь за собой потерю данных :( " , " Подтвердите действие " , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.WARNING_MESSAGE);
        if ( input == 1 || input == 2 )
            return -1;
        try {
            if ( input9.getText().trim().equals("") || input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        String tmp = "";

        try{
            int a = Integer.parseInt(input9.getText().trim());
            tmp += input1.getText().trim().substring(a);
            input1.setText(tmp);
            JOptionPane.showMessageDialog(null , "Обрезанная строка - " + tmp );
        }
        catch(RuntimeException e ) {
            String error = "Вы вышли за границы строки , либо ввели index отличный от типа int :(";
            label2.setText("Проверьте пожалуйста введеный индекс ");
            JOptionPane.showMessageDialog(null , error , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1; // выход с ошибкой
        }
        label2.setText("");
        return 0;
    }

    private int jButton1MouseClicked14(java.awt.event.MouseEvent evt) {
        music("6");
        try {
            if (  input1.getText().trim().equals("") ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Вы ввели пустую строку ";
            label2.setText("Введите предложение пожалуйста");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        label2.setText("");
        try {
            if (  input1.getText().trim().indexOf( input10.getText() ) == -1 ) {
                throw new RuntimeException();
            }
        }
        catch ( RuntimeException e )  {
            String tmp = "Разделитель отсутсвует в строке  ";
            label2.setText("Вы ввели не верный разделитель ");
            JOptionPane.showMessageDialog(null , tmp , "Результат работы " , JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        label2.setText("");

        String tmp = "";
        words = input1.getText().trim().split( input10.getText() );
        tmp += " Ваш массив : \n";
        int count = 1; // счетчик
        for( var word : words){
            tmp += count +" ) " + " элемент = " + word + " \n";
            ++count;
        }
        JOptionPane.showMessageDialog(null , tmp );
        return 0;
    }
    private String[] words;
}

    class Text {
        private String sentence;  // исходное предложение

        public Text(String sentence) { // сtor c 1 параметром
            this.sentence = sentence; // исходное предложение  = mySentece
        }

        public void opta_sarcina() {
            String message = "";
            int col = 0; // счетчик слов
            HashSet<String> a = new HashSet<>(); // создаем множетсво в котрое будут входить только УНИКАЛЬНЫЕ слова нашего преложения

            for (var x : this.sentence.split(" ")) {
                a.add(x); // добавляем слова в наше множество . ( Слово добавится только в том случае , если оно уникально -т.к это HashSet )
            }
            for (var x : a) { // проверяем наши слова из HashSet , с каждым словом в предложении .
                for (var y : this.sentence.split(" ")) { // разеделяем предложение на слова с помощью метода .split()
                    if (x.equals(y))
                        col++; // Вполняем сравнении строк с помощью метода equals() . // Если строки равны увеличиваем переменую col
                }
                // Если слово повтореять больше 1 раза - выводим на экран сколько раз оно повторялось в предложении
                if (col >= 1)
                    message += " Слово - ( " + x + " ) - повторяется " + col + " раза в вашем предложении. \n";
                // System.out.println(" Слово - " + x + " повторяется " + col + " раза в вашем предложении.");
                col = 0; // обнуляем col - перед проверкой нового слова из HashSet
            }
            JOptionPane.showMessageDialog(null, message, "Результат работы ", JOptionPane.PLAIN_MESSAGE);
        }

        public String KMP( String X, String Y) { //  для поиска подстроки

            String tmp ="";
            int m = X.length();
            int n = Y.length();
            // если Y пустая строка
            if (n == 0) {
                tmp += "Образец начинается с нулевого символа строки ";
                return tmp;
            }
            // если длина X , меньше длины Y
            if (m < n) {
                tmp += "Образец не найден";
                return tmp;
            }
            // next[i] хранит индекс наилучшего совпадения
            int [] next = new int [n+1];

            for (int i = 0; i < n + 1; i++) {
                next[i] = 0;
            }
            for (int i = 1; i < n; i++) {
                int j = next[i + 1];

                while (j > 0 && Y.charAt(j) != Y.charAt(i) ) {
                    j = next[j];
                }

                if (j > 0 || Y.charAt(j) == Y.charAt(i) ) {
                    next[i + 1] = j + 1;
                }
            }
            for (int i = 0, j = 0; i < m; i++) {
                if (X.charAt(i) == Y.charAt(j)) {
                    if (++j == n) {
                        tmp += "Образец начинется с " + ( i - j + 1 )+ " символа строки ";
                        return tmp;
                    }
                } else if (j > 0) {
                    j = next[j];
                    i--;
                }
            }
            return "Образец не был найден";
        }
    }




