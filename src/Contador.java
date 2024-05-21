import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		try {
            System.out.println("Digite o primeiro parâmetro");
		    int parametroUm = sc.nextInt();
            sc.nextLine();
		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = sc.nextInt();
			contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro tem que ser maior que o primeiro parâmetro");
		}catch(InputMismatchException e){
            System.out.println("O número digitado precisa ser um número INTEIRO");
        }
        sc.close();
    }
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ("O segundo parâmetro tem que ser maior que o primeiro parâmetro");
        }

		int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i ++ ){
            System.out.println("Imprimindo número " + i);
        }
	}
}

