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
        
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem            
            contar(parametroUm, parametroDois);            
        } 
        catch (ParametrosInvalidosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
        }
        
        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        int contagem = parametroDois - parametroUm;
        
        System.out.println("\nTotal = " + contagem + " [" + parametroDois + "-" + parametroUm + "]\n");
              
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++) {
            System.out.println(i+1);
        }
        
        System.out.println("\n");
    }    
}
