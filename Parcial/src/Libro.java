public class Libro {
    public String titulo;
    public String autor;
    public int numeroEjemplares;
    public int numeroEjemplaresPrestados;
    
    

    // Constructor

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return this.numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return this.numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public boolean Prestamo(){
        if ( numeroEjemplares < numeroEjemplaresPrestados  ) {
            this.numeroEjemplaresPrestados++;
            System.out.println("OPERACION EXITOSA!!");
            return true;
        } else {
            System.out.println("OPERACION NO EXITOSA!");
            return false;
        }

    }
    
    public boolean Devolucion (){
        if (numeroEjemplaresPrestados< numeroEjemplares){
            this.numeroEjemplares++;
            System.out.println("Puedes volver a pedir prestado un libro");
            return true;
        } else {
            System.out.println("Prestamos LIMITADOS!!");
            return false;
        }
    }

    @Override
    public String toString (){
        return "Titulo: "+ titulo + "\n"+
        "Autor: "+ autor+ "\n"+
        "Numero de Ejemplares: "+ numeroEjemplares + "\n"+
        "Numero de Ejemplares Prestados: " + numeroEjemplaresPrestados;
    }

    


    
}
