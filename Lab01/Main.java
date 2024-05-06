import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    /**
     * Método main que instancia as classes criadas e implementa a interface do jogo, além de receber os inputs do usuário.
     */
    public static void main(String[] args){
        
        double valor_inicial = 2458;

        ArrayList<Jogador> jogadores = new ArrayList<>();
        // CartaSorte carta_sorte = new CartaSorte();
        ArrayList<Peca> pecas = new ArrayList<>();
        Validacao validacao = new Validacao();
        Estacao estacao1 = new Estacao();
        // Propriedade propriedade = new Propriedade();
        Terreno terreno1 = new Terreno();
        ServicoPublico servico_publico1 = new ServicoPublico();
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean andou = false;

        for (int i = 0; i < 4; i++){
            if (i == 0){
                pecas.add(new Peca("Azul",0));
            } else if (i == 1){
                pecas.add(new Peca("Amarelo",0));
            } else if (i == 2){
                pecas.add(new Peca("Vermelho",0));
            } else if (i == 3){
                pecas.add(new Peca("Verde",0));
            }
        }

        /**
         * Coleta do comando do usuário e a ação feita pelo comando
         */
        while (true) {
            int counter = 1;
            System.out.println("Digite um comando: \n 'Criar jogador' - Cria um jogador \n 'Ver jogadores' - Ver os jogadores adicionados \n 'Jogar' - Iniciar o jogo \n 'q' - Sair do jogo");
            String user_input = scanner.nextLine();

            /**
             * Cria um jogador e o coloca na arraylist de jogadores existentes
             */
            if (user_input.equals("Criar jogador")){
                // Fazer lista de jogadores para poder criar n jogadores, sendo n até 4 (limitado pelas regras do Banco imobiliario)
                String nome = null;
                String cpf = null;
                String email = null;
                for (int i = 0; i < 4; i++) {
                    

                    if (i == 0){
                        System.out.println("Digite seu nome: ");
                        nome = scanner.nextLine();
                    } else if (i == 1) {
                        System.out.println("Digite seu cpf (com pontos e traço): ");
                        cpf = scanner.nextLine();
                    } else if (i == 2){
                        System.out.println("Digite seu e-mail: ");
                        email = scanner.nextLine();
                    } else {
                        for (int j = 0; j < pecas.size(); j++){
                            if (pecas.get(j).getDono() == null) {
                                Jogador aux = new Jogador(nome, cpf,email, valor_inicial, pecas.get(j));
                                jogadores.add(aux);
                                pecas.get(j).setDono(aux);
                                break;
                            }
                        }
                    }
                } 
                
                /**
                 * Validação de CPF e e-mail dos jogadores adicionados
                 */
                for (int i = 0; i < jogadores.size(); i++){
                    if (validacao.validarCpf(jogadores.get(i).getCpf()) == false){
                        System.out.println("CPF Inválido.");
                        jogadores.remove(jogadores.get(i));
                        i--;
                    } else if (validacao.validarEmail(jogadores.get(i).getEmail()) == false){
                        System.out.println("Email Inválido.");
                        jogadores.remove(jogadores.get(i));
                        i--;
                    }
                }   
            } else if (user_input.equals("Jogar")) {

                
                /**
                 * Adicionar todos os jogadores e propriedades ao jogo e iniciar o jogo (Eventualmente o mapa será gerado automaticamente com valores arbitriários para compra de propriedades, casas e aluguel)
                 */
                for(int i = 0; i < jogadores.size(); i++) {
                    tabuleiro.addJogador(jogadores.get(i));
                }

                tabuleiro.addPropriedade(terreno1);
                tabuleiro.addPropriedade(estacao1);
                tabuleiro.addPropriedade(servico_publico1);
                terreno1.setNome("Terreno do seu Luís");
                estacao1.setNome("Estaçao de Uber moto");
                servico_publico1.setNome("Contrato de obra de 100 anos");
                terreno1.setPreco(150);
                estacao1.setPreco(120);
                servico_publico1.setPreco(100);
                

                System.out.println("O jogo começou!");

                
                while (true) {
                    if (counter == jogadores.size()) {
                        counter = 0;
                    }


                    /**
                     * Ambiente de jogo, com comandos de verificar os dados dos jogadores, realizar um movimento, adquirir uma propriedade, sair do jogo ou chorar caso a situação esteja complicada
                     */
                    System.out.println(String.format("------VEZ DO(A) JOGADOR(A) %s -------", jogadores.get(counter).getNome()));
                    System.out.println("Digite um comando. \n Chorar - Buá buá \n Analisar - Ver situaçao dos jogadores \n Andar - Jogar dado para andar \n Adquirir prop - Adquire uma propriedade aleatória \n 'q' - Fechar jogo");
                    String game_command = scanner.nextLine();

                    if (game_command.equals("Chorar")) {
                        int aux = rnd.nextInt(3);
                        if (aux == 0){
                            System.out.println(" \n Inserir conhecimentos de POO e horas no dia para completar o jogo. \n");
                        } else if (aux == 1) {
                            System.out.println(" \n Falha crítica, é impossível. \n");
                        } else if (aux == 2) {
                            
                        }System.out.println("\n Buá buá buá \n");
                
                    } else if (game_command.equals("Adquirir prop")) {
                        int index_rnd_prop = rnd.nextInt(tabuleiro.getPropriedades().size());
                        System.out.println(tabuleiro.getPropriedades().get(index_rnd_prop).getDono());
                        if(tabuleiro.getPropriedades().get(index_rnd_prop).getDono() == null){

                            tabuleiro.getPropriedades().get(index_rnd_prop).setDono(jogadores.get(counter));
                            jogadores.get(counter).setDinheiro(jogadores.get(counter).getDinheiro() - tabuleiro.getPropriedades().get(index_rnd_prop).getPreco());
                            jogadores.get(counter).addCarta(tabuleiro.getPropriedades().get(index_rnd_prop));

                            System.out.println(String.format("\n O jogador %s adquiriu a propriedade %s \n", jogadores.get(counter).getNome(), tabuleiro.getPropriedades().get(index_rnd_prop).getNome())); 
                        
                        } else if (tabuleiro.getPropriedades().get(index_rnd_prop).getDono() != jogadores.get(counter)) {
                            tabuleiro.getPropriedades().get(index_rnd_prop).getDono().setDinheiro(tabuleiro.getPropriedades().get(index_rnd_prop).getDono().getDinheiro() + tabuleiro.getPropriedades().get(index_rnd_prop).calcularAluguel());
                            System.out.println("\n Você tentou adquirir uma propriedade que nao é sua! Pague o Aluguel! (OBS: Sei que a regra não existe no jogo, mas é para conseguir utilizar a funcionalidade de calcular o aluguel) \n");
                        }
                        andou = false;
                        counter++;
                    } else if (game_command.equals("Analisar")) {
                        for (int i = 0; i < jogadores.size(); i++){
                            System.out.println(jogadores.get(i).toString());
                        } 
                        
                    } else if (game_command.equals("Andar")) {
                        if (andou == false) {
                            int dice = rnd.nextInt(6);
                            jogadores.get(counter).getPeca().setPosicao(jogadores.get(counter).getPeca().getPosicao() + dice);
                            if (jogadores.get(counter).getPeca().getPosicao() > 20) {
                                jogadores.get(counter).getPeca().setPosicao(jogadores.get(counter).getPeca().getPosicao() - 20);
                            }
                            System.out.println(String.format("O jogador %s andou %d passos \n", jogadores.get(counter).getNome(), dice));
                            andou = true;
                        } else {
                            System.out.println("Você já andou! \n");
                        }
                        
                        
                    } else if (game_command.equals("q")){
                        break;
                    } 

                    
                }


            } else if (user_input.equals("Ver jogadores")) {
                for (int i = 0; i < jogadores.size(); i++){
                    System.out.println(jogadores.get(i).toString());
                } 
            } else if (user_input.equals("q")) {
                scanner.close();
                return;
            }
                
        }
        

        //  if(tabuleiro.getPropriedades().get(index_rnd_prop).getDono() == jogadores.get(0)){
        //     if(jogadores.get(0).getDinheiro() >= terreno1.getValorCasa()){
        //         terreno1.comprarCasa();
        //         jogadores.get(0).setDinheiro(jogadores.get(0).getDinheiro() - terreno1.getValorCasa());
        //     }
        // }
        
    }
}    
    