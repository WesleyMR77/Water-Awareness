import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Golfinho extends Actor
{
    
    public void act() 
    {
        move(1);
        int n = Greenfoot.getRandomNumber(400) + 1;
        if(getX() >= 750){
            setRotation(180);
            move(n);
        }
        if(getX() <= 20){
            setRotation(0);
            move(n);
        }
    }    
}
