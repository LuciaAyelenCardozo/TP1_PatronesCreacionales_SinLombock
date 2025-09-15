package abstractfactory;

public class AdminUI implements InterfazUI{
    private String temaUI;
    private MetodoEnvio envio;

    public AdminUI(String temaUI, MetodoEnvio envio) {
        this.temaUI = temaUI;
        this.envio=envio;
    }

    @Override
    public void mostrar() {
        System.out.println("Se realizó una UI de Admin con tema "+temaUI+"y el envio ");
        envio.Estadoenvio();
    }
}
