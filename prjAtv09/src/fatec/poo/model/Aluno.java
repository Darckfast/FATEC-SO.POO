
package fatec.poo.model;

/**
 *
 * @author Rodrigo Almeida
 */
public class Aluno extends Pessoa {
    private String ra;
    private int escolaridade;
     
    public Aluno(String ra, String nome){
        super(nome);
        this.ra = ra;        
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getRa() {
        return ra;
    }

    public void setEscolaridade(int escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getEscolaridade() {
        return escolaridade;
    }           
}