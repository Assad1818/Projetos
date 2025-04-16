package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA COMPLETA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("Digite o dividendo: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                case 5:
                    System.out.print("Digite a base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    num2 = scanner.nextDouble();
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 6:
                    System.out.print("Digite o número para calcular a raiz quadrada: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: número negativo não tem raiz real.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

