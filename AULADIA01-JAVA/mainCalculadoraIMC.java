import java.util.Scanner;

public class mainCalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMC");

        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu peso em kg (ex: 70.0): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Calculo do IMC
        double imc = peso / (altura * altura);

        // Exibição dos resultados formatados
        System.out.println("\n------------------------------");
        System.out.println("RELATÓRIO DO USUÁRIO");
        System.out.println("-------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        
        // %.2f formata o valor double com apenas 2 casas decimais
        System.out.printf("IMC Calculado: %.2f\n", imc);
        System.out.println("--------------------------------");

        scanner.close();
    }
}