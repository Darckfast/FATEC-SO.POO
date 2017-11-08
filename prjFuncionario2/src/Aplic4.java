
import fatec.poo.model.Funcionario;
import fatec.poo.model.Funcionariocomissionario;
import fatec.poo.model.Funcionariohorista;
import fatec.poo.model.Funcionariomensalista;


/**
 *
 * @author dimas
 */
public class Aplic4 {
    public static void main(String[] args) {
       Funcionario[] CadFun = new Funcionario[3];
       
       CadFun[0]= new Funcionariohorista(1010, "Pedro Silveira", "14/05/1978", 15.80); 
       CadFun[1]= new Funcionariomensalista(2020,"Ana Beatriz", "15/08/1999", 2.5);
       CadFun[2]= new Funcionariocomissionario(3030, "Joao", "10/12/1975", 10);
       
       CadFun[0].setCargo("Programador");
       CadFun[1].setCargo("Aux. Administrativo");
       CadFun[2].setCargo("Vendedor");
       
      //Utilizando o downcasting para acessar os
      //métodos específicos das subclasses
      ((Funcionariohorista)CadFun[0]).apontarHoras(80);
      ((Funcionariomensalista)CadFun[1]).apontarValSalMin(600);
      ((Funcionariocomissionario)CadFun[2]).setSalBase(750);
      
      for (int i=0; i < CadFun.length; i++){
          System.out.println("\n\nRegistro: " + CadFun[i].getRegistro());
          System.out.println("Nome: " +  CadFun[i].getNome());
          System.out.println("Data admissão: " +  CadFun[i].getdtAdmissao());
          System.out.println("Cargo: " +  CadFun[i].getCargo());
      
          if (CadFun[i] instanceof Funcionariohorista){
               System.out.println("Valor Hora Trab.: " +
                        ((Funcionariohorista)CadFun[i]).getValHoraTRab());
          }else 
             if (CadFun[i] instanceof Funcionariomensalista){
                 System.out.println("Qtde. Sal. Min: " +
                        ((Funcionariomensalista)CadFun[i]).getNumSalMin());
             }else{
                 System.out.println("Sal. Base: " +
                         ((Funcionariocomissionario)CadFun[i]).getSalBase());
             }
      }
    }    
}