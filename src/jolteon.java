public class Jolteon extends Eevee {
    public Jolteon(){
        super("Elétrico", 24.5, 80, 130, "Evolução de Eevee");
    }

    @Override
    public String ataque(){
        return "Trovoada - Thunder Shock";
    }  
    
    @Override
    public String defesa(){
        return "Carga - Wild Charge";
    } 

    @Override
    public String especial(){
        return "Raio - Thunderbolt";
    } 
}
