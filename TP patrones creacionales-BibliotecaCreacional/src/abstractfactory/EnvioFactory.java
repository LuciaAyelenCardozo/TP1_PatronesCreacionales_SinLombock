package abstractfactory;

public class EnvioFactory {
    public static MetodoEnvio crearEnvio(String tipo, int nroEnvio, String fechaEnvio){
        if(tipo.equalsIgnoreCase("Normal"))return new EnvioNormal(nroEnvio,fechaEnvio);
        else if (tipo.equalsIgnoreCase("Express")) return new EnvioExpress(nroEnvio,fechaEnvio);
        else return null;
    }
}
