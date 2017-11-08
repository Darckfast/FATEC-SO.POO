package fatec.poo.model;

import java.util.ArrayList;

public class Projeto {
    private String sigla;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    /*private Funcionario[] funcionarios;
    private int numFunc;*/
    private ArrayList<Funcionario> funcionarios;
    

    public Projeto(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
        funcionarios = new ArrayList<>();
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getSigla() {
        return sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataTermino() {
        return (dataTermino);
    }

    public String getDataInicio() {
        return (dataInicio);
    }

    public void addFuncionario(Funcionario f) {
        /*funcionarios[numFunc] = f;
        numFunc++;*/
        funcionarios.add(f);
        f.setProjeto(this);
    }

    public void listar() {
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data Início:  " + dataInicio);
        System.out.println("Data Término: " + dataTermino);       
        System.out.println("\nRegistro\t\tNome\t\tDepartamento");

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.print(funcionarios.get(i).getRegistro() + "\t\t");
            System.out.print(funcionarios.get(i).getNome() + "\t\t");
            System.out.println(funcionarios.get(i).getDepartamento().getDescricao());            
        }
    }
}
