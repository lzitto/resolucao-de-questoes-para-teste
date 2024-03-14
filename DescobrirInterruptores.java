import java.util.Scanner;

public class DescobrirInterruptores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está na sala das lâmpadas. Você tem três interruptores (A, B, C).");

        System.out.println("Ligue um dos interruptores (A, B ou C) e espere alguns minutos.");
        System.out.print("Qual interruptor você deseja ligar? ");
        String primeiroInterruptor = scanner.nextLine().toUpperCase();

        System.out.println("Desligue o interruptor que você ligou anteriormente e ligue outro interruptor.");
        System.out.print("Qual interruptor você deseja ligar agora? (diferente do anterior) ");
        String segundoInterruptor = scanner.nextLine().toUpperCase();

        // Simulando a situação de ligar e desligar os interruptores
        boolean[] lampadas = new boolean[3];
        lampadas[0] = (primeiroInterruptor.equals("A") || segundoInterruptor.equals("A"));
        lampadas[1] = (primeiroInterruptor.equals("B") || segundoInterruptor.equals("B"));
        lampadas[2] = (primeiroInterruptor.equals("C") || segundoInterruptor.equals("C"));

        System.out.println("\nResultados:");
        for (int i = 0; i < lampadas.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + ": " + (lampadas[i] ? "acesa" : "apagada") + ".");
        }

        scanner.close();
    }
}
