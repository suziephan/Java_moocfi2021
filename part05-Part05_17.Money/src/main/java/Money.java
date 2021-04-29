
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents+ addition.cents);
        return newMoney;

    }
    
    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } 
        if ( this.euros== compared.euros) {
            if ( this.cents > compared.cents){
                return false;
            } 
        } 
        return true;
        
    }
    
    public Money minus ( Money decreaser) {
        Money subtract = new Money (decreaser.euros,decreaser.cents);
        int cent =0;
        int euro =0;
        if (this.euros >= decreaser.euros) {
            if (this.cents < decreaser.cents) {
                cent = this.cents+100 -decreaser.cents;
                euro = this.euros - decreaser.euros -1;
            }
            if (this.cents >=decreaser.cents) {
                cent = this.cents -decreaser.cents;
                euro = this.euros - decreaser.euros ;
            }
        } 
            
        Money moneyLeft = new Money(euro,cent)   ;
        return moneyLeft;
    }
        

    

}
