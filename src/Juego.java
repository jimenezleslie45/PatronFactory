public class Juego {
    private FabricaAbstracta fabrica;

    public Juego(FabricaAbstracta fabrica) {
        this.fabrica = fabrica;
    }

    public void construirUI() {
        Boton boton = fabrica.crearBoton();
        Ventana ventana = fabrica.crearVentana();
        CuadroTexto cuadroTexto = fabrica.crearCuadroTexto();

        // Lógica para construir la interfaz del juego
        boton.render();
        ventana.render();
        cuadroTexto.render();
    }
}
