import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" *----- Olá Seja Bem Vindo -----*");
        System.out.println("Digite dois números inteiros");
        System.out.println();
        System.out.println("Digite o primeiro número");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo número");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException() ;
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo a quantidade de números incrementados com as interações do FOR: " + i);

        }


    }



}


