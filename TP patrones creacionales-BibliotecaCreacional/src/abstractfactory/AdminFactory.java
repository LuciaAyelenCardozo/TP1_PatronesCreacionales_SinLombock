package abstractfactory;

public class AdminFactory implements InterfazFactory{
    private String temaUI;
    private MetodoEnvio envio;

    public AdminFactory(String temaUI, MetodoEnvio envio) {
        this.temaUI = temaUI;
        this.envio=envio;
    }

    @Override
    public InterfazUI crearInterfaz() {
        return new UsuarioUI(this.temaUI, this.envio);
    }
}
