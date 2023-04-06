import javax.swing.*;
import java.awt.*;

public class RubiksCube extends JFrame {

  public RubiksCube() {
    setTitle("Rubik's Cube");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.BLUE);
    g.fillRect(50, 50, 50, 50);
    g.setColor(Color.RED);
    g.fillRect(100, 50, 50, 50);
    g.setColor(Color.YELLOW);
    g.fillRect(150, 50, 50, 50);
    g.setColor(Color.ORANGE);
    g.fillRect(200, 50, 50, 50);
    g.setColor(Color.GREEN);
    g.fillRect(250, 50, 50, 50);
    g.setColor(Color.WHITE);
    g.fillRect(300, 50, 50, 50);
  }

  public static void main(String[] args) {
    new RubiksCube();
  }
}
