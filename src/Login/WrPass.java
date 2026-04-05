package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WrPass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WrPass frame = new WrPass();
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
	public WrPass() {
		setTitle("Portal Launcher");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 178);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(27, 40, 56));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel wr = new JLabel("Wrong password");
		wr.setFont(new Font("Tahoma", Font.BOLD, 11));
		wr.setForeground(new Color(255, 255, 255));
		wr.setHorizontalAlignment(SwingConstants.CENTER);
		wr.setBounds(65, 32, 177, 20);
		contentPane.add(wr);
		
		JButton btn = new JButton("Go back");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn.setBackground(new Color(102, 192, 244));
		btn.setForeground(new Color(255, 255, 255));
		btn.setBounds(106, 85, 100, 30);
		contentPane.add(btn);
		
		JLabel wr2 = new JLabel("Empty Username or");
		wr2.setHorizontalAlignment(SwingConstants.CENTER);
		wr2.setForeground(Color.WHITE);
		wr2.setFont(new Font("Tahoma", Font.BOLD, 11));
		wr2.setBounds(65, 11, 177, 20);
		contentPane.add(wr2);
		
		JLabel wr3 = new JLabel("password is 123");
		wr3.setHorizontalAlignment(SwingConstants.CENTER);
		wr3.setForeground(Color.WHITE);
		wr3.setFont(new Font("Tahoma", Font.BOLD, 11));
		wr3.setBounds(65, 54, 177, 20);
		contentPane.add(wr3);
	}
}
