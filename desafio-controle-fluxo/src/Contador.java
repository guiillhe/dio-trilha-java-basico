import java.util.*;

public class Contador extends Exception {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Diferença entre dois números \nEscolha dois números");
        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parâmetro precisa ser maior que o Segundo ");
            
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        if (contagem <=0) {
            throw new ParametrosInvalidosException();
        
        } else {
            
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo  o Número "+ i);
            }
            
            
        }		
		        
	}
}
/*try {
    
} catch (Exception e) {
    
}
*/