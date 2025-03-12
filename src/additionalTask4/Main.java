package additionalTask4;

public class Main extends Credit{

    public Main(String name, double sum, double percent, int termMonth) {
        super(name, sum, percent, termMonth);
    }

    public static void main(String[] args) {
        Credit credit = new Credit("Credit", 10000, 15, 12);
        System.out.println("Credit name: " + credit.getName());
        System.out.println("Credit sum: " + credit.getSum());
        System.out.println("Credit percent: " + credit.getPercent());
        System.out.println("Credit term: " + credit.getTerm());
        System.out.println("Monthly payment: " + credit.calculateMonthlyPayment());
        System.out.println("Total amount: " + credit.calculateTotalAmount());
        System.out.println("");

        credit.setPercent(7.5);
        System.out.println("Credit percent: " + credit.getPercent());
        System.out.println("Monthly payment: " + credit.calculateMonthlyPayment());
        System.out.println("Total amount: " + credit.calculateTotalAmount());
    }

}
