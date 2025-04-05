/**
 * Exceção customizada lançada para indicar que os parâmetros fornecidos
 * a um método são inválidos para a operação pretendida.
 * <p>
 * No contexto da classe {@link Contador}, esta exceção é especificamente
 * utilizada quando o primeiro parâmetro fornecido ao método {@code contar}
 * é maior que o segundo parâmetro.
 *
 * @see Contador#contar(int, int) // Link para o método que a lança
 * @author Odilon Wagner
 * @version 1.0
 * @since 2025-04-05
 */
public class ParametrosInvalidosException extends Exception {

}