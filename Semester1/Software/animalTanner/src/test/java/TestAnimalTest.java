import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestAnimalTest {

   Animal henry;
   Animal Timmy;
   Animal Hansi;
   Animal Hubert;
   Animal Shelly;

   @org.junit.jupiter.api.BeforeEach
   //in der pom rechtclick dependency junit jupiter 5.8.1
   //dann plugin setup maven surefire suchen,
      // org darüber eingeben und version 2.2.0 normal

   void setUp() {
      henry = new Animal("Henry",21,"Hund","bark");
      Timmy = new Animal("Timmy",3, "turtle","rrrrrrr");
      Hubert = new Animal("hubert",3, "cat","brrr");
   }

   @Test
   void myFirstTest() {

      Assertions.assertEquals("Rawrrrrr ;)  :)",henry.giveAnimalLoud());
      Assertions.assertEquals("Rawrrrrr ;)  :)",Timmy.giveAnimalLoud());
   }


   @Test
   void mySecondTest()
   {
      Assertions.assertEquals("young animal",Hubert.ageCategory());
   }
}