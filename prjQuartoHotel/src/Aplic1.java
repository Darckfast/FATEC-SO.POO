import fatec.poo.model.QuartoHotel;
import java.util.Scanner;
/**
 * @author Dimas
 */
public class Aplic1 {
    public static void main(String [] args){        
        Scanner entrada = new Scanner(System.in);
        int opcao, numQuarto, rg,nq, qtdeDias;
        double valorDiaria;
       
        System.out.println("Informe o Numero do quarto: ");
        numQuarto = entrada.nextInt();
        System.out.println("Informe o valor da diária: ");
        valorDiaria = entrada.nextDouble();

        QuartoHotel objQuarto = new QuartoHotel(numQuarto, 
                                                valorDiaria);
        
        do{  //Menu
            System.out.println("\n\n******Hotel Recanto do Sossego******\n");
            System.out.println("1-Consultar quarto");
            System.out.println("2-Reservar quarto");
            System.out.println("3-Liberar quarto");
            System.out.println("4-Consultar faturamento");
            System.out.println("5-Sair\n");
            
            opcao = entrada.nextInt();
            
            if(opcao == 1){
               if(objQuarto.getSituacao())
                  System.out.print(" Situacao: Ocupado");
               else
                  System.out.print(" Situacao: Livre");
            }
            else             
              if(opcao == 2){
                   if(objQuarto.getSituacao())
                        System.out.println("O quarto já foi reservado.");
                   else{
                        System.out.println("Informe o RG: ");
                        rg = entrada.nextInt();
                        objQuarto.reservar(rg);
                    }
              }
              else
                if(opcao == 3){                    
                    if(!objQuarto.getSituacao())
                        System.out.println("O quarto já foi liberado.");
                    else{
                        System.out.println("Informe a qtde de Dias que o cliente ficou hospedado: ");
                        qtdeDias = entrada.nextInt();
                        System.out.println("Valor a pagar: "+ 
                                          objQuarto.liberar(qtdeDias));
                    }                   
            }
            else
              if(opcao == 4){
                 System.out.println("Faturamento total: " +
                                   objQuarto.getTotalFaturado());
              }
        }while(opcao != 5);        
    }
}
