
import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Digite o RA do aluno:");
        objAluno.setRa(Entrada.nextInt());
        System.out.println("Digite a nota da 1a Prova:");
        objAluno.setNtPrv1(Entrada.nextDouble());
        System.out.println("Digite a nota da 2a Prova:");
        objAluno.setNtPrv2(Entrada.nextDouble());
        System.out.println("Digite a nota do 1o Trabalho:");
        objAluno.setNtTrab1(Entrada.nextDouble());
        System.out.println("Digite a nota do 2o Trabalho:");
        objAluno.setNtTrab2(Entrada.nextDouble());
        
        System.out.println("\n\nRa: " + objAluno.getRa());
        System.out.println("Nota 1a. Prova    : " + objAluno.getNtPrv1());
        System.out.println("Nota 2a. Prova    : " + objAluno.getNtPrv2());
        System.out.println("Nota 1o. Trabalho : " + objAluno.getNtTrab1());
        System.out.println("Nota 2o. Trabalho : " + objAluno.getNtTrab2());
        System.out.println("Media Prova       : " + objAluno.calcMediaProva());
        System.out.println("Media Trabalho    : " + objAluno.calcMediaTrab());
        System.out.println("Media Final       : " + objAluno.calcMediaFinal());
       
        
    }   
}
    

