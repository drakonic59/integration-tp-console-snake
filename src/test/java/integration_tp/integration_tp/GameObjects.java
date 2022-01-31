package integration_tp.integration_tp;

import junit.framework.TestCase;

public class GameObjects 
    extends TestCase
{
   
    public GameObjects( String testName )
    {
        super( testName );
    }

    public void createSnake()
    {
    	Main.initScreen();
    	 
    	Snake snake = new Snake('X', 5, 5);
    	
    	Main.screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    	
        assertTrue( Main.screen.getObjectOnLocation(snake.getX(), snake.getY()) == snake.getSymbol() );
    }
    
    public void createWall()
    {
    	Main.initScreen();
    	
    	Food food = new Food('h');
    	food.setX(5);
    	food.setY(5);
    	
    	Main.screen.setObjectOnLocation(food, food.getX(), food.getY());
    	
        assertTrue( Main.screen.getObjectOnLocation(food.getX(), food.getY()) == food.getSymbol() );
    }
    
    public void CreateWall()
    {
    	Main.initScreen();
    	
    	Wall wall = new Wall();
    	wall.setX(5);
    	wall.setY(5);
    	
    	Main.screen.setObjectOnLocation(wall, wall.getX(), wall.getY());
    	
        assertTrue( Main.screen.getObjectOnLocation(wall.getX(), wall.getY()) == wall.getSymbol() );
    }
}
