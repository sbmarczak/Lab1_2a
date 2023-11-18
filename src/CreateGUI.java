// Lab 1 - Zadanie 5
import javax.swing.JFrame; // Importujemy potrzebną bibliotekę

// Klasa CreateGUI
class CreateGUI {
    // Główna funkcja programu
    public static void main(String[] args) {

        // Tworzymy nowy obiekt JFrame
        JFrame frame = new JFrame();

        // Ustawiamy rozmiar okna: 640 pikseli -> szerokość, 480 pikseli -> wysokość
        frame.setSize(640, 480);

        // Ustawiamy, aby okno było widoczne
        frame.setVisible(true);

        // Odpowiednia funkcja do wychodzenia z interfejsu graficznego (do momentu wyjścia przyciskiem: "X")
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
