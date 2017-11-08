
package fatec.poo.model;

/**
 *
 * @author Rodrigo Almeida
 */
public class Professor extends Pessoa {
    private String regFunc;
    private int titularidade;
    private int areaAtuacao;
        
    public Professor(String regFunc, String nome){
        super(nome);
        this.regFunc = regFunc;        
    }

    public String getRegFunc() {
        return regFunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }

    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}