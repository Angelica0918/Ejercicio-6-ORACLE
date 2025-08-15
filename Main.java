import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Pin_Correcto = 2305;

        Scanner entrada = new Scanner(System.in);

        System.out.print("INGRESE EL PIN: ");
        int Pin_Escrito = entrada.nextInt();

        while (Pin_Escrito != Pin_Correcto) {
            System.out.print("PIN INCORRECTO\nTRY AGAIN: ");
            Pin_Escrito = entrada.nextInt();
        }

        System.out.println("Bienvenido");
    }
}