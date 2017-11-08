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
public class Funcionariolista  extends funcionario{

    private double valHoraTRab;
    private int qtdHoraTrab;

    public Funcionariolista( int registro, String nome, String dtAdmissao,double valHoraTRab) {
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
    
}
