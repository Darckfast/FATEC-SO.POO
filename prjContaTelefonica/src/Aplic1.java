import fatec.poo.model.ContaTelefonica;
import java.util.Scanner;

public class Aplic1{

    public static void main(String[] args) {
        ContaTelefonica objCtaTel = new ContaTelefonica();
        Scanner s = new Scanner(System.in);
       
        System.out.println("Informe o número: ");
        objCtaTel.setNumero(s.nextInt());
        System.out.println("Informe o tipo (1)Residencial (2) Comercial: ");
        objCtaTel.setTipo(s.nextInt());        
        System.out.println("Informe a qtd de pulsos: ");
        objCtaTel.setQtdPulsos(s.nextInt());
        System.out.println("Informe a qtd de minutos de interurbanos: ");
        objCtaTel.setQtdInter(s.nextInt());
        System.out.println("Informe a qtd de servicos despertador: ");
        objCtaTel.setQtdServDesp(s.nextInt());
        
        System.out.println("Telefone: " + objCtaTel.getNumero());
        System.out.println("Tipo : " + objCtaTel.getTipo());
        System.out.println("Qtde de pulsos: " + objCtaTel.getQtdPulsos());
        System.out.println("Qtde de interurbanos: " + objCtaTel.getQtdInter());
        System.out.println("Qtde de servicos despertador: " + objCtaTel.getQtdServDesp());
        System.out.println("Valor da Conta: " + objCtaTel.calcValorConta());
    }
    
}
