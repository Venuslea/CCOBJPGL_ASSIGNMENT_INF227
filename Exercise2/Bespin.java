public class Bespin implements Planet{
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }   
}
