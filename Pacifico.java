import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pacifico extends World
{
    //GreenfootSound backgroundMusic = new GreenfootSound("fundo.mp3");
    public Pacifico()
    {    
        super(800, 430, 1); 
        
        addObject(new Barco(), 688, 76);      
        addObject(new NadadorProfissional(), 614, 93);
        addObject(new Tartaruga(), 33, 215);
        //backgroundMusic.playLoop();
        int x = 0;

        for(int i=0; i<5; i++){
            addObject(new Peixe(), 97+x, 108 );
            x+=100;
        }
        for(int i=0; i<5; i++){
            addObject(new Lixo(), Greenfoot.getRandomNumber(800),400 );
        }
        for(int i=0; i<5; i++){
            addObject(new Lixo(), Greenfoot.getRandomNumber(800),320 );
        }
    }
}
