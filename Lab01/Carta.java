public class Carta {
    private String nome;
    private int id;
    private String descricao;
    private Jogador dono;

    public int getId(){
        return this.id;
    }
    public void setId(int valor){
        this.id = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Jogador getDono(){
        return this.dono;
    }

    public void setDono(Jogador novoDono){
        this.dono = novoDono;
    }
}
