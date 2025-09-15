package Singleton;

import factory.Libro;

import java.util.ArrayList;
import java.util.List;

public class database {
    private List<Libro> libros =new ArrayList<>();
    private database() {
        System.out.println("Instancia creada");
    } //privado para que el constructor solo pueda ser accedido desde la clase

    private static class databaseHelper{
        private static final database Instancia = new database();//unica instancia
    }
    public static database getInstance(){
        return databaseHelper.Instancia;
    }
    //getters y setters
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
    public void mostrarLibros() {
        if (libros.isEmpty()){
            System.out.println("No hay elementos en la lista");
        }else{
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
