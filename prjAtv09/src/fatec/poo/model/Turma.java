
package fatec.poo.model;

/**
 *
 * @author Rodrigo Almeida
 */
public class Turma {
    private String sigla;
    private int qtdeVagas;
    private Curso curso;
    private Professor professor;
    private Aluno alunos[];
    private int numAlu;          
    
    public Turma(String sigla, int qtdeVagas){
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
        alunos = new Aluno[this.qtdeVagas];
    }

    public String getSigla() {
        return sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public Curso getCurso() {
        return curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void addAluno(Aluno a){
        alunos[numAlu++] = a;
    }
    
    public void listarAlunos(){
        System.out.println("\nSigla do Curso: " + getCurso().getSigla() + "\t\tNome do Curso: " + getCurso().getDescricao());
        System.out.println("\nSigla da Turma: " + sigla);
        System.out.println("\nNome do Professsor: " + getProfessor().getNome());
        System.out.println("\n\tNome do Aluno\n");
        for(int cont = 0; cont < numAlu; cont++){            
            System.out.println(cont + 1 + " - " + alunos[cont].getNome());
        }
    }
}
