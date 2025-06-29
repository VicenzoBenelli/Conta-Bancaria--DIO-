import java.util.Locale; // Define locale padrão americano para aceitar ponto como separador decimal
import java.util.Scanner; // Scanner para entrada de dados pelo terminal



public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o número da agência "); //Lê o código da agência informado pelo usuário
        System.out.print("Agência: ");
        var agencia = scanner.nextLine();

        System.out.println("Digite seu nome"); //Lê o nome e sobrenome do cliente
        System.out.print("Nome: ");
        var nome = scanner.nextLine();

        System.out.println("Digite seu número de Usuário"); //Lê o número da conta bancária
        System.out.print("Usuário: ");
        var num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu saldo"); //Lê o saldo inicial da conta
        System.out.print("Saldo: ");
        var saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do Scanner após leitura numérica


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, num, saldo);
        //Exibe os dados formatados de confirmação da conta criada

    }
}
