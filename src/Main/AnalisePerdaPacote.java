package Main;

import java.util.Scanner;

public class AnalisePerdaPacote {

    public static void calcularPerdaPacotes(double tamanhoArquivo, double velocidadeRede, double duracaoTransmissao) {

        System.out.println("Tempo (s)\tPerda de Pacotes (%)");
        for (int segundo = 0; segundo <= duracaoTransmissao; segundo++) {
            double tempoAtual = segundo;
            double perdaPacotesAtual = segundo * (1 - (tempoAtual / duracaoTransmissao));
            System.out.printf("%.2f\t\t%.2f\n", tempoAtual, perdaPacotesAtual);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo (em bits):");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Informe a velocidade da rede (em bits por segundo):");
        double velocidadeRede = scanner.nextDouble();

        System.out.println("Informe a duração da transmissão (em segundos):");
        double duracaoTransmissao = scanner.nextDouble();

        calcularPerdaPacotes(tamanhoArquivo, velocidadeRede, duracaoTransmissao);

        scanner.close();
    }
}
