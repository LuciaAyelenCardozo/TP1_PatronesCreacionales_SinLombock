package factory;

public class LibroDigital implements Libro{
    private int codigo;
    private String nombreLibro;

    public LibroDigital(int codigo, String nombreLibro) {
        this.codigo = codigo;
        this.nombreLibro = nombreLibro;
    }

    @Override
    public void mostrarLibro() {
        System.out.println("Libro digital: "+nombreLibro+", código "+codigo);
    }

    @Override
    public String toString() {
        return "LibroDigital: código=" + codigo +", nombreLibro=" + nombreLibro;
    }
}
