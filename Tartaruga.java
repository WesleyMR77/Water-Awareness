import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tartaruga extends Actor
{
    Tartaruga(){
        
    }
    
    public void act() 
    {
    move(1);      
    
    if(getX() > 790){
        setRotation(90);
        move(30);
        setRotation(180);
    }
    if(getX() < 20){
        setRotation(90);
        move(30);
        setRotation(0);
    }
    if(getOneIntersectingObject(Lixo.class) != null | getX() > 766 & getY()>390){
        Greenfoot.playSound("GameOver.mp3");
        getWorld().showText("VOCÊ PODERIA TER SALVO A VIDA MARINHA, MAS DEIXOU LIXO NA ÁGUA", getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    }    
}
