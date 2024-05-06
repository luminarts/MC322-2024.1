/**
 * Classe que armazena as variáveis-base de uma carta do tipo propriedade
 */

public class Propriedade extends Carta {
    private int preco;
    private float aluguel;

    int getPreco() {
        return this.preco;
    }

    void setPreco(int preco) {
        this.preco = preco;
    }

    float getAluguel() {
        return this.aluguel;
    }

    void setAluguel(float aluguel) {
        this.aluguel = aluguel;
    }

    public int calcularAluguel(){
        int aluguel = (int) this.aluguel;
        return aluguel;
    }
}
