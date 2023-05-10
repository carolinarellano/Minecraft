package net.rcy.modbuilder.Interface;

import javax.swing.*;
import java.awt.*;

public class Armor_Interface extends JFrame {
    public static final Color WINDOW_COLOR = new Color(28, 28, 28);
    public static final Font   FONT  = new Font("CHEWY", Font.BOLD, 15);
    private JLabel titleMenu;
    private ImageIcon BackgroundIcon;
    private JLabel BackgroundImage;
    public enum Durability { ARMADURA1, ARMADURA2, ARMADURA3 };
    private JComboBox<Durability> DurabilityCmb = new JComboBox(Durability.values());

    public Armor_Interface(){
        super("Crea tu armadura");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        setVisible(true);
    }
    private void initComponents(){
        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        c.setLayout(null);

        BackgroundIcon = new ImageIcon(getClass().getResource("images/fondoArmadura.png"));
        BackgroundImage = new JLabel(BackgroundIcon);
        BackgroundImage.setBounds(0,0,800,600);
        System.out.println(BackgroundIcon.getIconWidth());

        //Lista despegable durabilidad
        DurabilityCmb.setBounds(50, 200, 200, 40);
        DurabilityCmb.setFont(FONT);
        //Lista despegable tenacidad

        c.add(BackgroundImage);
        c.add(DurabilityCmb);

    }
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme");
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Armor_Interface();
    }

}
