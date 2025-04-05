import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o 1º parâmetro:");
        int primeiroTermo = terminal.nextInt();
        terminal.nextLine();

        System.out.println("Digite o 2º parâmetro:");
        int segundoTermo = terminal.nextInt();
        terminal.nextLine();

        try
        {
            contar(primeiroTermo, segundoTermo);
        }
        catch (ParametrosInvalidosException e)
        {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    
    }

    static void contar(int termo1, int termo2) throws ParametrosInvalidosException
    {
        if (termo1 > termo2)
        {
            throw new ParametrosInvalidosException();
        }

        int contador = termo2 - termo1;

        System.out.println("Imprimindo:");
        for (int i = 0; i < contador; i++)
        {
            System.out.println((i + 1));
        }
    }

}
