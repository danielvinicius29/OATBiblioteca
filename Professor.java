
public class Professor extends Pessoa {

    String codigo;

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String nome, String codigo) {
        super(nome);
        this.codigo = codigo;
    }

    public void setarCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setarProfessor(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return this.nome;
    }
    
}
