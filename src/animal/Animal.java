package animal;

public interface Animal {
    public abstract void manincaFructe();

    public abstract void manincaIarba();

    public default void auBlana() {
        System.out.println("Au blana");
    }
      public static void beauApa() {
       System.out.println("Beau apa");
      }
}
