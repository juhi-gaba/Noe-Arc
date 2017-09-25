import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task
 * @author Juhi Gaba
 */
public class NoeArcRecord {
    private static List<String> listArc = new ArrayList<>();
    private static List<String> listCompleted = new ArrayList<>();

    /**
     * Entry point.
     *
     * @param args Input
     */
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter input");
        String input = null;

        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        processInput(input);

        processOutput();
    }


    /**
     * Process input.
     *
     * @param input Data that is going to be processed.
     */
    private static void processInput(String input) {
        String[] inputRecord = input.split(",");

        List<String> consoleInput = Arrays.asList(inputRecord);

        for (String value : consoleInput){

            String[] splitValue = value.split("-");

            String animalId = splitValue[0].trim();
            String label = splitValue[1];

            if (label.equals("1")) {

                listArc.add(animalId);

            } else {

                if (listArc.contains(animalId)) {
                    listCompleted.add(animalId);
                }
            }
        }
    }

    /**
     * Process output.
     */
    private static void processOutput() {
        for (String name : listCompleted){
            System.out.println(name + " completed");
        }
    }
}

