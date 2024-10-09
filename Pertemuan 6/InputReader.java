import java.util.HashSet;
import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader() {
        reader = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("> "); //cetak prompt
        String inputLine = reader.nextLine(); //membaca semua input hingga ditemui newline
        return inputLine;
    }
}
