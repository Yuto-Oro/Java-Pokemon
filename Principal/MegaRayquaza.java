package Principal;

public class MegaRayquaza extends Pokemon
{
    public MegaRayquaza()
    {
        super("Mega-Rayquaza");
        vida = 2000;
        energia = 250;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Extreme Speed";
        especialAtack = "Dragon Ascent";
    }
    
    public int ataqueNormal()
    {
        return 80;
    }
    
    public int ataqueEspecial()
    {
    
        return 120;
    }
}
