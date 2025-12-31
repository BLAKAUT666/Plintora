package dominio.Login.UI.main.Anottion.add.input.descricao;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class panelDescricao extends JPanel {
    public panelDescricao(JTextArea text){
        setVisible(true);
        setPreferredSize(new Dimension(400, 500));
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JLabel("Descrição"));
        add(text);
    }
}
