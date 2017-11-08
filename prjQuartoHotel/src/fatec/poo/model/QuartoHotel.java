package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;
    
    public QuartoHotel(int nq, double vd){
        numQuarto = nq;
        valorDiaria = vd;
        situacao = false; //livre
        totalFaturado = 0;
    }
    
    
    public void reservar(int rg){
        numRG = rg;
        situacao = true; //ocupado
    }
    
    public double liberar(int dias){
        double valTot;
        numRG = 0;
        situacao = false; //livre 
        
        valTot = valorDiaria * dias;
        totalFaturado += valTot;
        
        return valTot;
    }   
    
    public boolean getSituacao(){
        return situacao;    
    }
   
    public double getNumQuarto(){
        return numQuarto;
    }
    public double getTotalFaturado(){
        return totalFaturado;
    }

    
}
