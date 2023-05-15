public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Tatooine tatooine);

    void visit(Coruscant coruscant);

    void visit(Bespin binespin);

    void visit(Kamino kamino);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}