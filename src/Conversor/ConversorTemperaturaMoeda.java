package Conversor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversorTemperaturaMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("-----CONVERSOR-----");
            System.out.println("1- Converter temperatura");
            System.out.println("2- Converter moeda");
            System.out.println("3- Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    converterTemperatura(scanner);
                    break;

                case 2:
                    converterMoeda(scanner);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 3);
    }

    public static void converterTemperatura(Scanner scanner){
        System.out.println("---CONVERSOR DE TEMPERATURA---");
        System.out.println("1- Celsius para Fahrenheit");
        System.out.println("2- Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.println("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        double resultado;

        if (escolha == 1){
            resultado = (temperatura * 1.8) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", temperatura, resultado);
        } else if (escolha == 2) {
            resultado = (temperatura - 32) / 1.8;
            System.out.printf("%.2f°F = %.2f°C%n", temperatura, resultado);
        } else{
            System.out.println("Opção inválida");
        }
    }

    public static void converterMoeda(Scanner scanner){
        double valorTaxa = 5.0;

        System.out.println("---CONVERSOR DE MOEDA---");
        System.out.println("1- Dollar para Real");
        System.out.println("2- Real para Dollar");
        int escolha = scanner.nextInt();

        System.out.println("Digite o valor: ");
        double valor = scanner.nextDouble();
        double resultado;

        if (escolha == 1){
            resultado = valor * valorTaxa;
            System.out.printf("US$ %.2f = R$ %.2f%n", valor, resultado);
        } else if (escolha == 2) {
            resultado = valor / valorTaxa;
            System.out.printf("R$ %.2f = US$ %.2f%n", valor, resultado);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
