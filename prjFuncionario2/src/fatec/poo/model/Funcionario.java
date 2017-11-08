/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author root
 */
public abstract class Funcionario {
    private final int registro;
    private final String nome;
    private final String dtAdmissao;
    private String Cargo;
    
    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    abstract public double calcSalBruto();
    
    public double calDesconto(){
        double desconto;
        desconto = 0.1 * calcSalBruto();
        return (desconto);
    }
    public double calSalLiqui(){
        double SalLiq;
        
        SalLiq = calcSalBruto() - calDesconto();
        
        return (SalLiq);
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getdtAdmissao() {
        return dtAdmissao;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
