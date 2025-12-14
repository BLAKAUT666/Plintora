package dominio.Config.Panel.themeAdd;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class add extends JButton{
    private Color colorButton = new Color(255, 91, 20);
    private Font fontButton = new Font("JetBrains Mono", 0, 20);

    public add(){
        super("Temas");

        setFont(fontButton);
        setBackground(colorButton);
        setVisible(true);

        clicked();
    }

    private void clicked(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                opcao op = new opcao();
            }
        });
    }
}
