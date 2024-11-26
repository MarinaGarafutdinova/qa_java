
import com.example.Feline;
import com.example.Lion;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
// параметризованный тест
@RunWith(Parameterized.class)
public class LionParameterTest {
    String sex;
    boolean hasMane;

    public LionParameterTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Mock
    Feline feline;

    @Parameterized.Parameters()
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    // определение пола животного
    @Test
    public void haveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}

