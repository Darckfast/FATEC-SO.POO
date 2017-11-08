
import fatec.poo.model.Pfisica;
import fatec.poo.model.Pjuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Aplic1 {
    private double tot;
    public static void main (String[] args){
        Pfisica fisica = new Pfisica("100101","Omae Mou Shindeiru",1990);
        Pjuridica juridica = new Pjuridica ("100102","Nani?",1991);
        Scanner entrada = new Scanner(System.in);
        
        DecimalFormat df;
        df = new DecimalFormat("#,##0.00");
        fisica.setBase(100);
        System.out.println("Digite o total  de vendas :");
        fisica.addCompras(entrada.nextDouble());
        System.out.println("Pessoa fisica:");
        System.out.println("Nome:" + fisica.getNome() + "\nCPF: " + fisica.getCpf() + "\nAno : " + fisica.getAno());
        System.out.println("Bonus:" + df.format(fisica.calcBonus(fisica.getAno())));
        System.out.println("Total: " + df.format(fisica.getTot()));
        juridica.setTax(10);
        System.out.println("Pessoa juridica:");
        System.out.println("Nome:" + juridica.getNome() + "\nAno: " + juridica.getAno());
        System.out.println("Bonus:" + df.format(juridica.calcBonus(juridica.getAno())));
    }
}
