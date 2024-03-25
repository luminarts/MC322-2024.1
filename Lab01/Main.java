public class Main {
    /**
     * Método main que instancia as classes criadas e um objeto de cada classe, além de printá-los no console.
     */
    public static void main(String[] args){
        
        Jogador jogador = new Jogador();
        CartaSorte carta_sorte = new CartaSorte();
        Peca peca = new Peca();
        
        jogador.setNome("Pou Ateudes");
        peca.setCor("Âmbar como a especiaria");
        carta_sorte.setDescricao("Na semana anterior à partida para Arrakis, quando a agitação dos últimos preparativos chegara a um furor quase insuportável, uma velha veio visitar a mãe do menino, Pou. Era uma noite quente no Castelo Caladan, e as pedras antigas que serviam de lar à família Ateudes havia vinte e seis gerações exalavam aquela sensação de suor resfriado que costumavam adquirir pouco antes do tempo virar. Fizeram a velha entrar pela porta lateral, que ficava no fim da passagem abobadada perto do quarto de Pou, e deram-lhe a oportunidade de espiar o jovem, deitado em sua cama. À meia-luz de uma luminária suspensa que pairava perto do chão, o menino, acordado, viu uma volumosa forma feminina parada à porta, um passo à frente de sua mãe. A velha era a sombra de uma bruxa: os cabelos eram um emaranhado de teias de aranha a cobrir-lhe as feições obscuras, e os olhos cintilavam feito joias. Ele não é pequeno para a idade, Jéssica? - perguntou a velha. Sua voz chiava e arranhava como um baliset desafinado. A mãe de Pou respondeu, com seu suave contralto: - É fato conhecido que os Ateudes começam a crescer tarde, Vossa Reverência. - Foi o que ouvi, foi o que ouvi - chiou a velha. - Mas ele já tem 15 anos. - Sim, Vossa Reverência. - Está acordado e nos ouve - disse a velha. - O tratantezinho dissimulado - ela riu disfarçadamente. - Mas a realeza precisa ser dissimulada. E se ele for realmente o Kwisatz Haderach... bem... Nas sombras de sua cama, Pou tinha os olhos semicerrados. Dois globos ovalados, pássaro-brilhantes - os olhos da velha - pareceram crescer e refulgir ao fitar os dele. - Durma bem, seu tratantezinho dissimulado - disse a velha. - Amanhã você precisará de todas as suas faculdades para enfrentar meu gom jabbar. E ela se foi, empurrando a mãe dele para fora do quarto e fechando a porta com uma batida firme. Pou ficou deitado, em vigília, perguntando-se: O que é um gom jabbar? Em meio a toda a confusão daquele período de mudança, a velha foi a coisa mais estranha que ele já tinha visto. Vossa Reverência. E a maneira como a mulher se dirigira à mãe dele, Jéssica, como se ela fosse uma criada comum, e não o que era de fato: uma Bene Gesserit, a concubina de um duque e a mãe do herdeiro ducal.");

        
        System.out.println(jogador.getNome());
        System.out.println(peca.getCor());
        System.out.println(carta_sorte.getDescricao());
    }

}    
    