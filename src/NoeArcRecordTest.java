import org.junit.Assert;
import org.junit.Test;

/**
 * @author Juhi Gaba
 */
public class NoeArcRecordTest {

    @Test
    public void test(){
        final String input = "ELE-1, ELE-2, SNA-1, FRO-1, FOX-1, LAM-1, FOX-2, GIR-1, GIR-2, FRO-2, LIO-1, LIO-2";
        final String expectedOutput = "ELE completed" + "\n" + "FOX completed"
                + "\n" + "GIR completed" + "\n" + "FRO completed" + "\n"
                + "LIO completed";

        System.out.println("Expected Output : " + expectedOutput);
        System.out.println();
        System.out.println(" Actual Output : ");

        NoeArcRecord.processInput(input);
        String processOutput = NoeArcRecord.processOutput();
        Assert.assertNotNull(processOutput);
        Assert.assertEquals(expectedOutput, processOutput.trim());
    }
    }
