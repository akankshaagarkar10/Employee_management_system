
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    Splash()
    {
        getContentPane().setBackground(Color.white); //getContentPane allows you to take access of complete frame
        
        JLabel heading=new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        
        setLayout(null);
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("Times New Roman", Font.PLAIN,60));
        heading.setForeground(Color.RED);
        
        add(heading);
        
        //we cannot directly add image so we have to convert image icon to image and then back to image icon
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170,650);
        setLocation(200,50);
        setVisible(true);
        
        
        //for flashing heading
//        while(true)
//        {
//            heading.setVisible(false);
//            try
//            {
//                Thread.sleep(500);
//            }
//            catch(Exception e)
//            {
//                
//            }
//            
//            heading.setVisible(true);
//            try
//            {
//                Thread.sleep(500);
//            }
//            catch(Exception e)
//            {
//                
//            }
//        }
        
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);//close the current frame
        new Login();//open the login frame
    }
    public static void main(String args[])
    {
        new Splash();
    }
}
