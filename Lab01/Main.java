public class Main {
    /**
     * Método main que instancia as classes criadas e um objeto de cada classe, além de printá-los no console.
     */
    public static void main(String[] args){
        
        double valor_inicial = 100;

        Jogador jogador = new Jogador(valor_inicial);
        CartaSorte carta_sorte = new CartaSorte();
        Peca peca = new Peca();
        
        
        
        System.out.println(jogador.getNome());
        System.out.println(peca.getCor());
        System.out.println(carta_sorte.getDescricao());
    }

}    
    