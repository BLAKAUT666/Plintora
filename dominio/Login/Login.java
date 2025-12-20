package dominio.Login;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import dominio.Config.Panel.loginButton;
import dominio.Config.Panel.panel;

public class Login{
    private String userName;
    private String userPassword;

    public Login(){
        input();
    }

    public void input(){
        panel painel = new panel();
        JTextField name = new JTextField();
        JTextField password = new JTextField();

        // fonts
        Font font = new Font("Inter", 4, 20);
        Color background = new Color(255,255,255);
        Color fontColor = new Color(0,0,0);
        // name
        name.setVisible(true);
        name.setSize(new Dimension(100,40));
        name.setFont(font);
        name.setBackground(background);
        name.setForeground(fontColor);

        // password
        password.setVisible(true);
        password.setFont(font);
        password.setSize(new Dimension(100, 40));
        password.setBackground(background);
        password.setForeground(fontColor);

        // add
        painel.add(name);
        painel.add(password);

        // cick button
        loginButton button = new loginButton();
        painel.add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event){
                userName = name.getName();
                userPassword = password.getName();

                if(userName == null || userPassword == null) {
                    System.out.println("Campos incorretos!!!");
                    return;
                }

                System.out.println("Campos corretos");
            }
        });

    }
}
