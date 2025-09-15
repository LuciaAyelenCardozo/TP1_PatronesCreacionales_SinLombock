package abstractfactory;

public class UsuarioUI implements InterfazUI{
    private String temaUI;
    private MetodoEnvio envio;

    public UsuarioUI(String temaUI, MetodoEnvio envio) {
        this.temaUI = temaUI;
        this.envio=envio;
    }
    @Override
    public void mostrar() {
        System.out.println("Se realizó una UI de Usuario con tema "+temaUI);
        envio.Estadoenvio();
    }
}
