import java.util.Scanner;
public class Soluciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        int edad = 25;
        double altura = 1.75;
        String nombre = "Ana";
        System.out.println(nombre + " tiene  una edad de " + edad + " años" + " y mide " + altura);

        // Suma de enteros
        int num1 = 2;
        int num2 = 3;
        int resultado = num1 + num2;
        System.out.println(resultado);

        // Área Rectangulo
        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura: ");
        double alturaRectangulo = sc.nextDouble();
        double area = base * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + area);

        // Concatenación de string
        String parte1 = "Hola ";
        String parte2 = "mundo";

        // 7. Longitud de cadena
        System.out.println("Introduce una palabra:");
        String palabra = sc.next();
        System.out.println("Longitud: " + palabra.length());

        // 8. Letra inicial: Muestra la primera letra de una cadena.
        String cadena = "Hola Mundo";

        if (!cadena.isEmpty()) {
            char primeraLetra = cadena.charAt(0);
            System.out.println("La primera letra es: " + primeraLetra);
        } else {
            System.out.println("La cadena está vacía.");
        }

        }
}
