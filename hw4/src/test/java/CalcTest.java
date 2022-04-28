import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {


    @DataProvider(name = "Numbers")
    public Object[][] getNumbers() {
        Object[][] numbers = {{3, 1, 3, "*"}, {0, -3, -3, "-"}, {12, 36, 3, "/"}, {14, 12, 2, "+"}};
        return numbers;
    }

    @DataProvider(name = "Negativ")
    public Object[][] getNegativeNumbers() {
        Object[][] numbers = {{43, 12, 3, "*"}, {35, 8, 3, "+"}, {6, -3, -3, "-"}, {33, 36, 3, "/"}};
        return numbers;
    }

    @Test(dataProvider = "Numbers")
    public void calcTest(int exp, int a, int b, String act) {
        Assert.assertEquals(exp, Calc.calculator(a, b, act));
    }

    @Test(dataProvider = "Negativ")
    public void calcNegativeTest(int exp, int a, int b, String act) {
        Assert.assertNotEquals(exp, Calc.calculator(a, b, act));
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void calcDivZeroTest() {
        Calc.calculator(4, 0, "/");
    }


    @Test
    public void caltIntOut() {
        Assert.assertFalse(Integer.MAX_VALUE < Calc.calculator(Integer.MAX_VALUE, 1, "+"));
    }

}
