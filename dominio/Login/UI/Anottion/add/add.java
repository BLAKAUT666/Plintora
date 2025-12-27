package dominio.Login.UI.Anottion.add;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class add extends JButton{
    private static final Font FONT = new Font("Inter", 0, 20);

    public add(){
        setText("Adicionar Anotação");
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        setSize(new Dimension(120, 40));
        setFont(FONT);

        click();
    }

    private void click(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                System.out.println("Apertei no butão de adicionar");
            }
        });
    }
}
