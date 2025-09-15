package abstractfactory;

public class LogicaUI {
    public static InterfazUI getInterfaz(InterfazFactory factory){
        return factory.crearInterfaz();
    }
}
