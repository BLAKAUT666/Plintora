package dominio.Login.UI.main.Anottion.add.input.name;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pane extends JPanel{
    public pane(JTextField name){
        setVisible(true);
        setPreferredSize(new Dimension(400, 40));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JLabel("Nome"));
        add(name);
    }
}
