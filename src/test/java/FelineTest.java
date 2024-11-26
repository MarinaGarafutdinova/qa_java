import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

      //относится ли животное к семейству кошачьих
      @Test
      public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Это точно семейство кошачьих?",expectedFamily, actualFamily);
    }

        //что едят кошачьи
        @Test
        public void eatMeatTest() throws Exception {
            Feline feline = new Feline();
            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            List<String> actualFood = feline.eatMeat();
            assertEquals("Эта еда не подходит семейству кошачьих", expectedFood, actualFood);
        }


        //сколько котят
        @Test
        public void getKittensTest() {
            Feline feline = new Feline();
            int expectedKittensCount = 1;
            int actualKittensCount = feline.getKittens();
            assertEquals("Количество котят не соответствует ожиданиям", expectedKittensCount, actualKittensCount);
        }


    }

