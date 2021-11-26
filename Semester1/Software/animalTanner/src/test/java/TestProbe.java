import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProbe
{
    Animal an;
    Animal an2;
    Animal an3;
    @BeforeEach
    void setUp() {
        an3 = new Animal("Leo",13,"dog","bark");
    }

    @Test
    void name()
    {
        Assertions.assertEquals("old animal",an3.ageCategory());
    }
}
