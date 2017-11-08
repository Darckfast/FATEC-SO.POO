package fatec.poo.model;

public class ContaTelefonica {
    private int numero;
    private int tipo;
    private int qtdPulsos;
    private int qtdInter;
    private int qtdServDesp;   

    public void setNumero(int a) {
        numero = a;
    }

    public int getNumero() {
        return numero;
    }
	
    public void setTipo(int a) {
        tipo = a;
    }
	
    public int getTipo() {
        return tipo;
    }

    public void setQtdPulsos(int a) {
        qtdPulsos = a;
    }

    public int getQtdPulsos() {
        return qtdPulsos;
    }

    public void setQtdInter(int a) {
        qtdInter = a;
    }
	
    public int getQtdInter() {
        return qtdInter;
    }

    public void setQtdServDesp(int a) {
        qtdServDesp = a;
    }

    public int getQtdServDesp() {
        return qtdServDesp;
    }

    public double calcValorConta(){
        double taxa, pulso = 0;
        if(tipo == 1){
            taxa = 10;
        }else{
            taxa = 15;
        }	
        if(qtdPulsos > 90){
            pulso = (qtdPulsos-90)*0.05;
        }
        return (taxa + pulso + (qtdInter * 60 * 0.08) + (qtdServDesp * 2));
    }

}
