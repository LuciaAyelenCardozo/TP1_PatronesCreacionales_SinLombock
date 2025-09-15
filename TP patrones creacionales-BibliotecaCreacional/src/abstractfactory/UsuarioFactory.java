package abstractfactory;

public class UsuarioFactory implements InterfazFactory {
    private String temaUI;
    private MetodoEnvio envio;

    public UsuarioFactory(String temaUI, MetodoEnvio envio) {
        this.temaUI = temaUI;
        this.envio=envio;
    }

    @Override
    public InterfazUI crearInterfaz() {
        return new UsuarioUI(this.temaUI, this.envio);
    }
}
