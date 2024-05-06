import java.util.ArrayList;

/**
     * Classe que implementa o tabuleiro do jogo, contendo jogadores e propriedades
     */
public class Tabuleiro {    
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private ArrayList<Propriedade> propriedades = new ArrayList<>();

    public boolean addJogador(Jogador jogador){
        return jogadores.add(jogador);
    }

    public boolean removeJogador(Jogador jogador){
        return jogadores.remove(jogador);
    }
    
    public boolean addPropriedade(Propriedade propriedade){
        return propriedades.add(propriedade);
    }

    public boolean removePropriedade(Propriedade propriedade){
        return propriedades.remove(propriedade);
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

}