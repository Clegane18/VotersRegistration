package votersregistration;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage_votersRegistration extends JFrame implements ActionListener {
    JLabel lblHomePage = new JLabel("Home Page");
    JButton candidateRegistrationButton = new JButton("Candidates Registration");
    JButton votersRegistrationButton = new JButton("Voters Registration");
    JLabel noteLabel = new JLabel("Note: Individuals who are 17 years old or below are not allowed to vote or run for office.");

    public HomePage_votersRegistration() {
        // JFrame
        setSize(500, 400);
        this.setResizable(false);
        this.setTitle("");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HomePage_votersRegistration.EXIT_ON_CLOSE);

        // Gradient Color
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(0, 56, 168);
                Color color2 = new Color(209, 25, 54);
                GradientPaint gradient = new GradientPaint(0, 0, color1, width, height, color2);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, width, height);
            }
        };
        gradientPanel.setLayout(null);
        this.setContentPane(gradientPanel);

        // Logo
        ImageIcon votersLogo = new ImageIcon("C:\\Users\\johnr\\OneDrive\\Desktop\\logoForVotingjpg.jpg");
        Image logoImage = votersLogo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);

        ImageIcon scaledLogo = new ImageIcon(logoImage);
        this.setIconImage(scaledLogo.getImage());

        // Home page
        lblHomePage.setFont(new Font("Arial", Font.BOLD, 40));
        lblHomePage.setBounds(125, 50, 250, 50);
        lblHomePage.setHorizontalAlignment(JLabel.CENTER);
        lblHomePage.setForeground(Color.WHITE);
        gradientPanel.add(lblHomePage);

        // Candidates Registration Button
        candidateRegistrationButton.setBounds(100, 150, 300, 50);
        candidateRegistrationButton.setFont(new Font("Arial", Font.BOLD, 16));
        candidateRegistrationButton.setBackground(new Color(255, 204, 0));
        candidateRegistrationButton.setForeground(Color.BLACK);
        gradientPanel.add(candidateRegistrationButton);

        // Voters Registration Button
        votersRegistrationButton.setBounds(100, 250, 300, 50);
        votersRegistrationButton.setFont(new Font("Arial", Font.BOLD, 16));
        votersRegistrationButton.setBackground(new Color(0, 56, 168));
        votersRegistrationButton.setForeground(Color.WHITE);
        gradientPanel.add(votersRegistrationButton);

        // Add Action Listeners
        candidateRegistrationButton.addActionListener(this);
        votersRegistrationButton.addActionListener(this);

        // Note
        noteLabel.setBounds(10, getHeight() - 70, 400, 20);
        noteLabel.setForeground(Color.WHITE);
        gradientPanel.add(noteLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Candidates Registration")) {
            candidatesFrame CandidatesFrame = new candidatesFrame();
            CandidatesFrame.setVisible(true);
            this.dispose();
        } else if (e.getActionCommand().equals("Voters Registration")) {
            votersFrame VotersFrame = new votersFrame();
            VotersFrame.setVisible(true);
            this.dispose();
        }
    }
}
