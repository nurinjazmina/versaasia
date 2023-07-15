import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.append("BIG BANG\n");
            } else if (i % 3 == 0) {
                output.append("BIG\n");
            } else if (i % 5 == 0) {
                output.append("BANG\n");
            } else {
                output.append(i).append("\n");
            }
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(output.toString());
            System.out.println("Array generated and saved to 'output.txt' file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
