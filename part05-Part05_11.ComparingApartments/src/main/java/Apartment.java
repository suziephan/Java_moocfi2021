
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan (Apartment compared) {
        if (this.squares >= compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference (Apartment compared) {
        if ( this.pricePerSquare*this.squares - compared.pricePerSquare*compared.squares >=0 ) {
            return this.pricePerSquare*this.squares - compared.pricePerSquare*compared.squares;
        } else {
            return -this.pricePerSquare*this.squares + compared.pricePerSquare*compared.squares;
        }
    }
    
    public boolean moreExpensiveThan (Apartment compared) {
        if ( this.pricePerSquare*this.squares - compared.pricePerSquare*compared.squares >=0 ) {
            return true;
        } else {
            return false;
        }
    }

}
