public class Coruscant implements Planet{
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
    
}
