package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton yes, no, other, married, unmarried;
    JComboBox religion, category, income, qualification, occupation;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD,20));
        religionLabel.setBounds(100,140,100,30);
        add(religionLabel);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD,20));
        categoryLabel.setBounds(100,190,200,30);
        add(categoryLabel);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD,20));
        incomeLabel.setBounds(100,240,200,30);
        add(incomeLabel);

        String valincome[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
        
        JLabel educationLabel = new JLabel("Educational");
        educationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        educationLabel.setBounds(100,290,200,30);
        add(educationLabel); 
        
        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD,20));
        qualificationLabel.setBounds(100,315,200,30);
        add(qualificationLabel);      
        
        String valqualification[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        qualification = new JComboBox(valqualification);
        qualification.setBounds(300,300,400,30);
        qualification.setBackground(Color.white);
        add(qualification);
                
        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont((new Font("Raleway",Font.BOLD,20)));
        occupationLabel.setBounds(100,360,200,30);
        add(occupationLabel);
        
        String valoccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(300,360,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        JLabel panlabel = new JLabel("PAN Number:");
        panlabel.setFont((new Font("Raleway",Font.BOLD,20)));
        panlabel.setBounds(100,420,200,30);
        add(panlabel);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);
        
        JLabel aadharlabel = new JLabel("Aadhar Number:");
        aadharlabel.setFont((new Font("Raleway",Font.BOLD,20)));
        aadharlabel.setBounds(100,480,200,30);
        add(aadharlabel);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,480,400,30);
        add(aadharTextField);
        
        JLabel seniorlabel = new JLabel("Senior Citizen:");
        seniorlabel.setFont((new Font("Raleway",Font.BOLD,20)));
        seniorlabel.setBounds(100,540,200,30);
        add(seniorlabel);
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.white);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(400,540,100,30);
        no.setBackground(Color.white);
        add(no);   
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(yes);
        seniorgroup.add(no);
        
        JLabel accountlabel = new JLabel("Existing Account:");
        accountlabel.setFont((new Font("Raleway",Font.BOLD,20)));
        accountlabel.setBounds(100,590,200,30);
        add(accountlabel);
        
        yes = new JRadioButton("Yes");
        yes.setBounds(300,590,100,30);
        yes.setBackground(Color.white);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(400,590,100,30);
        no.setBackground(Color.white);
        add(no);   
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(yes);
        existinggroup.add(no);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.black);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String squalification = (String)qualification.getSelectedItem(); 
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if (yes.isSelected()) {
            seniorcitizen = "Yes";
        } else if(no.isSelected()) {
            seniorcitizen = "No";
        }
        String sexisting = null;
        if (yes.isSelected()) {
            sexisting = "Yes";
        } else if (no.isSelected()) {
            sexisting = "No";
        }
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        try {   
            if(sreligion.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else if(scategory.equals("")) {
                JOptionPane.showMessageDialog(null,"Father's Name is Required");
            }else if(sincome.equals("")) {
                JOptionPane.showMessageDialog(null,"Date of Birth is Required");
            }else if(squalification.equals("")) {
                JOptionPane.showMessageDialog(null,"Email is Required");
            }else if(soccupation.equals("")) {
                JOptionPane.showMessageDialog(null,"Gender is Required");
            }else if(seniorcitizen.equals("")) {
                JOptionPane.showMessageDialog(null,"Marital Status is Required");
            }else if(sexisting.equals("")) {
                JOptionPane.showMessageDialog(null,"Address is Required");
            }else if(span.equals("")) {
                JOptionPane.showMessageDialog(null,"City is Required");
            }else if(saadhar.equals("")) {
                JOptionPane.showMessageDialog(null,"State is Required");
            }else {
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"','"+sincome+"','"+squalification+"','"+soccupation+"','"+span+"','"+saadhar+"', '"+seniorcitizen+"','"+sexisting+"')";
            c.s.executeUpdate(query);
            
            //SignupThree Object
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}
