package votersregistration;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class votersFrame extends JFrame implements ActionListener {
    JLabel lblVotersRegistration = new JLabel("Voters Registration");
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
    JLabel lblCitizenshipStatus = new JLabel("Citizenship Status:");
    String[] citizenshipOptions = { "Filipino", "Dual Citizenship" };
    JComboBox<String> citizenshipComboBox = new JComboBox<>(citizenshipOptions);
    JButton btnRegister = new JButton("Register");
    JButton btnBack = new JButton("Back");

    public votersFrame() {
        setSize(500, 550);
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
        lblVotersRegistration.setForeground(textColor);
        lblFullName.setForeground(textColor);
        lblDateOfBirth.setForeground(textColor);
        lblAddress.setForeground(textColor);
        lblContactInformation.setForeground(textColor);
        lblGender.setForeground(textColor);
        lblCitizenshipStatus.setForeground(textColor);
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

        rbMale.setBackground(backgroundColor);
        rbMale.setForeground(textColor);
        rbFemale.setBackground(backgroundColor);
        rbFemale.setForeground(textColor);
        rbOther.setBackground(backgroundColor);
        rbOther.setForeground(textColor);

        citizenshipComboBox.setBackground(beige);
        citizenshipComboBox.setForeground(comboBoxTextColor);

        // Font styles
        Font titleFont = new Font("Arial", Font.BOLD, 36);
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        Font radioButtonFont = new Font("Arial", Font.BOLD, 14);

        lblVotersRegistration.setFont(titleFont);
        lblFullName.setFont(labelFont);
        lblDateOfBirth.setFont(labelFont);
        lblAddress.setFont(labelFont);
        lblContactInformation.setFont(labelFont);
        lblGender.setFont(labelFont);
        lblCitizenshipStatus.setFont(labelFont);
        btnRegister.setFont(buttonFont);
        btnBack.setFont(buttonFont);
        rbMale.setFont(radioButtonFont);
        rbFemale.setFont(radioButtonFont);
        rbOther.setFont(radioButtonFont);

        lblVotersRegistration.setFont(titleFont);
        lblFullName.setFont(labelFont);
        lblDateOfBirth.setFont(labelFont);
        lblAddress.setFont(labelFont);
        lblContactInformation.setFont(labelFont);
        lblGender.setFont(labelFont);
        lblCitizenshipStatus.setFont(labelFont);
        btnRegister.setFont(buttonFont);
        btnBack.setFont(buttonFont);
        rbMale.setFont(radioButtonFont);
        rbFemale.setFont(radioButtonFont);
        rbOther.setFont(radioButtonFont);

        // SetBounds
        lblVotersRegistration.setBounds(80, 25, 500, 50);
        lblFullName.setBounds(40, 120, 150, 30);
        txtFullName.setBounds(250, 120, 200, 30);
        lblDateOfBirth.setBounds(40, 170, 200, 30);
        txtDateOfBirth.setBounds(250, 170, 200, 30);
        txtDateOfBirth.setToolTipText("Example Date Format: December 18, 2002");
        lblAddress.setBounds(40, 220, 150, 30);
        txtAddress.setBounds(250, 220, 200, 30);
        txtAddress.setToolTipText("Address Format: Street, City, State, Postal Code");
        lblContactInformation.setBounds(40, 270, 200, 30);
        txtContactInformation.setBounds(250, 270, 200, 30);
        lblGender.setBounds(40, 320, 200, 30);
        rbMale.setBounds(130, 323, 80, 30);
        rbFemale.setBounds(210, 323, 80, 30);
        rbOther.setBounds(293, 323, 200, 30);
        lblCitizenshipStatus.setBounds(40, 370, 200, 30);
        citizenshipComboBox.setBounds(250, 370, 200, 30);
        btnRegister.setBounds(80, 430, 120, 30);
        btnBack.setBounds(280, 430, 120, 30);

        // Add components to the panel
        panel.add(lblVotersRegistration);
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
        panel.add(lblCitizenshipStatus);
        panel.add(citizenshipComboBox);
        panel.add(btnRegister);
        panel.add(btnBack);

        // Action Listeners
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
            String citizenshipStatus = (String) citizenshipComboBox.getSelectedItem();

            // To check for blank info 
            if (fullName.isEmpty() || dateOfBirth.isEmpty() || address.isEmpty() || contactInformation.isEmpty()
                    || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please complete all the required details.",
                        "Incomplete Information", JOptionPane.WARNING_MESSAGE);
            } else {
                // Validate age, date format, and contact number
                if (isBelow18(dateOfBirth) && isCorrectDateFormat(dateOfBirth) && isNumeric(contactInformation)) {
                    registerVoter(fullName, dateOfBirth, address, contactInformation, gender, citizenshipStatus);
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

    private void registerVoter(String fullName, String dateOfBirth, String address, String contactInformation,
            String gender, String citizenshipStatus) {
        JOptionPane.showMessageDialog(this,
                "Registration Successful\n\n" + "Full Name: " + fullName + "\n" + "Date of Birth: " + dateOfBirth
                        + "\n" + "Address: " + address + "\n" + "Contact Information: " + contactInformation + "\n"
                        + "Gender: " + gender + "\n" + "Citizenship Status: " + citizenshipStatus,
                "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
    }
}
