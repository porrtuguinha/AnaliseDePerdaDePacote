package main;

import java.util.Scanner;

import business.Business;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo (em bits):");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Informe a velocidade da rede (em bits por segundo):");
        double velocidadeRede = scanner.nextDouble();

        System.out.println("Informe a duração da transmissão (em segundos):");
        double duracaoTransmissao = scanner.nextDouble();

        Business.calcularPerdaPacotes(tamanhoArquivo, velocidadeRede, duracaoTransmissao);

        scanner.close();
    }
}
