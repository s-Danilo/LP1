package contaminacao;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.Math.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela extends JFrame {
	  private static int contaminacao_inicial;
	  private static int constante_proporcionalidade;
	  private static int tempo; // em horas
	  public Tela(int tempo, int contaminacao_inicial, int constante_proporcionalidade) {
		Tela.contaminacao_inicial = contaminacao_inicial;
		Tela.constante_proporcionalidade = constante_proporcionalidade;
		Tela.tempo = tempo;
	    JPanel panel = new Plotar();
	    panel.setPreferredSize(new Dimension(600, 600));
	    add(panel);
	  }
	
	  class Plotar extends JPanel {
	    public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      Graphics2D g2 = (Graphics2D) g;
	      g2.translate(50, 300);
	      int x1 = 0;
	      int y1 = 0;
	      int x2;
	      int y2;
	      for (int i = 0; i < Tela.tempo; i++) {
	        x2 = x1 + 1;
	        y2 = - Tela.contaminacao_inicial * (int) Math.exp(i * Tela.constante_proporcionalidade);
	        g2.drawLine(x1, y1, x2, y2);
	        x1 = x2;
	        y1 = y2;
	      }
	    }
	  }
}
