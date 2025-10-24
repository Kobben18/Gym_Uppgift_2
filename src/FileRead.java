import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static List<Medlem> readMedlemmar(String filePath) {
        List<Medlem> medlemmar = new ArrayList<>();

        try (BufferedReader buf = new BufferedReader(new FileReader(filePath))) {

            buf.readLine();

            String line;
            while ((line = buf.readLine()) != null) {

                String[] split = line.split(";");

                String namn = split[0];
                String personnummer = split[3];
                LocalDate betalning = LocalDate.parse(split[5]);
                String medlemTyp = split[6];

                medlemmar.add(new Medlem(namn, personnummer, betalning, medlemTyp));
            }
        } catch (IOException e) {
            System.out.println("Någonting gick ffffel" + e);
        }

        return medlemmar;

    }
}
