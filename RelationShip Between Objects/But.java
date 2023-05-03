//  Creating a push Button and providing action to it
import java.awt.*; // for button
import java.awt.event.*; // for ActionListener

class But extends Frame
{
    But()
    {
        // Create a push button b
        Button b = new Button("OK");
        //  add push button to frame
        add(b);
        // add action listener to Button
        b.addActionListener(new MyClass());
    }
    public static void main(String args[ ])
    {
        // Create a Frame By Creating a But Class Object
        But obj = new But();
        //  Set the size of frame to width: 400 px and height: 300 px
        obj.setSize(400,300);
        //  display the frame
        obj.setVisible(true);
    }
}

//  MyClass should Implement the methods of ActionListener
class MyClass implements ActionListener
{
    //  this method is executed when button is clicked
    public void actionPerformed(ActionEvent ae)
    {
        // exit the application
        System.exit(0);
    }
}
