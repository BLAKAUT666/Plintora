package dominio.Config.Panel.themeAdd;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;
import dominio.Login.theme.theme;

public class opcao extends JPanel{
    public opcao(){
        JCheckBox dark, white;

        dark = new JCheckBox("Escuro");
        white = new JCheckBox("Branco");

        // temas
        theme tema = new theme();
        JCheckBoxMenuItem menuItem = new JCheckBoxMenuItem("menu");
        Font fontMenuItem = new Font("Fira Code", 2, 20);


        // configurações do dark e white
        dark.setFont(fontMenuItem);
        white.setFont(fontMenuItem);
        // adiciona os itens ao menuItem
        menuItem.add(dark);
        menuItem.add(white);
        menuItem.setVisible(true);

        dark.setVisible(true);
        white.setVisible(true);
        dark.setBounds(50, 100, 100, 100);
        white.setBounds(200, 100, 100, 100);

        setVisible(true);
        add(menuItem);

        if(dark.isSelected()){
            // aplicar tema escuro
            tema.dark();
        }else if( white.isSelected()){
            // aplicar tema claro
            tema.white();
        }
    }
}
