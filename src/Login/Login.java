package Login;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Store.Store;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField UserField;
	private JLabel gifPic;
	public JLabel UsernameLabel;
	private JLabel PasswordLabel;
	private JPasswordField PasswordField;
	private JLabel NoAccLabel;
	public static String u;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Portal Launcher");
		
		ImageIcon img;
		img= new ImageIcon("images/portal.gif");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(23, 26, 33));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserField = new JTextField();
		UserField.setFont(new Font("Tahoma", Font.BOLD, 18));
		UserField.setForeground(new Color(255, 255, 255));
		UserField.setBackground(new Color(27, 40, 56));
		UserField.setBounds(40, 129, 331, 44);
		contentPane.add(UserField);
		UserField.setColumns(10);
		
		JLabel PortalLabel = new JLabel("Portal Launcher");
		PortalLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		PortalLabel.setForeground(new Color(255, 255, 255));
		PortalLabel.setBounds(83, 16, 233, 53);
		contentPane.add(PortalLabel);
		
		gifPic = new JLabel(img);
		gifPic.setBounds(20, 16, 53, 53);
		contentPane.add(gifPic);
		
		UsernameLabel = new JLabel("Username:");
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setForeground(new Color(199, 213, 224));
		UsernameLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		UsernameLabel.setBounds(40, 106, 74, 22);
		contentPane.add(UsernameLabel);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u = UserField.getText();
				String p = PasswordField.getText();
				try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            String url = "jdbc:mysql://localhost:3306/pLauncher";
		            String username = "root";
		            String password = "";
		            Connection connection = DriverManager.getConnection(url, username, password);
		            String sql = "SELECT * FROM users WHERE username='"+u+"' AND password='"+p+"'";
		            PreparedStatement preparedStatement = connection.prepareStatement(sql);
		            ResultSet resultSet = preparedStatement.executeQuery();

		            if (resultSet.next()) {
		                String data = resultSet.getString("username");
		                if (data!=null) {
		                	dispose();
		                	Store st = new Store();
		                	st.setVisible(true);
		                	} else {
		                	JOptionPane.showMessageDialog(LoginButton, "Wrong Username or Password");   
		            		
		                	}
		                }
		            
		            resultSet.close();
		            preparedStatement.close();
		            connection.close();
		        } catch (ClassNotFoundException | SQLException e1) {
		            e1.printStackTrace();
		            }
			}
		});
		LoginButton.setForeground(new Color(255, 255, 255));
		LoginButton.setBackground(new Color(102, 192, 244));
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		LoginButton.setBounds(104, 302, 189, 44);
		contentPane.add(LoginButton);
		
		PasswordLabel = new JLabel("Password:");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setForeground(new Color(199, 213, 224));
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		PasswordLabel.setBounds(40, 184, 74, 22);
		contentPane.add(PasswordLabel);
		
		PasswordField = new JPasswordField();
		PasswordField.setForeground(new Color(255, 255, 255));
		PasswordField.setFont(new Font("Tahoma", Font.BOLD, 18));
		PasswordField.setBackground(new Color(27, 40, 56));
		PasswordField.setBounds(40, 207, 331, 44);
		contentPane.add(PasswordField);
		
		JPanel Shade = new JPanel();
		Shade.setBackground(new Color(45, 67, 94));
		Shade.setBounds(0, 0, 408, 84);
		contentPane.add(Shade);
		
		NoAccLabel = new JLabel("Don't have an account?");
		NoAccLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				SignUp su = new SignUp();
				su.setVisible(true);
				
			}
		});
		NoAccLabel.setForeground(new Color(0, 128, 255));
		NoAccLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NoAccLabel.setBounds(104, 262, 189, 14);
		contentPane.add(NoAccLabel);
		
	}
}
