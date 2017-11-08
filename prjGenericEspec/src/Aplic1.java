
import faec.poo.model.Funcionariolista;
import java.text.DecimalFormat;

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
    public static void main (String agrs[]){
       Funcionariolista funchor = new Funcionariolista(1010,"Pedro silva", "14/05/2014", 15.80);
       DecimalFormat df;
       df = new DecimalFormat("#,##0.00");
       funchor.apontarHoras(90);
       
       System.out.println("Salario bruto    => " + df.format(funchor.calcSalBruto()));
       System.out.println("Salario liquido  => " + df.format(funchor.calSalLiqui()));
       System.out.println("Desconto         => " + df.format(funchor.calDesconto()));
    }

}
