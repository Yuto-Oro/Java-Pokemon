package Principal;

public class Giratina extends Pokemon
{
    public Giratina()
    {
        super("Giratina");
        vida = 2000;
        energia = 250;
        hPotions = 3;
        mPotions = 2;
        normalAtack = "Shadow Claw";
        especialAtack = "Shadow Force";
    }
    
    public int ataqueNormal()
    {
        return 70;
    }
    
    public int ataqueEspecial()
    {
    
        return 120;
    }
}
