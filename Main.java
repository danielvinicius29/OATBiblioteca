public class Main {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Autor autor1 = new Autor("Stephen Hawking");                
        Aluno aluno = new Aluno("Aluno Daniel", "21898");
        livro1.emprestadopor = aluno;
        Autor autor2 = new Autor("Stephen Covey");        
        Professor prof = new Professor("Professor Efrain", "3213214");
        livro2.emprestadopor = prof;
       


       livro1.setarNome("Uma breve história do tempo");
       livro1.setarAutor(autor1);
       livro1.setEmprestadopor(livro1.emprestadopor);
       aluno.setarCodigo("212109");
       autor1.setarNacionalidade("Reino Unido");


       livro2.setarNome("Os 7 hábitos das pessoa altamente eficazes");
       livro2.setarAutor(autor2);
       livro2.setEmprestadopor(livro2.emprestadopor);
       autor2.setarNacionalidade("Estados Unidos");

       System.out.println("----BIBLIOTECA----");
       System.out.println(" ");
       System.out.println("LIVRO 1:");
       System.out.println(" ");
       System.out.println("Livro: " + livro1.getNome());
       System.out.println("Autor: " + livro1.autor.nome);
       System.out.println("Emprestado por: " + livro1.emprestadopor.nome + " / Codigo: " + aluno.getCodigo());
       System.out.println(" ");
       System.out.println("-------------------");
       System.out.println(" ");
       System.out.println("LIVRO 2:");
       System.out.println(" ");
       System.out.println("Livro: " + livro2.getNome());
       System.out.println("Autor: " + livro2.autor.nome);
       System.out.println("Emprestado por: " + livro2.emprestadopor.nome + " / Codigo: " + prof.getCodigo());

    }
}
