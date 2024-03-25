/**
 * Classe Peça responsável por armazenar e modificar as informações de cor e posição de cada peça.
 */
public class Peca {

    private String cor;
    private int posicao;

    String getCor() {
        return this.cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    int getPosicao() {
        return this.posicao;
    }

    void setPosicao(String posicao) {
        this.cor = posicao;
    }

}