package Mainn;
import Singleton.*;
import abstractfactory.*;
import builder.Usuario;
import factory.*;
import prototype.Prestamo;

public class Main {
    public static void main(String[] args) {

        System.out.println("||SINGLETON||\n");
        database singleton = database.getInstance();
        database singleton1 = database.getInstance();

        singleton.addLibro(LibroFactory.crearLibro("Digital",10, "El Tunel"));
        singleton1.addLibro(LibroFactory.crearLibro("Fisico",11, "Mafalda"));

        singleton.mostrarLibros();
        singleton1.mostrarLibros();

        //factorylibros
        System.out.println("\n||FACTORY||\n");

        Libro libro1= LibroFactory.crearLibro("fisico", 12,"Martin Fierro");
        Libro libro2= LibroFactory.crearLibro("digital", 15,"Rayuela");

        libro2.mostrarLibro();
        libro1.mostrarLibro();

        //AbsFactory
        System.out.println("\n||ABSTRACT FACTORY||\n");
        InterfazUI interfaz1= LogicaUI.getInterfaz(new UsuarioFactory("abstract", EnvioFactory.crearEnvio("normal",11,"22/06/2025")));
        InterfazUI interfaz2= LogicaUI.getInterfaz(new AdminFactory("black", EnvioFactory.crearEnvio("express",12,"23/06/2025")));
        interfaz1.mostrar();
        interfaz2.mostrar();

        //Builder
        System.out.println("\n||BUILDER||\n");
        Usuario usuario1= new Usuario.UsuarioBuilder()
                .setNombre("Juan Perez")
                .setEmail("JuanPerez@gmail.com")
                .setDireccion("Barrio papa")
                .setTelefono("+54 2617789980")
                .setFechaNacimiento("12/3/98")
                .build(); //siempre al final, declarando que terminamos de construir

        Usuario usuario2= new Usuario.UsuarioBuilder()
                .setNombre("Pepa Fernandez")
                .setDireccion("Barrio terrada")
                .setFechaNacimiento("12/3/98")
                .build(); //siempre al final, declarando que terminamos de construir

        System.out.println(usuario1);
        System.out.println(usuario2+ "\n");

        System.out.println("\n||PROTOTYPE||\n");

        System.out.println("--Shallow Clone--\n");
        Prestamo prestamo1=new Prestamo(libro1, usuario1, "29/08/2025","27/09/2025");
        Prestamo prestamoCopia=prestamo1.shallowClone();
        prestamoCopia.setFechaInicio("27/09/2025");
        prestamoCopia.setFechaFin("24/10/2025");

        System.out.println(prestamo1);
        System.out.println(prestamoCopia);

        System.out.println("\n--Deep Clone--\n");
        Prestamo prestamoDeepClone=prestamo1.deepClone();
        prestamoDeepClone.setUsuario(usuario2);

        System.out.println(prestamo1);
        System.out.println(prestamoDeepClone);
    }
}
