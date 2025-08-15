public class Main {
    public static void crearRectangulo(int ancho, int alto) {
        if (ancho < 1 || alto < 1) {
            System.out.println("Dimensiones no válidas.");
            return;
        }
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void crearTriangulo(int lado) {
        if (lado < 1) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        crearRectangulo(15, 4);
        System.out.println();
        crearTriangulo();
    }
}
