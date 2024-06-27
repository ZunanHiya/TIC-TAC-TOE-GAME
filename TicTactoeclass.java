
package tictactoe;
import java.awt.*; 
import java.util.*; 
import java.awt.event.*;  
import javax.swing.*;
public class TicTactoeclass implements ActionListener{ 
    Main main = new Main(); 
    JFrame frame = new JFrame(); 
    JPanel title_panel = new JPanel(); 
    JPanel button_panel = new JPanel(); 
    JLabel textfield = new JLabel(); 
    JButton[] buttons = new JButton[9];  
    boolean player1_turn;
    
 TicTactoeclass(){  
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     frame.setSize(800,800); 
     frame.getContentPane().setBackground(Color.WHITE);   
     frame.setLayout(new BorderLayout()); 
     frame.setVisible(true); 
      
     textfield.setBackground(Color.CYAN); 
     textfield.setForeground(Color.DARK_GRAY); 
     textfield.setFont(new Font("Ink Free",Font.BOLD,75)); 
     textfield.setHorizontalAlignment(JLabel.CENTER);
     textfield.setText("TIC-TAC-TOE"); 
     textfield.setOpaque(true);
       
      
     title_panel.setLayout(new BorderLayout()); 
     title_panel.setBounds(0,0,800,100);
     title_panel.add(textfield);  
     frame.add(title_panel,BorderLayout.NORTH); 
     button_panel.setLayout(new GridLayout(3,3)); 
     title_panel.setBackground(new Color(150,150,150)); 
     for(int i=0; i<9; i++){ 
        buttons[i] = new JButton();    
        button_panel.add(buttons[i]);
        buttons[i].setFont(new Font("MV Boli",Font.BOLD,120)); 
        buttons[i].setFocusable(false);
        buttons[i].addActionListener(this);
        
     }
     title_panel.add(textfield);  
     frame.add(title_panel,BorderLayout.NORTH);
     frame.add(button_panel);
      
    firstTurn();
     
 }
     @Override
     public void actionPerformed(ActionEvent e){ 
     for(int i=0;i<9;i++){ 
         if(e.getSource()==buttons[i]){ 
           if(player1_turn){ 
               if(buttons[i].getText()==""){ 
                   buttons[i].setForeground(Color.red); 
                   buttons[i].setText("X"); 
                   player1_turn = false; 
                   textfield.setText("0 turn");  
                   check();
               }
           }  
           else{ 
                if(buttons[i].getText()==""){ 
                   buttons[i].setForeground(Color.BLUE); 
                   buttons[i].setText("0"); 
                   player1_turn = true; 
                   textfield.setText("X turn");  
                   check();
           }
         }
     }
 }  
     }
      

 public void firstTurn(){   
     try{
     Thread.sleep(2000); 
     } 
     catch(InterruptedException e){ 
         e.printStackTrace();
     }
     if(random.nextInt(2)==0){ 
         player1_turn = true; 
         textfield.setText("X turn"); 
     
     } 
     else{ 
        player1_turn = false; 
        textfield.setText("0 turn"); 
         
     }
         
         
         

}  
 public void check(){  
  if((buttons[0].getText()=="X") &&  
          (buttons[1].getText()=="X") && 
            (buttons[2].getText()=="X") 
      
          )        
  { 
      xWins(0,1,2);
   
  } 
    if((buttons[3].getText()=="X") &&  
          (buttons[4].getText()=="X") && 
            (buttons[5].getText()=="X") 
      
          )        
  { 
      xWins(3,4,5);
   
  } 
      if((buttons[6].getText()=="X") &&  
          (buttons[7].getText()=="X") && 
            (buttons[8].getText()=="X") 
      
          )        
  { 
      xWins(6,7,8);
   
  }
          
     
 } 
 public void xWins(int a , int b, int c){ 
     
 } 
 public void oWins(int a , int b, int c){ 
      
 }
}
 

