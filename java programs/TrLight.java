
import java.awt.event.*;

import java.applet.*;

import java.awt.*; 

/*

  <applet code="TrLight" width=250 height=350>

  </applet>

*/

public class TrLight extends Applet implements ItemListener {

  String msg = "";

  Checkbox red,green,yellow;

  CheckboxGroup cbg;

  public void init() {

    cbg = new CheckboxGroup();

    red = new Checkbox("Red", cbg, false);

    green = new Checkbox("Green", cbg, false);

    yellow = new Checkbox("Yellow", cbg, false);

    add(red);

    add(yellow);

    add(green);

    red.addItemListener(this);

    yellow.addItemListener(this);

    green.addItemListener(this);

  }

  public void itemStateChanged(ItemEvent ie) {

    repaint();

  }

  // Display current state of the check boxes.

  public void paint(Graphics g) {

     Color color;

     color=Color.BLACK;

     g.setColor(color);

     g.drawOval(50, 50, 52, 52);

     g.drawOval(50, 103, 52, 52);

     g.drawOval(50, 156, 52, 52);

     String col = cbg.getSelectedCheckbox().getLabel();

     System.out.println(col);

     if(col.equalsIgnoreCase("Green"))

    {

     color= Color.GREEN;

     g.setColor(color);

     g.fillOval(50, 156, 52, 52);

    }

     if(col.equalsIgnoreCase("Red"))

    {

     color=Color.RED;

     g.setColor(color);

     g.fillOval(51, 51, 51, 51);

    }

     if(col.equalsIgnoreCase("Yellow"))

    {

     color=Color.YELLOW;

     g.setColor(color);

     g.fillOval(50, 103, 51, 51);

    }

  }

}