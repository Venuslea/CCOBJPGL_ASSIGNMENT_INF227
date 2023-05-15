public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet tatooine = new Tatooine();
        Planet coruscant = new Coruscant();
        Planet bespin = new Bespin();
        Planet kamino = new Kamino();


        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        tatooine.accept(astronaut);
        coruscant.accept(astronaut);
        bespin.accept(astronaut);
        kamino.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        tatooine.accept(rover);
        coruscant.accept(rover);
        bespin.accept(rover);
        kamino.accept(rover);
    }
}