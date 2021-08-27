import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloPeerakorn () {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Act
        String actualResult = helloWorld.greeting("Peerakorn");

        //Assert
        assertEquals("Hello Peerakorn", actualResult);
    }
}
