import javax.swing.*;
import java.util.List;

void main() {
    List<Medlem> medlemLista = FileRead.readMedlemmar("src/Medlemmar.txt");

    String input = JOptionPane.showInputDialog("Ange namn eller personnummer:");

    Medlem hittad = null;

    for (Medlem medlem : medlemLista) {
        if (medlem.getNamn().equalsIgnoreCase(input) || medlem.getPersonnummer().equals(input)) {
            hittad = medlem;
            break;
        }
    }

    if (hittad == null) {
        JOptionPane.showMessageDialog(null, "Personen är obehörig");
    } else if (hittad.medlemCheck()) {
        JOptionPane.showMessageDialog(null, hittad + " - Aktiv medlem");
        TräningsLogg.logg(hittad, "src/PTlogg.txt");
    } else {
        JOptionPane.showMessageDialog(null, hittad + " - Före detta medlem");
    }

}
