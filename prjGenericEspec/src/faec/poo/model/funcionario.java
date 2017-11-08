/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faec.poo.model;

/**
 *
 * @author root
 */
public abstract class funcionario {
    private final int registro;
    private final String nome;
    private final String dtAdmissao;

    public funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    //assinatura do metodo
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
    
}
