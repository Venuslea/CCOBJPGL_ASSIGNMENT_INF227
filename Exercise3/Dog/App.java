public class App {
    public static void main(String[] args) throws Exception {

      
        Pugese myPet = new Pugese();

        myPet.bark();
        System.out.println("My Pugese Eye Like Boba Pearls " + myPet.eyeColor +".");
        System.out.println("My Pugese is as big as " + myPet.weight + " and stands " + myPet.height +" tall.");
        System.out.println("My Pugese is " + myPet.characteristic +" pet.");

    }
}