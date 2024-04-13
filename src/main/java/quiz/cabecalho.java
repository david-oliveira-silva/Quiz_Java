package quiz;

public class cabecalho {
    private String nome;
    private int idade;
    private String curso;

    public cabecalho() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void  escreverCabecalho(){
        System.out.println("Nome : " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Curso : " + this.curso);

    }
}
