package Profile;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import Login.Login;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;

public class ChangeName extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField UserField;
	private JLabel gifPic;
	public JLabel UserLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeName frame = new ChangeName();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangeName() {
setTitle("Portal Launcher");
		
		ImageIcon img;
		img= new ImageIcon("Images/portal.gif");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 33));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserField = new JTextField();
		UserField.setFont(new Font("Tahoma", Font.BOLD, 18));
		UserField.setForeground(new Color(255, 255, 255));
		UserField.setBackground(new Color(27, 40, 56));
		UserField.setBounds(41, 121, 331, 44);
		contentPane.add(UserField);
		UserField.setColumns(10);
		
		JLabel PortalLabel = new JLabel("Portal Launcher");
		PortalLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		PortalLabel.setForeground(new Color(255, 255, 255));
		PortalLabel.setBounds(83, 16, 231, 53);
		contentPane.add(PortalLabel);
		
		gifPic = new JLabel(img);
		gifPic.setBounds(20, 16, 53, 53);
		contentPane.add(gifPic);
		
		UserLabel = new JLabel("Username:");
		UserLabel.setForeground(new Color(199, 213, 224));
		UserLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		UserLabel.setBounds(41, 98, 74, 22);
		contentPane.add(UserLabel);
		
		JButton ChangeNamebtn = new JButton("Change Name");
		ChangeNamebtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String newName=UserField.getText();
				String url= "jdbc:mysql://localhost:3306/pLauncher";
				String users = "root";
				String passw = "";
				try {
					Connection connection = DriverManager.getConnection(url,users,passw);
					String us = Login.u;
					String query = "UPDATE `users` SET `username`='"+newName+"' WHERE username='"+us+"';";
					
				java.sql.Statement sta= connection.createStatement();
				int x = sta.executeUpdate(query);
				if(x==0) {
					JOptionPane.showMessageDialog(ChangeNamebtn, "This already exists");
				}
				else {
					JOptionPane.showMessageDialog(ChangeNamebtn, "Your username has been changed, restart the app to apply changes");
					dispose();
				}
				connection.close();
				
				} catch (Exception exception) {
				exception.printStackTrace();
				}
				}});
		
		ChangeNamebtn.setForeground(new Color(255, 255, 255));
		ChangeNamebtn.setBackground(new Color(102, 192, 244));
		ChangeNamebtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		ChangeNamebtn.setBounds(104, 191, 189, 44);
		contentPane.add(ChangeNamebtn);
		
		JPanel Shade = new JPanel();
		Shade.setBackground(new Color(45, 67, 94));
		Shade.setBounds(0, 0, 408, 84);
		contentPane.add(Shade);
		
	}
}
