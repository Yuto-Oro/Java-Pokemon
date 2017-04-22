package Principal;

public class Charizard extends Pokemon
{
    public Charizard()
    {
        super("Charizard");
        vida = 600;
        energia = 80;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Body Slam";
        especialAtack = "Fire Blast ";
    }
    
    public int ataqueNormal()
    {
        return 70;
    }
    
    public int ataqueEspecial()
    {
    
        return 110;
    }
}
