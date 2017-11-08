package fatec.poo.model;

/**
 *
 * @author dimas
 */
public class Departamento {
    private String sigla;
    private String descricao;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Departamento(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
        numFunc=0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc++] = f; 
        f.setDepartamento(this);
    }
    
    public void listar(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descricao: " + descricao);
        System.out.println("Registro\t\tNome");
        for (int i=0; i < numFunc; i++){
            System.out.print(funcionarios[i].getRegistro());
            System.out.println("\t\t" + funcionarios[i].getNome());
        }
    }
    
    
    
}
