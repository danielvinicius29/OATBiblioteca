public class Livro {

        public String nome;
        public Autor autor;
        public Pessoa emprestadopor;


        public void setarNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return this.nome;
        }

        public void setarAutor(Autor autor) {
            this.autor = autor;
        }

        public Autor getAutor() {
            return this.autor;
        }

        public void setEmprestadopor(Pessoa emprestadopor) {
            this.emprestadopor = emprestadopor;
        }

        public String getemprestadopor() {
            return this.nome;
        }        

    
}
