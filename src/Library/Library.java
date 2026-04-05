package Library;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import Store.Store;
import Login.Login;
import Profile.Profile;

import javax.swing.JButton;

public class Library extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel PfLabel;
	
	public JLabel gamename_1;
	public JLabel gamepic_1;
	public JLabel gamename_2;
	public JLabel gamepic_2;
	public JLabel gamename_3;
	public JLabel gamepic_3;
	public JLabel gamename_4;
	public JLabel gamepic_4;
	public JLabel gamename_5;
	public JLabel gamepic_5;
	public JLabel gamename_6;
	public JLabel gamepic_6;
	public JLabel gamename_7;
	public JLabel gamepic_7;
	private JLabel BigImg;
	private JLabel BigName;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library frame = new Library();
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
	public Library() {		
		
		
		
		ImageIcon img = new ImageIcon("Images/portal.gif");
		ImageIcon ER = new ImageIcon("Images/Library/SmallImages/ER.jpg");
		ImageIcon TLOU = new ImageIcon("Images/Library/SmallImages/TLOU.jpg");
		ImageIcon Seki = new ImageIcon("Images/Library/SmallImages/Sekiro.jpg");
		ImageIcon P5R = new ImageIcon("Images/Library/SmallImages/P5R.jpg");
		ImageIcon MK11 = new ImageIcon("Images/Library/SmallImages/MK11.jpg");
		ImageIcon GTAV = new ImageIcon("Images/Library/SmallImages/GTAV.jpg");
		ImageIcon detroit = new ImageIcon("Images/Library/SmallImages/Detroit.jpg");
		
		ImageIcon ER2 = new ImageIcon("Images/Library/BigImages/ER.jpg");
		ImageIcon TLOU2 = new ImageIcon("Images/Library/BigImages/TLOU.jpg");
		ImageIcon Seki2 = new ImageIcon("Images/Library/BigImages/Sekiro.jpg");
		ImageIcon P5R2 = new ImageIcon("Images/Library/BigImages/P5R.jpg");
		ImageIcon MK112 = new ImageIcon("Images/Library/BigImages/MK11.jpg");
		ImageIcon GTAV2 = new ImageIcon("Images/Library/BigImages/GTAV.jpg");
		ImageIcon detroit2 = new ImageIcon("Images/Library/BigImages/Detroit.jpg");
		
		
		setTitle("Portal Launcher");
		
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
		GamesLabel.setOpaque(true);
		GamesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GamesLabel.setForeground(new Color(0, 128, 255));
		GamesLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GamesLabel.setBackground(new Color(40, 62, 87));
		GamesLabel.setBounds(120, 11, 100, 40);
		contentPane.add(GamesLabel);
		
		String nm= Login.u;
		PfLabel = new JLabel(nm);
		PfLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				PfLabel.setForeground(new Color(255, 255, 255));
				PfLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				PfLabel.setForeground(new Color(251, 251, 251));
				PfLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Profile pf = new Profile();
				pf.setVisible(true);
				
			}
		});
		
		PfLabel.setOpaque(true);
		PfLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PfLabel.setForeground(new Color(251, 251, 251));
		PfLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(61, 96, 135));
		panel.setBounds(0, 81, 198, 523);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton PlayBtn = new JButton("Play");
		PlayBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
		PlayBtn.setBackground(new Color(0, 179, 45));
		PlayBtn.setForeground(new Color(255, 255, 255));
		PlayBtn.setBounds(798, 394, 123, 40);
		
		JLabel BigDesc = new JLabel();
		BigDesc.setHorizontalAlignment(SwingConstants.CENTER);
		BigDesc.setBackground(new Color(54, 66, 86));
		BigDesc.setFont(new Font("Tahoma", Font.BOLD, 20));
		BigDesc.setForeground(new Color(255, 255, 255));
		BigDesc.setBounds(208, 449, 713, 131);
		contentPane.add(BigDesc);
		
		BigImg = new JLabel("");
		BigImg.setBounds(198, 81, 733, 309);
		contentPane.add(BigImg);
		
		gamepic_1 = new JLabel(detroit);
		gamepic_1.setBounds(0, 11, 30, 30);
		
		
		gamename_1 = new JLabel("  Detroit: Become Human");
		gamename_1.setBackground(new Color(61, 96, 135));
		gamename_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_1.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_1.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_1.setForeground(new Color(223, 223, 223));
			}
			
			public void mouseClicked(MouseEvent e) {
				contentPane.add(PlayBtn);
				BigImg.setIcon(detroit2);
				BigName.setText("Detroit: Become Human");
				BigDesc.setText("<html>Detroit: Become Human puts the destiny of both mankind and androids in your hands, taking you to a near future where machines have become more intelligent than humans. Every choice you make affects the outcome of the game, with one of the most intricately branching narratives ever created.</html>");
				BigDesc.setOpaque(true);
				
			}
		});
		gamename_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_1.setForeground(new Color(223, 223, 223));
		gamename_1.setBounds(29, 11, 169, 30);
		
		
		gamepic_2 = new JLabel(ER);
		gamepic_2.setBounds(0, 52, 30, 30);
		
		
		gamename_2 = new JLabel("  Elden Ring");
		gamename_2.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_2.setBackground(new Color(61, 96, 135));
		gamename_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_2.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_2.setForeground(new Color(255, 255, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_2.setForeground(new Color(223, 223, 223));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(ER2);
				contentPane.add(PlayBtn);
				BigName.setText("Elden Ring");
				BigDesc.setText("<html>THE NEW FANTASY ACTION RPG. Rise, Tarnished, and be guided by grace to brandish the power of the Elden Ring and become an Elden Lord in the Lands Between.</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_2.setForeground(new Color(223, 223, 223));
		gamename_2.setBounds(29, 52, 169, 30);
		
		
		gamepic_3 = new JLabel(GTAV);
		gamepic_3.setBounds(0, 93, 30, 30);
		
		
		gamename_3 = new JLabel("  Grand Theft Auto V");
		gamename_3.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_3.setBackground(new Color(61, 96, 135));
		gamename_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_3.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_3.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_3.setForeground(new Color(223, 223, 223));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(GTAV2);
				contentPane.add(PlayBtn);
				BigName.setText("Grand Theft Auto V");
				BigDesc.setText("<html>Grand Theft Auto V for PC offers players the option to explore the award-winning world of Los Santos and Blaine County in resolutions of up to 4k and beyond, as well as the chance to experience the game running at 60 frames per second.</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_3.setForeground(new Color(223, 223, 223));
		gamename_3.setBounds(29, 93, 169, 30);
		
		
		gamepic_4 = new JLabel(MK11);
		gamepic_4.setBounds(0, 134, 30, 30);
		
		gamename_4 = new JLabel("  Mortal Kombat 11");
		gamename_4.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_4.setBackground(new Color(61, 96, 135));
		gamename_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_4.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_4.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_4.setForeground(new Color(223, 223, 223));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(MK112);
				contentPane.add(PlayBtn);
				BigName.setText("Mortal Kombat 11");
				BigDesc.setText("<html>Mortal Kombat is back and better than ever in the next evolution of the iconic franchise.</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_4.setForeground(new Color(223, 223, 223));
		gamename_4.setBounds(29, 134, 169, 30);
		
		
		gamepic_5 = new JLabel(P5R);
		gamepic_5.setBounds(0, 175, 30, 30);
	
		
		gamename_5 = new JLabel("  Persona 5 Royal");
		gamename_5.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_5.setBackground(new Color(61, 96, 135));
		gamename_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_5.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_5.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_5.setForeground(new Color(223, 223, 223));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(P5R2);
				contentPane.add(PlayBtn);
				BigName.setText("Persona 5 Royal");
				BigDesc.setText("<html>Don the mask and join the Phantom Thieves of Hearts as they stage grand heists, infiltrate the minds of the corrupt, and make them change their ways!</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_5.setForeground(new Color(223, 223, 223));
		gamename_5.setBounds(29, 175, 169, 30);

		
		gamepic_6 = new JLabel(Seki);
		gamepic_6.setBounds(0, 216, 30, 30);
	
		
		gamename_6 = new JLabel("  Sekiro: Shadows Die Twice");
		gamename_6.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_6.setBackground(new Color(61, 96, 135));
		gamename_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_6.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_6.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_6.setForeground(new Color(223, 223, 223));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(Seki2);
				contentPane.add(PlayBtn);
				BigName.setText("Sekiro: Shadows Die Twice");
				BigDesc.setText("<html>Game of the Year - The Game Awards 2019 Best Action Game of 2019 - IGN Carve your own clever path to vengeance in the award winning adventure from developer FromSoftware, creators of Bloodborne and the Dark Souls series. Take Revenge. Restore Your Honor. Kill Ingeniously.</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_6.setForeground(new Color(223, 223, 223));
		gamename_6.setBounds(29, 216, 169, 30);
		
		
		gamepic_7 = new JLabel(TLOU);
		gamepic_7.setBounds(0, 257, 30, 30);
		
		
		gamename_7 = new JLabel("  The Last Of Us Part I");
		gamename_7.setHorizontalAlignment(SwingConstants.LEFT);
		gamename_7.setBackground(new Color(61, 96, 135));
		gamename_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gamename_7.setFont(new Font("Tahoma", Font.BOLD, 11));
				gamename_7.setForeground(new Color(255, 255, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				gamename_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
				gamename_7.setForeground(new Color(223, 223, 223));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BigImg.setIcon(TLOU2);
				contentPane.add(PlayBtn);
				BigName.setText("The Last Of Us Part I");
				BigDesc.setText("<html>Experience the emotional storytelling and unforgettable characters in The Last of Us™, winner of over 200 Game of the Year awards.</html>");
				BigDesc.setOpaque(true);
			}
		});
		gamename_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gamename_7.setForeground(new Color(223, 223, 223));
		gamename_7.setBounds(29, 257, 169, 30);
		
		
		BigName = new JLabel("");
		BigName.setForeground(new Color(255, 255, 255));
		BigName.setFont(new Font("Tahoma", Font.BOLD, 17));
		BigName.setBounds(208, 393, 257, 40);
		contentPane.add(BigName);
	

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pLauncher";
            String users = "root";
            String passw = "";
            String us = Login.u;
            Connection connection = DriverManager.getConnection(url, users, passw);
            String sql = "SELECT * FROM users JOIN user_games ON users.user_id = user_games.user_id WHERE username=? AND owned=1";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, us);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String gameID = resultSet.getString("game_id");

                // Add game label and image based on the retrieved game ID
                switch (gameID) {
                    case "1":
                        panel.add(gamename_1);
                        panel.add(gamepic_1);
                        break;
                    case "2":
                        panel.add(gamename_2);
                        panel.add(gamepic_2);
                        break;
                    case "3":
                        panel.add(gamename_3);
                        panel.add(gamepic_3);
                        break;
                    case "4":
                        panel.add(gamename_4);
                        panel.add(gamepic_4);
                        break;
                    case "5":
                        panel.add(gamename_5);
                        panel.add(gamepic_5);
                        break;
                    case "6":
                        panel.add(gamename_6);
                        panel.add(gamepic_6);
                        break;
                    case "7":
                        panel.add(gamename_7);
                        panel.add(gamepic_7);
                        break;
                    // Add cases for other games similarly
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
		
	