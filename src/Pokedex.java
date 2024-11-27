public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e1 = new Eevee();
        jolteon j1 = new jolteon();

        System.out.println("Ataque: " +e1.ataque());
        System.out.println("Defesa: " +e1.defesa());
        System.out.println("Especial: " +e1.especial());

        System.out.println("\n");

        System.out.println("Ataque: " +j1.ataque());
        System.out.println("Defesa: " +j1.defesa());
        System.out.println("Especial: " +j1.especial());
    }
}
