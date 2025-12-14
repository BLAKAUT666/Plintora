package dominio.Config.Panel;
import javax.swing.*;
import java.awt.*;

public class panel extends JPanel{

   // color
   private final Color color = new Color(134, 141, 93);

   public panel(){
	   setBackground(color);
	   setPreferredSize(new Dimension(400, 400));
      setVisible(true);
   }
}
