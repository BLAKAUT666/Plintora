package dominio.Login.inputs.name;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class namePanel extends JPanel {
    public namePanel(){
        setVisible(true);
        setPreferredSize(new Dimension(100, 10));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JLabel("Usuario"));
    }
}
