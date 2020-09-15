import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitToCelsiusTest {
    private static Double fahrenheit = 20.00;

    @Test
    public void mustBeAbleToCreateConverter() {
        //Arrange
        FahrenheitToCelsiusConverter c = new FahrenheitToCelsiusConverter();

        //Act

        //Assert
        assertNotNull(c);
    }

    @Test
    public void mustBeAbleToConvertFahrenheitToCelsius() {
        //Arrange
        Double expectedCelsius, actualCelsius;
        FahrenheitToCelsiusConverter c = new FahrenheitToCelsiusConverter();
        expectedCelsius = (fahrenheit - 32)*(0.5556);

        //Act
        actualCelsius = c.convert(fahrenheit);

        //Assert
        assertEquals(expectedCelsius, actualCelsius);
    }
}
