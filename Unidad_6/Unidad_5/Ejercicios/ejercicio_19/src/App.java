public class App {
    public static void main(String[] args) throws Exception {
        // variables
        int altura = 0;
        int columna = 1;
        String caracter = "";

        // titulo y preguntas de la altura y el caracter
        System.out.println("PIRAAAAMIDE!!!!!");
        System.out.println("------------------");
        System.out.print("Altura -> ");
        altura = Integer.parseInt(System.console().readLine());
        System.out.print("Caracter -> ");
        caracter= System.console().readLine();
        System.out.println("------------------");

        // entramos en el bucle 
        while (altura > 0) {
            // bucle para los espacios
            for (int i = 0; i < altura; i++) {
                System.out.print(" ");
            }
            // bucle para el caracter
            for (int i = 0; i < columna; i++) {
                System.out.print(caracter);
            }
            // modificacion de las variables para que calcule bien los espacios y los caracteres que tiene que rellenar
            columna = columna + 2;
            altura--;
            System.err.println("");
        }
    }
}
