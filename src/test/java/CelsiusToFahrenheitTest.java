import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CelsiusToFahrenheitTest {
    private static Double celsius = 20.00;

    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange
        CelsiusToFahrenheitConverter c = new CelsiusToFahrenheitConverter();

        //Act

        //Assert
        assertNotNull(c);
    }

    @Test
    public void mustBeAbleToConvertCelsiusToFahrenheit() {
        //Arrange
        Double expectedFahrenheit, actualFahrenheit;
        CelsiusToFahrenheitConverter c = new CelsiusToFahrenheitConverter();
        expectedFahrenheit = (celsius + 32)/(0.5556);

        //Act
        actualFahrenheit = c.convert(celsius);

        //Assert
        assertEquals(expectedFahrenheit, actualFahrenheit);
    }
}
