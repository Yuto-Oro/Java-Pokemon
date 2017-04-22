package Principal;

public class Mewtwo extends Pokemon
{
    public Mewtwo()
    {
        super("Mewtwo");
        vida = 320;
        energia = 100;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Psycho Cut";
        especialAtack = "PsyStrike";
    }
    
    public int ataqueNormal()
    {
        return 90;
    }
    
    public int ataqueEspecial()
    {
    
        return 100;
    }
}
