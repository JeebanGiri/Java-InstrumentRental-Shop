import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;

public class SarangiSansar {

    final static int INVALID = -1;

    ArrayList<Instrument> list = new ArrayList<>();
    String year[] = { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017","2018","2019","2020","2021","2022","2023","2024","2025"};
    String month[] = { "Janurary", "feburary", "march", "April", "May", "June", "july", "August", "Septerber", "October",
            "November", "december" };
    String day[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20","21","22","23","24","25","26","27","28","29","30"};   

    private JFrame frame;
    private JLabel titleLabel;
    private JButton insRentBtn;
    private JButton insSellBtn;

    private JFrame frame1;
    private JButton backBtn1;
    private JButton addButton1;
    private JButton rentButton1;
    private JButton returnButton1;
    private JPanel framePanel1;

    // for add panel of rent
    private JPanel panel1;
    private JLabel nameLabel;
    private JLabel chargLabel;
    private JTextField namTextField;
    private JTextField chargTextField;

    private JPanel panel2;
    private JButton addBtn1;
    private JButton clearBtn1;
    private JButton displayBtn1;

    // for rent panel of rent frame
    private JPanel panel3;
    private JLabel insNameLabel;
    private JTextField insNameTField;
    private JLabel cusNameLabel;
    private JTextField cusNameTField;
    private JLabel cusPhoneLabel;
    private JTextField cusPhoneTField;
    private JLabel cusPanLabel;
    private JTextField cusPanTFeild;
    private JLabel rentDateLabel;
    private JLabel retrunDateLabel;
    private JLabel rentingDaysLabel;
    private JTextField rentingDateTFeild;

    // creating combobox of rented days and returned days
    private JPanel rentDatePanel;
    private JPanel returnDatePanel;

    private JComboBox<String> yearCB;
    private JComboBox<String> monthCB;
    private JComboBox<String> dayCB;

    private JComboBox<String> yearCB1;
    private JComboBox<String> monthCB1;
    private JComboBox<String> dayCB1;

    private JComboBox<String> yearCB2;
    private JComboBox<String> monthCB2;
    private JComboBox<String> dayCB2;

    // creatin the side panel for rent
    private JPanel panel4;
    private JButton rentBtn2;
    private JButton clearBtn2;
    private JButton displayBtn2;

    // creating the panel for return panel
    private JPanel panel5;
    private JLabel instNameLabel;
    private JTextField instNameTextField;

    // creating side panel of return panel
    private JPanel panel6;
    private JButton returnBtn3;
    private JButton clearBtn3;
    private JButton displayBtn3;

    // creating frame 2
    private JFrame frame2;
    private JButton backBtn2;
    private JButton addButton2;
    private JButton sellButton2;
    private JPanel framePanel2;

    // creating the panel for add the instrument
    private JPanel panel7;
    private JLabel insNameLbl;
    private JLabel priceLbl;
    private JTextField insNameTF;
    private JTextField priceTF;

    private JPanel panel8;
    private JButton addBtn4;
    private JButton clearBtn4;
    private JButton displayBtn4;

    // creating the panel for sell the instrument
    private JPanel panel9;
    private JLabel instNameLbl;
    private JLabel cusNameLbl;
    private JLabel cusPhoneLbl;
    private JLabel cusPanNoLbl;
    private JLabel sellDateLbl;
    private JLabel disPerLbl;

    private JTextField instNameTF;
    private JTextField cusNameTF;
    private JTextField cusPhoneTF;
    private JTextField cusPanNoTF;
    private JPanel sellDatePanel;
    private JTextField disPerTF;

    private JPanel panel10;
    private JButton sellBtn5;
    private JButton clearBtn5;
    private JButton displayBtn5;


    public SarangiSansar()
    {
        frame();
        rentFrame();
        sellFrame();
        frame.setVisible(true);

    }

    public void frame()
    {
        frame = new JFrame();
        frame.setBounds(600, 200, 700, 400);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel();
        titleLabel.setText("Welcome To Sarangi Sansar");
        titleLabel.setFont(new Font("light-gray", Font.BOLD, 28));
        titleLabel.setBounds(140, 20, 400, 50);
        frame.add(titleLabel);

        insRentBtn = new JButton();
        insRentBtn.setText("Rent Instrument");
        insRentBtn.setBounds(120, 200, 175, 40);
        insRentBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(insRentBtn);

        insSellBtn = new JButton();
        insSellBtn.setText("Sell Instrument");
        insSellBtn.setBounds(400, 200, 170, 40);
        insSellBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(insSellBtn);

        insRentBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame1.setVisible(true);
                framePanel1.setVisible(true);
            }
        });

        insSellBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame2.setVisible(true);
            }
        });

    }


    public void rentFrame()
    {
        

        frame1 = new JFrame("Rent Instrument");
        frame1.setBounds(300, 120, 1300, 750);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Border lineBorder1= BorderFactory.createLineBorder(Color.black, 5);

        framePanel1=new JPanel();
        framePanel1.setBounds(20, 70, 1050, 600);
        framePanel1.setBorder(lineBorder1);
        // framePanel1.setBackground((new Color(67, 25, 10)));
        // framePanel1.setBackground(Color.lightGray);
        framePanel1.setLayout(null);
        frame1.add(framePanel1);
        

        backBtn1 = new JButton();
        backBtn1.setText("Back");
        backBtn1.setBounds(0, 0, 90, 30);
        backBtn1.setFont(new Font("Arial", Font.BOLD, 15));
        backBtn1.setBackground(Color.BLACK.darker());
        backBtn1.setForeground(Color.LIGHT_GRAY.brighter());
        frame1.add(backBtn1);

        backBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                frame1.setVisible(false);
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(false);
                panel6.setVisible(false);
                framePanel1.setBackground(Color.WHITE);
                addButton1.setBackground(Color.BLUE.darker());
                rentButton1.setBackground(Color.BLUE.darker());
                returnButton1.setBackground(Color.BLUE.darker());
                
            }
        });

        addButton1 = new JButton();
        addButton1.setText("Add");
        addButton1.setBounds(400, 20, 120, 40);
        addButton1.setFont(new Font("Arial", Font.BOLD, 15));
        addButton1.setBackground(Color.BLUE.darker());
        addButton1.setForeground(Color.LIGHT_GRAY.brighter());
        frame1.add(addButton1);

        addButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(true);
                addButton1.setBackground(Color.gray);
                addButton1.setForeground(Color.white);
                rentButton1.setBackground(Color.BLUE.darker());
                rentButton1.setForeground(Color.LIGHT_GRAY.brighter());
                returnButton1.setBackground(Color.BLUE.darker());
                returnButton1.setForeground(Color.LIGHT_GRAY.brighter());
                framePanel1.setBackground(Color.lightGray);
               
            }
        });

        rentButton1 = new JButton();
        rentButton1.setText("Rent");
        rentButton1.setBounds(600, 20, 120, 40);
        rentButton1.setFont(new Font("Arial", Font.BOLD, 15));
        rentButton1.setBackground(Color.BLUE.darker());
        rentButton1.setForeground(Color.LIGHT_GRAY.brighter());
        frame1.add(rentButton1);

        rentButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(true);
                panel4.setVisible(true);
                addButton1.setBackground(Color.BLUE.darker());
                addButton1.setForeground(Color.LIGHT_GRAY.brighter());
                rentButton1.setBackground(Color.gray);
                rentButton1.setForeground(Color.white);
                returnButton1.setBackground(Color.BLUE.darker());
                returnButton1.setForeground(Color.LIGHT_GRAY.brighter());
                framePanel1.setBackground(Color.lightGray);
            }
        });

        returnButton1 = new JButton();
        returnButton1.setText("Return");
        returnButton1.setBounds(800, 20, 120, 40);
        returnButton1.setFont(new Font("Arial", Font.BOLD, 15));
        returnButton1.setBackground(Color.BLUE.darker());
        returnButton1.setForeground(Color.LIGHT_GRAY.brighter());
        frame1.add(returnButton1);

        returnButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel5.setVisible(true);
                panel6.setVisible(true);
                returnButton1.setBackground(Color.gray);
                returnButton1.setForeground(Color.white);
                addButton1.setBackground(Color.BLUE.darker());
                addButton1.setForeground(Color.LIGHT_GRAY.brighter());
                rentButton1.setBackground(Color.BLUE.darker());
                rentButton1.setForeground(Color.LIGHT_GRAY.brighter());
                framePanel1.setBackground(Color.lightGray);

            }
        });

        panel1 = new JPanel();
        panel1.setBounds(20, 30, 1000, 100);
        // panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setLayout(null);
        panel1.setVisible(false);


        TitledBorder borderPanel1 = BorderFactory.createTitledBorder(
                "Add");
        borderPanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel1.setTitleJustification(TitledBorder.LEFT);
        panel1.setBorder(borderPanel1);

        nameLabel = new JLabel("Instrument Name:");
        nameLabel.setBounds(20, 30, 200, 40);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel1.add(nameLabel);

        namTextField = new JTextField();
        namTextField.setBounds(270, 30, 250, 40);
        namTextField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel1.add(namTextField);

        chargLabel = new JLabel("Charge Per Day:");
        chargLabel.setBounds(550, 30, 200, 40);
        chargLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel1.add(chargLabel);

        chargTextField = new JTextField();
        chargTextField.setBounds(750, 30, 245, 40);
        chargTextField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel1.add(chargTextField);
        framePanel1.add(panel1);

        // add panel
        panel2 = new JPanel();
        panel2.setBounds(1100, 70, 150, 160);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(null);
        panel2.setVisible(false);
        frame1.add(panel2);

        TitledBorder borderPanel2 = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel2.setTitleJustification(TitledBorder.LEFT);
        panel2.setBorder(borderPanel2);

        addBtn1 = new JButton();
        addBtn1.setText("Add");
        addBtn1.setBounds(25, 10, 100, 40);
        addBtn1.setFont(new Font("Arial", Font.BOLD, 15));
        panel2.add(addBtn1);
        addBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addInstrumentToRent();
            }
        });

        clearBtn1 = new JButton();
        clearBtn1.setText("Clear");
        clearBtn1.setBounds(25, 60, 100, 40);
        clearBtn1.setFont(new Font("Arial", Font.BOLD, 15));
        panel2.add(clearBtn1);

        clearBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearAddedTFInInstrumentToRent();
            }
        });

        displayBtn1 = new JButton();
        displayBtn1.setText("Display");
        displayBtn1.setBounds(25, 110, 100, 40);
        displayBtn1.setFont(new Font("Arial", Font.BOLD, 15));
        panel2.add(displayBtn1);

        displayBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayAddedInstrumentInInstrumentToRent();
            }
        });



        // rent panel
        panel3 = new JPanel();
        panel3.setBounds(20, 180, 1000, 210);
        // panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setLayout(null);
        panel3.setVisible(false);
        framePanel1.add(panel3);

        TitledBorder borderPanel3 = BorderFactory.createTitledBorder(
                "Rent");
        borderPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel3.setTitleJustification(TitledBorder.LEFT);
        panel3.setBorder(borderPanel3);

        insNameLabel = new JLabel("Instrument Name:");
        insNameLabel.setBounds(20, 20, 200, 40);
        insNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(insNameLabel);

        insNameTField = new JTextField();
        insNameTField.setBounds(270, 20, 250, 40);
        insNameTField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel3.add(insNameTField);

        cusNameLabel = new JLabel("Customer Name:");
        cusNameLabel.setBounds(20, 65, 200, 40);
        cusNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(cusNameLabel);

        cusNameTField = new JTextField();
        cusNameTField.setBounds(270, 65, 250, 40);
        cusNameTField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel3.add(cusNameTField);

        cusPhoneLabel = new JLabel("Customer Mobile No:");
        cusPhoneLabel.setBounds(20, 110, 200, 40);
        cusPhoneLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(cusPhoneLabel);

        cusPhoneTField = new JTextField();
        cusPhoneTField.setBounds(270, 110, 250, 40);
        cusPhoneTField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel3.add(cusPhoneTField);

        cusPanLabel = new JLabel("Customer PAN No:");
        cusPanLabel.setBounds(20, 155, 200, 40);
        cusPanLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(cusPanLabel);

        cusPanTFeild = new JTextField();
        cusPanTFeild.setBounds(270, 155, 250, 40);
        cusPanTFeild.setFont(new Font("verdana", Font.PLAIN, 15));
        panel3.add(cusPanTFeild);

        rentDateLabel = new JLabel("Rented Date:");
        rentDateLabel.setBounds(550, 20, 200, 40);
        rentDateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(rentDateLabel);

        rentDatePanel = new JPanel();
        rentDatePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rentDatePanel.setLayout(new FlowLayout());
        rentDatePanel.setBounds(750, 20, 245, 40);
        rentDatePanel.setFont(new Font("verdana", Font.PLAIN, 15));

        yearCB= new JComboBox<>(year);
        rentDatePanel.add(yearCB);

        monthCB = new JComboBox<>(month);
        rentDatePanel.add(monthCB);

        dayCB = new JComboBox<>(day);
        rentDatePanel.add(dayCB);

        panel3.add(rentDatePanel);

        retrunDateLabel = new JLabel("Returned Date:");
        retrunDateLabel.setBounds(550, 65, 200, 40);
        retrunDateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(retrunDateLabel);

        // creating combo box of return date.
        returnDatePanel = new JPanel();
        returnDatePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        returnDatePanel.setLayout(new FlowLayout());
        returnDatePanel.setBounds(750, 65, 245, 40);
        returnDatePanel.setFont(new Font("verdana", Font.PLAIN, 15));

        yearCB1 = new JComboBox<>(year);
        returnDatePanel.add(yearCB1);

        monthCB1 = new JComboBox<>(month);
        returnDatePanel.add(monthCB1);

        dayCB1 = new JComboBox<>(day);
        returnDatePanel.add(dayCB1);

        panel3.add(returnDatePanel);

        rentingDaysLabel = new JLabel("No Of Days:");
        rentingDaysLabel.setBounds(550, 110, 200, 40);
        rentingDaysLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(rentingDaysLabel);

        rentingDateTFeild = new JTextField();
        rentingDateTFeild.setBounds(750, 110, 245, 40);
        rentingDateTFeild.setFont(new Font("verdana", Font.PLAIN, 15));
        panel3.add(rentingDateTFeild);

        // side rentpanel
        panel4 = new JPanel();
        panel4.setBounds(1100, 270, 150, 160);  
        panel4.setBackground(Color.LIGHT_GRAY);
        panel4.setLayout(null);
        panel4.setVisible(false);
        frame1.add(panel4);

        TitledBorder borderPanel4 = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel4.setTitleJustification(TitledBorder.LEFT);
        panel4.setBorder(borderPanel4);

        rentBtn2 = new JButton();
        rentBtn2.setText("Rent");
        rentBtn2.setBounds(25, 10, 100, 40);
        rentBtn2.setFont(new Font("Arial", Font.BOLD, 15));
        panel4.add(rentBtn2);

        rentBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rentInstrumentInInstrumentToRent();
            }
        });

        clearBtn2 = new JButton();
        clearBtn2.setText("Clear");
        clearBtn2.setBounds(25, 60, 100, 40);
        clearBtn2.setFont(new Font("Arial", Font.BOLD, 15));
        panel4.add(clearBtn2);

        clearBtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearRentedTFInInstrumentToRent();
            }
        });

        displayBtn2 = new JButton();
        displayBtn2.setText("Display");
        displayBtn2.setBounds(25, 110, 100, 40);
        displayBtn2.setFont(new Font("Arial", Font.BOLD, 15));
        panel4.add(displayBtn2);

        displayBtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayRentedInstrumentInInstrumentToRent();
            }
        });
        

        

        // return panel
        panel5 = new JPanel();
        panel5.setBounds(20, 450, 1000, 80);
        // panel5.setBackground(Color.LIGHT_GRAY);
        panel5.setLayout(null);
        panel5.setVisible(false);
        framePanel1.add(panel5);

        TitledBorder borderPanel5 = BorderFactory.createTitledBorder(
                "Return");
        borderPanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel5.setTitleJustification(TitledBorder.LEFT);
        panel5.setBorder(borderPanel5);

        instNameLabel = new JLabel("Instrument Name:");
        instNameLabel.setBounds(20, 20, 200, 40);
        instNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel5.add(instNameLabel);

        instNameTextField = new JTextField();
        instNameTextField.setBounds(270, 20, 250, 40);
        instNameTextField.setFont(new Font("verdana", Font.PLAIN, 15));
        panel5.add(instNameTextField);

        // side renturn panel
        panel6 = new JPanel();
        panel6.setBounds(1100, 470, 150, 160);
        panel6.setBackground(Color.LIGHT_GRAY);
        panel6.setLayout(null);
        panel6.setVisible(false);
        frame1.add(panel6);

        TitledBorder borderPanel6 = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel6.setTitleJustification(TitledBorder.LEFT);
        panel6.setBorder(borderPanel6);

        returnBtn3 = new JButton();
        returnBtn3.setText("Return");
        returnBtn3.setBounds(25, 10, 100, 40);
        returnBtn3.setFont(new Font("Arial", Font.BOLD, 15));
        panel6.add(returnBtn3);

        returnBtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                rentReturnInstrumentInInstrumentToRent();
            }
        });

        clearBtn3 = new JButton();
        clearBtn3.setText("Clear");
        clearBtn3.setBounds(25, 60, 100, 40);
        clearBtn3.setFont(new Font("Arial", Font.BOLD, 15));
        panel6.add(clearBtn3);

        clearBtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearReturnTFInInstrumentToRent();
            }
        });

        displayBtn3 = new JButton();
        displayBtn3.setText("Display");
        displayBtn3.setBounds(25, 110, 100, 40);
        displayBtn3.setFont(new Font("Arial", Font.BOLD, 15));
        panel6.add(displayBtn3);

        displayBtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayReturnedInsInInstrumentToRent();  
            }
        });





        
    }

    public void sellFrame()
    {
        frame2 = new JFrame("Sell Instrument");
        frame2.setBounds(300, 120, 1300, 650);
        frame2.setLayout(null);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Border lineBorder2= BorderFactory.createLineBorder(Color.black, 5);

        framePanel2=new JPanel();
        framePanel2.setBounds(20, 70, 1050, 500);
        framePanel2.setBorder(lineBorder2);
        framePanel2.setLayout(null);
        // framePanel2.setBackground(Color.lightGray);
        frame2.add(framePanel2);

        backBtn2 = new JButton();
        backBtn2.setText("Back");
        backBtn2.setBounds(0, 0, 90, 30);
        backBtn2.setFont(new Font("Arial", Font.BOLD, 15));
        backBtn2.setBackground(Color.BLACK.darker());
        backBtn2.setForeground(Color.LIGHT_GRAY.brighter());
        frame2.add(backBtn2);

        backBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                frame2.setVisible(false);
                panel7.setVisible(false);
                panel8.setVisible(false);
                panel9.setVisible(false);
                panel10.setVisible(false);
                framePanel2.setBackground(Color.white);
                addButton2.setBackground(Color.BLUE.darker());
                sellButton2.setBackground(Color.BLUE.darker());

            }
        });

        addButton2 = new JButton();
        addButton2.setText("Add");
        addButton2.setBounds(500, 20, 120, 40);
        addButton2.setFont(new Font("Arial", Font.BOLD, 15));
        addButton2.setBackground(Color.BLUE.darker());
        addButton2.setForeground(Color.LIGHT_GRAY.brighter());
        frame2.add(addButton2);

        addButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel7.setVisible(true);
                panel8.setVisible(true);
                addButton2.setBackground(Color.gray);
                addButton2.setForeground(Color.white);
                sellButton2.setBackground(Color.BLUE.darker());
                sellButton2.setForeground(Color.LIGHT_GRAY.brighter());
                framePanel2.setBackground(Color.lightGray);

            }
        });

        sellButton2 = new JButton();
        sellButton2.setText("Sell");
        sellButton2.setBounds(700, 20, 120, 40);
        sellButton2.setFont(new Font("Arial", Font.BOLD, 15));
        sellButton2.setBackground(Color.BLUE.darker());
        sellButton2.setForeground(Color.LIGHT_GRAY.brighter());
        frame2.add(sellButton2);

        sellButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel9.setVisible(true);
                panel10.setVisible(true);
                sellButton2.setBackground(Color.gray);
                sellButton2.setForeground(Color.white);
                addButton2.setBackground(Color.BLUE.darker());
                addButton2.setForeground(Color.LIGHT_GRAY.brighter());
                framePanel2.setBackground(Color.lightGray);
                
            }
        });

        // add panel of sell
        panel7 = new JPanel();
        panel7.setBounds(20, 50, 1000, 100);
        // panel7.setBackground(Color.LIGHT_GRAY);
        panel7.setLayout(null);
        panel7.setVisible(false);
        framePanel2.add(panel7);

        TitledBorder borderPanel7 = BorderFactory.createTitledBorder("Add");
        borderPanel7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel7.setTitleJustification(TitledBorder.LEFT);
        panel7.setBorder(borderPanel7);

        insNameLbl = new JLabel("Instrument Name:");
        insNameLbl.setBounds(20, 30, 200, 40);
        insNameLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel7.add(insNameLbl);

        insNameTF = new JTextField();
        insNameTF.setBounds(270, 30, 250, 40);
        insNameTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel7.add(insNameTF);

        priceLbl = new JLabel("Price:");
        priceLbl.setBounds(550, 30, 200, 40);
        priceLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel7.add(priceLbl);

        priceTF = new JTextField();
        priceTF.setBounds(750, 30, 245, 40);
        priceTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel7.add(priceTF);

        // add side panel of sell
        panel8 = new JPanel();
        panel8.setBounds(1100, 90, 150, 160);
        panel8.setBackground(Color.LIGHT_GRAY);
        panel8.setLayout(null);
        panel8.setVisible(false);
        frame2.add(panel8);

        TitledBorder borderPanel8 = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel8.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel8.setTitleJustification(TitledBorder.LEFT);
        panel8.setBorder(borderPanel8);

        addBtn4 = new JButton();
        addBtn4.setText("Add");
        addBtn4.setBounds(25, 10, 100, 40);
        addBtn4.setFont(new Font("Arial", Font.BOLD, 15));
        panel8.add(addBtn4);

        addBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAddInInstrumentToSell();
            }
        });

        clearBtn4 = new JButton();
        clearBtn4.setText("Clear");
        clearBtn4.setBounds(25, 60, 100, 40);
        clearBtn4.setFont(new Font("Arial", Font.BOLD, 15));
        panel8.add(clearBtn4);

        clearBtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearAddTFInInstrumentToSell();
            }
        });

        displayBtn4 = new JButton();
        displayBtn4.setText("Display");
        displayBtn4.setBounds(25, 110, 100, 40);
        displayBtn4.setFont(new Font("Arial", Font.BOLD, 15));
        panel8.add(displayBtn4);

        displayBtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displayAddedInInstrumentToSell();
            }
        });

        // sell panel of sell frame
        panel9 = new JPanel();
        panel9.setBounds(20, 230, 1000, 200);
        // panel9.setBackground(Color.LIGHT_GRAY);
        panel9.setLayout(null);
        panel9.setVisible(false);
        framePanel2.add(panel9);

        TitledBorder borderPanel3 = BorderFactory.createTitledBorder(
                "Sell");
        borderPanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel3.setTitleJustification(TitledBorder.LEFT);
        panel9.setBorder(borderPanel3);

        instNameLbl = new JLabel("Instrument Name:");
        instNameLbl.setBounds(20, 30, 200, 40);
        instNameLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(instNameLbl);

        instNameTF = new JTextField();
        instNameTF.setBounds(270, 30, 250, 40);
        instNameTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel9.add(instNameTF);

        cusNameLbl = new JLabel("Customer Name:");
        cusNameLbl.setBounds(20, 75, 200, 40);
        cusNameLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(cusNameLbl);

        cusNameTF = new JTextField();
        cusNameTF.setBounds(270, 75, 250, 40);
        cusNameTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel9.add(cusNameTF);

        cusPhoneLbl = new JLabel("Customer Mobile No:");
        cusPhoneLbl.setBounds(20, 120, 200, 40);
        cusPhoneLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(cusPhoneLbl);

        cusPhoneTF = new JTextField();
        cusPhoneTF.setBounds(270, 120, 250, 40);
        cusPhoneTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel9.add(cusPhoneTF);

        cusPanNoLbl = new JLabel("CustomerPAN No:");
        cusPanNoLbl.setBounds(550, 30, 200, 40);
        cusPanNoLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(cusPanNoLbl);

        cusPanNoTF = new JTextField();
        cusPanNoTF.setBounds(750, 30, 245, 40);
        cusPanNoTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel9.add(cusPanNoTF);

        sellDateLbl = new JLabel("Sell Date:");
        sellDateLbl.setBounds(550, 75, 200, 40);
        sellDateLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(sellDateLbl);

        // creating combo box of return date.
        sellDatePanel = new JPanel();
        sellDatePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sellDatePanel.setLayout(new FlowLayout());
        sellDatePanel.setBounds(750, 75, 245, 40);
        sellDatePanel.setFont(new Font("verdana", Font.PLAIN, 15));

        yearCB2 = new JComboBox<>(year);
        sellDatePanel.add(yearCB2);

        monthCB2 = new JComboBox<>(month);
        sellDatePanel.add(monthCB2);

        dayCB2 = new JComboBox<>(day);
        sellDatePanel.add(dayCB2);

        panel9.add(sellDatePanel);

        disPerLbl = new JLabel("Discount Percent:");
        disPerLbl.setBounds(550, 120, 200, 40);
        disPerLbl.setFont(new Font("Arial", Font.PLAIN, 20));
        panel9.add(disPerLbl);

        disPerTF = new JTextField();
        disPerTF.setBounds(750, 120, 245, 40);
        disPerTF.setFont(new Font("verdana", Font.PLAIN, 15));
        panel9.add(disPerTF);

        // side sellpanel of sell frame
        panel10 = new JPanel();
        panel10.setBounds(1100, 320, 150, 160);
        panel10.setBackground(Color.LIGHT_GRAY);
        panel10.setLayout(null);
        panel10.setVisible(false);
        frame2.add(panel10);

        TitledBorder borderPanel10 = new TitledBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel10.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        borderPanel10.setTitleJustification(TitledBorder.LEFT);
        panel10.setBorder(borderPanel10);

        sellBtn5 = new JButton();
        sellBtn5.setText("Sell");
        sellBtn5.setBounds(25, 10, 100, 40);
        sellBtn5.setFont(new Font("Arial", Font.BOLD, 15));
        panel10.add(sellBtn5);

        sellBtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sellInstrumentInInstrumentToSell();
            }
        });

        clearBtn5 = new JButton();
        clearBtn5.setText("Clear");
        clearBtn5.setBounds(25, 60, 100, 40);
        clearBtn5.setFont(new Font("Arial", Font.BOLD, 15));
        panel10.add(clearBtn5);

        clearBtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearSellTFInInstrumentToSell();
            }
        });

        displayBtn5 = new JButton();
        displayBtn5.setText("Display");
        displayBtn5.setBounds(25, 110, 100, 40);
        displayBtn5.setFont(new Font("Arial", Font.BOLD, 15));
        panel10.add(displayBtn5);
        displayBtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                displaySellInInstrumentToSell();
            }
        });
    }

    public static void main(String[] args)
    {
        new SarangiSansar();

    }


    // For add frame of rent
    public void addInstrumentToRent()
    {
        if(getInstrumentName().isEmpty() && getChargePerDay().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"Enter the Instrument Name & Charge Per Day","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        else{
        if(getInstrumentName().isEmpty()){  
            JOptionPane.showMessageDialog(frame1,"Enter Instrument Name","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
                if(getChargePerDay().isEmpty()){
                    JOptionPane.showMessageDialog(frame1,"Enter Charge Per Day ","ERROR!!",JOptionPane.ERROR_MESSAGE);
                 }
                    else{
                        String instrumentName=getInstrumentName();
                        int chargePerDay;
                        boolean isRepeated= false;
                    try{
                         chargePerDay=Integer.parseInt(getChargePerDay());
                     }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(frame1,"Please fill positive Integer value in Charge Per Day", "ERROR!",JOptionPane.ERROR_MESSAGE);
                        return;
                     }
                // addInstrument.add(new Instrument(instrumentName));
                for(Instrument ins: list){
                    if(ins.getInstrumentName().equals(getInstrumentName())){
                        JOptionPane.showMessageDialog(frame1,"Instrument Name must be unique","ERROR!", JOptionPane.ERROR_MESSAGE);

                        isRepeated=true;
                    }
                
                }
                     if(isRepeated== false){
                        list.add(new InstrumentToRent(instrumentName, chargePerDay));
                        JOptionPane.showMessageDialog(frame1,"Added Succesfully\n Instrument Name: "+instrumentName+"\n Charge Per Day: "+chargePerDay, "Add",JOptionPane.INFORMATION_MESSAGE);
                        clearAddedTFInInstrumentToRent();
                    }
                }  
        }   
            
    }
    // Getter method for IName textffeild
    public String getInstrumentName() 
    {
        return namTextField.getText().trim();
    }

    // Getter method for chargePerDay TF
     public String getChargePerDay()
     {
         return chargTextField.getText().trim();
     }



    // for clear button of Add panel
    public void clearAddedTFInInstrumentToRent()
    {
        namTextField.setText(null);
        chargTextField.setText(null);
    }

    // for display button of Add panel
    public void displayAddedInstrumentInInstrumentToRent()
    {

     if(list.isEmpty()){
        JOptionPane.showMessageDialog(frame1,"No instrument are added to display..", "DISPLAY",JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            for (Instrument instrument : list){
            InstrumentToRent obj2=(InstrumentToRent) instrument;
             System.out.println("Instrument Name: "+ obj2.getInstrumentName()+"\n Charge Per Day: "+ obj2.getChargePerDay());
            }
        }
    }

    public void rentInstrumentInInstrumentToRent()
    {
            String instrumentName = getInstrumentsName();
            String customerName = getCustomerName();
            String customerMobileNumber = getCustomerMobileNumber();
            int customerPANNo=getCustomerPANNo();
            String rentedDate=getDateOfrent();
            String returnedDate=getDateOfReturn();
            int noOfRentedDays=getNoOfDays();
            boolean isNotFound=false;
            boolean isInvalid=true; 
        
        if (instrumentName.isEmpty()|| customerName.isEmpty()||noOfRentedDays==INVALID|| customerPANNo==INVALID){
            JOptionPane.showMessageDialog(frame1,"Fill all the text field and check PAN Number or No of Days","ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Instrument ins: list){   
                if(ins.getInstrumentName().equals(getInstrumentsName())){
                    if(ins instanceof InstrumentToRent){
                        InstrumentToRent obj3=(InstrumentToRent) ins;
                        
                        isInvalid=false;
                        if(obj3.getIsRented()){
                        JOptionPane.showMessageDialog(frame1, "The instrument is already rented...","ERROR!",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            obj3.rent(customerName, customerMobileNumber, customerPANNo, rentedDate,returnedDate, noOfRentedDays);
                            JOptionPane.showMessageDialog(frame1, "Instrument rented Succesfully\n Instrument Name:"+obj3.getInstrumentName()+"\n Rented to:"+obj3.getCustomerName()+"\n Rented for: "+obj3.getNoOfDays()+"days","Done",JOptionPane.INFORMATION_MESSAGE);
                            clearRentedTFInInstrumentToRent();
                            break;
                        }

                    }else{
                        isNotFound=true;
                    }
                }else{
                    isInvalid=true;
                }
            }if(isInvalid==true && isNotFound==false){
                JOptionPane.showMessageDialog(frame1,"This instrument is not available..    ","ERROR!",JOptionPane.ERROR_MESSAGE);

            }else if(isNotFound==true && isInvalid==false){
                    JOptionPane.showMessageDialog(frame1, "This instrument is not available for rent.","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String getInstrumentsName()
    {
        return insNameTField.getText().trim();
    }

    public String getCustomerName()
    {
        return cusNameTField.getText().trim();
    }

    public String getCustomerMobileNumber()
    {
        return cusPhoneTField.getText().trim();
    }

    public int getCustomerPANNo()
    {
       String customerPantext=cusPanTFeild.getText().trim();
       int panNo=INVALID;

       try{
        panNo=Integer.parseInt(customerPantext);
        if(panNo <=0)
        {
            panNo=INVALID;
        }
       }catch(NumberFormatException e) {
       }
       return panNo;
    }



    public String getDateOfrent()
    {
        String year = yearCB.getSelectedItem().toString();
        String month = monthCB.getSelectedItem().toString();
        String day = dayCB.getSelectedItem().toString();

        String rentDate = year +"-"+month+"-"+day;
        return rentDate;
    }
    public String getDateOfReturn()
    {
        String year = yearCB1.getSelectedItem().toString();
        String month = monthCB1.getSelectedItem().toString();
        String day = dayCB1.getSelectedItem().toString();
        
        String returnDate=year+"-"+month+"-"+day;
        return returnDate;
    }
    public int getNoOfDays()
    {
       String rentingDaysTextFeild = rentingDateTFeild.getText().trim();
        int noOfDays=INVALID;
        try {
            noOfDays = Integer.parseInt(rentingDaysTextFeild);
            if (noOfDays <= 0) {
                noOfDays = INVALID;
            }
        } catch (NumberFormatException e) {
        }
        return noOfDays;
    }




    public void clearRentedTFInInstrumentToRent()
    {
        insNameTField.setText("");
        cusNameTField.setText("");
        cusPhoneTField.setText("");
        cusPanTFeild.setText("");
        rentingDateTFeild.setText("");

    }

    public void displayRentedInstrumentInInstrumentToRent()
    {
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(frame1,"No added instrument ", "DIsplay",JOptionPane.INFORMATION_MESSAGE);

        }
    else{
        for (Instrument ins : list){
                if(ins instanceof InstrumentToRent){
                    ((InstrumentToRent)ins).display();
                }
            }
        }

}




    public void rentReturnInstrumentInInstrumentToRent()
    {
        boolean isInvalid=true;
        if(getInstrumentNames().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Enter Instrument Name","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Instrument instrument: list){
                if(instrument.getInstrumentName().equals(getInstrumentNames())){
                    if(instrument instanceof InstrumentToRent){
                        InstrumentToRent obj4= (InstrumentToRent) instrument;
                        if(obj4.getIsRented()){
                            obj4.returnInstrument();
                            JOptionPane.showMessageDialog(frame1, "Instrument returned Succesfully","Returned",JOptionPane.INFORMATION_MESSAGE);
                            clearReturnTFInInstrumentToRent();
                            isInvalid=false;
                        }
                        else{
                            JOptionPane.showMessageDialog(frame1, "You must rent the instrument before you return","ERROR!",JOptionPane.ERROR_MESSAGE);
                            isInvalid=false;
                        }
                        break;
                     }
                }
            }
            if(isInvalid==true){
                JOptionPane.showMessageDialog(frame1, "Invalid instrument Name","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    



    public void clearReturnTFInInstrumentToRent()
    {
        instNameTextField.setText(null);
    }



    public String getInstrumentNames()
    {
        return instNameTextField.getText().trim();
    }


    public void displayReturnedInsInInstrumentToRent()
    {
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(frame1,"No added instrument ", "Display",JOptionPane.INFORMATION_MESSAGE);

        }
    else{
        for (Instrument ins : list){
                if(ins instanceof InstrumentToRent){
                    ((InstrumentToRent)ins).display();
                }
            }
        }
} 
    



    // For sell button of add frame
    public void addAddInInstrumentToSell()
    {
        if(getInsName().isEmpty() && getPrice().isEmpty()){
            JOptionPane.showMessageDialog(frame2,"Enter the Instrument Name & Price of the instrument","ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if(getInsName().isEmpty()){
            JOptionPane.showMessageDialog(frame2,"Enter Instrument Name","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
            if(getPrice().isEmpty()){
            JOptionPane.showMessageDialog(frame2,"Enter price of the instrument","ERROR!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String instrumentName=getInsName();
                int price;
                boolean isRepeated= false;
                try{
                    price=Integer.parseInt(getPrice());
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(frame2,"Please input positive Integer value in price", "ERROR!",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                for(Instrument ins: list){
                    if(ins.getInstrumentName().equals(getInsName())){
                        JOptionPane.showMessageDialog(frame2,"Instrument Name name name must be unique","ERROR!", JOptionPane.ERROR_MESSAGE);

                        isRepeated=true;
                    }
                
                }
                if(isRepeated== false){
                    list.add(new InstrumentToSell(instrumentName, price));
                    JOptionPane.showMessageDialog(frame2,"Added Succesfully\n Instrument Name: "+instrumentName+"\n Price: "+price, "Added for sell",JOptionPane.INFORMATION_MESSAGE);
                    clearAddTFInInstrumentToSell();
                }
            }
        }         
    }

    public String getInsName()
    {
        return insNameTF.getText().trim();
    }

    public String getPrice()
    {
        return priceTF.getText().trim();
    }



    public void clearAddTFInInstrumentToSell()
    {
        insNameTF.setText(null);
        priceTF.setText(null);
    }

    

    public void displayAddedInInstrumentToSell()
    {
        if(list.isEmpty()){
                JOptionPane.showMessageDialog(frame2,"No instrument are added to display", "ERROR!",JOptionPane.INFORMATION_MESSAGE);
            }
        else{
            for (Instrument ins : list){
                ins.display();
                // InstrumentToSell dis=(InstrumentToSell) instrument;
                // dis= (InstrumentToSell) addedInstrument.get(addedInstrument.size() - 1);
                // JOptionPane.showMessageDialog(frame1, "Instrument name: "+dis.getInstrumentName()+"\n Price: "+dis.getPrice(), "Display",JOptionPane.INFORMATION_MESSAGE);
            }
        }        
    }








    public void sellInstrumentInInstrumentToSell()
    {
        String instrumentName=getInstName();
        String customerName=getCusName();
        String customerMobileNumber=getCusMobileNumber();
        int customerPANNo=getCusPANNo();
        String sellDate=getDateOfSell();
        int discountPercent=getDiscountPercent();
        boolean isInvalid=true;
        boolean isNotFound=false;
        if (instrumentName.isEmpty()|| customerName.isEmpty()|| customerMobileNumber.isEmpty()|| customerPANNo==INVALID|| sellDate.isEmpty()|| discountPercent==INVALID){
            JOptionPane.showMessageDialog(frame2,"Fill all the field and Check Customer Pan No or Discount Percent","ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Instrument obj6: list){
                if(obj6.getInstrumentName().equals(getInstName())){
                    isInvalid=false;
                    if(obj6 instanceof InstrumentToSell){
                        InstrumentToSell instrument=(InstrumentToSell) obj6;
  
                        if(instrument.getIssold()){
                        JOptionPane.showMessageDialog(frame2, "The instrument is already sold","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            instrument.sellInstrument(customerName, customerMobileNumber, customerPANNo, sellDate, discountPercent);
                            JOptionPane.showMessageDialog(frame2, "Instrument Sold Succesfully\n Instrument Name: "+instrument.getInstrumentName()+"\n Price: "+instrument.getprice(),"Done",JOptionPane.INFORMATION_MESSAGE);
                            clearSellTFInInstrumentToSell();
                            break;
                        }

                    }else{
                        isNotFound=true;
                    }
            }if(isInvalid==true){
                JOptionPane.showMessageDialog(frame2,"This instrument is not Found","ERROR!!",JOptionPane.ERROR_MESSAGE);

            }else if(isNotFound==true){
                    JOptionPane.showMessageDialog(frame2, "This instrument is recently not available .","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }



    public String getInstName()
    {
        return instNameTF.getText().trim();
    }
    public String getCusName()
    {
        return cusNameTF.getText().trim();
    }
    public String getCusMobileNumber()
    {
        return cusPhoneTF.getText().trim();
    }
    public int getCusPANNo()
    {
        String customerPANTextFeild = cusPanNoTF.getText().trim();
        int cusPanNoTF = INVALID;
        try {
            cusPanNoTF = Integer.parseInt(customerPANTextFeild);
            if (cusPanNoTF <= 0) {
                cusPanNoTF = INVALID;
            }
        } catch (NumberFormatException e) {
        }
        return cusPanNoTF;
    }
    public String getDateOfSell(){
        String year = yearCB2.getSelectedItem().toString();
        String month = monthCB2.getSelectedItem().toString();
        String day = dayCB2.getSelectedItem().toString();
        
        String sellDate=year+"-"+month+"-"+day;
        return sellDate;
    }

    public int getDiscountPercent()
    {
        String discountPercentTextFeild=disPerTF.getText().trim();
        int disPerTF=INVALID;
        try{
            disPerTF=Integer.parseInt(discountPercentTextFeild);
            if(disPerTF<=0) {
                disPerTF=INVALID;
            }
        }catch(NumberFormatException e){

        }
        return disPerTF;
    }

    
    public void clearSellTFInInstrumentToSell()
    {
        instNameTF.setText(null);
        cusNameTF.setText(null);
        cusPhoneTF.setText(null);
        cusPanNoTF.setText(null);
        disPerTF.setText(null);
    }


    public void displaySellInInstrumentToSell(){
        if(list.isEmpty()){
                JOptionPane.showMessageDialog(frame2,"Instrument is not availiable for sell", "Display",JOptionPane.INFORMATION_MESSAGE);

            }
        else{
            for (Instrument ins : list){
                ins.display();
            }
        }        
    }
}
