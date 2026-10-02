import java.util.Scanner; // Importacao necessaria

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o leitor do teclado

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê um texto completo

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close(); // Boa prática: fechar o scanner ao terminar
    }
}