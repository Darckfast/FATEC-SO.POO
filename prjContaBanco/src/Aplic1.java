
import fatec.poo.model.Conta;
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
   
    public static void main(String[] args){
        int index = 0;
        Scanner input = new Scanner(System.in);
        Conta[] objConta = new Conta[10];

        for(int a = 0; a < 10; a++){
            System.out.println("Digite o numero da conta e seu saldo:");
            objConta[a] = new Conta(input.nextInt(),input.nextDouble());
        }
        
        System.out.println("1 - depositar"+
                           "2 - sacar"+
                           "3 - consultar"+
                            " 4 - sair");
        switch(input.nextInt()){
            case 1:
                System.out.println("Digite o number e o saldo");
                
                break;
            case 2:
                  break;
            case 3:
                   break;
            default:
                    break;
                        
        }
    }
    public int search(int number){
        int b = 0;
        while(objConta[b].getNumber() != number && b < objConta.lenght + 1){
            b++;
        }
        if(b == objConta.lenght + 1){
            return 1;
        }else{
            return 0;
        }
    }
}
