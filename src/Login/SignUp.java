package Login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SignUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JTextField UserField;
    private JLabel gifPic;
    public JLabel UserLabel;
    private JLabel PassLabel;
    private JPasswordField PassField;
    private JTextField EmailField;
    private JLabel EmailLabel;
    private JLabel haveAccLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp frame = new SignUp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SignUp() {
        setTitle("Portal Launcher");
        ImageIcon img = new ImageIcon("Images/portal.gif");
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
        UserField.setBounds(40, 103, 331, 44);
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
        UserLabel.setBounds(40, 80, 74, 22);
        contentPane.add(UserLabel);

        JButton Signupbtn = new JButton("Sign Up");
        Signupbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String user = UserField.getText();
                String email = EmailField.getText();
                String pass = PassField.getText();
                String url = "jdbc:mysql://localhost:3306/pLauncher";
                String users = "root";
                String passw = "";

                try {
                    Connection connection = DriverManager.getConnection(url, users, passw);

                    String query = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, user);
                    preparedStatement.setString(2, email);
                    preparedStatement.setString(3, pass);
                    int x = preparedStatement.executeUpdate();

                    JOptionPane.showMessageDialog(Signupbtn, "Your account is now made!");

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        Signupbtn.setForeground(new Color(255, 255, 255));
        Signupbtn.setBackground(new Color(102, 192, 244));
        Signupbtn.setFont(new Font("Tahoma", Font.BOLD, 17));
        Signupbtn.setBounds(105, 317, 189, 44);
        contentPane.add(Signupbtn);

        PassLabel = new JLabel("Password:");
        PassLabel.setForeground(new Color(199, 213, 224));
        PassLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        PassLabel.setBounds(40, 214, 74, 22);
        contentPane.add(PassLabel);

        PassField = new JPasswordField();
        PassField.setForeground(new Color(255, 255, 255));
        PassField.setFont(new Font("Tahoma", Font.BOLD, 18));
        PassField.setBackground(new Color(27, 40, 56));
        PassField.setBounds(40, 237, 331, 44);
        contentPane.add(PassField);

        JPanel Shade = new JPanel();
        Shade.setBackground(new Color(45, 67, 94));
        Shade.setBounds(0, 0, 408, 84);
        contentPane.add(Shade);

        EmailField = new JTextField();
        EmailField.setForeground(Color.WHITE);
        EmailField.setFont(new Font("Tahoma", Font.BOLD, 18));
        EmailField.setColumns(10);
        EmailField.setBackground(new Color(27, 40, 56));
        EmailField.setBounds(40, 170, 331, 44);
        contentPane.add(EmailField);

        EmailLabel = new JLabel("Email:");
        EmailLabel.setForeground(new Color(199, 213, 224));
        EmailLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        EmailLabel.setBounds(40, 147, 89, 22);
        contentPane.add(EmailLabel);

        haveAccLabel = new JLabel("Already have an account?");
        haveAccLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Login ln = new Login();
                ln.setVisible(true);
            }
        });
        haveAccLabel.setHorizontalAlignment(SwingConstants.CENTER);
        haveAccLabel.setForeground(new Color(0, 128, 255));
        haveAccLabel.setBounds(105, 292, 189, 14);
        contentPane.add(haveAccLabel);
    }
}
