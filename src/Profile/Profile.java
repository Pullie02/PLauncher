package Profile;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Login.Login;
import Login.SignUp;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Library.Library;
import Store.Store;
import javax.swing.JButton;
import javax.swing.Icon;

public class Profile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel PfLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setTitle("Portal Launcher");
		ImageIcon img;
		img= new ImageIcon("images/portal.gif");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 40, 56));
		contentPane.setForeground(new Color(27, 40, 56));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(true);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel StoreLabel = new JLabel("Store");
		StoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StoreLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				StoreLabel.setForeground(new Color(255, 255, 255));
				StoreLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

			}
			@Override
			public void mouseExited(MouseEvent e) {
				StoreLabel.setForeground(new Color(251, 251, 251));
				StoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Store st = new Store();
				st.setVisible(true);			
			}
		});
		StoreLabel.setForeground(new Color(251, 251, 251));
		StoreLabel.setBackground(new Color(40, 62, 87));
		StoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StoreLabel.setBounds(10, 11, 100, 40);
		StoreLabel.setOpaque(true);
		contentPane.add(StoreLabel);
		
		JLabel GamesLabel = new JLabel("Library");
		GamesLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				GamesLabel.setForeground(new Color(255, 255, 255));
				GamesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				GamesLabel.setForeground(new Color(251, 251, 251));
				GamesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Library gm= new Library();
				gm.setVisible(true);
			}
		});
		GamesLabel.setOpaque(true);
		GamesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GamesLabel.setForeground(new Color(251, 251, 251));
		GamesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GamesLabel.setBackground(new Color(40, 62, 87));
		GamesLabel.setBounds(120, 11, 100, 40);
		contentPane.add(GamesLabel);
		
		String nm= Login.u;
		PfLabel = new JLabel(nm);
		PfLabel.setOpaque(true);
		PfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PfLabel.setForeground(new Color(0, 128, 255));
		PfLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		PfLabel.setBackground(new Color(40, 62, 87));
		PfLabel.setBounds(230, 11, 100, 40);
		contentPane.add(PfLabel);
		
		JPanel Shade = new JPanel();
		Shade.setBackground(new Color(40, 62, 87));
		Shade.setBounds(0, 0, 931, 84);
		contentPane.add(Shade);
		Shade.setLayout(null);
		
		JLabel gifPic = new JLabel(img);
		gifPic.setBounds(670, 11, 53, 53);
		Shade.add(gifPic);
		
		JLabel PortalLabel = new JLabel("Portal Launcher");
		PortalLabel.setBounds(733, 11, 188, 53);
		Shade.add(PortalLabel);
		PortalLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		PortalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PortalLabel.setForeground(new Color(255, 255, 255));
		
		JLabel BigName = new JLabel(nm);
		BigName.setFont(new Font("Tahoma", Font.BOLD, 30));
		BigName.setForeground(new Color(255, 255, 255));
		BigName.setBounds(10, 91, 355, 84);
		contentPane.add(BigName);
		
		JButton btnNewButton = new JButton("Change Username");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangeName cn = new ChangeName();
				cn.setVisible(true);
			}
		});
		
		btnNewButton.setBackground(new Color(0, 191, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(249, 184, 203, 40);
		contentPane.add(btnNewButton);
		
		JButton btnDeleteAccount = new JButton("Delete Account");
		btnDeleteAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Delete dt = new Delete();
				dt.setVisible(true);
				
			}
		});
		btnDeleteAccount.setForeground(Color.WHITE);
		btnDeleteAccount.setBackground(new Color(0, 191, 0));
		btnDeleteAccount.setBounds(249, 287, 203, 40);
		contentPane.add(btnDeleteAccount);
		
		JButton btnSignUpNew = new JButton("Sign up new account");
		btnSignUpNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				SignUp su= new SignUp();
				su.setVisible(true);
			}
		});
		btnSignUpNew.setForeground(Color.WHITE);
		btnSignUpNew.setBackground(new Color(0, 191, 0));
		btnSignUpNew.setBounds(249, 392, 203, 40);
		contentPane.add(btnSignUpNew);
		
		JPanel Shade_1 = new JPanel();
		Shade_1.setLayout(null);
		Shade_1.setBackground(new Color(40, 62, 87));
		Shade_1.setBounds(0, 520, 931, 84);
		contentPane.add(Shade_1);
		
		JLabel gifPic_1 = new JLabel(img);
		gifPic_1.setBounds(670, 11, 53, 53);
		Shade_1.add(gifPic_1);
		
		JLabel PortalLabel_1 = new JLabel("Portal Launcher");
		PortalLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		PortalLabel_1.setForeground(Color.WHITE);
		PortalLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		PortalLabel_1.setBounds(733, 11, 188, 53);
		Shade_1.add(PortalLabel_1);
		
		JLabel Names = new JLabel("<html>\r\nDesigner and Developer: Dere Rzgar Sidiq & Ara Srwsht Ali & Basam A.Rashid<br><br>\r\nCreative Advisor: Subhu Abdul Bari\r\n</html>");
		Names.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Names.setForeground(new Color(255, 255, 255));
		Names.setBounds(10, 11, 496, 53);
		Shade_1.add(Names);
		
		JLabel lblNewLabel = new JLabel("Change Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 186, 190, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblDeleteAccount = new JLabel("Delete Account");
		lblDeleteAccount.setForeground(new Color(255, 255, 255));
		lblDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblDeleteAccount.setBounds(10, 287, 190, 38);
		contentPane.add(lblDeleteAccount);
		
		JLabel lblCreateNewProfile = new JLabel("Create New Profile");
		lblCreateNewProfile.setForeground(new Color(255, 255, 255));
		lblCreateNewProfile.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblCreateNewProfile.setBounds(10, 392, 190, 38);
		contentPane.add(lblCreateNewProfile);
		
	}
}