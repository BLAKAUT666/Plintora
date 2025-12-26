package dominio.Login.inputs.password;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class passPanel extends JPanel{
    public passPanel(){
        setSize(new Dimension(200, 10));
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JLabel("Senha"));
    }
}
