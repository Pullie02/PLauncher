package Store;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Library.Library;
import Login.Login;
import Profile.Profile;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Store extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JLabel PfLabel;
	public JLabel gm1name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store frame = new Store();
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
	public Store() {
		setTitle("Portal Launcher");
		ImageIcon img = new ImageIcon("Images/portal.gif");
		ImageIcon ER = new ImageIcon("Images/Store/ER.jpg");
		ImageIcon TLOU = new ImageIcon("Images/Store/TLOU.jpg");
		ImageIcon Seki = new ImageIcon("Images/Store/Seki.jpg");
		ImageIcon P5R = new ImageIcon("Images/Store/P5R.jpg");
		ImageIcon MK11 = new ImageIcon("Images/Store/MK11.jpg");
		ImageIcon GTAV = new ImageIcon("Images/Store/GTA V.jpg");
		ImageIcon detroit = new ImageIcon("Images/Store/detroit.jpg");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(24, 40, 56));
		contentPane.setForeground(new Color(27, 40, 56));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(true);

		setContentPane(contentPane);
		
		JLabel StoreLabel = new JLabel("Store");
		StoreLabel.setBounds(10, 11, 100, 40);
		StoreLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.setLayout(null);
		StoreLabel.setForeground(new Color(0, 128, 255));
		StoreLabel.setBackground(new Color(40, 62, 87));
		StoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StoreLabel.setOpaque(true);
		contentPane.add(StoreLabel);
		
		JLabel GamesLabel = new JLabel("Library");
		GamesLabel.setBounds(120, 11, 100, 40);
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
				Library lb= new Library();
				lb.setVisible(true);
			}
		});
		GamesLabel.setOpaque(true);
		GamesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GamesLabel.setForeground(new Color(251, 251, 251));
		GamesLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GamesLabel.setBackground(new Color(40, 62, 87));
		contentPane.add(GamesLabel);
		
		String nm= Login.u;
		PfLabel = new JLabel(nm);
		PfLabel.setBounds(230, 11, 100, 40);
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
		contentPane.add(PfLabel);
		
		JPanel Shade = new JPanel();
		Shade.setBounds(0, 0, 931, 84);
		Shade.setBackground(new Color(40, 62, 87));
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
		
		JPanel ER_1 = new JPanel();
		ER_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				EldenRing erpage = new EldenRing();
				erpage.setVisible(true);
			}
		});
		ER_1.setBackground(new Color(16, 148, 226));
		ER_1.setBounds(10, 95, 233, 300);
		
		contentPane.add(ER_1);
		ER_1.setLayout(null);
		
		JLabel ERimg1 = new JLabel(ER);
		ERimg1.setBounds(0, 0, 233, 233);
		ER_1.add(ERimg1);
		
		JLabel ERLabel = new JLabel("Elden Ring");
		ERLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		ERLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ERLabel.setForeground(new Color(255, 255, 255));
		ERLabel.setBounds(20, 235, 94, 24);
		ER_1.add(ERLabel);
		
		JLabel ERpriceLabel = new JLabel("$59.99");
		ERpriceLabel.setHorizontalAlignment(SwingConstants.LEFT);
		ERpriceLabel.setForeground(Color.WHITE);
		ERpriceLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		ERpriceLabel.setBounds(20, 263, 94, 24);
		ER_1.add(ERpriceLabel);
		
		JLabel ERgenresLabel = new JLabel("Genres:\r\n");
		ERgenresLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ERgenresLabel.setForeground(Color.WHITE);
		ERgenresLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		ERgenresLabel.setBounds(124, 235, 94, 24);
		ER_1.add(ERgenresLabel);
		
		JLabel lblSoulslike = new JLabel("Souls-like  Open-World");
		lblSoulslike.setHorizontalAlignment(SwingConstants.LEFT);
		lblSoulslike.setForeground(Color.WHITE);
		lblSoulslike.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSoulslike.setBounds(111, 264, 122, 24);
		ER_1.add(lblSoulslike);
		
		JPanel TLOU_1 = new JPanel();
		TLOU_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				TLOU tlou = new TLOU();
				tlou.setVisible(true);
				}
		});
		TLOU_1.setLayout(null);
		TLOU_1.setBackground(new Color(16, 148, 226));
		TLOU_1.setBounds(253, 95, 233, 300);
		contentPane.add(TLOU_1);
		
		JLabel TLOUPic = new JLabel(TLOU);
		TLOUPic.setBounds(0, 0, 233, 233);
		TLOU_1.add(TLOUPic);
		
		JLabel TLOUlbl = new JLabel("The Last of Us Part I");
		TLOUlbl.setHorizontalAlignment(SwingConstants.LEFT);
		TLOUlbl.setForeground(Color.WHITE);
		TLOUlbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		TLOUlbl.setBounds(0, 235, 138, 24);
		TLOU_1.add(TLOUlbl);
		
		JLabel TLOUpricelbl = new JLabel("$69.99");
		TLOUpricelbl.setHorizontalAlignment(SwingConstants.LEFT);
		TLOUpricelbl.setForeground(Color.WHITE);
		TLOUpricelbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		TLOUpricelbl.setBounds(20, 263, 94, 24);
		TLOU_1.add(TLOUpricelbl);
		
		JLabel TLOUgenreslbl = new JLabel("Genres:\r\n");
		TLOUgenreslbl.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenreslbl.setForeground(Color.WHITE);
		TLOUgenreslbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		TLOUgenreslbl.setBounds(146, 235, 87, 24);
		TLOU_1.add(TLOUgenreslbl);
		
		JLabel TLOUgenres = new JLabel("Horror  Apocolypse");
		TLOUgenres.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres.setForeground(Color.WHITE);
		TLOUgenres.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres.setBounds(124, 264, 109, 24);
		TLOU_1.add(TLOUgenres);
		
		JPanel Sekiro_1 = new JPanel();
		Sekiro_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Sekiro sek = new Sekiro();
				sek.setVisible(true);
			}
		});
		Sekiro_1.setLayout(null);
		Sekiro_1.setBackground(new Color(16, 148, 226));
		Sekiro_1.setBounds(496, 95, 233, 300);
		contentPane.add(Sekiro_1);
		
		JLabel SekiImg = new JLabel(Seki);
		SekiImg.setBounds(0, 0, 233, 233);
		Sekiro_1.add(SekiImg);
		
		JLabel Sekiro = new JLabel("Sekiro");
		Sekiro.setHorizontalAlignment(SwingConstants.LEFT);
		Sekiro.setForeground(Color.WHITE);
		Sekiro.setFont(new Font("Tahoma", Font.BOLD, 13));
		Sekiro.setBounds(20, 235, 94, 24);
		Sekiro_1.add(Sekiro);
		
		JLabel sekiPrice = new JLabel("$59.99");
		sekiPrice.setHorizontalAlignment(SwingConstants.LEFT);
		sekiPrice.setForeground(Color.WHITE);
		sekiPrice.setFont(new Font("Tahoma", Font.BOLD, 13));
		sekiPrice.setBounds(20, 263, 94, 24);
		Sekiro_1.add(sekiPrice);
		
		JLabel SekiGenes = new JLabel("Genres:\r\n");
		SekiGenes.setHorizontalAlignment(SwingConstants.CENTER);
		SekiGenes.setForeground(Color.WHITE);
		SekiGenes.setFont(new Font("Tahoma", Font.BOLD, 13));
		SekiGenes.setBounds(124, 235, 94, 24);
		Sekiro_1.add(SekiGenes);
		
		JLabel genres = new JLabel("Souls-like     Ninja");
		genres.setHorizontalAlignment(SwingConstants.CENTER);
		genres.setForeground(Color.WHITE);
		genres.setFont(new Font("Tahoma", Font.BOLD, 10));
		genres.setBounds(111, 264, 122, 24);
		Sekiro_1.add(genres);
		
		JPanel P5R_1 = new JPanel();
		P5R_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				P5R P5R = new P5R();
				P5R.setVisible(true);
			}
		});
		P5R_1.setBackground(new Color(16, 148, 226));
		P5R_1.setBounds(739, 95, 182, 145);
		contentPane.add(P5R_1);
		P5R_1.setLayout(null);
		
		JLabel P5RImg = new JLabel(P5R);
		P5RImg.setBounds(0, 0, 182, 85);
		P5R_1.add(P5RImg);
		
		JLabel P5Rlbl = new JLabel("Persona 5 Royal");
		P5Rlbl.setForeground(new Color(255, 255, 255));
		P5Rlbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		P5Rlbl.setBackground(new Color(255, 255, 255));
		P5Rlbl.setHorizontalAlignment(SwingConstants.CENTER);
		P5Rlbl.setBounds(10, 96, 172, 14);
		P5R_1.add(P5Rlbl);
		
		JLabel P5RPrice = new JLabel("$59.99");
		P5RPrice.setForeground(new Color(255, 255, 255));
		P5RPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		P5RPrice.setHorizontalAlignment(SwingConstants.CENTER);
		P5RPrice.setBounds(20, 121, 152, 14);
		P5R_1.add(P5RPrice);
		
		JPanel MK11_1 = new JPanel();
		MK11_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MK_11 mk=new MK_11();
				mk.setVisible(true);
				}
		});
		MK11_1.setLayout(null);
		MK11_1.setBackground(new Color(16, 148, 226));
		MK11_1.setBounds(739, 250, 182, 145);
		contentPane.add(MK11_1);
		
		JLabel P5RImg_1 = new JLabel(MK11);
		P5RImg_1.setBounds(0, 0, 182, 85);
		MK11_1.add(P5RImg_1);
		
		JLabel lblMortalKombat = new JLabel("Mortal Kombat 11");
		lblMortalKombat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMortalKombat.setForeground(Color.WHITE);
		lblMortalKombat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMortalKombat.setBackground(Color.WHITE);
		lblMortalKombat.setBounds(10, 96, 172, 14);
		MK11_1.add(lblMortalKombat);
		
		JLabel P5RPrice_1 = new JLabel("$59.99");
		P5RPrice_1.setHorizontalAlignment(SwingConstants.CENTER);
		P5RPrice_1.setForeground(Color.WHITE);
		P5RPrice_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		P5RPrice_1.setBounds(20, 121, 152, 14);
		MK11_1.add(P5RPrice_1);
		
		JPanel GTAV_1 = new JPanel();
		GTAV_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				GTAV gta=new GTAV();
				gta.setVisible(true);
				}
		});
		
		GTAV_1.setLayout(null);
		GTAV_1.setBackground(new Color(16, 148, 226));
		GTAV_1.setBounds(10, 406, 450, 187);
		contentPane.add(GTAV_1);
		
		JLabel P5RImg_1_1 = new JLabel(GTAV);
		P5RImg_1_1.setBounds(0, 11, 332, 162);
		GTAV_1.add(P5RImg_1_1);
		
		JLabel TLOUgenreslbl_1 = new JLabel("Genres:\r\n");
		TLOUgenreslbl_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenreslbl_1.setForeground(Color.WHITE);
		TLOUgenreslbl_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TLOUgenreslbl_1.setBounds(331, 67, 109, 24);
		GTAV_1.add(TLOUgenreslbl_1);
		
		JLabel TLOUgenres_1 = new JLabel("Open World");
		TLOUgenres_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1.setForeground(Color.WHITE);
		TLOUgenres_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1.setBounds(331, 102, 109, 24);
		GTAV_1.add(TLOUgenres_1);
		
		JLabel TLOUgenres_1_1 = new JLabel("Action");
		TLOUgenres_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1_1.setForeground(Color.WHITE);
		TLOUgenres_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1_1.setBounds(331, 127, 109, 24);
		GTAV_1.add(TLOUgenres_1_1);
		
		JLabel TLOUgenres_1_1_1 = new JLabel("Multiplayer");
		TLOUgenres_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1_1_1.setForeground(Color.WHITE);
		TLOUgenres_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1_1_1.setBounds(331, 152, 109, 24);
		GTAV_1.add(TLOUgenres_1_1_1);
		
		JLabel lblMortalKombat_1 = new JLabel("Grand Theft Auto V");
		lblMortalKombat_1.setBounds(322, 0, 128, 25);
		GTAV_1.add(lblMortalKombat_1);
		lblMortalKombat_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMortalKombat_1.setForeground(Color.WHITE);
		lblMortalKombat_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMortalKombat_1.setBackground(Color.WHITE);
		
		JLabel P5RPrice_1_1 = new JLabel("$59.99");
		P5RPrice_1_1.setBounds(332, 36, 108, 14);
		GTAV_1.add(P5RPrice_1_1);
		P5RPrice_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		P5RPrice_1_1.setForeground(Color.WHITE);
		P5RPrice_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JPanel Detroit_1 = new JPanel();
		Detroit_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Detroit det = new Detroit();
				det.setVisible(true);
				}
		});
		Detroit_1.setLayout(null);
		Detroit_1.setBackground(new Color(16, 148, 226));
		Detroit_1.setBounds(470, 406, 450, 187);
		contentPane.add(Detroit_1);
		
		JLabel P5RImg_1_1_1 = new JLabel(detroit);
		P5RImg_1_1_1.setBounds(0, 11, 332, 162);
		Detroit_1.add(P5RImg_1_1_1);
		
		JLabel TLOUgenreslbl_1_1 = new JLabel("Genres:");
		TLOUgenreslbl_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenreslbl_1_1.setForeground(Color.WHITE);
		TLOUgenreslbl_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		TLOUgenreslbl_1_1.setBounds(331, 67, 109, 24);
		Detroit_1.add(TLOUgenreslbl_1_1);
		
		JLabel TLOUgenres_1_2 = new JLabel("Choices Matter");
		TLOUgenres_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1_2.setForeground(Color.WHITE);
		TLOUgenres_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1_2.setBounds(331, 102, 109, 24);
		Detroit_1.add(TLOUgenres_1_2);
		
		JLabel TLOUgenres_1_1_2 = new JLabel("Story Rich");
		TLOUgenres_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1_1_2.setForeground(Color.WHITE);
		TLOUgenres_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1_1_2.setBounds(331, 127, 109, 24);
		Detroit_1.add(TLOUgenres_1_1_2);
		
		JLabel TLOUgenres_1_1_1_1 = new JLabel("Multiple Ending");
		TLOUgenres_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		TLOUgenres_1_1_1_1.setForeground(Color.WHITE);
		TLOUgenres_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		TLOUgenres_1_1_1_1.setBounds(331, 152, 109, 24);
		Detroit_1.add(TLOUgenres_1_1_1_1);
		
		JLabel lblMortalKombat_1_1 = new JLabel("Detroit: Become Human");
		lblMortalKombat_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMortalKombat_1_1.setForeground(Color.WHITE);
		lblMortalKombat_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMortalKombat_1_1.setBackground(Color.WHITE);
		lblMortalKombat_1_1.setBounds(299, 0, 151, 14);
		Detroit_1.add(lblMortalKombat_1_1);
		
		JLabel P5RPrice_1_1_1 = new JLabel("$39.99");
		P5RPrice_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		P5RPrice_1_1_1.setForeground(Color.WHITE);
		P5RPrice_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		P5RPrice_1_1_1.setBounds(332, 36, 108, 14);
		Detroit_1.add(P5RPrice_1_1_1);
		
		
	}
}
