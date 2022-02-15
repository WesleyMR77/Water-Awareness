    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    public class NadadorProfissional extends Actor
    {
        private int cont = 0;
        private int cont2 = 0;

        NadadorProfissional(){
            GreenfootImage nadador = getImage();
            nadador.scale(45, 75);
            setRotation(270);
        }
        
        public void act() {
        
             if(Greenfoot.isKeyDown("D") | Greenfoot.isKeyDown("right")){
                setRotation(0);
                move(3);
            }
            else if(Greenfoot.isKeyDown("A") | Greenfoot.isKeyDown("left")){
                setRotation(180);
                move(3);
            }        
            else if(Greenfoot.isKeyDown("W") | Greenfoot.isKeyDown("up")){
                setRotation(270);
                move(3);
            }
            else if(Greenfoot.isKeyDown("S") | Greenfoot.isKeyDown("down")){
                setRotation(90);
                move(3);
            }
            if(getY() <= 90){
                move(-3);
            }
             
            if(getOneIntersectingObject(Lixo.class) != null){
               if(getY() >=  160 ){
                 ((Lixo) getOneIntersectingObject(Lixo .class)).setLocation(getX(), getY());
              getWorld().showText("", getWorld().getWidth()/2, getWorld().getHeight()/2);
                 if(getOneIntersectingObject(Barco.class) != null){   
                     int xb = ((Barco) getOneIntersectingObject(Barco .class)).getX();
                     int yb = ((Barco) getOneIntersectingObject(Barco .class)).getY();  
                     int r = Greenfoot.getRandomNumber(70);
                     ((Lixo) getOneIntersectingObject(Lixo .class)).setLocation(xb + r, yb);
                     cont +=1;    
                     getWorld().showText("Lixos pegos: " + cont, 70, 30); 
                     Greenfoot.playSound("tick.mp3");
                     if(cont >= 10 ){
                         getWorld().showText("Parabéns você salvou a vida aquática, vamos para o Oceano Atlantico", getWorld().getWidth()/2, getWorld().getHeight()/2);
                         Greenfoot.delay(180);
                         Atlantico atlantico = new Atlantico();
                         Greenfoot.setWorld(atlantico);
                        }
                    }           
                } 
                    if(getOneIntersectingObject(Peixe.class) != null)
                getWorld().showText("Não posso colocar o lixo perto do Peixe", getWorld().getWidth()/2, getWorld().getHeight()/2); 
            }
            if(getOneIntersectingObject(Lixeira.class) != null){
                Greenfoot.playSound("tick.mp3");
                cont2 +=1;
                getWorld().showText("Lixos: " + cont2, 70, 30);
                getWorld().removeObject(getOneIntersectingObject(Lixeira.class));
                
                if(cont2>= 110){
                getWorld().showText("PARABÉNS VOCÊ SE MOSTROU UMA PESSOA QUE CUIDA DOS OCEANOS", getWorld().getWidth()/2, getWorld().getHeight()/2); 
                Greenfoot.stop();
                }
            
            }
            
        }    
}
