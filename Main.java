
public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------- FELIZ NAVIDAD -------------------");
        arbolito();
    }

    private static void arbolito() {

        int n = 18;

        // estrella 
        for (int i = 0; i <= 0; i++) {
            // espacios en blanco
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            System.out.print("X");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            // espacios en blanco
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }

            // imprime el arbol
            for (int k = 0; k <= i; k++) {
                if (k % 2 == 1) {
                    System.out.print("° ");
                } else {
                    System.out.print("^ ");
                }
                
                
            }
            // salto de linea
            System.out.println(" ");
        }

        // imprime la base
        for (int x = 0; x < 3; x++) {
            System.out.print("           ");
            for (int y = 0; y < 9; y++) {
                if (y % 2 == 0) {
                    System.out.print("█");
                } else {
                    System.out.print("█");
                }
            }
            // salto de linea
            System.out.println("");
        }

    }
}
