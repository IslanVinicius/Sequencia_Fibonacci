import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CRIANDO UM SCANNER PARA RECEBER UM INTEIRO

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        //PERCORRENDO 40 ELEMENTOS DA SEQUENCIA E VENDO SE O NUMERO INFORMADO PERTENCE
        boolean PERTENCE = false;
        for (int i = 0; i < 40; i++) {
            //System.out.println(Fibonacci.fibo(i));
            if (Fibonacci.fibo(i) == num) {
                PERTENCE = true;
                break;
            }
        }
        //RETORNANDO SE PERTENCE OU NÃO DENTRO DO LIMITE DE 40 ELEMENTOS;
        if (PERTENCE) System.out.print("O NUMERO: " + num + " PERTENCE A SEQUENCIA!");
        else System.out.println("NÃO PERTENCE");
    }
    //CLASSE PARA RECEBER UMA POSICAO N DA SEQUENCIA
    public class Fibonacci {
        static long fibo(int n) {
            if (n < 2) {
                return n;
            } else {
                return fibo(n - 1) + fibo(n - 2);
            }
        }
    }
}