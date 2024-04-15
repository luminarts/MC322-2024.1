public class ServicoPublico extends Propriedade{
    public int calcularAluguel(int dados) {
        int aluguel = (int) this.getAluguel() * dados;
        return aluguel;
    }
}
