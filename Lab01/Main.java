public class Main {
    /**
     * Método main que instancia as classes criadas e um objeto de cada classe, além de printá-los no console.
     */
    public static void main(String[] args){
        
        double valor_inicial = 2458;

        Jogador jogador1 = new Jogador(valor_inicial, new Peca("Amarelo", 0));
        Jogador jogador2 = new Jogador(valor_inicial, new Peca("Vermelho", 0));
        Jogador jogador3 = new Jogador(valor_inicial, new Peca("Azul", 0));
        // CartaSorte carta_sorte = new CartaSorte();
        // Peca peca = new Peca();
        Validacao validacao = new Validacao();
        Estacao estacao1 = new Estacao();
        // Propriedade propriedade = new Propriedade();
        Terreno terreno1 = new Terreno();
        ServicoPublico servico_publico1 = new ServicoPublico();
        Tabuleiro tabuleiro = new Tabuleiro();


        if (!validacao.validarCpf(jogador1.getCpf())){
            System.out.println("CPF Inválido.");
        } else if (!validacao.validarCpf(jogador2.getCpf())){
            System.out.println("CPF Inválido.");
        } else if (!validacao.validarCpf(jogador3.getCpf())){
            System.out.println("CPF Inválido.");
        } else if (!validacao.validarEmail(jogador1.getEmail())){
            System.out.println("Email Inválido.");
        } else if (!validacao.validarEmail(jogador2.getEmail())){
            System.out.println("Email Inválido.");
        } else if (!validacao.validarEmail(jogador3.getEmail())){
            System.out.println("Email Inválido.");
        } else {
            tabuleiro.addJogador(jogador1.getId());
        tabuleiro.addJogador(jogador2.getId());
        tabuleiro.addJogador(jogador3.getId());
        tabuleiro.addPropriedade(terreno1.getId());
        tabuleiro.addPropriedade(estacao1.getId());
        tabuleiro.addPropriedade(servico_publico1.getId());

        jogador1.setNome("Joaum");
        jogador2.setNome("Jodois");
        jogador3.setNome("Jotres");

        terreno1.setDono(jogador1);
        estacao1.setDono(jogador2);
        servico_publico1.setDono(jogador3); 

            if(terreno1.getDono() == jogador1){
                if(jogador1.getDinheiro() >= terreno1.getValorCasa()){
                    terreno1.comprarCasa();
                    jogador1.setDinheiro(jogador1.getDinheiro() - terreno1.getValorCasa());
                }
            }
        
        }

        
        
        
        
        
        
        
    }

}    
    