package Principal;

public class Persona
{
    public String nickname = "";
    public int nivel = 1;
    public double experiencia = 0.0;
    public int batallasGanadas = 0;
    public int batallasPerdidas = 0;
    
    public Persona(){}
    
    public Persona(String nickname, int nivel, double experiencia, int batallasGanadas, int batallasPerdidas)
    {
    this.nickname = nickname;
    this.nivel = nivel;
    this.experiencia = experiencia;
    this.batallasGanadas = batallasGanadas;
    this.batallasPerdidas = batallasPerdidas;
    }
    
}
