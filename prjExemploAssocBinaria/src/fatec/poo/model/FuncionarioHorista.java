package fatec.poo.model;

/**
 *
 * @author dimas
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab) {
        //chamada do método construtor da superclasse
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public void apontarHoras(int qht){
        qtdeHorTrab = qht;
    }
    
    
    @Override
    public double calcSalBruto() {
        double salBruto;
        salBruto = valHorTrab * qtdeHorTrab;
        return(salBruto);
    }
    
    public double calcGratificação(){
        return(0.075 * calcSalBruto());
    }
    
    //sobreposição do método
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificação());
    }

    public double getValHorTrab() {
        return valHorTrab;
    }

    public int getQtdeHorTrab() {
        return qtdeHorTrab;
    }
    
    
}
