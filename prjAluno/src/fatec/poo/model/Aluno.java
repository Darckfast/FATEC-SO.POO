package fatec.poo.model;

/**
 *
 * @author 
 */
public class Aluno {
    private int ra;
    private double ntPrv1;
    private double ntPrv2;
    private double ntTrab1;
    private double ntTrab2;
    
    public void setRa(int r){
        ra=r;
    }
    public void setNtPrv1(double p1){
        ntPrv1 = p1;
    }
    public void setNtPrv2(double p2){
        ntPrv2 = p2;
    }
    public void setNtTrab1(double t1){
        ntTrab1 = t1;
    }
    public void setNtTrab2(double t2){
        ntTrab2 = t2;
    }    
    
    public int getRa(){
        return(ra);
    }
    public double getNtPrv1(){
        return(ntPrv1);
    }
    public double getNtPrv2(){
        return(ntPrv2);
    }
    public double getNtTrab1(){
        return(ntTrab1);
    }
    public double getNtTrab2(){
        return(ntTrab2);
    }
    
    public double calcMediaProva(){
        return(0.75  * (ntPrv1 + 2 * ntPrv2)/3);
    }
    
    public double calcMediaTrab(){
        return(0.25 * (ntTrab1 + ntTrab2)/2);
    }
    
    public double calcMediaFinal(){
        return(calcMediaProva() + calcMediaTrab());
    }    
    
  
    
}