package dominio.Login.UI.main.Anottion.add.btnClick.descricao;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class btnPanelDescricao extends JPanel{
    public btnPanelDescricao(JButton btn){
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(120, 40));

        add(btn);
    }
}
