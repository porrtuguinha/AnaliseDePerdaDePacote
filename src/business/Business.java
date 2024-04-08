package business;

public class Business {
	 public static void calcularPerdaPacotes(double tamanhoArquivo, double velocidadeRede, double duracaoTransmissao) {

	        System.out.println("Tempo (s)\tPerda de Pacotes (%)");
	        for (int segundo = 0; segundo <= duracaoTransmissao; segundo++) {
	            double tempoAtual = segundo;
	            double perdaPacotesAtual = segundo * (1 - (tempoAtual / duracaoTransmissao));
	            System.out.printf("%.2f\t\t%.2f\n", tempoAtual, perdaPacotesAtual);
	        }
	    }
}
