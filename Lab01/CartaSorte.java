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

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMovimento() {
        return this.movimento;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    public int getEfeito() {
        return this.efeito;
    }

    public void setEfeito(int efeito) {
        this.efeito = efeito;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getAcao(){
        return this.acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getRestricao(){
        return this.restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

}