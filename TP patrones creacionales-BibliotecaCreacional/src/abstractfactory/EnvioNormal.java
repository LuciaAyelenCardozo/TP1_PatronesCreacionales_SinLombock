package abstractfactory;

public class EnvioNormal implements MetodoEnvio{
    private int nroEnvio;
    private String fechaEnvio;

    public EnvioNormal(int nroEnvio, String fechaEnvio) {
        this.nroEnvio = nroEnvio;
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public void Estadoenvio() {
        System.out.println("Tiene un envio Normal el día "+fechaEnvio);
    }
}
