import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What story/file do you want to read? ");
        String story = scanner.nextLine().strip().toLowerCase() + ".txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(story));
            String line;
            int lineNumber = 1;
            while((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ".\t" + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Couldn't find file or something unexpected what wrong");
        }
    }
}
