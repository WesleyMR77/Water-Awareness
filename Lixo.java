import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lixo extends Actor
{
    public Lixo(){

        int numero = Greenfoot.getRandomNumber(3) + 1;
        setImage(numero + ".png");  
        GreenfootImage nadador = getImage();
        nadador.scale(70, 70);
    }
    
    public void act() 
    {
        
    }    
}
