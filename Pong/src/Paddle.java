import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
    int id;
    int yVelocity;
    
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }
    public void KeyPressed(KeyEvent e){
            
    }
    public void KeyReleased(KeyEvent e){
            
    }
    public void setYDirection(int yDirection){

    }
    public void move(){
        
    }
    public void draw(Graphics g){
        if(id==1)
            g.setColor(Color.white);
        else
            g.setColor(Color.white);
        g.fillRect(x, y, width, height);
    }
}