import java.util.ArrayList;

public class Tabuleiro {    
    private ArrayList<Integer> jogadores = new ArrayList<>();
    private ArrayList<Integer> propriedades = new ArrayList<>();

    boolean addJogador(int jogador){
        return jogadores.add(jogador);
    }

    boolean removeJogador(Integer jogador){
        return jogadores.remove(jogador);
    }
    
    boolean addPropriedade(int propriedade){
        return propriedades.add(propriedade);
    }

    boolean removePropriedade(Integer propriedade){
        return propriedades.remove(propriedade);
    }

    public ArrayList<Integer> getJogadores() {
        return jogadores;
    }

    public ArrayList<Integer> getPropriedades() {
        return propriedades;
    }

}