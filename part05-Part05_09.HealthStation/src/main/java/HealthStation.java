
public class HealthStation {    
    private int count = 0;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count++;
        return person.getWeight();
    }
    public void feed(Person person) {
        int newweight = person.getWeight() +1;
        person.setWeight(newweight);
        
    }
    public int weighings() {
        return this.count;
    }

}
