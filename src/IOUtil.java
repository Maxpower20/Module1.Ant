import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class IOUtil {

    public static void printToConsole (String[] data) {

        for (String aData : data) {
            System.out.print(aData);
        }
    }

    public static void saveToFile (String data[], String path ) throws IOException {
        PrintWriter fileWriter = new PrintWriter(new FileWriter(path, true));

        for (String aData : data) {
            fileWriter.print(aData);
        }

        fileWriter.close();
    }


}
