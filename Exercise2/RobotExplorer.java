public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }
    @Override
    public void visit(Tatooine  tatooine) {
        System.out.println("Planet Tatooine instructions Building C-3PO  ");
    }
    @Override
    public void visit(Coruscant coruscant) {
        System.out.println("Planet Coruscant Radar instructions Building to find R2-D2");
    }

    @Override
    public void visit(Bespin bespin) {
        System.out.println("Planet Bespin Retriving data from C-3PO BODY");
    }

    @Override
    public void visit(Kamino kamino) {
        System.out.println("Planet Kamino Scanning Planet");
    }
}