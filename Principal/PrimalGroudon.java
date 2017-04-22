package Principal;

public class PrimalGroudon extends Pokemon
{
     public PrimalGroudon()
    {
        super("Primal Groudon");
        vida = 1600;
        energia = 200;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Hammer Arm";
        especialAtack = "Precipice Blades";
    }
    
    public int ataqueNormal()
    {
        return 100;
    }
    
    public int ataqueEspecial()
    {
    
        return 110;
    }
}
