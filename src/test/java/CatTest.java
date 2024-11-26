import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
    public class CatTest {

        @Mock
        Feline feline;

        //какие звуки издает кошка
        @Test
        public void getSoundTest() {
            Cat cat = new Cat(feline);
            String expected = "Мяу";
            String actual = cat.getSound();
            assertEquals("Это не похоже на мяуканье кошки", expected, actual);
        }

        //что едят кошки
        @Test
        public void getFoodTest() throws Exception {
            Cat cat = new Cat(feline);
            List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
            List<String> actual = cat.getFood();
            assertEquals("Эта еде не подходит кошкам", expectedFood, actual);
        }

    }

