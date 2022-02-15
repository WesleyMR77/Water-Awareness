import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Lixeira extends Actor
{
    private int velocidade;
    
    public Lixeira(){
        int n = Greenfoot.getRandomNumber(4) + 1;
        setImage("lixo" + n + ".png");
        GreenfootImage lixeira = getImage();
        lixeira.scale(70, 70);
        setRotation(90);
    }
        
    public void act() 
    {
        if(getOneIntersectingObject(Golfinho.class) != null){
            getWorld().showText("VOCÊ NÃO CONSEGUIU SALVAR O GOLFINHO", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("GameOver.mp3");
            Greenfoot.stop();
        }        

        move(2);
        if(isAtEdge())
            getWorld().removeObject(this);      
        
    }    
    
}
