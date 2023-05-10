package net.rcy.modbuilder.Interface;
import javax.swing.*;
import java.awt.*;

public class Main_Window extends JFrame {

    public static final Color  WINDOW_COLOR = new Color(28, 28, 28);
    public static final Font   BUTTON_FONT  = new Font("CHEWY", Font.BOLD, 15);
    private ImageIcon titleIcon;
    private JLabel titleImage;
    private JButton weaponBtn = new JButton("Crear arma");
    private JButton armorBtn = new JButton("Crear armadura");
    private JButton testingBtn = new JButton("Testing");


    public Main_Window() {
        super("MineCreator");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        //initMenu();
        setVisible(true);
    }
    private void initComponents() {
        titleIcon = new ImageIcon(getClass().getResource("images/fondo.png"));
        titleImage = new JLabel(titleIcon);
        titleImage.setBounds(0,0,800,600);
        System.out.println(titleIcon.getIconWidth());

        Container c = getContentPane();
        c.setBackground(WINDOW_COLOR);
        c.setLayout(null);

        weaponBtn.setBounds(550,159,139,43);
        weaponBtn.setFont(BUTTON_FONT);
        armorBtn.setBounds(540,238,155,43);
        armorBtn.setFont(BUTTON_FONT);
        testingBtn.setBounds(550,480,139,43);
        testingBtn.setFont(BUTTON_FONT);
        //Cambiar de ventana al presionar el botón de crear armadura
        armorBtn.addActionListener(e -> {
            Armor_Interface armorInterface = new Armor_Interface();
            armorInterface.setVisible(true);
        });
        c.add(weaponBtn);
        c.add(armorBtn);
        c.add(testingBtn);
        c.add(titleImage);
    }
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme");
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main_Window();
    }

}
