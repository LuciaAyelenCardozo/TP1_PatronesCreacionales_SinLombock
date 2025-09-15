package factory;

public class LibroFisico implements Libro{
    private int codigo;
    private String nombreLibro;

    public LibroFisico(int codigo, String nombreLibro) {
        this.codigo = codigo;
        this.nombreLibro = nombreLibro;
    }
    @Override
    public void mostrarLibro() {
        System.out.println("Libro físico: "+nombreLibro+", código "+codigo);
    }

    @Override
    public String toString() {
        return "LibroFisico: código=" + codigo +", nombreLibro='" + nombreLibro;
    }
}
