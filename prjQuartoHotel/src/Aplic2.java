import fatec.poo.model.QuartoHotel;
import java.util.Scanner;

public class Aplic2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        
        QuartoHotel[] Hotel = new QuartoHotel[3];
        
        int Escolha, Cont, NumQuarto;
        double ValorQuarto;
        
        for(Cont = 0; Cont < Hotel.length ; Cont ++){
            System.out.println("Informe o Numero do quarto: ");
            NumQuarto = S.nextInt();
            System.out.println("Informe o valor da diaria: ");
            ValorQuarto = S.nextDouble();
            
            Hotel[Cont] =  new QuartoHotel(NumQuarto,
                                           ValorQuarto);            
        }
            
        
        do{
            System.out.println("\t  Hotel Recanto do Sossego");
            System.out.println("\t1 - Consultar quarto");
            System.out.println("\t2 - Reservar Quarto");
            System.out.println("\t3 - Liberar Quarto");
            System.out.println("\t4 - Consultar Faturamento");
            System.out.println("\t5 - Sair");

            System.out.println("\t\tDigite a opção: ");
            Escolha = S.nextInt();
            
            if( Escolha == 1 ){                
                System.out.println("Informe o numero do quarto a ser consultado: ");
                NumQuarto= S.nextInt();               
                                
                if( pesqQuarto(Hotel, NumQuarto) == -1 ){
                    System.out.println("Quarto não existe");
                }else 
                   if(!Hotel[pesqQuarto(Hotel, NumQuarto)].getSituacao()){
                      System.out.println("Quarto Livre");
                   }else{
                      System.out.println("Quarto Ocupado");
                   }   
            }
            else
              if (Escolha == 2){
                   System.out.println("Informe o numero do quarto a ser consultado: ");
                   NumQuarto= S.nextInt();   
                   if( pesqQuarto(Hotel, NumQuarto) == -1 ){
                       System.out.println("Quarto não existe");
                   }else
                     if (Hotel[pesqQuarto(Hotel, NumQuarto)].getSituacao()){
                         System.out.println("Quarto Ocupado");
                     }
                     else{
                       System.out.println("Digite o RG: ");
                       Hotel[pesqQuarto(Hotel, NumQuarto)].reservar(S.nextInt());
                   }                        
              }
              else
                 if (Escolha == 3){  
                     System.out.println("Informe o numero do quarto a ser consultado: ");
                     NumQuarto= S.nextInt();   
                     if( pesqQuarto(Hotel, NumQuarto) == -1 ){
                         System.out.println("Quarto não existe");
                     }else
                       if (!Hotel[pesqQuarto(Hotel, NumQuarto)].getSituacao()){
                           System.out.println("Quarto Livre");
                       }
                       else{
                            int qtdeDias;
                            System.out.println("Informe a qtde. de dias: ");
                            qtdeDias = S.nextInt();
                            System.out.println("Valor da hospedagem: " +
                                               Hotel[pesqQuarto(Hotel, NumQuarto)].liberar(qtdeDias));
                       }
                     
                 }
                 else
                   if (Escolha == 4){
                       double fatHotel=0;
                       
                       for(Cont=0; Cont <Hotel.length; Cont++){
                           fatHotel += Hotel[Cont].getTotalFaturado();                         
                       }
                       
                       System.out.println("Faturamento Hotel: "  + fatHotel);                     
                   }
            
        }while(Escolha != 5);        
    }        
    
    public static int pesqQuarto(QuartoHotel[] h,
                                 int nq){
        int Cont, Resultado = -1;
        
        Cont = 0; 
        while(Cont < h.length && 
              h[Cont].getNumQuarto() != nq){ 
             Cont++;
        }
        if (Cont < h.length)
            Resultado = Cont;
        return(Resultado);
    }
}
