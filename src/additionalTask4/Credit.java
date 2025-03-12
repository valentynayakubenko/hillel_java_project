package additionalTask4;

public class Credit {

    public String name;
    public double sum;
    public double percent;
    public int termMonth;

    public Credit(String name, double sum, double percent, int term) {
        this.name = name;
        this.sum = sum;
        this.percent = percent;
        this.termMonth = term;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getTerm() {
        return termMonth;
    }

    public void setTerm(int term) {
        this.termMonth = term;
    }

    public double calculateMonthlyPayment() {
        double monthlyPercent = percent/ 12 / 100;
        double monthlyPayment = sum * (monthlyPercent + monthlyPercent / (Math.pow(1 + monthlyPercent, termMonth) - 1));
        return monthlyPayment;
    }

    // Method to calculate the total amount of payment
    public double calculateTotalAmount() {
        return calculateMonthlyPayment() * termMonth;
    }

}
