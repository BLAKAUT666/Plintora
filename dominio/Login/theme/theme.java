package dominio.Login.theme;
import java.awt.Color;

import dominio.Config.window.menu;

public class theme {
    private menu main = new menu();

    // colors dark and white
    private final Color DARK = new Color(0, 0, 0);
    private final Color WHITE  = new Color(255, 255, 255);

    // theme: Dark
    public void dark(){
        main.setBackground(DARK);
    }
    // theme: White
    public void white(){
        main.setBackground(WHITE);
    }
}
