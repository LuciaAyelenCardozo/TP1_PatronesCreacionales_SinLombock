package prototype;

import builder.Usuario;
import factory.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestamo implements Cloneable{
    private Libro libro;
    private Usuario usuario;
    private String fechaInicio;
    private String fechaFin;
   // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Prestamo(Libro libro, Usuario usuario, String fechaInicio, String fechaFin) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    //no uso el override porque lo declaro con otro nombre
    public Prestamo shallowClone(){
        try {
            return (Prestamo) super.clone(); //devuelve un object por eso usamos un casteo
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Prestamo deepClone() {
        try {
            Prestamo prestamoClon = (Prestamo) super.clone();
            prestamoClon.usuario = new Usuario.UsuarioBuilder().build();//creamos un usuario sin nada
            return prestamoClon;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", usuario=" + usuario +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }

}
