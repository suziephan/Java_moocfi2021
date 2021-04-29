
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
     // balance of card


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money =1000;
        
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (card.balance() >= 2.5) {
            card.setBalance(card.balance() - 2.5);
            affordableMeals++;
   
            return true;
        } 
        return false;
        
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (card.balance() >= 4.3) {
            card.setBalance(card.balance() - 4.3);
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 2.5) {
            payment +=  - 2.5;
            affordableMeals++;
            this.money += 2.5;
        } 
        return payment;
        
    }
    public double eatHeartily(double payment) {
        // an affordable meal costs 4.30 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= 4.3) {
            payment +=  - 4.3;
            heartyMeals++;
            this.money += 4.3;
        } 
        return payment;
        
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >0) {
            card.addMoney(sum);
            this.money += sum;
        }
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
