package JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumero = 100;
        int maxTentativas = 7;

        System.out.println("🎯 Jogo da Adivinhação com Dificuldade!");
        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 50, 10 tentativas)");
        System.out.println("2 - Médio (1 a 100, 7 tentativas)");
        System.out.println("3 - Difícil (1 a 200, 5 tentativas)");
        System.out.print("Digite a opção: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                maxNumero = 50;
                maxTentativas = 10;
                break;
            case 2:
                maxNumero = 100;
                maxTentativas = 7;
                break;
            case 3:
                maxNumero = 200;
                maxTentativas = 5;
                break;
            default:
                System.out.println("Opção inválida! Dificuldade média selecionada por padrão.");
        }

        int numeroSecreto = random.nextInt(maxNumero) + 1;
        int tentativa;
        int tentativasFeitas = 0;
        boolean acertou = false;

        System.out.println("\n🔢 Tente adivinhar o número entre 1 e " + maxNumero + ".");

        while (tentativasFeitas < maxTentativas) {
            System.out.print("Tentativa " + (tentativasFeitas + 1) + ": ");
            tentativa = scanner.nextInt();
            tentativasFeitas++;

            if (tentativa == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou em " + tentativasFeitas + " tentativas.");
                acertou = true;
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("🔼 O número é maior.");
            } else {
                System.out.println("🔽 O número é menor.");
            }
        }

        if (!acertou) {
            System.out.println("😢 Você perdeu! O número era: " + numeroSecreto);
        }

        scanner.close();
    }
}

