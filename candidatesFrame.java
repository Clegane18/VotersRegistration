/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package votersregistration;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.text.Position;

public class candidatesFrame extends JFrame implements ActionListener {
        JLabel lblCandidatesFrame = new JLabel("Candidates Registration");
        JLabel lblFullName = new JLabel("Full Name:");
        JTextField txtFullName = new JTextField();
        JLabel lblDateOfBirth = new JLabel("Date of Birth:");
        JTextField txtDateOfBirth = new JTextField();
        JLabel lblAddress = new JLabel("Address:");
        JTextField txtAddress = new JTextField();
        JLabel lblContactInformation = new JLabel("Contact Number:");
        JTextField txtContactInformation = new JTextField();
        JLabel lblGender = new JLabel("Gender:");
        JRadioButton rbMale = new JRadioButton("Male");
        JRadioButton rbFemale = new JRadioButton("Female");
        JRadioButton rbOther = new JRadioButton("Other/Prefer not to say");
        ButtonGroup genderGroup = new ButtonGroup();
        JLabel lblPartyAffiliation = new JLabel("Party Affiliation:");
        JTextField txtPartyAffiliation = new JTextField();
        JLabel lblPosition = new JLabel("Position:");
        JTextField txtPosition = new JTextField();
        JLabel lblExperience = new JLabel("Experience:");
        JTextField txtExperience = new JTextField();
        JLabel lblEducationalBackground = new JLabel("Educational Background:");
        JTextField txtEducationalBackground = new JTextField();
        JLabel lblPreviousPosition = new JLabel("Previous Position:");
        JTextField txtPreviousPosition = new JTextField();
        JButton btnRegister = new JButton("Register");
        JButton btnBack = new JButton("Back"); 
        
    public candidatesFrame() {
        setSize(580, 600);
        setTitle("Voters Registration");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
        
        //logo
        ImageIcon votersLogo = new ImageIcon("D:\\logoForVotingjpg.jpg");
        Image logoImage = votersLogo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledLogo = new ImageIcon(logoImage);
        this.setIconImage(scaledLogo.getImage());
        
        // Color scheme
        Color backgroundColor = new Color(240, 240, 240);
        Color textColor = new Color(51, 51, 51);
        Color buttonColor = new Color(68, 108, 179);
        Color buttonTextColor = new Color(255, 255, 255);
        Color comboBoxColor = new Color(225, 225, 225);
        Color comboBoxTextColor = new Color(51, 51, 51);
        Color beige = new Color(245, 245, 220);
        
        panel.setBackground(backgroundColor);
        lblCandidatesFrame.setForeground(textColor);
        lblFullName.setForeground(textColor);
        lblDateOfBirth.setForeground(textColor);
        lblAddress.setForeground(textColor);
        lblContactInformation.setForeground(textColor);
        lblGender.setForeground(textColor);
        lblPartyAffiliation.setForeground(textColor);
        lblPosition.setForeground(textColor);
        lblExperience.setForeground(textColor);
        lblEducationalBackground.setForeground(textColor);
        lblPreviousPosition.setForeground(textColor);
        btnRegister.setBackground(buttonColor);
        btnRegister.setForeground(buttonTextColor);
        btnBack.setBackground(buttonColor);
        btnBack.setForeground(buttonTextColor);

        txtFullName.setBackground(backgroundColor);
        txtFullName.setForeground(textColor);
        txtDateOfBirth.setBackground(backgroundColor);
        txtDateOfBirth.setForeground(textColor);
        txtAddress.setBackground(backgroundColor);
        txtAddress.setForeground(textColor);
        txtContactInformation.setBackground(backgroundColor);
        txtContactInformation.setForeground(textColor);
        txtPartyAffiliation.setBackground(backgroundColor);
        txtPartyAffiliation.setForeground(textColor);
        txtPosition.setBackground(backgroundColor);
        txtPosition.setForeground(textColor);
        txtExperience.setBackground(backgroundColor);
        txtExperience.setForeground(textColor);
        txtEducationalBackground.setBackground(backgroundColor);
        txtEducationalBackground.setForeground(textColor);
        txtPreviousPosition.setBackground(backgroundColor);
        txtPreviousPosition.setForeground(textColor);

        rbMale.setBackground(backgroundColor);
        rbMale.setForeground(textColor);
        rbFemale.setBackground(backgroundColor);
        rbFemale.setForeground(textColor);
        rbOther.setBackground(backgroundColor);
        rbOther.setForeground(textColor);
        
        //Font Styles
        Font titleFont = new Font("Arial", Font.BOLD, 36);
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        Font radioButtonFont = new Font("Arial", Font.BOLD, 14);    

        lblCandidatesFrame.setForeground(textColor);
        lblCandidatesFrame.setFont(titleFont);
        lblFullName.setForeground(textColor);
        lblFullName.setFont(labelFont);
        lblDateOfBirth.setForeground(textColor);
        lblDateOfBirth.setFont(labelFont);
        lblAddress.setForeground(textColor);
        lblAddress.setFont(labelFont);
        lblContactInformation.setForeground(textColor);
        lblContactInformation.setFont(labelFont);
        lblGender.setForeground(textColor);
        lblGender.setFont(labelFont);
        lblPartyAffiliation.setForeground(textColor);
        lblPartyAffiliation.setFont(labelFont);
        lblPosition.setForeground(textColor);
        lblPosition.setFont(labelFont);
        lblExperience.setForeground(textColor);
        lblExperience.setFont(labelFont);
        lblEducationalBackground.setForeground(textColor);
        lblEducationalBackground.setFont(labelFont);
        lblPreviousPosition.setForeground(textColor);
        lblPreviousPosition.setFont(labelFont);
        btnRegister.setBackground(buttonColor);
        btnRegister.setForeground(buttonTextColor);
        btnRegister.setFont(buttonFont);
        btnBack.setBackground(buttonColor);
        btnBack.setForeground(buttonTextColor);
        btnBack.setFont(buttonFont);
        rbMale.setFont(radioButtonFont);
        rbFemale.setFont(radioButtonFont);
        rbOther.setFont(radioButtonFont);
        
        //SetBounds
        lblCandidatesFrame.setBounds(80, 10, 420, 50);
        lblFullName.setBounds(30, 80, 180, 30);
        txtFullName.setBounds(280, 80, 250, 30);
        lblDateOfBirth.setBounds(30, 120, 180, 30);
        txtDateOfBirth.setBounds(280, 120, 250, 30);
        txtDateOfBirth.setToolTipText("Example Date Format: December 18, 2002");
        lblAddress.setBounds(30, 160, 180, 30);
        txtAddress.setBounds(280, 160, 250, 30);
        txtAddress.setToolTipText("Address Format: Street, City, State, Postal Code");
        lblContactInformation.setBounds(30, 200, 180, 30);
        txtContactInformation.setBounds(280, 200, 250, 30);
        lblGender.setBounds(30, 240, 180, 30);
        rbMale.setBounds(170, 240, 80, 30);
        rbFemale.setBounds(260, 240, 80, 30);
        rbOther.setBounds(350, 240, 200, 30);
        lblPartyAffiliation.setBounds(30, 280, 180, 30);
        txtPartyAffiliation.setBounds(280, 280, 250, 30);
        lblPosition.setBounds(30, 320, 180, 30);
        txtPosition.setBounds(280, 320, 250, 30);
        txtPosition.setToolTipText("Specify the desired position or role you are applying for. Examples: Mayor, City Councilor, Governor, Senator, etc. If you are applying for a specific position within a party or organization, mention that as well. Be clear and specific about the position you are seeking.");
        lblExperience.setBounds(30, 360, 180, 30);
        txtExperience.setBounds(280, 360, 250, 30);
        txtExperience.setToolTipText("Please provide brief explanation of your exprience");
        lblEducationalBackground.setBounds(30, 400, 240, 30);
        txtEducationalBackground.setBounds(280, 400, 250, 30);
        txtEducationalBackground.setToolTipText("Enter your educational qualifications and academic achievements. Mention the name of the institution, major or specialization, and the year of completion. Example: Bachelor of Information Technology, Bulacan State University, 2020.");
        lblPreviousPosition.setBounds(30, 440, 180, 30);
        txtPreviousPosition.setBounds(280, 440, 250, 30);
        btnRegister.setBounds(250, 500, 120, 30);
        btnBack.setBounds(410, 500, 120, 30);

        
        //Add components to the panel
        
        panel.add(lblCandidatesFrame);
        panel.add(lblFullName);
        panel.add(txtFullName);
        panel.add(lblDateOfBirth);
        panel.add(txtDateOfBirth);
        panel.add(lblAddress);
        panel.add(txtAddress);
        panel.add(lblContactInformation);
        panel.add(txtContactInformation);
        panel.add(lblGender);
        panel.add(rbMale);
        panel.add(rbFemale);
        panel.add(rbOther);
        panel.add(lblPartyAffiliation);
        panel.add(txtPartyAffiliation);
        panel.add(lblPosition);
        panel.add(txtPosition);
        panel.add(lblExperience);
        panel.add(txtExperience);
        panel.add(lblEducationalBackground);
        panel.add(txtEducationalBackground);
        panel.add(lblPreviousPosition);
        panel.add(txtPreviousPosition);
        panel.add(btnRegister);
        panel.add(btnBack);
        
        //Add action Listener
        btnRegister.addActionListener(this);
        btnBack.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            String fullName = txtFullName.getText();
            String dateOfBirth = txtDateOfBirth.getText();
            String address = txtAddress.getText();
            String contactInformation = txtContactInformation.getText();
            String gender = getSelectedGender();
            String partyAffiliation = txtPartyAffiliation.getText();
            String postion = txtPosition.getText();
            String experience = txtExperience.getText();
            String educationalBackground = txtEducationalBackground.getText();
            String previousPosition = txtPreviousPosition.getText();
            

            // To check for blank info 
            if (fullName.isEmpty() || dateOfBirth.isEmpty() || address.isEmpty() || contactInformation.isEmpty()
                    || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please complete all the required details.",
                        "Incomplete Information", JOptionPane.WARNING_MESSAGE);
            } else {
                // Validate age, date format, and contact number
                if (isBelow18(dateOfBirth) && isCorrectDateFormat(dateOfBirth) && isNumeric(contactInformation)) {
                    registerCandidate(fullName, dateOfBirth, address, contactInformation, gender, partyAffiliation, postion, experience, educationalBackground, previousPosition);
                    dispose(); // Close the registration frame
                    // Back to homepage
                    new HomePage_votersRegistration().setVisible(true);
                }
            }
        } else if (e.getSource() == btnBack) {
            int confirmation = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to go back?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
                dispose(); 
                new HomePage_votersRegistration().setVisible(true);
            }
        }
    }
    private String getSelectedGender() {
        if (rbMale.isSelected()) {
            return "Male";
        } else if (rbFemale.isSelected()) {
            return "Female";
        } else if (rbOther.isSelected()) {
            return "Other/Prefer not to say";
        } else {
            return "";
        }
    }

    private boolean isNumeric(String str) {
        if (!str.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Contact number should contain numbers only.",
                    "Invalid Contact Number", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isBelow18(String dateOfBirth) {
        if (dateOfBirth.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a date of birth.", "Registration Error",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        dateFormat.setLenient(false);

        try {
            Date birthDate = dateFormat.parse(dateOfBirth);

            Calendar currentDate = Calendar.getInstance();
            Calendar birthDateCalendar = Calendar.getInstance();
            birthDateCalendar.setTime(birthDate);

            int age = currentDate.get(Calendar.YEAR) - birthDateCalendar.get(Calendar.YEAR);

            if (currentDate.get(Calendar.MONTH) < birthDateCalendar.get(Calendar.MONTH)
                    || (currentDate.get(Calendar.MONTH) == birthDateCalendar.get(Calendar.MONTH)
                            && currentDate.get(Calendar.DAY_OF_MONTH) < birthDateCalendar
                                    .get(Calendar.DAY_OF_MONTH))) {
                age--;
            }

            if (age < 18) {
                                String message = "Registration not allowed. Must be 18 years old or above.";
                JOptionPane.showMessageDialog(null, message, "Registration Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            return true;
        } catch (ParseException e) {
            String message = "Invalid date format. Please use the format: MMMM d, yyyy";
            JOptionPane.showMessageDialog(null, message, "Registration Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean isCorrectDateFormat(String date) {
        if (date.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a date.", "Date Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            String message = "Invalid date format. Please use the format: MMMM d, yyyy";
            JOptionPane.showMessageDialog(null, message, "Date Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

   private void registerCandidate(String fullName, String dateOfBirth, String address, String contactInformation,
        String gender, String partyAffiliation, String position, String experience, String educationalBackground,
        String previousPosition) {
    String registrationDetails = "Registration Successful\n\n" +
            "Full Name: " + fullName + "\n" +
            "Date of Birth: " + dateOfBirth + "\n" +
            "Address: " + address + "\n" +
            "Contact Information: " + contactInformation + "\n" +
            "Gender: " + gender + "\n" +
            "Party Affiliation: " + partyAffiliation + "\n" +
            "Position: " + position + "\n" +
            "Experience: " + experience + "\n" +
            "Educational Background: " + educationalBackground + "\n" +
            "Previous Position: " + previousPosition + "\n";

    JOptionPane.showMessageDialog(this, registrationDetails, "Registration Successful",
            JOptionPane.INFORMATION_MESSAGE);
    }
}

    

