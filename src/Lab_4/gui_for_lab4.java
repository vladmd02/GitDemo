package Lab_4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui_for_lab4 {
    public static void main(String[] args) {
        ComPolFram fram = new ComPolFram();
        fram.setVisible(true);
    }}

class ComPolFram extends JFrame{

    public ComPolFram(){
        this.setTitle("Fraction Poligon");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255 , 204 , 255	));  //Whatever color
        this.setSize(500, 125);
        this.setLocation(300, 200);
        setResizable(false);
        Box Hbox1 = Box.createHorizontalBox();
        Hbox1.add(new JLabel("n="));
         nn = new JTextField(10);
         nn.setMaximumSize(nn.getPreferredSize());
        Hbox1.add(nn);
        butmac("Создать полином",Hbox1);
        butmac("Получить результат",Hbox1);

        Hbox2 = Box.createHorizontalBox();
        Hbox3 = Box.createHorizontalBox();
        Hbox4 = Box.createHorizontalBox();
        Hbox5 = Box.createHorizontalBox();
        Hbox6 = Box.createHorizontalBox();
        Hbox7 = Box.createHorizontalBox();
        Box Vbox = Box.createVerticalBox();
        Vbox.add(Hbox1);
        Vbox.add(Hbox2);
        Vbox.add(Hbox3);
        Vbox.add(Hbox4);
        Vbox.add(Hbox5);
        Vbox.add(Hbox6);
        Vbox.add(Hbox7);
        add(Vbox,BorderLayout.CENTER);
    }
    private JTextField nn;
    private TextField[] y1  ;
    private TextField[] x1 ;
    private JLabel[] mas;
    private JLabel  label1  = new JLabel("Первый полином :  ");
    private JLabel  label2  = new JLabel("Второй полином :  ");
    private JLabel[] arr;
    private JLabel[] mas_w;
    private JLabel[] arr_z;
    private TextField[] w1  ;
    private TextField[] z1 ;
    private Box Hbox2,Hbox3,Hbox4,Hbox5,Hbox6,Hbox7 ;
    private FractionPolynom simple;

    private void butmac(String s,Box b){
        JButton but = new JButton(s);
        but.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                      //  System.out.println(e.getActionCommand());
                        if (e.getActionCommand()=="Создать полином") {
                            try {
                                int n = Integer.parseInt(nn.getText().trim());
                            Hbox2.removeAll();
                            Hbox3.removeAll();
                            w1 = new TextField[n];
                            z1 = new TextField[n];
                            y1 = new TextField[n];
                            x1 = new TextField[n];
                            mas = new JLabel[n];
                            arr = new JLabel[n];
                            mas_w = new JLabel[n];
                            arr_z = new JLabel[n];
                            for (int i = 0; i < n; i++) {
                                w1[i] = new TextField(0);
                                z1[i] = new TextField(0);
                                y1[i] = new TextField(0);
                                x1[i] = new TextField(0);
                                mas[i] = new JLabel("        ");
                                arr[i] = new JLabel("        ");
                                mas_w[i] = new JLabel("        ");
                                arr_z[i] = new JLabel("        ");
                                Hbox2.add(label1);
                                Hbox3.add(y1[i]);
                                Hbox3.add(arr[i]);
                                Hbox4.add(x1[i]);
                                Hbox4.add(mas[i]);
                                Hbox5.add(label2);
                                label2.setBounds(100, 100, 240, 200);
                                Hbox6.add(w1[i]);
                                Hbox6.add(mas_w[i]);
                                Hbox7.add(z1[i]);
                                Hbox7.add(arr_z[i]);
                                but.setEnabled(false);
                            }
                            }
                            catch ( RuntimeException exception ) {
                                JOptionPane.showMessageDialog(null , " Вы ввели объект n отличный от типа int :( " , "Результат работы" , JOptionPane.PLAIN_MESSAGE);
                            }
                            pack();
                        }
                        else
                        if(e.getActionCommand()=="Получить результат")
                        {
                            try {
                                int n = Integer.parseInt(nn.getText().trim());

                                FractionPolynom one = new FractionPolynom(n - 1);
                                FractionPolynom two = new FractionPolynom(n - 1);
                                for (int i = 0; i < n; i++) {
                                    float numerator = Integer.parseInt(y1[i].getText().trim());
                                    float denominator = Integer.parseInt(x1[i].getText().trim());
                                    one.setCoeff(n - 1 - i, numerator / denominator);
                                }
                                String message = "";
                                message += "Первый полином : \n " + one.output() + "\n";
                                for (int i = 0; i < n; i++) {
                                    float numerator = Integer.parseInt(w1[i].getText().trim());
                                    float denominator = Integer.parseInt(z1[i].getText().trim());
                                    two.setCoeff(n - 1 - i, numerator / denominator);
                                }
                                message += "------------------------------------------------ \n";
                                message += "Второй полином : \n " + two.output() + "\n";
                                message += "------------------------------------------------ \n";
                                message += "Cумма полиномов : \n " + FractionPolynom.summ(one, two) + "\n";
                                message += "------------------------------------------------ \n";
                                message += "Разность полиномов : \n " + FractionPolynom.difference(one, two) + "\n";
                                message += "------------------------------------------------ \n";
                                message += "Произведение полиномов : \n " + FractionPolynom.multiply(one, two) + "\n";
                                message += "------------------------------------------------ \n";
                                JOptionPane.showMessageDialog(null , message , "Результат работы" , JOptionPane.PLAIN_MESSAGE);

                            } catch ( RuntimeException exception ) {
                                JOptionPane.showMessageDialog(null, " Вы заполнили не все дроби , либо ввели значения отличные от типа int :( ", "Результат работы", JOptionPane.PLAIN_MESSAGE);
                                return ;
                            }
                            pack();
                        }}});
        b.add(but);
    }}