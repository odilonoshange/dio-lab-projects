import java.util.Scanner;

/**
 * Classe principal que demonstra um contador simples baseado em dois parâmetros.
 * Solicita dois números inteiros ao usuário e, se o segundo for maior ou igual
 * ao primeiro, imprime uma sequência de números.
 *
 * @author Odilon Wagner
 * @version 1.0
 * @since 2025-04-05
 */

public class Contador {

    /**
     * Ponto de entrada principal do programa.
     * Lê dois parâmetros inteiros do terminal, chama o método contar
     * e trata a exceção ParametrosInvalidosException caso ocorra.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     * @throws Exception Pode lançar exceções gerais, embora o foco seja ParametrosInvalidosException.
     */
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
        finally
        {
            terminal.close();
        }
    
    }

    /**
     * Realiza a contagem e impressão dos números com base nos parâmetros fornecidos.
     * A contagem é feita imprimindo números de 1 até a diferença entre
     * o segundo e o primeiro termo.
     *
     * @param termo1 O primeiro parâmetro inteiro.
     * @param termo2 O segundo parâmetro inteiro. Deve ser maior ou igual a termo1.
     * @throws ParametrosInvalidosException Se o primeiro parâmetro for maior que o segundo.
     */

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