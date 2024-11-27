public class Pokedex {
    public static void main(String[] args) {
        Eevee e = new Eevee("Normal", 6.5, 30, 55, "Não possui");
        Vaporeon v = new Vaporeon();
        Jolteon j = new Jolteon();
        Flareon f = new Flareon();
        Espeon es = new Espeon();
        Umbreon u = new Umbreon();
        Leafeon l = new Leafeon();
        Glaceon g = new Glaceon();
        Sylveon s = new Sylveon();

        System.out.println("Eevee");
        e.Imprimir();
        System.out.println("Ataque: " +e.ataque());
        System.out.println("Defesa: " +e.defesa());
        System.out.println("Especial: " +e.especial());

        System.out.println("\n");

        System.out.println("Vaporeon");
        v.Imprimir();
        System.out.println("Ataque: " +v.ataque());
        System.out.println("Defesa: " +v.defesa());
        System.out.println("Especial: " +v.especial());

        System.out.println("\n");

        System.out.println("Jolteon");
        j.Imprimir();
        System.out.println("Ataque: " +j.ataque());
        System.out.println("Defesa: " +j.defesa());
        System.out.println("Especial: " +j.especial());

        System.out.println("\n");

        System.out.println("Flareon");
        f.Imprimir();
        System.out.println("Ataque: " +f.ataque());
        System.out.println("Defesa: " +f.defesa());
        System.out.println("Especial: " +f.especial());

        System.out.println("\n");

        System.out.println("Espeon");
        es.Imprimir();
        System.out.println("Ataque: " +es.ataque());
        System.out.println("Defesa: " +es.defesa());
        System.out.println("Especial: " +es.especial());

        System.out.println("\n");

        System.out.println("Umbreon");
        u.Imprimir();
        System.out.println("Ataque: " +u.ataque());
        System.out.println("Defesa: " +u.defesa());
        System.out.println("Especial: " +u.especial());

        System.out.println("\n");

        System.out.println("Leafeon");
        l.Imprimir();
        System.out.println("Ataque: " +l.ataque());
        System.out.println("Defesa: " +l.defesa());
        System.out.println("Especial: " +l.especial());

        System.out.println("\n");

        System.out.println("Glaceon");
        g.Imprimir();
        System.out.println("Ataque: " +g.ataque());
        System.out.println("Defesa: " +g.defesa());
        System.out.println("Especial: " +g.especial());

        System.out.println("\n");

        System.out.println("Sylveon");
        s.Imprimir();
        System.out.println("Ataque: " +s.ataque());
        System.out.println("Defesa: " +s.defesa());
        System.out.println("Especial: " +s.especial());
    }
}
