package animal;

public class Elefant extends Erbivor implements Animal {
    @Override
    public void manincaFructe() {
        System.out.println("Elefantul maninca fructe");
    }

    @Override
    public void manincaIarba() {
        System.out.println("Elefantul maninca Iarba");

    }

    @Override
    public void auBlana() {
        Animal.super.auBlana();
    }
     @Override
    public void manincaFrunze() {
        System.out.println("Elefantul maninca Frunze");
}
}
