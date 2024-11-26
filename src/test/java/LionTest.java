import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;


    @RunWith(MockitoJUnitRunner.class)
    public class LionTest {

        @Mock
        Feline feline;

        //самец этот лев или нет
        @Test
        public void doesHaveManeTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            boolean expectedHaseMane = true;
            boolean actualHaseMane = lion.doesHaveMane();
            Assert.assertEquals("Это  кажется не самец", actualHaseMane, expectedHaseMane);
        }


        @Test
        public void doesHaveManeThrowsExceptionTest() {
            try {
               new Lion("Мальчик", feline);
            } catch (Exception exception) {

                String textException="Используйте допустимые значения пола животного - самец или самка";
                Assert.assertEquals(textException, exception.getMessage());
                System.out.println(textException);
            }
        }

        //сколько львят у львов
        @Test
        public void getKittensTest() throws Exception {
            Lion lion = new Lion("Самка", feline);
            Mockito.when(feline.getKittens()).thenReturn(1);
            int actualKittensCount = lion.getKittens();
            int expectedKittensCount = 1;
            Assert.assertEquals("Количество львят не соответствует ожиданиям", expectedKittensCount, actualKittensCount);
        }

        //что едят львы
        @Test
        public void getFoodTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actual = lion.getFood();
            Assert.assertEquals("Эта еда не подходит львам", expected, actual);
        }


    }

