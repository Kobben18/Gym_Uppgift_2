import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

    public FileReadDemo(){
        String temp;

        try(FileReader br = new FileReader("src/song.txt");
            BufferedReader buf = new BufferedReader(br)){

            while((temp = buf.readLine()) != null){
                System.out.println(temp);
            }

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    void main(){

        FileReadDemo frd = new FileReadDemo();

    }
}
