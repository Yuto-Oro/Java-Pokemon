package Principal;

public class Pikachu extends Pokemon
{

    public Pikachu()
    {
        super("Pikachu");
        vida = 400;
        energia = 130;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Gruñido Growl";
        especialAtack = "Impactrueno ";
    }
    
    public int ataqueNormal()
    {
        return 40;
    }
    
    public int ataqueEspecial()
    {
        return 150;
    }
}
