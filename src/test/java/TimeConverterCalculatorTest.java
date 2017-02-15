import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by latashawatson on 2/15/17.
 */
public class TimeConverterCalculatorTest {
    TimeConverterCalculator tCC;

    @Before
    public void setup(){
        tCC = new TimeConverterCalculator();
    }

    @Test
    public void splitSortDigitalTimeTest(){
        String input = "3:17 pm";
        String expected = "3";
        tCC.splitSortDigitalTime(input);
        String actual = tCC.hm.get("hour");
        Assert.assertEquals("Values should be equal", expected, actual);
    }

    @Test
    public void splitSortMilitaryTime(){
    String input = "15:18";
    String expected = "15";
    tCC.splitSortMilitaryTime(input);
    String actual = tCC.hm.get("hour");
    Assert.assertEquals("Values should be equal", expected, actual);
    }
}
