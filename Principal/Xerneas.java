package Principal;

public class Xerneas extends Pokemon
{
     public Xerneas()
    {
        super("Xerneas");
        vida = 800;
        energia = 120;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Giga Impact";
        especialAtack = "Moonblast";
    }
    
    public int ataqueNormal()
    {
        return 150;
    }
    
    public int ataqueEspecial()
    {
    
        return 95;
    }
}
