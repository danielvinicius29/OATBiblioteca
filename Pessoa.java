public abstract class Pessoa {

    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setarNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
}