import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Win /*extends JFrame*/ {
  
  /*private*/ JFrame WinWin;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Win window = new Win();
          window.WinWin.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  
  public Win() {  
    initialize();
  }
  
  private void initialize() {
    WinWin = new JFrame();
//  contentPane.getContentPane().setForeground(SystemColor.windowBorder);
    WinWin.setTitle("WIN");
    WinWin.setBounds(100, 100,520, 425); //(х,у,ширина, высота)
    WinWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    WinWin.getContentPane().setLayout(null);
    
    JButton btnNewButton = new JButton("Вернуться в главное меню");
        btnNewButton.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      WinWin.setVisible(false);
        WinWin.dispose();
      new InterFaZe();
     }
    });
    btnNewButton.setBounds(25, 285, 220,40);
    btnNewButton.setBackground(SystemColor.activeCaption);
    btnNewButton.setForeground(Color.DARK_GRAY);
    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));//шрифт
    btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
       WinWin.getContentPane().add(btnNewButton);
    /*   btnNewButton.setLayout(new BorderLayout());
     JLabel label1 = new JLabel("Ваше");
     JLabel label2 = new JLabel("�мя");
     
     btnNewButton.add(BorderLayout.NORTH,label1);
     btnNewButton.add(BorderLayout.SOUTH,label2);     */
 
          JButton btnNewButton_1 = new JButton("Сохранить результат");
             btnNewButton_1.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      WinWin.setVisible(false);
        WinWin.dispose();
      new Ratings();
     }
    }); 
    btnNewButton_1.setBounds(260, 285, 220,40);
    btnNewButton_1.setBackground(SystemColor.activeCaption);
    btnNewButton_1.setForeground(Color.DARK_GRAY);
    btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));//шрифт
    btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
       WinWin.getContentPane().add(btnNewButton_1);
    
    JLabel lblNewLabel = new JLabel("ПОБЕДА!");
    lblNewLabel.setBackground(SystemColor.menu);
    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(200, 20, 132, 47);
    WinWin.getContentPane().add(lblNewLabel); 
    
    JLabel lblNewLabel_1 = new JLabel("Ваше время:!");
    lblNewLabel_1.setBackground(SystemColor.menu);
    lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_1.setBounds(180, 60, 145, 47);
    WinWin.getContentPane().add(lblNewLabel_1); 

    JTextField textField = new JTextField("Введите NikName", 20);
 textField.setCaretColor(Color.RED);//курсор
 textField.setHorizontalAlignment(JTextField.CENTER);
 textField.setBackground(SystemColor.BLUE);
 textField.setForeground(Color.BLACK);
  textField.setFont(new Font("Tahoma", Font.PLAIN, 15));//шрифт
 textField.setBounds(180, 130, 150, 47);
 WinWin.getContentPane().add(textField, BorderLayout.NORTH);
   }
 }
