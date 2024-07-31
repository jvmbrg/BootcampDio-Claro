import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia,nomeCliente;
        double saldo;

        Scanner leia = new Scanner(System.in);
        saldo = 0.0;
        System.out.println("Seja bem vindo a BBanking! Para começar, informe os dados a seguir: ");
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = leia.nextLine();
        System.out.print("Agora, digite o número da agência: ");
        agencia = leia.nextLine();
        System.out.print("Por fim, digite o número da conta: ");
        numero = leia.nextInt();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco, sua agência " +
                "é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente,agencia,numero,saldo);


    }
}