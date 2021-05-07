public class Autor extends Pessoa {

    public String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome) {
        super(nome);
    }

    public void setarNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

}
