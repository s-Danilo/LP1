import java.math.*;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class Controles {
	private final int contaminacao_incial;
	private final int constante_proporcionalidade;
	private int tempo = 1; //constante em horas
	private double infectados;

	public Controles(int tempo, int contaminacao_inicial, int constante_proporcionalidade) {
        this.contaminacao_incial = contaminacao_inicial;
        this.constante_proporcionalidade = constante_proporcionalidade;
		infectados = contaminacao_incial * Math.exp(constante_proporcionalidade * tempo);	
		System.out.printf("Numero de infectados: %f \n", infectados);		
	}

	public void calc_infectados () {
		String tempo;
		Scanner input = new Scanner(System.in);
		System.out.println("Calcula de infectados e insira o tempo: ");

		while (input.hasNext()){
			int t = input.nextInt();

			if (t > 0 && t <= 24)
				tempo = "horas";
			else if (t > 24)
				tempo = "dias";
			else 
				tempo = "meses";

			JFrame frame = new JFrame ("Plot infectados");

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			switch (tempo) {
				case "horas":
					System.out.printf("Numero de infectados: %f \n", this.contaminacao_horas(t));
					plotInfectados(frame.getGraphics());
					break;

				case "dias":
					System.out.printf("Numero de infectados: %f \n",this.contaminacao_dias(t))	;
					plotInfectados(frame.getGraphics());
					break;

				case "meses":
					System.out.printf("Numero de infectados: %f \n", this.contaminacao_meses(t));
					plotInfectados(frame.getGraphics());
					break;

				default:
					System.out.println("Fora do periodo!\\n");
					break;
			}
		}
		input.close();		
	}

	public double contaminacao_horas(int tempo) {
		return this.infectados = this.contaminacao_incial*Math.exp(this.constante_proporcionalidade * tempo);
	}

	public double contaminacao_dias(int tempo) {
		return this.infectados = this.contaminacao_incial*Math.exp(this.constante_proporcionalidade * tempo / 24);
	}

	public double contaminacao_meses(int tempo) {
		return this.infectados = this.contaminacao_incial*Math.exp(this.constante_proporcionalidade * tempo / 360);
	}

	public void plotInfectados(Graphics g) {		
		g.drawChars(null, constante_proporcionalidade, tempo, contaminacao_incial, constante_proporcionalidade);
		//plot.drawChars(null, constante_proporcionalidade, tempo, {0}, infectados);		
	}
        
}
