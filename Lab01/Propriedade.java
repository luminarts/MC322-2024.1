public class Propriedade {
    private int id;
    private String nome;
    private String proprietario;
    private int preco;
    private float aluguel;

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getProprietario() {
        return this.proprietario;
    }

    void setProprietario(String proprietario) {
        this.proprietario = proprietario;
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
