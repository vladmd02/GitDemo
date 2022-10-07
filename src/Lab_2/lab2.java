package Lab_2;
import java.io.*;
import java.util.Scanner;

// Вариант 8 :
// Для всех вариантов расширить возможности данного базового класса с помощью наследования:
// 8. Класс Файл , чтобы можно было определить размер объекта после изменения.
public class lab2 extends File   {

    // Для начала надо объявить ctor по умолчанию , который будет вызывать конструктор базового класса File
    public lab2(String pathname) { // ctor по умолчанию
        super(pathname); // вызываем ctor базы , и передаем в него путь к файлу
    }

    // Далее определим пару методов , которые будут возвращать размер файла :
    // метод возвращает размер файла в мегабайтах
    // длину файла делим на 1 мегабайт (1024 * 1024 байт) и узнаем количество мегабайт
    public static String getFileSizeMegaBytes(File file) {
        return (double) file.length()/(1024*1024)+" мегабайт";
    }

    // метод возвращает размер файла в килобайтах
    // длину файла делим на 1 килобайт (1024 байт) и узнаем количество килобайт
    public static String getFileSizeKiloBytes(File file) {
        return (double) file.length()/1024 + " килобайт";
    }

    // тут мы просто вызываем метод length() и получаем размер файла в байтах
    public static String getFileSizeBytes(File file) {
        return file.length() + " байт";
    }

    // Далее напишем метод , который определяет размер файла после добавления в него данных
    public static String add_information( File file , String str ) {
        String res = "";
        double size_before = file.length() ;
        Scanner in = new Scanner(System.in);
        // Выводим на экран размер файла до добавления в него данных
        res += "Размер файла ДО    добавления данных равен - " + size_before + " байт \n";
        //System.out.println("Размер файла ДО    добавления данных равен - " + size_before + " байт " );
        try(FileWriter writer = new FileWriter(file , true )) { // для добавления данных используем конструкцию try with resources  , и объект типа FileWriter
            // Подсказка для пользователя
            System.out.println("Введите пожалуйста данные - ");
            String text = str;
            //String text = in.nextLine(); // временная переменная , можно без нее
            // записываем всю строку
            writer.write(text);
            // запись по символам
            writer.append('\n'); // после записи данных добавляем символа перехода на новую строку
            writer.flush(); // ???
        }
        catch(IOException ex){ // если не получилось записать - выбрасываем исключение IOException
            System.out.println(ex.getMessage()); // выводим информацию о выбращенном исключении
        }
        double size_after = file.length() ;
        // Выводим на экран размер файла после добавления в него данных
        res += "Размер файла ПОСЛЕ добавления данных равен - " + size_after + " байт \n";
        //System.out.println("Размер файла ПОСЛЕ добавления данных равен - " + size_after + " байт " );
        return res;
    }

    public static String clear_file(File file) {
        double size_before = file.length() ;
        String res = "";
        // Выводим на экран размер файла до добавления в него данных
        res += "Размер файла ДО    удаления всех данных равен - " + size_before + " байт \n";
        //System.out.println("Размер файла ДО    удаления всех данных равен - " + size_before + " байт " );
        try(FileWriter writer = new FileWriter(file , false )) { // для добавления данных используем конструкцию try with resources  , и объект типа FileWriter
            // добавляем в файл пустую строку тем самым очищая его содержимое
            writer.write("");
            writer.flush(); // ???
        }
        catch(IOException ex){ // если не получилось записать - выбрасываем исключение IOException
            System.out.println(ex.getMessage()); // выводим информацию о выбращенном исключении
        }
        double size_after = file.length() ;
        // Выводим на экран размер файла после добавления в него данных
        res += "Размер файла ПОСЛЕ удаления всех данных равен - " + size_after + " байт  \n";
        //System.out.println("Размер файла ПОСЛЕ удаления всех данных равен - " + size_after + " байт " );
        return res;
    }

    public static String print_file (File file) {
        if (file.exists()) {
            String concat = "";
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    concat += line;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return concat;
        }
        else {
            return "Увы файл не существует";
        }
    }
}

