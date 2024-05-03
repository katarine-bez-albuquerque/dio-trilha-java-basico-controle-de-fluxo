package programa;

import exceptions.ParametrosInvalidosException;
import java.util.Scanner;

/**
 *
 * @author Katarine Albuquerque
 */
public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------ CONTADOR ------------\n");
        
        System.out.print("Digite o primeiro par�metro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo par�metro: ");
        int parametroDois = sc.nextInt();

        try {
            //chamando o m�todo contendo a l�gica de contagem            
            contar(parametroUm, parametroDois);            
        } 
        catch (ParametrosInvalidosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
        }
        
        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        //validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
        }
        
        int contagem = parametroDois - parametroUm;
        
        System.out.println("\nTotal = " + contagem + " [" + parametroDois + "-" + parametroUm + "]\n");
              
        //realizar o for para imprimir os n�meros com base na vari�vel contagem
        for(int i = 0; i < contagem; i++) {
            System.out.println(i+1);
        }
        
        System.out.println("\n");
    }    
}
