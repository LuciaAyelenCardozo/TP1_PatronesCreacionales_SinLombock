package abstractfactory;

public class EnvioExpress implements MetodoEnvio{
    private int nroEnvio;
    private String fechaEnvio;

    public EnvioExpress(int nroEnvio, String fechaEnvio) {
        this.nroEnvio = nroEnvio;
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public void Estadoenvio() {
        System.out.println("Tiene un envio Express el día "+fechaEnvio);
    }
}
