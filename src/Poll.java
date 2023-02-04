/* 
 *  Implements a program with a pie chart
 *  that shows interactive polling results for candidates
 */

import java.awt.*;
import javax.swing.*;

public class Poll extends JFrame
{
  public Poll()
  {
    super("Cast Your Vote");

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    PollDisplayPanel chart = new PollDisplayPanel("Ana", "Bob", "Carl", "Desi", "Elle");
    PollControlPanel controls = new PollControlPanel(chart);
    c.add(chart, BorderLayout.CENTER);
    c.add(controls, BorderLayout.SOUTH);
  }

  public static void main(String[] args)
  {
    Poll w = new Poll();
    w.setBounds(300, 300, 400, 400);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

