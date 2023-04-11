import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        int anterior = 0;
        int atual = 1;
        int proximo;
        boolean pertence = false;
        
        while (atual <= numero) {
            if (atual == numero) {
                pertence = true;
            }
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
    }
}
