public class Pokedex {
    public static void main(String[] args) {
        Eevee e1 = new Eevee("Normal", 6.5, 30, 55, "Não possui");
        Vaporeon v1 = new Vaporeon();
        Jolteon j1 = new Jolteon();
        Flareon f1 = new Flareon();
        Espeon es1 = new Espeon();
        Umbreon u1 = new Umbreon();
        Leafeon l1 = new Leafeon();
        Glaceon g1 = new Glaceon();
        Sylveon s1 = new Sylveon();

        System.out.println("Eevee");
        e1.Imprimir();
        System.out.println("Ataque: " +e1.ataque());
        System.out.println("Defesa: " +e1.defesa());
        System.out.println("Especial: " +e1.especial());

        System.out.println("\n");

        System.out.println("Vaporeon");
        v1.Imprimir();
        System.out.println("Ataque: " +v1.ataque());
        System.out.println("Defesa: " +v1.defesa());
        System.out.println("Especial: " +v1.especial());

        System.out.println("\n");

        System.out.println("Jolteon");
        j1.Imprimir();
        System.out.println("Ataque: " +j1.ataque());
        System.out.println("Defesa: " +j1.defesa());
        System.out.println("Especial: " +j1.especial());

        System.out.println("\n");

        System.out.println("Flareon");
        f1.Imprimir();
        System.out.println("Ataque: " +f1.ataque());
        System.out.println("Defesa: " +f1.defesa());
        System.out.println("Especial: " +f1.especial());

        System.out.println("\n");

        System.out.println("Espeon");
        es1.Imprimir();
        System.out.println("Ataque: " +es1.ataque());
        System.out.println("Defesa: " +es1.defesa());
        System.out.println("Especial: " +es1.especial());

        System.out.println("\n");

        System.out.println("Umbreon");
        u1.Imprimir();
        System.out.println("Ataque: " +u1.ataque());
        System.out.println("Defesa: " +u1.defesa());
        System.out.println("Especial: " +u1.especial());

        System.out.println("\n");

        System.out.println("Leafeon");
        l1.Imprimir();
        System.out.println("Ataque: " +l1.ataque());
        System.out.println("Defesa: " +l1.defesa());
        System.out.println("Especial: " +l1.especial());

        System.out.println("\n");

        System.out.println("Glaceon");
        g1.Imprimir();
        System.out.println("Ataque: " +g1.ataque());
        System.out.println("Defesa: " +g1.defesa());
        System.out.println("Especial: " +g1.especial());

        System.out.println("\n");

        System.out.println("Sylveon");
        s1.Imprimir();
        System.out.println("Ataque: " +s1.ataque());
        System.out.println("Defesa: " +s1.defesa());
        System.out.println("Especial: " +s1.especial());
    }
}
