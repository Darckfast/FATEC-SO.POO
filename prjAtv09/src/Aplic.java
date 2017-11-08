
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Professor;
import fatec.poo.model.Turma;


/**
 *
 * @author Rodrigo Almeida
 */
public class Aplic {

    
    public static void main(String[] args) {
       Curso curso = new Curso("LNX", "Introdução a Linux", "8 horas semanais");
       
       Professor prof1 = new Professor("123", "Zequinha");
       Turma turma1 = new Turma("LNX02", 15);              
       
       //instanciação dos alunos
       Aluno aluno1 = new Aluno("001", "Joao");
       Aluno aluno2 = new Aluno("002", "Maria");
       Aluno aluno3 = new Aluno("003", "Pedro");
       Aluno aluno4 = new Aluno("004", "Carlos");
       Aluno aluno5 = new Aluno("005", "Rodrigo");
       
       //associações binárias unidirecional
       //entre Turma e Curso, Professor, Aluno
       turma1.setCurso(curso);
       turma1.setProfessor(prof1);
       turma1.addAluno(aluno1);
       turma1.addAluno(aluno2);
       turma1.addAluno(aluno3);
       turma1.addAluno(aluno4);
       turma1.addAluno(aluno5);
        
       turma1.listarAlunos();       
    }    
}
