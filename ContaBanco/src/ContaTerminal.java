import java.util.Scanner;

public class ContaTerminal {
    public static void main (String [] args)
    {

        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        if (args.length == 4)
        {
            numeroConta = Integer.valueOf(args[0]);
            agencia = args[1];
            nomeCliente = args[2];
            saldo = Double.valueOf(args[3]);
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
        }
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seja bem-vindo(a).\n:::LOW BANK:::");
            System.out.println("Vamos dar início ao processo de abertura de conta.");
            System.out.println("Nº da conta:");
            numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente após nextInt()
            
            System.out.println("Agência:");
            agencia = scanner.nextLine();

            System.out.println("Cliente:");
            nomeCliente = scanner.nextLine();

            System.out.println("Saldo:");
            saldo = scanner.nextDouble();

            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");
        }
    }
}
