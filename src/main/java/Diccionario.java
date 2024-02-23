import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("ordenador", "computer");
        diccionario.put("árbol", "tree");
        diccionario.put("coche", "car");
        diccionario.put("avión", "plane");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("teléfono", "phone");
        diccionario.put("ventana", "window");
        diccionario.put("reloj", "clock");
        diccionario.put("manzana", "apple");
        diccionario.put("plátano", "banana");
        diccionario.put("naranja", "orange");
        diccionario.put("limón", "lemon");
        diccionario.put("agua", "water");
        diccionario.put("leche", "milk");
        diccionario.put("café", "coffee");

        // Seleccionar 5 palabras al azar
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspanol[random.nextInt(palabrasEspanol.length)];
        }

        // Pedir palabra
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabra : palabrasSeleccionadas) {
            System.out.print("Traduce \"" + palabra + "\": ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals(diccionario.get(palabra))) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
