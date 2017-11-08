package fatec.poo.model;

/**
 *
 * @author dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento;//atributo ponteiro

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    //definição de um método abstrato
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        double desconto;
        desconto = 0.10 * calcSalBruto();
        return(desconto);
    }
    
    public double calcSalLiquido(){
        double salLiquido;
        salLiquido = calcSalBruto() - calcDesconto();
        return(salLiquido); 
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
