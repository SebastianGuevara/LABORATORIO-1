import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.detectWallCollision();
        this.detectBlockCollision();
        this.playerMovement();
        this.detectHome();
        this.eatPizza();
    }
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            setLocation(48, 50);
            Greenfoot.playSound("hurt.mp3");
        }
    }
    public void playerMovement()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+2,getY());
        }
    }
    public void detectHome()
    {
        if(isTouching(Home.class))
        {
            Greenfoot.playSound("yipee.mp3");
        }
    }
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.mp3");
            removeTouching(Pizza.class);
        }
    }


}
