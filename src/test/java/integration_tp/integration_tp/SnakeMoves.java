package integration_tp.integration_tp;

import junit.framework.TestCase;

public class SnakeMoves
    extends TestCase
{
   
    public SnakeMoves( String testName )
    {
        super( testName );
    }

    public void MoveRightSnake()
    {
    	Main.initScreen();
    	
    	Snake snake = new Snake('X', 5, 5);
    	Main.screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    	
    	snake.moveRight(Main.screen, snake);
    	
        assertTrue( Main.screen.getObjectOnLocation(snake.getX()+1, snake.getY()) == snake.getSymbol() );
    }
    
    public void MoveLeftSnake()
    {
    	Main.initScreen();
    	
    	Snake snake = new Snake('X', 5, 5);
    	Main.screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    	
    	snake.moveLeft(Main.screen, snake);
    	
        assertTrue( Main.screen.getObjectOnLocation(snake.getX()-1, snake.getY()) == snake.getSymbol() );
    }
    
    public void MoveUpSnake()
    {
    	Main.initScreen();
    	
    	Snake snake = new Snake('X', 5, 5);
    	Main.screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    	
    	snake.moveUp(Main.screen, snake);
    	
        assertTrue( Main.screen.getObjectOnLocation(snake.getX(), snake.getY()-1) == snake.getSymbol() );
    }

    public void MoveDownSnake()
    {
    	Main.initScreen();
    	
    	Snake snake = new Snake('X', 5, 5);
    	Main.screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
    	
    	snake.moveDown(Main.screen, snake);
    	
        assertTrue( Main.screen.getObjectOnLocation(snake.getX(), snake.getY()+1) == snake.getSymbol() );
    }
}
