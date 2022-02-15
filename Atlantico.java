import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Atlantico extends World
{
    //GreenfootSound backgroundMusic = new GreenfootSound("fundo.mp3");

    public Atlantico()
    {           
        super(800, 400, 1); 
        int x = 0;
        //backgroundMusic.playLoop();
        
        addObject(new NadadorProfissional(), getWidth()/2,  377);
        
        for(int i = 0; i < 1; i++){
            addObject(new Golfinho(), 50+x, 360);
            x += 300;
    }
    
    }
        public void act(){
        int random = Greenfoot.getRandomNumber(50000);
        
        if(random >= 25 && random <= 800){
            addObject(new Lixeira(), random, 5);
            
            if(getObjects(Lixeira.class).size() == 0)
                addObject(new Lixeira(), random, 5);
        }
    }
   
    
}
