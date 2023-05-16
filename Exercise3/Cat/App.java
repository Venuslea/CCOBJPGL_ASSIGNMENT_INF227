public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("Garfield eyes are " + myPet.eyeColor +".");
        System.out.println("Garfield is fat he " + myPet.weight + " and stands " + myPet.height +" tall.");     
        System.out.println("Garfield Have" + myPet.characteristic +".");

    }
}