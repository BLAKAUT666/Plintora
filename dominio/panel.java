package dominio;
import javax.swing.*;
import java.awt.*;

public class panel extends JPanel{
   public panel(){
      //configuração inicial
      Color color = new Color(134, 141, 93);
	  setBackground(color);
	  setPreferredSize(new Dimension(400, 400));
   }   
   
   // adicionando componentes
   private void add(JLabel label, JTextField textField){
     add(label);
	 add(textField);
   }
}
