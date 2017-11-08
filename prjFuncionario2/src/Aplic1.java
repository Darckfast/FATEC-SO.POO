
import fatec.poo.model.Funcionariocomissionario;
import fatec.poo.model.Funcionariohorista;
import fatec.poo.model.Funcionariomensalista;
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
    public static void main (String[] args){
        boolean a = true;
        Scanner S = new Scanner(System.in);
        Funcionariohorista[] objFunH = new Funcionariohorista[10];
        Funcionariomensalista[] objFunM = new Funcionariomensalista[10];
        Funcionariocomissionario[] objFunC = new Funcionariocomissionario[10];
        int registro, conth = 0, contm = 0, contc = 0;
        double valHtrab,SalMin;
        String nome;
        String dtAdmissao;
        
        while(a){
            System.out.println("1 - Cadastrar horista");
            System.out.println("2 - Cadastrar mensalista");
            System.out.println("3 - Cadastrar comissario");
            System.out.println("4 - Exibir salarios");
            System.out.println("5 - Fim");
            switch(S.nextInt()){
                case 1:
                    if(conth != 10){
                        System.out.println("Digite: ");
                        System.out.println("Registro:");
                        registro = S.nextInt();
                        System.out.println("Nome:");
                        nome = S.next();
                        System.out.println("Data de admissão:");
                        dtAdmissao = S.next();
                        System.out.println("Valor de hora trabalhadas");
                        valHtrab = S.nextDouble();
                        objFunH[conth++] = new Funcionariohorista(registro,nome,dtAdmissao,valHtrab);
                        System.out.println("Horas trabalhadas:");
                        objFunH[conth-1].apontarHoras(S.nextInt());
                    }else{
                        System.out.println("Limite da Matriz Esgotado");
                    }
                    break;
                case 2:
                    if(contm != 10){
                        System.out.println("Digite: ");
                        System.out.println("Registro:");
                        registro = S.nextInt();
                        System.out.println("Nome:");
                        nome = S.next();
                        System.out.println("Data de admissão:");
                        dtAdmissao = S.next();
                        System.out.println("Valor do salario");
                        SalMin = S.nextDouble();
                        objFunM[contm++] = new Funcionariomensalista(registro,nome,dtAdmissao,SalMin);
                    }else{
                        System.out.println("Limite da Matriz Esgotado");
                    }
                    break;
                case 3:
                    if(contc != 10){
                        System.out.println("Digite: ");
                        System.out.println("Registro:");
                        registro = S.nextInt();
                        System.out.println("Nome:");
                        nome = S.next();
                        System.out.println("Data de admissão:");
                        dtAdmissao = S.next();
                        objFunC[contc++] = new Funcionariocomissionario(registro,nome,dtAdmissao);
                        System.out.println("Salario base:");
                        objFunC[contc-1].setSalBase(S.nextDouble());
                    }else{
                        System.out.println("Limite da Matriz Esgotado");
                    }
                    break;
                case 4:
                    for(int i = 0; i < conth; i ++){
                        System.out.println("Registro:" + objFunH[i].getRegistro());
                        System.out.println("Nome:" + objFunH[i].getNome());
                        System.out.println("Salario:" + objFunH[i].calSalLiqui());
                    }
                    for(int i = 0; i < contm; i ++){
                        System.out.println("Registro:" + objFunM[i].getRegistro());
                        System.out.println("Nome:" + objFunM[i].getNome());
                        System.out.println("Salario:" + objFunM[i].calSalLiqui());
                    }
                    for(int i = 0; i < contc; i ++){
                        System.out.println("Registro:" + objFunC[i].getRegistro());
                        System.out.println("Nome:" + objFunC[i].getNome());
                        System.out.println("Salario:" + objFunC[i].calSalLiqui());
                    }
                    break;
                default:
                       a = false;
                       break;
            }
        }
    }
}
