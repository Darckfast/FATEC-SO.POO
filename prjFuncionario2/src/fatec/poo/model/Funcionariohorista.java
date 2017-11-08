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
public class Funcionariohorista extends Funcionario {
    private double valHoraTRab;
    private int qtdHoraTrab;

    public Funcionariohorista( int registro, String nome, String dtAdmissao,double valHoraTRab) {
        //chama o metodo construtor da csuper classe
        super(registro, nome, dtAdmissao);
        this.valHoraTRab = valHoraTRab;
        this.qtdHoraTrab = qtdHoraTrab;
    }
    public void apontarHoras(int qht){
        qtdHoraTrab = qht;
        
    }
    
    @Override
    public double calcSalBruto() {
        double salBruto = valHoraTRab * qtdHoraTrab;
        return (salBruto);
    } 

    public double getValHoraTRab() {
        return valHoraTRab;
    }

    public int getQtdHoraTrab() {
        return qtdHoraTrab;
    }

    public void setValHoraTRab(double valHoraTRab) {
        this.valHoraTRab = valHoraTRab;
    }

    public void setQtdHoraTrab(int qtdHoraTrab) {
        this.qtdHoraTrab = qtdHoraTrab;
    }
    
}
