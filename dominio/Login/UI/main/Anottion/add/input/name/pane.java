package dominio.Login.UI.main.Anottion.add.input.name;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class pane extends JPanel{

    // configuração basica
    public pane(){
        setVisible(true);
        setPreferredSize(new Dimension(100, 40));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JLabel("Nome"));
    }
}
