import java.util.Scanner;
import java.util.Random;
public class ContaTerminal {
    public static void main(String[] args) {

        //Gerador aleatorio de conta
        Random numeroRandom = new Random();
        Integer numero = numeroRandom.nextInt(9999);
        
        Scanner scan = new Scanner(System.in);
        

        //Entrada de nome
        System.out.print("Olá, Digite seu nome completo, por favor :");
        String nomeCliente = scan.nextLine();
        


        //Entrada número agência
        System.out.print("Por favor, digite o cogigo da agência : XXXX ");
        Integer agencia = scan.nextInt();


        //Entrada depósito
        System.out.print(" O valor a ser depositado : R$00.00 ");
        double saldo = scan.nextDouble();

    

 



        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", sua conta é Nº "+ numero + " e seu saldo é R$"+ saldo + " e já está disponível para saque.");
        scan.close();
    }

    
    
}
