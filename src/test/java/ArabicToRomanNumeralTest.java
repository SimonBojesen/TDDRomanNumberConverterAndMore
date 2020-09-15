import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArabicToRomanNumeralTest {
    private static int numberToConvert = 4999;
    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange
        ArabicToRomanNumeralConverter c = new ArabicToRomanNumeralConverter();

        //Act

        //Assert
        assertNotNull(c);
    }
    @Test
    public void mustBeAbleToConvertNumberToRomanNumeral() {
        //Arrange
        ArabicToRomanNumeralConverter c = new ArabicToRomanNumeralConverter();
        String expected = "MMMMCMXCIX";

        //Act
        String actual = c.toRoman(numberToConvert);

        //Assert
        assertEquals(expected, actual);
    }
}
