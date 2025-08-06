package Tasks;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

 class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        
        if (timeToEat) {
            
            System.out.println("Feeding the gorilla...");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void groom() {
       
        System.out.println("Grooming the gorilla...");
    }

    @Override
    public void pet() {
        
        System.out.println("You pet the gorilla. Be careful!");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
