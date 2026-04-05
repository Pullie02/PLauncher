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
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;

public class Delete extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel gifPic;
    public JLabel UserLabel;
    private JButton btnNo;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Delete frame = new Delete();
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
    public Delete() {
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
        
        JLabel PortalLabel = new JLabel("Portal Launcher");
        PortalLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
        PortalLabel.setForeground(new Color(255, 255, 255));
        PortalLabel.setBounds(83, 16, 231, 53);
        contentPane.add(PortalLabel);
        
        gifPic = new JLabel(img);
        gifPic.setBounds(20, 16, 53, 53);
        contentPane.add(gifPic);
        
        UserLabel = new JLabel("Are you sure you want to delete your account?");
        UserLabel.setHorizontalAlignment(SwingConstants.CENTER);
        UserLabel.setForeground(new Color(199, 213, 224));
        UserLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        UserLabel.setBounds(36, 120, 334, 53);
        contentPane.add(UserLabel);
        
        JButton Deletebtn = new JButton("Yes");
        Deletebtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String url= "jdbc:mysql://localhost:3306/pLauncher";
                String users = "root";
                String passw = "";
                try {
                    Connection connection = DriverManager.getConnection(url, users, passw);
                    String us = Login.u;

                    // Retrieve user ID from the database
                    String queryGetUserID = "SELECT user_id FROM users WHERE username = ?";
                    PreparedStatement stmtGetUserID = connection.prepareStatement(queryGetUserID);
                    stmtGetUserID.setString(1, us);
                    ResultSet resultSet = stmtGetUserID.executeQuery();

                    if (resultSet.next()) {
                        int userID = resultSet.getInt("user_id");

                        // Proceed with deleting associated records from user_games and the user from users
                        String queryDeleteUserGames = "DELETE FROM user_games WHERE user_id = ?";
                        PreparedStatement stmtDeleteUserGames = connection.prepareStatement(queryDeleteUserGames);
                        stmtDeleteUserGames.setInt(1, userID);
                        int rowsAffectedGames = stmtDeleteUserGames.executeUpdate();

                        String queryDeleteUser = "DELETE FROM users WHERE username = ?";
                        PreparedStatement stmtDeleteUser = connection.prepareStatement(queryDeleteUser);
                        stmtDeleteUser.setString(1, us);
                        int rowsAffectedUser = stmtDeleteUser.executeUpdate();

                        if (rowsAffectedUser > 0) {
                            JOptionPane.showMessageDialog(Delete.this, "User " + us + " has been deleted!");
                        } else {
                            JOptionPane.showMessageDialog(Delete.this, "User " + us + " not found!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(Delete.this, "User not found!");
                    }

                    connection.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        });
        
        Deletebtn.setForeground(new Color(255, 255, 255));
        Deletebtn.setBackground(new Color(102, 192, 244));
        Deletebtn.setFont(new Font("Tahoma", Font.BOLD, 17));
        Deletebtn.setBounds(58, 191, 126, 44);
        contentPane.add(Deletebtn);
        
        JPanel Shade = new JPanel();
        Shade.setBackground(new Color(45, 67, 94));
        Shade.setBounds(0, 0, 408, 84);
        contentPane.add(Shade);
        
        btnNo = new JButton("No");
        btnNo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        btnNo.setForeground(Color.WHITE);
        btnNo.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnNo.setBackground(new Color(102, 192, 244));
        btnNo.setBounds(230, 191, 126, 44);
        contentPane.add(btnNo);
        
    }
}
