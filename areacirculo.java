import java.util.Scanner;

public class areacirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio, area;

        System.out.print("Digite o raio da círculo: ");
        raio = teclado.nextDouble();

        area = Math.PI * Math.pow(raio , 2);

        System.out.printf("A área desse círculo é: %.3f", area);

        teclado.close();

    }
}