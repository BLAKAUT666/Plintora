package dominio.Config.Panel.themeAdd;
import javax.swing.JButton;
import javax.swing.JPanel;

import dominio.Login.theme.theme;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class opcao extends JPanel{
    private JButton dark = new JButton("Escuro");
    private JButton white = new JButton("Branco");
    private static final Font font = new Font("Inter", 0, 20);
    private static final Color background = new Color(33, 33, 31);
    private static final Color fontColor = new Color(255, 255, 255);
    private theme themes = new theme();

    public opcao(){
        setSize(new Dimension(200, 200));
        setLayout(new GridLayout(0, 1));

        // métodos
        configButton();
        addThemes();

        //add components in painel
        add(dark);
        add(white);
    }

    private void configButton(){
        // theme dark
        dark.setVisible(true);
        dark.setFont(font);
        dark.setBackground(background);
        dark.setForeground(fontColor);
        dark.setPreferredSize(new Dimension(120, 50));

        // theme white
        white.setVisible(true);
        white.setFont(font);
        white.setForeground(fontColor);
        white.setBackground(background);
        white.setPreferredSize(new Dimension(120, 50));
    }

    private void addThemes(){
        // theme dark click
        dark.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                System.out.println("Tema adicionado com sucesso!!");
                themes.dark();
                dark.setVisible(false);
            }
        });

        // theme white click
        white.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                System.out.println("Tema adicionado com sucesso!!");
                themes.white();
                white.setVisible(false);
            }
        });
    }
}
