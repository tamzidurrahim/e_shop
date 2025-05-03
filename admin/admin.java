import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class admin extends JFrame implements ActionListener
{
   ImageIcon img,title1;
   JLabel userLabel,passLabel,imgLabel,title,forget,newacc;
   JTextField userTF;
   JButton loginBtn,exitBtn,forgetbtn;
   JPanel panel;
   Color mycolor,c2;
   Font myFont;
   JPasswordField passPF;
   
  public admin()
   {
    super("E-SUPERMARKET");
    this.setSize(900,600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mycolor=new Color(getDefaultCloseOperation());
    myFont = new Font("Cambria", Font.PLAIN, 18);
	Font tf= new Font("Cambria", Font.PLAIN, 25);
	c2=new Color(23,122,128);
        
		 panel = new JPanel();
	     panel.setLayout(null);
		 panel.setBackground(c2);
		 
		 userLabel = new JLabel("Admin Name : ");
		userLabel.setBounds(515, 150, 110, 30);
		userLabel.setForeground(Color.BLACK);
		userLabel.setFont(myFont);
		panel.add(userLabel);


        userTF = new JTextField();
		userTF.setBounds(510, 180, 300, 40);
		userTF.setBackground(Color.WHITE);
		panel.add(userTF);
		
		title=new JLabel("ADMIN");
	    title.setBounds(615,50,300,40);
		title.setBackground(Color.WHITE);
		title.setFont(tf);
		panel.add(title);
		
		 passLabel = new JLabel("Password : ");
		passLabel.setBounds(515, 240, 100, 40);
		passLabel.setBackground(Color.WHITE);
		passLabel.setFont(myFont);
		panel.add(passLabel);


        passPF = new JPasswordField();
		passPF.setBounds(510, 270, 300, 40);
		passPF.setEchoChar('*');
		panel.add(passPF);

		
		
		//forgetbtn=new JButton("Forget password");
		//forgetbtn.setBounds(665,320,135,17);
		//forgetbtn.addActionListener(this);
		//forgetbtn.setBackground(c2);
		//panel.add(forgetbtn);
		
		
		
		this.add(panel);
   }
   public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==forgetbtn)
		{
			admin b1=new admin();
            b1.setVisible(true);
            this.setVisible(false);
		}
			
	}
} 
		




