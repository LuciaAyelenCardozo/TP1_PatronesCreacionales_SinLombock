package factory;

public class LibroFactory {
    public static Libro crearLibro(String tipo,int codigo, String nombreLibro){
        if (tipo.equalsIgnoreCase("Fisico"))return new LibroFisico(codigo, nombreLibro);
        else if (tipo.equalsIgnoreCase("Digital"))return new LibroDigital(codigo, nombreLibro);
        System.out.println("No se pudo instanciar");
        return null;
    }
}
