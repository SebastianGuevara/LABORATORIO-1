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
        movement();
        colliders();
    }
    public void movement()
    {
        if(Greenfoot.isKeyDown("Up"))
        {
            setLocation(getX(),getY()- 2);
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            setLocation(getX()+2,getY());
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            setLocation(getX(),getY()+2);
        }
    }
    public void colliders()
    {
        if(isTouching(Wall.class))
        {
            setLocation(getX(),getY()-2);
        }
        if(isTouching(Block.class))
        {
            
        }
    }
}
