/**
 * Classe Peça responsável por armazenar e modificar as informações de cor e posição de cada peça.
 */
public class Peca {

    private String cor;
    private int posicao;
    private Jogador dono;

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Jogador getDono() {
        return this.dono;
    }

    public void setDono(Jogador jogador) {
        this.dono = jogador;
    }

    public Peca(String c, int p){
        this.cor = c;
        this.posicao = p;
        this.dono = null; 
    }

}