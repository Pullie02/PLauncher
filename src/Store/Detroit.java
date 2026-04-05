package Store;
import Login.Login;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Detroit extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Detroit frame = new Detroit();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Detroit() {
        setTitle("Portal Launcher");
        ImageIcon big1 = new ImageIcon("Images/Store/Detroit/img1-big.jpg");
        ImageIcon sml1 = new ImageIcon("Images/Store/Detroit/img1-sml.jpg");
        ImageIcon big2 = new ImageIcon("Images/Store/Detroit/img2-big.jpg");
        ImageIcon sml2 = new ImageIcon("Images/Store/Detroit/img2-sml.jpg");
        ImageIcon big3 = new ImageIcon("Images/Store/Detroit/img3-big.jpg");
        ImageIcon sml3 = new ImageIcon("Images/Store/Detroit/img3-sml.jpg");
        ImageIcon big4 = new ImageIcon("Images/Store/Detroit/img4-big.jpg");
        ImageIcon sml4 = new ImageIcon("Images/Store/Detroit/img4-sml.jpg");
        ImageIcon main = new ImageIcon("Images/Store/Detroit/main.jpg");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 947, 643);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(24, 40, 56));
        contentPane.setForeground(new Color(27, 40, 56));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setOpaque(true);

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(42, 71, 94));
        panel.setBounds(21, 32, 884, 543);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel titlelbl = new JLabel("Detroit: Become Human");
        titlelbl.setBounds(36, 29, 426, 53);
        panel.add(titlelbl);
        titlelbl.setFont(new Font("Tahoma", Font.BOLD, 30));
        titlelbl.setForeground(new Color(255, 255, 255));

        JLabel picslbl = new JLabel(big1);
        picslbl.setBounds(36, 83, 505, 284);
        panel.add(picslbl);

        JLabel img1lbl = new JLabel(sml1);
        img1lbl.setBounds(36, 378, 117, 66);
        panel.add(img1lbl);

        JLabel img2lbl = new JLabel(sml2);
        img2lbl.setBounds(163, 378, 117, 66);
        panel.add(img2lbl);

        JLabel img3lbl = new JLabel(sml3);
        img3lbl.setBounds(292, 378, 117, 66);
        panel.add(img3lbl);

        JLabel img4lbl = new JLabel(sml4);
        img4lbl.setBounds(424, 378, 117, 66);
        panel.add(img4lbl);

        img4lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                picslbl.setIcon(big4);
            }
        });
        img3lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                picslbl.setIcon(big3);
            }
        });
        img2lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                picslbl.setIcon(big2);
            }
        });
        img1lbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                picslbl.setIcon(big1);
            }
        });
        JLabel imgmainlbl = new JLabel(main);
        imgmainlbl.setBounds(563, 83, 295, 138);
        panel.add(imgmainlbl);

        JLabel abtgame = new JLabel("<html>Detroit: Become Human puts the destiny of both mankind and androids in your hands, taking you to a near future where machines have become more intelligent than humans. Every choice you make affects the outcome of the game, with one of the most intricately branching narratives ever created.</html>");
        abtgame.setFont(new Font("Tahoma", Font.BOLD, 11));
        abtgame.setVerticalAlignment(SwingConstants.TOP);
        abtgame.setForeground(new Color(255, 255, 255));
        abtgame.setToolTipText("");
        abtgame.setBounds(563, 232, 295, 91);
        panel.add(abtgame);

        JLabel devlbl = new JLabel("<html>PUBLISHER: Quantic Dream<br>DEVELOPER: Quantic Dream</html>");
        devlbl.setForeground(new Color(255, 255, 255));
        devlbl.setBounds(563, 309, 295, 66);
        panel.add(devlbl);

        JButton buybtn = new JButton("Purchase");
        buybtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String url = "jdbc:mysql://localhost:3306/pLauncher";
                String users = "root";
                String passw = "";

                try {
                    Connection connection = DriverManager.getConnection(url, users, passw);
                    String us = Login.u;
                    String sql = "SELECT * FROM users WHERE username=?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, us);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        String userID = resultSet.getString("user_id");
                        String query = "INSERT INTO user_games (user_id, game_id, owned) VALUES (?, 1, true)";
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setString(1, userID);
                        int x = statement.executeUpdate();
                        if (x == 0) {
                            JOptionPane.showMessageDialog(buybtn, "This game already exists in your library.");
                        } else {
                            JOptionPane.showMessageDialog(buybtn, "Detroit: Become Human has been added to your library.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(buybtn, "User not found!");
                    }

                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        buybtn.setBackground(new Color(0, 128, 0));
        buybtn.setForeground(new Color(255, 255, 255));
        buybtn.setBounds(689, 378, 153, 46);
        panel.add(buybtn);

        JLabel pricelbl = new JLabel("$39.99");
        pricelbl.setFont(new Font("Tahoma", Font.BOLD, 17));
        pricelbl.setForeground(new Color(255, 255, 255));
        pricelbl.setToolTipText("");
        pricelbl.setHorizontalAlignment(SwingConstants.CENTER);
        pricelbl.setBackground(new Color(31, 52, 69));
        pricelbl.setBounds(573, 378, 115, 46);
        pricelbl.setOpaque(true);
        panel.add(pricelbl);

        JButton btnNewButton = new JButton("Go Back");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(37, 62, 88));
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Store st = new Store();
                st.setVisible(true);
            }
        });
        btnNewButton.setBounds(21, 0, 115, 32);
        contentPane.add(btnNewButton);
    }
}
