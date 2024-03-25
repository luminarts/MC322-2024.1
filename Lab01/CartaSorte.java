/**
 * Classe CartaSorte é responsável por armazenar e modificar informações das cartas 
 */
public class CartaSorte {
    private int id;
    private String descricao;
    private int movimento;
    private int efeito;
    private float valor;
    private String acao;
    private int tempo;
    private String restricao;

    int getId(){
        return this.id;
    }

    void setId(int id) {
        this.id = id;

    }

    String getDescricao(){
        return this.descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    int getMovimento() {
        return this.movimento;
    }

    void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    int getEfeito() {
        return this.efeito;
    }

    void setEfeito(int efeito) {
        this.efeito = efeito;
    }

    float getValor() {
        return this.valor;
    }

    void setValor(float valor) {
        this.valor = valor;
    }

    String getAcao(){
        return this.acao;
    }

    void setAcao(String acao) {
        this.acao = acao;
    }

    int getTempo() {
        return this.tempo;
    }

    void setTempo(int tempo) {
        this.tempo = tempo;
    }

    String getRestricao(){
        return this.restricao;
    }

    void setRestricao(String restricao) {
        this.restricao = restricao;
    }

}