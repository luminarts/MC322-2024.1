/**
 * Classe Peça responsável por armazenar e modificar as informações de cor e posição de cada peça.
 */
public class Peca {

    private String cor;
    private int posicao;

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.cor = posicao;
    }

    public Peca(String c, int p){
        this.cor = c;
        this.posicao = p;
    }

}