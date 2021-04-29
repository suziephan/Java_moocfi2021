
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrenHospital = new HealthStation();
        Person ethan = new Person("Ethan",1,119,7);
        Person peter = new Person("Peter", 33,176,85);
        
        
        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        childrenHospital.feed(ethan);
        
        System.out.println(" ");
        
        
        
        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(peter);

        System.out.println("weighings performed: " + childrenHospital.weighings());

        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);
        childrenHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrenHospital.weighings());
        
    }
}
