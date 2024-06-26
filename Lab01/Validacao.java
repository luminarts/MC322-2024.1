import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validacao{
    /**
     * método que calcula os dígitos verificadores do cpf
     * @param cpf_reduzido primeiros 9 ou 10 dígitos do cpf
     * @param peso peso a ser atribuido, para o caso do cpf_reduzido ser 9 ou 10 digitos.
     * @return retorna o inteiro dígito verificador, isto é, o resto de acordo com as regras previstas para o cálculo dos digitos verificadores
     */
    private static int calcularDV(String cpf_reduzido, int peso) {
        int soma = 0;
        for (int i = 0; i < cpf_reduzido.length(); i++) {
            soma += Character.getNumericValue(cpf_reduzido.charAt(i)) * peso--;
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : (11 - resto);
    }
    /**
     * método que valida o cpf com base nos digitos verificadores , na quantidade de digitos e se há diferença entre eles
     * @param cpf cpf a ser validado
     * @return retorna true ou false conforme a validação do cpf
     */
    public boolean validarCpf(String cpf) {
        String cpf_aux = cpf.replaceAll("[^0-9]", "");
        String cpf_reduzido = cpf_aux.substring(0, cpf_aux.length() - 2);
        System.out.println("cpf reduzido");
        System.out.println(cpf_reduzido);
        
        if (cpf_aux.length() != 11) {

            return false;
        }
        
        if (Character.getNumericValue(cpf_aux.charAt(9)) != (int)calcularDV(cpf_reduzido, 10)) {
            System.out.println("cpf_aux charAt(9):");
            System.out.println((int)cpf_aux.charAt(9) - 1);
            System.out.println("calcularDV");
            System.out.println(calcularDV(cpf_reduzido, 10) - 1);
            return false;
        } else {
            cpf_reduzido = cpf_aux.substring(0, cpf_aux.length() - 1);
            if (Character.getNumericValue(cpf_aux.charAt(10))!= calcularDV(cpf_reduzido, 11)) {
                System.out.println("cpf_aux charAt(10):");
                System.out.println(cpf_aux.charAt(10) - 1);
                System.out.println("calcularDV");
                System.out.println(calcularDV(cpf_reduzido, 10) - 1);
                return false;
            } else {
                return true;
            }
        }

        
    }
    
    /**
     * método que valida email conforme seu regex esperado
     * @param email email a ser analisado
     * @return retorna verdadeiro se o regex é compatível e falso caso contrário
     */
    public boolean validarEmail(String email) {

        String email_regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}