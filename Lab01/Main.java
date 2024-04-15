public class Main {
    /**
     * Método main que instancia as classes criadas e um objeto de cada classe, além de printá-los no console.
     */
    public static void main(String[] args){
        
        double valor_inicial = 100;

        Jogador jogador1 = new Jogador(valor_inicial);
        Jogador jogador2 = new Jogador(valor_inicial);
        Jogador jogador3 = new Jogador(valor_inicial);
        CartaSorte carta_sorte = new CartaSorte();
        Peca peca = new Peca();
        Validacao validacao = new Validacao();
        Estacao estacao = new Estacao();
        Propriedade propriedade1 = new Propriedade();
        Propriedade propriedade2 = new Propriedade();
        Propriedade propriedade3 = new Propriedade();
        ServicoPublico servico_publico = new ServicoPublico();
        Tabuleiro tabuleiro = new Tabuleiro();
        Terreno terreno = new Terreno();


        if (!validacao.validarCpf(jogador.getCpf())){
            System.out.println("CPF Inválido.");
        }

        if (!validacao.validarEmail(jogador.getEmail())){
            System.out.println("Email Inválido.");
        }
        
        tabuleiro.addJogador(jogador1.getId());
        tabuleiro.addJogador(jogador2.getId());
        tabuleiro.addJogador(jogador3.getId());
        tabuleiro.addPropriedade(propriedade1.getId());
        tabuleiro.addPropriedade(propriedade2.getId());
        tabuleiro.addPropriedade(propriedade3.getId());

        jogador1.setNome("Joaum");
        jogador2.setNome("Jodois");
        jogador3.setNome("Jotres");

        propriedade1.setProprietario(jogador1.getNome());
        propriedade2.setProprietario(jogador2.getNome());
        propriedade3.setProprietario(jogador3.getNome()); 

        
        
        System.out.println(peca.getCor());
        System.out.println(carta_sorte.getDescricao());
    }

}    
    