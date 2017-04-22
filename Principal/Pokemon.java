package Principal;

import javax.swing.JOptionPane;

public abstract class Pokemon
{
    public String nombre = "";
    public int vida;
    public int energia;
    public int hPotions;
    public int mPotions;
    public String normalAtack ;
    public String especialAtack;
    public Pokemon(){}
    public Pokemon(String pokemon)
    {
        this.nombre = pokemon;
    }
    
    public abstract int ataqueNormal();
    
    public abstract int ataqueEspecial();
    
    public int usarHP()
    {
        return 100;
    }
    
    public int usarMP()
    {
        return 100;
    }
}
