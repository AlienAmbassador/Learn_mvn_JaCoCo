import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class PersonalAccTest {

    @Test
    public void test6Percent(){
        PersonalAcc personalAcc = new PersonalAcc();

        int expected = 30;
        int actual = personalAcc.tax6Percent(500);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test15Percent(){
        PersonalAcc personalAcc = new PersonalAcc();

        int expected = 45;
        int actual = personalAcc.tax15PercentFromOdds(500, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void addedExpensesTest(){
        PersonalAcc personalAcc = new PersonalAcc();

        personalAcc.addedExpense(100);
        personalAcc.addedExpense(300);

        int expected = 400;
        int actual = personalAcc.getExpenses();

        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testIncomes.csv")
    public void testIncomes(int income, int expectedIncome){
        PersonalAcc personalAcc = new PersonalAcc();
        personalAcc.addedIncome(income);

        int actual = personalAcc.getIncome();

        Assertions.assertEquals(expectedIncome, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testExpenses.csv")
    public void testExpenses(int expense, int expectedExpense){
        PersonalAcc personalAcc = new PersonalAcc();
        personalAcc.addedExpense(expense);

        int actual = personalAcc.getExpenses();

        Assertions.assertEquals(expectedExpense, actual);
    }


}
