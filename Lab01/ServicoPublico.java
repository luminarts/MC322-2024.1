/**
 * Classe que calcula o aluguel referente à propriedade do tipo Serviço Público
 */
public class ServicoPublico extends Propriedade{
    public int calcularAluguel(int dados) {
        int aluguel = (int) this.getAluguel() * dados;
        return aluguel;
    }
}
