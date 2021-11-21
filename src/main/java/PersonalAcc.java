public class PersonalAcc {
    private int income;
    private int expenses;

    public int getIncome() {
        return income;
    }

    public int getExpenses() {
        return expenses;
    }

    public void addedIncome(int income){
        if (income < 0) {
            return;
        }

        this.income += income;
    }

    public void addedExpense(int expenses) {
        if (expenses < 0) {
            return;
        }

        this.expenses += expenses;
    }

    public int tax6Percent(int income) {
        return income / 100 * 6;
    }

    public int tax15PercentFromOdds(int income, int expenses) {
        if (income - expenses <= 0) {
            return 0;
        }
        else {
            return (income - expenses) / 100 * 15;
        }
    }
}

