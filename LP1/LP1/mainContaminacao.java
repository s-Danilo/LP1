package contaminacao;
import java.awt.Dimension;
import javax.swing.JFrame;

public class mainContaminacao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  ---------------  COMO UTILIZAR -------------------
		 *  controles controle = new controles(horas, contaminacão inicial, constante de proporcionalidade);
		 */
		controles controle = new controles(1, 2, 1);
		JFrame frame = new Tela(3, 2, 2);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(new Dimension(400, 400));
	    frame.setVisible(true);
	}
}
