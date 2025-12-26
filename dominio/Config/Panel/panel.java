package dominio.Config.Panel;
import javax.swing.*;
import java.awt.*;

public class panel extends JPanel{

   public panel(){
	   setSize(new Dimension(400, 400));
      setVisible(true);
      setLayout(new GridLayout(0, 1, 0, 10));
   }
}
