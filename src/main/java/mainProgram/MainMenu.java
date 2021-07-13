package mainProgram;
import instruments.Sound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

public class MainMenu extends JFrame {

    private final  JButton elfLanguage = new JButton("Эльфийский");
    private final  JButton chort = new JButton("Шрифт чорта");
    private final  JButton cesar = new JButton("Шифр цезаря");

    public MainMenu()
    {
        super("21");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Определяем размер окна и выводим его на экран
        setSize(550, 350);
        setVisible(true);
        try {
            setContentPane(panel()); // передаем как параметр в коструктор
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        setVisible(true); //  форма будет видимой
    }

    public JPanel panel() throws URISyntaxException  {
        // We create a bottom JPanel to place everything on.
        // сначала создаётся "панель", на которой и размещаюся
        // остальные компоненты
        JPanel menushka = new JPanel(); // создаём "поверхность"
        menushka.setLayout(null);

        // Создаём кнопку---------------
        elfLanguage.setLocation(5, 7); // расположение кнопки
        elfLanguage.setSize(250, 80); // размер кнопки
        elfLanguage.setBackground(new Color(0x6DC911));
        elfLanguage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound("sounds\\boyNextDoor.wav");

            }
        });


        elfLanguage.setActionCommand("Open");
        menushka.add(elfLanguage); // добавляем кнопку на поверхность

        // Создаём кнопку---------------
        chort.setLocation(5, 107); // расположение кнопки
        chort.setSize(250, 80); // размер кнопки
        chort.setBackground(new Color(0x157AA1));
        chort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        chort.setActionCommand("Open");
        menushka.add(chort); // добавляем кнопку на поверхность

        // Создаём кнопку---------------
        cesar.setLocation(5, 207); // расположение кнопки
        cesar.setSize(250, 80); // размер кнопки
        cesar.setBackground(new Color(0x157AA1));
        cesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        cesar.setActionCommand("Open");
        menushka.add(cesar); // добавляем кнопку на поверхность

        JLabel label = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("images/Legolas.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(label);
        label.setIcon(imageIcon);
        label.setLocation(275, 7); // расположение кнопки
        label.setSize(250, 300); // размер кнопки
        menushka.add(label);

        menushka.setOpaque(true);
        //menushka.setBackground(Color.DARK_GRAY);
        return menushka; // возвращаем внешний вид


    }
    public static void main(String[] args) {
        new MainMenu();
        Sound.playSound("sounds\\welcomeToTheClubBuddy.wav");
    }
}