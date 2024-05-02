import java.util.ArrayList;

/**
 * Classe Jogador é responsável por armazenar e modificar informações do jogador como nome, cpf, foto e email, além de verificar a validação do cpf e email fornecidos
 */
public class Jogador {
    private String nome;
    private String cpf;
    private String foto;
    private String email;
    private double dinheiro;
    private int id;
    private ArrayList<Carta> cartas;
    private Peca peca;
    private static int contadorJogador = 1;
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public ArrayList<Carta> getCartas(){
        return this.cartas;
    }

    public void addCarta(Carta carta){
        this.cartas.add(carta);
    }

    public void removeCarta(Carta carta){
        this.cartas.remove(carta);
    }

    public Jogador(double dinheiroInicial, Peca p){
        this.dinheiro = dinheiroInicial;
        this.id = contadorJogador++;
        this.peca = p;
        cartas = new ArrayList<Carta>();
    }

    // @Override
    public String toString(){
        String out = "";
        out += "Nome: " + this.getNome();
        out += "Dinheiro: " + this.getNome();
        out += "Cartas: " + this.getCartas();
        out += "Cor: " + this.peca.getCor();

        return out;
    }
    

    
}
