import java.util.ArrayList;

public class Tabuleiro {    
    private ArrayList<Integer> jogadores = new ArrayList<>();
    private ArrayList<Integer> propriedades = new ArrayList<>();

    public boolean addJogador(int jogador){
        return jogadores.add(jogador);
    }

    public boolean removeJogador(Integer jogador){
        return jogadores.remove(jogador);
    }
    
    public boolean addPropriedade(int propriedade){
        return propriedades.add(propriedade);
    }

    public boolean removePropriedade(Integer propriedade){
        return propriedades.remove(propriedade);
    }

    public ArrayList<Integer> getJogadores() {
        return jogadores;
    }

    public ArrayList<Integer> getPropriedades() {
        return propriedades;
    }

}