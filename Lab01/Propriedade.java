public class Propriedade extends Carta {
    private String nome;
    private int preco;
    private float aluguel;

    

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

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
