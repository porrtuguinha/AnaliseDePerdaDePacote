package main;

import java.util.Scanner;

import business.Business;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tráfego (em Erlangs): ");
        double traffic = scanner.nextDouble();

        System.out.print("Digite o número de servidores: ");
        int servers = scanner.nextInt();


        System.out.print("Digite a quantidade de intervalos de tempo: ");
        int intervals = scanner.nextInt();

        System.out.print("Digite o intervalo de tempo (em segundos): ");
        double timeInterval = scanner.nextDouble();

        System.out.println("\nResultados:");

        for (int i = 1; i <= intervals; i++) {
            double currentTime = i * timeInterval;
            double erlangC = Business.calculateErlangC(traffic, servers, currentTime);
            System.out.println("Tempo: " + currentTime + " segundos - Perda de pacotes (Erlang C): " + erlangC + "%");
        }

        scanner.close();
    }
}

