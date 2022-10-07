package Lab_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleGui extends JFrame {

    public static void main(String[] args) throws Exception {
        SimpleGui app = new SimpleGui();
        app.setVisible(true);
    }

    private JButton button1   = new JButton("Получить все данные из файла ");
    private JButton button2   = new JButton("Добавить данные ");
    private JButton button3   = new JButton("Удалить все данные из файла");
    private JButton button4   = new JButton("Узнать родительскую директорию");
    private JButton button5   = new JButton("Размер файла");
    private JButton button7   = new JButton("Cоздать / Открыть");
    private JLabel label1     = new JLabel("Добавление новых данных в файл  :");
    private JLabel label2     = new JLabel("Дополнительный действия с файлом  :");
    private JLabel label3     = new JLabel("Введите пожалуйста имя файла , который вы хотите открыть или создать для дальнейшей работы ");
    private JLabel label7     = new JLabel("Расширение .txt указывать не нужно. ( Файл будет добавлен в папку - learn\\src\\Lab_2 ) ");
    private JLabel label4     = new JLabel("Cкопировать данные в другой файл   :");
    private JLabel label6     = new JLabel("Введите пожалуйста название второго файла  -");
    private JTextField input3 = new JTextField("", 20);
    private JButton button6   = new JButton("Скопировать");
    private JTextField input  = new JTextField("", 20);
    private JTextField input1 = new JTextField("", 20);
    private JButton button8   = new JButton("Узнать время последней модификации файла");
    private JLabel label8     = new JLabel("Переименовать файл   :");
    private JLabel label9     = new JLabel("Введите пожалуйста новое название файла - ");
    private JTextField input4 = new JTextField("", 20);
    private JButton button9   = new JButton("Переименовать");
    private lab2 myFile;

    public SimpleGui() throws Exception {
        super(" Lab 2 ");
        this.setBounds(100, 0, 655, 680);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        this.getContentPane().setBackground(new Color(255, 204, 255));  //Whatever color
        container.setLayout(null);
        container.add(label3);
        label3.setBounds(20, 10, 610, 20);
        container.add(label7);
        label7.setBounds(60, 40, 600, 20);
        container.add(input1);
        input1.setBounds(67, 70, 500, 20);
        container.add(button7);
        button7.setBounds(67, 100, 500, 20);
        container.add(label1);
        label1.setBounds(200, 130, 500, 20);
        container.add(input);
        input.setBounds(60, 160, 500, 20);
        button2.setBounds(60, 190, 500, 20);
        container.add(label2);
        label2.setBounds(200, 220, 500, 20);
        container.add(button4);
        button4.setBounds(60, 250, 500, 20);
        container.add(button5);
        button5.setBounds(60, 280, 500, 20);
        button1.setBounds(60, 310, 500, 20);
        container.add(button3);
        button3.setBounds(60, 340, 500, 20);
        container.add(label4);
        label4.setBounds(200, 370, 500, 20);
        container.add(label6);
        label6.setBounds(60, 400, 500, 20);
        container.add(input3);
        input3.setBounds(60, 430, 500, 20);
        container.add(button6);
        button6.setBounds(60, 460, 500, 20);
        container.add(button8);
        button8.setBounds(60, 490, 500, 20);
        container.add(label8);
        label8.setBounds(60, 520, 500, 20);
        container.add(label9);
        label9.setBounds(60, 550, 500, 20);
        container.add(input4);
        input4.setBounds(60, 580, 500, 20);
        container.add(button9);
        button9.setBounds(60, 610, 500, 20);

        button1.addActionListener(new ButtonEventListiner1());
        button2.addActionListener(new ButtonEventListiner1());
        button3.addActionListener(new ButtonEventListiner1());
        button4.addActionListener(new ButtonEventListiner1());
        button5.addActionListener(new ButtonEventListiner1());
        button6.addActionListener(new ButtonEventListiner1());
        button7.addActionListener(new ButtonEventListiner1());
        button8.addActionListener(new ButtonEventListiner1());
        button9.addActionListener(new ButtonEventListiner1());

        container.add(button1);
        container.add(button2);
        container.add(button3);
    }

    class ButtonEventListiner1 implements ActionListener {

   /*    public void creation_of_file() {
            String message = "";
            try {
                String path = input1.getText().trim();
                if (input1.getText().trim().isEmpty() == true) { // если пользователь ввел пустую строку - выкинуть исключение
                    throw new RuntimeException();
                }
                try {
                    // создадим новый ( объект ) класса файл
                    myFile = new lab2("C:\\Users\\User\\Desktop\\learn\\src\\Lab_2\\" + path + ".txt");
                    if (myFile.createNewFile()) {
                        message += "Файл ( " + path + ".txt ) был успешно создан , и готов к работе :) \n";
                        message += "------------------------------------------------\n";
                    } else {
                        message += "Файл ( " + path + ".txt ) уже существует \n";
                        message += "------------------------------------------------\n";
                    }
                } catch (IOException ex) {
                    message += "Ошибочка при открытии или создании файла ... хз в чем \n";
                }
                JOptionPane.showMessageDialog(null, message, "Открытие файла", JOptionPane.PLAIN_MESSAGE);
            } catch (RuntimeException exception) {
            JOptionPane.showMessageDialog(null, " Вы ввели пустую строку в поле для ввода имени файла , попробуйте снова :(" ,"Результат", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        } */

        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            if (e.getActionCommand() == "Cоздать / Открыть") {
                String message = "";
                try {
                    String path = input1.getText().trim();
                    if (input1.getText().trim().isEmpty() == true) { // если пользователь ввел пустую строку - выкинуть исключение
                        throw new RuntimeException();
                    }
                    try {
                        // создадим новый ( объект ) класса файл
                        myFile = new lab2("C:\\Users\\User\\Desktop\\learn\\src\\Lab_2\\" + path + ".txt");
                        if (myFile.createNewFile()) {
                            message += "Файл ( " + path + ".txt ) был успешно создан , и готов к работе :) \n";
                            message += "------------------------------------------------\n";
                        } else {
                            message += "Файл ( " + path + ".txt ) был найден , и готов к работе \n";
                            message += "------------------------------------------------\n";
                        }
                        // проверка на возможность чтения данных из файла
                        if (myFile.canRead()) {
                            message += "Файл может быть прочитан \n";
                            message += "------------------------------------------------\n";
                        } else {
                            message += "Файл не может быть прочитан \n";
                            message += "------------------------------------------------\n";
                        }
                        // проверка на возможность записи данных в файл
                        if (myFile.canWrite()) {
                            message += "Файл может быть записан \n";
                        } else {
                            message += "Файл не может быть записан \n";
                        }
                    } catch (IOException ex) {
                        message += "Ошибочка при открытии или создании файла ... хз в чем \n";
                    }
                    JOptionPane.showMessageDialog(null, message, "Открытие файла", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, " Вы ввели пустую строку в поле для ввода имени файла , попробуйте снова :(" ,"Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Удалить все данные из файла") {
                String message = "";
                //creation_of_file(); // эта функция , каждый раз обновляет файл
                try {
                    if (myFile.print_file(myFile).trim().isEmpty() == true) {
                        JOptionPane.showMessageDialog(null, "Ваш файл и так пуст :)", "Удаление данных из файла", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                    message += myFile.clear_file(myFile);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null,"При удалении данных возникла ошибка , попробуйте снова :( ","Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(null, message, "Удаление данных из файла", JOptionPane.PLAIN_MESSAGE);
            }
            if (e.getActionCommand() == "Добавить данные ") {
                String message = "";
               // creation_of_file();
                try {
                    if (input.getText().trim().isEmpty() == true) {
                        JOptionPane.showMessageDialog(null, "Вы пытаетесь добавить пустую строку в файл , попробуйте снова :( ", "Добавление данных в файл", JOptionPane.PLAIN_MESSAGE);
                        return;
                    }
                    message += myFile.add_information(myFile, input.getText()) + "\n";
                    message += "------------------------------------------------ \n";
                    message += " Файл содержит следующие данные - \n";
                    if (myFile.print_file(myFile).trim().isEmpty() == true) {
                        message += " " + "Ваш файл пуст" + "\n";
                    } else {
                        message += " " + myFile.print_file(myFile) + "\n";
                    }
                    message += "------------------------------------------------ \n";
                    JOptionPane.showMessageDialog(null, message, "Добавление данных в файл", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, "При добавлении данных возинла ошибка , попробуйте снова :( ","Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Узнать родительскую директорию") {
                String message = "";
               // creation_of_file();
                try {
                    message += "Имя файла : " + myFile.getName() + "\n";
                    message += "Родительская директория : " + myFile.getParent() + "\n";
                    JOptionPane.showMessageDialog(null, message, "Информация о файле", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null,  "При попытке узнать имя файла возникла ошибка , попробуйте снова :( ","Результат",  JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Размер файла") {
                String message = "";
              //  creation_of_file();
                try {
                    message += "Размер файла : \n";
                    message += myFile.getFileSizeBytes(myFile) + "\n";
                    message += myFile.getFileSizeKiloBytes(myFile) + "\n";
                    message += myFile.getFileSizeMegaBytes(myFile) + "\n";
                    JOptionPane.showMessageDialog(null, message, "Размер файла ", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, "При попытке узнать размер файла возникла ошибка , попробуйте снова :( ","Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Узнать время последней модификации файла") {
                String message = "";
              //  creation_of_file();
                try {
                    String date = new SimpleDateFormat("------------------\nВремя   - HH:mm:ss \nДата      - dd MMMM yyyy \nДень недели   - EEEE \n ").format(new Date(myFile.lastModified()));
                    message += date;
                    JOptionPane.showMessageDialog(null,"Время последней модификации файла \n" + date , "Результат" , JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, "При попытке узнать время последней модификации файла возникла ошибка , попробуйте снова :( " , "Результат" , JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Скопировать") {
             //   creation_of_file();
                try {
                    copy(input3.getText().trim(), myFile);
                } catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
            }
            if (e.getActionCommand() == "Переименовать") {
                String message = "";
               // creation_of_file();
                try {
                    String path = input4.getText().trim();
                    if (input4.getText().trim().isEmpty() == true) { // если пользователь ввел пустую строку - кинуть исключение
                        throw new RuntimeException();
                    }
                    File newFile = new File("C:\\Users\\User\\Desktop\\learn\\src\\Lab_2\\" + path + ".txt");
                    if (myFile.renameTo(newFile)) {
                        message += "Файл переименован успешно";
                    } else {
                        message += "Файл не был переименован";
                    }
                    JOptionPane.showMessageDialog(null, message, "Результат - ", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, "При попытке переименовать файла возникла ошибка , возможно вы ввели пустую строку , в поле для ввода имени :( ","Результат" , JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            if (e.getActionCommand() == "Получить все данные из файла ") {
                String message = "";
               // creation_of_file();
                try {
                    message += " Данные из файла - \n";
                    message += "------------------------------------------------ \n";
                    if (myFile.print_file(myFile).trim().isEmpty() == true) {
                        message += " " + "Ваш файл пуст" + "\n";
                    } else {
                        message += " " + myFile.print_file(myFile) + "\n";
                    }
                    message += "------------------------------------------------ \n";
                    JOptionPane.showMessageDialog(null, message, "Данные из файла ", JOptionPane.PLAIN_MESSAGE);
                } catch (RuntimeException exception) {
                    JOptionPane.showMessageDialog(null, "При получении данных из файла возникла ошибка , попробуйте снова :( ","Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
        }

        public static void copy(String path, lab2 myFile) throws Exception {
            try {
                if (myFile.print_file(myFile).trim().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null, " Вы ввели пустую строку в поле для ввода имени файла , попробуйте снова :(" ,"Результат", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
                if (path.trim().isEmpty() == true) { // если пользователь ввел пустую строку - выкинуть исключение
                    JOptionPane.showMessageDialog(null, " В файле ( источнике ) нет данных ", "Результат ", JOptionPane.PLAIN_MESSAGE);
                }
                File myFile_2 = new lab2("C:\\Users\\User\\Desktop\\learn\\src\\Lab_2\\" + path + ".txt");
                //Создаем поток-чтения-байт-из-файла
                FileInputStream inputStream = new FileInputStream(myFile);
                // Создаем поток-записи-байт-в-файл
                FileOutputStream outputStream = new FileOutputStream(myFile_2);

                while (inputStream.available() > 0) { //пока есть еще непрочитанные байты
                    int data = inputStream.read(); // прочитать очередной байт в переменную data
                    outputStream.write(data); // и записать его во второй поток
                }
                inputStream.close(); //закрываем оба потока. Они больше не нужны.
                outputStream.close();
                System.out.println(" все окей ? ");
            } catch (RuntimeException exception) {
                JOptionPane.showMessageDialog(null, "При попытке копирования данных возникла ошибка , попробуйте снова :( ", "Результат ", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
    }
}

