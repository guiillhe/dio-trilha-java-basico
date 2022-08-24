import java.util.Scanner;
import java.util.Random;
public class ContaTerminal {
    public static void main(String[] args) {

        Random numeroRandom = new Random();
        Integer numero = numeroRandom.nextInt(9999);
        

        Scanner nomeClienteScanner = new Scanner(System.in);
        System.out.print("Olá, Digite seu nome completo, por favor :");
        String nomeCliente = nomeClienteScanner.nextLine();
        


        System.out.print("Por favor, digite o cogigo da agência : XXXX ");
        Scanner agenciasScanner= new Scanner(System.in);
        Integer agencia = agenciasScanner.nextInt();


        System.out.print(" O valor a ser depositado : R$00.00 ");
        Scanner saldoScanner= new Scanner(System.in);
        double saldo = saldoScanner.nextDouble();

    

 



        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", sua conta é Nº "+ numero + " e seu saldo é R$"+ saldo + " e já está disponível para saque.");
    }

    
    
}
