public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }
    @Override
    public void visit(Tatooine  tatooine) {
        System.out.println("Planet Tatooine Going back home Mom, you said that the biggest problem in the universe is no one helps each other.” — Anakin Skywalker");
    }

    @Override
    public void visit(Coruscant coruscant) {
        System.out.println("Planet Coruscant Operation: Knightfall through the Jedi beacon.");
    }

    @Override
    public void visit(Bespin bespin) {
        System.out.println("Planet Bespin Operation:The Duel on Cloud City Luke, I am your father.”");
    }

    @Override
    public void visit(Kamino kamino) {
        System.out.println("Planet Kamino Operation:command of the clones.");
    }
}