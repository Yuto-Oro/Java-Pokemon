package Principal;

public class Talonflame extends Pokemon 
{
     public Talonflame()
    {
        super("Talonflame");
        vida = 600;
        energia = 80;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Brave Bird";
        especialAtack = "Fire Blitz";
    }
    
    public int ataqueNormal()
    {
        return 120;
    }
    
    public int ataqueEspecial()
    {
    
        return 120;
    }
}
