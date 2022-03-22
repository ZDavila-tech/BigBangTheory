import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class GUI extends Game{
    Game game = new Game();
    static JFrame frame1;
    static JPanel p1,p2;
    static JButton button1 = new JButton("Attack");
    static JButton button2 = new JButton("Play Again");
    static JButton button3 = new JButton("Quit");
    static JPanel container = new JPanel();
    static JLabel label1;
    static JTextField user_weapon;
    static String image, image2;
    static Icon icon1 = new ImageIcon(image);
    static Icon icon2 = new ImageIcon(image2);

    
    public static void main(String args[]){
        createFrame();
        createPanel();
    }

    //create the main frame of game
    static void createFrame(){
        frame1 = new JFrame("Rock, Paper, Scissors, Lizard, Spock");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(800, 800);
        frame1.add(container);
        frame1.setVisible(true);
    }

    //create Panels for game
    static void createPanel(){
        p1 = new JPanel();
        p2 = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(p1);
        container.add(p2);
        label1 = new JLabel("Choose your weapon: Rock Paper Scissors Lizard Spock");
        user_weapon = new JTextField(10);
        user_weapon.setFont(user_weapon.getFont().deriveFont(Font.BOLD, 12f));

         //Function for Attack Button
         button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(final ActionEvent e){
                button1 = (JButton)e.getSource();
            }
        });
        
        //Function for Play Again Button
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(final ActionEvent e){
                button2 = (JButton)e.getSource();
            }
        });

        //Function for Quit Button
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(final ActionEvent e){
                button3 = (JButton)e.getSource();
                frame1.dispose();
                
            }
        });
        p1.add(label1);
        p1.add(user_weapon);
        p1.add(button1);
        p2.add(button2);
        p2.add(button3);

    }

    static void chooseImage(){
        switch(Game.user_action){
            case "Rock":
                image = "";
            break;
            case "Paper":
            image = "";
            break;
            case "Scissors":
            image = "";
            break;
            case "Lizard":
            image = "";
            break;
            case "Spock":
            image = "";
            break;
        }
        switch(Game.computer_actions){
            case "Rock":
            image2 = "";
            break;
            case "Paper":
            image2 = "";
            break;
            case "Scissors":
            image2 = "";
            break;
            case "Lizard":
            image2 = "";
            break;
            case "Spock":
            image2 = "";
            break;
        }
    }
       
    
}
