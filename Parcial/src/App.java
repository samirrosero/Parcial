import java.util.Scanner;

public class App extends Libro {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Todo lo que me falta por contar","andres solis", 7,10 );

        Scanner sc = new Scanner(System.in);
        Libro libro2 = new Libro(null, null, 0, 0);
        System.out.println("ingrese el titulo del libro");
        libro2.setTitulo (sc.nextLine());
        System.out.println("ingrese el autor del libeo: ");
        libro2.setAutor(sc.nextLine());
        System.out.println("ingrese el numero de ejemplares: ");
        libro2.setNumeroEjemplares(sc.nextInt());




    }
}
