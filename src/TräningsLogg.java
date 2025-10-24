import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class TräningsLogg {
    public static void logg(Medlem medlem, String filePath) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(medlem.getNamn() + ";" +
                    medlem.getPersonnummer() + ";" + LocalDate.now() + "\n");
        } catch (IOException e) {
            System.out.println("Någonting gick fel");
        }
    }
}
