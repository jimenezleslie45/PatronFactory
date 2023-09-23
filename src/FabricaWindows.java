public class FabricaWindows implements FabricaAbstracta {
    public Boton crearBoton() {
        return new BotonWindows();
    }

    public Ventana crearVentana() {
        return new VentanaWindows();
    }

    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoWindows();
    }
}