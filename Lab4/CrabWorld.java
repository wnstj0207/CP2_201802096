import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Crab 1마리 (231, 203) 좌표에 추가
        Crab crab = new Crab();
        addObject(crab, 231, 203);
        // Worm 10마리 랜덤 좌표에 추가
        for(int i=0; i<10; i++){
            addObject(new Worm(), Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));
        }
        // Lobster 3마리 추가
        Lobster lobster01 = new Lobster();
        Lobster lobster02 = new Lobster();
        Lobster lobster03 = new Lobster();
        // 각 좌표는 (334, 65), (481, 481), (79, 270)
        addObject(lobster01, 334, 65);
        addObject(lobster02, 481, 481);
        addObject(lobster03, 79, 270);
        
        // 100을 세고 움직이는 Turtle 추가
        Turtle turtle = new Turtle(100);
        addObject(turtle, Greenfoot.getRandomNumber(561), Greenfoot.getRandomNumber(561));// 좌표는 랜덤
    }
}
