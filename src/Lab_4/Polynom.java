package Lab_4;
import java.util.*;

public class Polynom {

     protected double[] coeff;
     protected int deg;

     public Polynom(int n) {
         deg = n;
         coeff = new double[deg+1];
         for(int i = 0; i < deg+1; i++)
             coeff[i] = 0;
     }

     // Этот метод мы переопределили в наследнике FractionPolynom
     // тут мы просто присваиваем число типа double нашим коэфицентам
     // а в переопределном методе - присваиваем частное двух чисел
     //Нулевой коэффициент - свободный член
     public void inputCoeff()
     {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите коэффициенты: ");
         for(int i = 0; i < deg+1; i++)
         {
             coeff[i] = in.nextDouble();
             System.out.print("coeff[" + i + "] = " +  coeff[i]);
             System.out.println();
         }
     }

     // абстрактные методы , которые мы переопределим в наследнике FractionPolynom
     public  void setCoeff(int index, double x) { coeff[index] = x; }
     public double getCoeff(int index) { return coeff[index]; }
     public int getDeg()
     {
         return deg;
     }

     //Возвращает полином с суммой соотвутствующих коэффициентов
     public static String summ(Polynom p1, Polynom p2) {
         String tmp = "";
         int tempDeg;
         if(p1.getDeg() < p2.getDeg())
             tempDeg = p1.getDeg();
         else
             tempDeg = p2.getDeg();
         Polynom tempP = new Polynom(tempDeg);
         for(int i = 0; i < tempDeg+1; i++)
             tempP.setCoeff(i, p1.getCoeff(i) + p2.getCoeff(i));
         tmp += tempP.output();
         return tmp;
     }

     // Возвращает полином с разностью соотвутствующих коэффициентов
     public static String difference(Polynom p1, Polynom p2) {
         String tmp = "";
         int tempDeg;
         if(p1.getDeg() > p2.getDeg())
             tempDeg = p1.getDeg();
         else
             tempDeg = p2.getDeg();
         Polynom tempP = new Polynom(tempDeg);
         for(int i = 0; i < tempDeg+1; i++)
             tempP.setCoeff(i, p1.getCoeff(i) - p2.getCoeff(i));
         tmp += tempP.output();
         return tmp;
     }

     //Возвращает полином, полученный при произведении
     public static String multiply(Polynom p1, Polynom p2) {
         String tmp = "";
         int tempDeg = p1.getDeg()+p2.getDeg();
         Polynom tempP = new Polynom(tempDeg);
         for(int i = 0; i < p1.getDeg()+1; i++)
             for (int j = 0; j < p2.getDeg()+1; j++)
                 tempP.setCoeff(i + j, tempP.getCoeff(i + j) + p1.getCoeff(i) * p2.getCoeff(j));
         tmp += tempP.output();
         return tmp;
     }

     //Метод для инициализации полиномов
     public static Polynom inputPolynom() {
         Scanner in = new Scanner(System.in);
         System.out.print("Введите степень полинома: ");
         int degP = in.nextInt();
         FractionPolynom p = new FractionPolynom(degP);
         p.inputCoeff();
         p.output();
         return p;
     }

     //Вывод полинома на экран
     public String output() {
         String tmp = "";
         for (int i = 0; i < deg + 1; i++) {
             int l = deg - i;
             tmp += coeff[l] + "*" + "X(" + l + ")";
             //System.out.printf("%d*X(%d)", coeff[i], i);
             if (i < deg)
                 tmp += "+";
             //System.out.print("+");
         }
         System.out.println();
         return tmp;
     }
 }

class FractionPolynom extends Polynom {
//    private double[] coeff;
//    private int deg;

    public FractionPolynom(int n) {
        super(n);
    }

    //Нулевой коэффициент - свободный член
    public void inputCoeff(int numerator , int denominator)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты: ");
      //  int a = numerator/denominator;
        for(int i = 0; i < deg+1; i++)
        {
            coeff[i] = numerator/denominator;
            System.out.print("coeff[" + i + "] = " +  coeff[i]);
            System.out.println();
        }
    }

    //Возвращает полином с суммой соотвутствующих коэффициентов
    public static String summ(FractionPolynom p1, FractionPolynom p2)
    {
        String tmp = "";
        int tempDeg;
        if(p1.getDeg() < p2.getDeg())
            tempDeg = p1.getDeg();
        else
            tempDeg = p2.getDeg();
        FractionPolynom tempP = new FractionPolynom(tempDeg);
        for(int i = 0; i < tempDeg+1; i++)
            tempP.setCoeff(i, p1.getCoeff(i) + p2.getCoeff(i));
        tmp += tempP.output();
        return tmp;
    }

    //Возвращает полином с разностью соотвутствующих коэффициентов
    public static String difference(FractionPolynom p1, FractionPolynom p2)
    {
        String tmp = "";
        int tempDeg;
        if(p1.getDeg() > p2.getDeg())
            tempDeg = p1.getDeg();
        else
            tempDeg = p2.getDeg();
        FractionPolynom tempP = new FractionPolynom(tempDeg);
        for(int i = 0; i < tempDeg+1; i++)
            tempP.setCoeff(i, p1.getCoeff(i) - p2.getCoeff(i));
        tmp += tempP.output();
        return tmp;
    }

    //Возвращает полином, полученный при произведении
    public static String multiply(FractionPolynom p1, FractionPolynom p2)
    {
        String tmp = "";
        int tempDeg = p1.getDeg()+p2.getDeg();
        FractionPolynom tempP = new FractionPolynom(tempDeg);
        for(int i = 0; i < p1.getDeg()+1; i++)
            for (int j = 0; j < p2.getDeg()+1; j++)
                tempP.setCoeff(i + j, tempP.getCoeff(i + j) + p1.getCoeff(i) * p2.getCoeff(j));
        tmp += tempP.output();
        return tmp;
    }

    //Метод для инициализации полиномов
    public static FractionPolynom inputPolynom(int n , int numerator , int denominator )
    {
        //Scanner in = new Scanner(System.in);
        System.out.print("Введите степень полинома: ");
       // int degP = in.nextInt();
        FractionPolynom p = new FractionPolynom(n);
        p.inputCoeff(numerator ,denominator );
        p.output();
        return p;
    }
}


