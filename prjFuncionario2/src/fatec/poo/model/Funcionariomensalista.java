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
public class Funcionariomensalista extends Funcionario{
    
    private double ValSalMin;
    private double NumSalMin;
    
    public Funcionariomensalista (int registro, String nome, String dtAdmissao, double NumSalMin) {
        super(registro, nome, dtAdmissao);
        this.ValSalMin = ValSalMin;
        this.NumSalMin = NumSalMin;
    }
    
    public void apontarValSalMin(double vsm){
        ValSalMin = vsm;
    }
    
    @Override
    public double calcSalBruto() {
        double SalBruto = ValSalMin * NumSalMin;
        return (SalBruto);
    }
}
