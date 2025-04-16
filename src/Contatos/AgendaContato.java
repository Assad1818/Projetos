package Contatos;
import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== AGENDA DE CONTATOS ===");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato por nome");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.next();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.next();
                    contatos.add(new Contato(nome, telefone));
                    break;

                case 2:
                    for (Contato contato : contatos) {
                        System.out.println(contato);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBusca = scanner.next().toLowerCase();
                    boolean encontrado = false;
                    for (Contato contato : contatos) {
                        if (contato.nome.toLowerCase().contains(nomeBusca)) {
                            System.out.println(contato);
                            encontrado = true;
                        }
                    }
                    if (!encontrado){
                            System.out.println("Contato não encontrado!");
                            break;
                        }


                case 4:
                    System.out.println("Saindo da agenda...");
                    break;

                default:
                    System.out.println("Opção invãlida");
            }

        } while (opcao != 4);
    }
}
