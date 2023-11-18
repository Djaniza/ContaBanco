import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // Solicitando as informações do cliente.
        System.out.println("Por favor, digite seu nome completo: ");
        String clientName = scan.nextLine();
        System.out.println("Digite agora o número da agência: ");
        String agency = scan.nextLine();
        System.out.println("Por favor digite o seu saldo: ");
        float balance = scan.nextFloat();
        System.out.println("Informe agora o número da sua conta: ");
        int bankAccount = scan.nextInt();

        // Imprimindo no terminal o resultado
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                clientName, agency, bankAccount, balance);
    }
}
