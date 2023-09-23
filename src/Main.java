// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FabricaAbstracta fabricaWindows = new FabricaWindows();
        Juego juegoWindows = new Juego(fabricaWindows);
        juegoWindows.construirUI();

        // Puedes hacer lo mismo para otras plataformas (macOS, Linux) si es necesario.
    }
}
