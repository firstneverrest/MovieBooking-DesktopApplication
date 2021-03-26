
package movietheater;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static movietheater.mainMenu.firstTime;

public class Theater1 extends javax.swing.JFrame {

    public ArrayList<JLabel> theater1Seat = new ArrayList<>();
    public ArrayList<JLabel> tseat = new ArrayList<>();
    private static int cntRed = 0;
    private static JLabel second;
    private static JLabel first;
    
    public Theater1() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }    
    public void setSeat(){       // seat gray seat from later use.
        File file1 = new File("seat1.txt");
        firstTime = Starter.menu.jComboBox1.getSelectedItem().toString(); 
        try (Scanner sc = new Scanner(file1)) {           
                while (sc.hasNextLine()) {
                    String i = sc.nextLine();  
                    String[] j = i.split(" ");
                    for(JLabel label : tseat){
                        if(firstTime.equals(j[0])){ 
                            if(label.getName().equals(j[1])){                               
                                label.setBackground(Color.gray);
                                break;
                            }
                        }
                    }
                }
        }        
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } 
        
    } 

    public void mainMenu(){
        Starter.menu.setVisible(true);
    }
    public void ticket(){
        Starter.tick1.setVisible(true);
    }
    public void setColor(JLabel label){        
        if(label.getBackground() != Color.gray){
            first = label;           
            cntRed++;
            if(cntRed == 1){
                first.setBackground(new java.awt.Color(255,0,0));
            }
            else if(cntRed == 2 && first.equals(second)){    
                if(first.getName().substring(0,1).equals("A") || first.getName().substring(0,1).equals("B")){
                    first.setBackground(new java.awt.Color(51,51,255));    
                }
                else
                    first.setBackground(new java.awt.Color(255,153,102));
                cntRed = 0;
            }        
            else if(cntRed == 2 && first != second){
                first.setBackground(new java.awt.Color(255,0,0));
                if(second.getName().substring(0,1).equals("A") || second.getName().substring(0,1).equals("B")){
                    second.setBackground(new java.awt.Color(51,51,255));    
                }
                else
                    second.setBackground(new java.awt.Color(255,153,102));
                cntRed = 1;
            }
            
            theater1Seat.add(label);               
            second = first;
        }
    }
    public double calculation(){
        int sum = 0;
        int cnt=0;
        JLabel label = theater1Seat.get(theater1Seat.size()-1);
            if(label.getName().substring(0,1).equals("A") || label.getName().substring(0,1).equals("B")){
                sum = 200;
            }
            else
                sum = 150;
        Starter.tick1.seatNo.setText(label.getName());
        Starter.tick1.price.setText(""+sum);
        Starter.tick1.showTime.setText(Starter.menu.jComboBox1.getSelectedItem().toString());
        if (sum == 150)
            Starter.tick1.seatType.setText("Normal");
        else if (sum == 200)  
            Starter.tick1.seatType.setText("Special");
        Starter.tick1.theater.setText("Theater1");
        Starter.tick1.movietitle.setText(Starter.menu.MTitle1.getText());          
        return sum;
    }
    public void Seat(){ // get setName to here.
        tseat.add(F1);tseat.add(F2);tseat.add(F3);tseat.add(F4);tseat.add(F5);
        tseat.add(F6);tseat.add(F7);tseat.add(F8);tseat.add(F9);tseat.add(F10); 
        tseat.add(F11);tseat.add(F12);tseat.add(F13);tseat.add(F14);tseat.add(F15); 
        tseat.add(E1);tseat.add(E2);tseat.add(E3);tseat.add(E4);tseat.add(E5);
        tseat.add(E6);tseat.add(E7);tseat.add(E8);tseat.add(E9);tseat.add(E10); 
        tseat.add(E11);tseat.add(E12);tseat.add(E13);tseat.add(E14);tseat.add(E15);
        tseat.add(D1);tseat.add(D2);tseat.add(D3);tseat.add(D4);tseat.add(D5);
        tseat.add(D6);tseat.add(D7);tseat.add(D8);tseat.add(D9);tseat.add(D10); 
        tseat.add(D11);tseat.add(D12);tseat.add(D13);tseat.add(D14);tseat.add(D15);
        tseat.add(C1);tseat.add(C2);tseat.add(C3);tseat.add(C4);tseat.add(C5);
        tseat.add(C6);tseat.add(C7);tseat.add(C8);tseat.add(C9);tseat.add(C10); 
        tseat.add(C11);tseat.add(C12);tseat.add(C13);tseat.add(C14);tseat.add(C15);
        tseat.add(B1);tseat.add(B2);tseat.add(B3);tseat.add(B4);tseat.add(B5);
        tseat.add(B6);tseat.add(B7);tseat.add(B8);tseat.add(B9);tseat.add(B10); 
        tseat.add(B11);tseat.add(B12);tseat.add(B13);tseat.add(B14);tseat.add(B15);
        tseat.add(A1);tseat.add(A2);tseat.add(A3);tseat.add(A4);tseat.add(A5);
        tseat.add(A6);tseat.add(A7);tseat.add(A8);tseat.add(A9);tseat.add(A10); 
        tseat.add(A11);tseat.add(A12);tseat.add(A13);tseat.add(A14);tseat.add(A15);
        F1.setName("F1");F2.setName("F2");F3.setName("F3");F4.setName("F4");F5.setName("F5");
        F6.setName("F6");F7.setName("F7");F8.setName("F8");F9.setName("F9");F10.setName("F10");
        F11.setName("F11");F12.setName("F12");F13.setName("F13");F14.setName("F14");F15.setName("F15");
        E1.setName("E1");E2.setName("E2");E3.setName("E3");E4.setName("E4");E5.setName("E5");
        E6.setName("E6");E7.setName("E7");E8.setName("E8");E9.setName("E9");E10.setName("E10");
        E11.setName("E11");E12.setName("E12"); E13.setName("E13"); E14.setName("E14");E15.setName("E15");
        D1.setName("D1");D2.setName("D2");D3.setName("D3");D4.setName("D4");D5.setName("D5");
        D6.setName("D6");D7.setName("D7");D8.setName("D8"); D9.setName("D9");D10.setName("D10");
        D11.setName("D11");D12.setName("D12");D13.setName("D13");D14.setName("D14");D15.setName("D15");
        C1.setName("C1");C2.setName("C2");C3.setName("C3");C4.setName("C4");C5.setName("C5");
        C6.setName("C6");C7.setName("C7");C8.setName("C8");C9.setName("C9");C10.setName("C10");
        C11.setName("C11");C12.setName("C12");C13.setName("C13");C14.setName("C14");C15.setName("C15");
        B1.setName("B1");B2.setName("B2");B3.setName("B3");B4.setName("B4");B5.setName("B5");
        B6.setName("B6");B7.setName("B7");B8.setName("B8");B9.setName("B9");B10.setName("B10");
        B11.setName("B11");B12.setName("B12");B13.setName("B13");B14.setName("B14");B15.setName("B15");
        A1.setName("A1");A2.setName("A2");A3.setName("A3");A4.setName("A4");A5.setName("A5");
        A6.setName("A6");A7.setName("A7");A8.setName("A8");A9.setName("A9");A10.setName("A10");
        A11.setName("A11");A12.setName("A12");A13.setName("A13");A14.setName("A14");A15.setName("A15");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        F11 = new javax.swing.JLabel();
        F12 = new javax.swing.JLabel();
        F13 = new javax.swing.JLabel();
        F14 = new javax.swing.JLabel();
        F15 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        E10 = new javax.swing.JLabel();
        E11 = new javax.swing.JLabel();
        E12 = new javax.swing.JLabel();
        E13 = new javax.swing.JLabel();
        E14 = new javax.swing.JLabel();
        E15 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        D7 = new javax.swing.JLabel();
        D8 = new javax.swing.JLabel();
        D9 = new javax.swing.JLabel();
        D10 = new javax.swing.JLabel();
        D11 = new javax.swing.JLabel();
        D12 = new javax.swing.JLabel();
        D13 = new javax.swing.JLabel();
        D14 = new javax.swing.JLabel();
        D15 = new javax.swing.JLabel();
        C1 = new javax.swing.JLabel();
        C2 = new javax.swing.JLabel();
        C3 = new javax.swing.JLabel();
        C4 = new javax.swing.JLabel();
        C5 = new javax.swing.JLabel();
        C6 = new javax.swing.JLabel();
        C7 = new javax.swing.JLabel();
        C8 = new javax.swing.JLabel();
        C9 = new javax.swing.JLabel();
        C10 = new javax.swing.JLabel();
        C11 = new javax.swing.JLabel();
        C12 = new javax.swing.JLabel();
        C13 = new javax.swing.JLabel();
        C14 = new javax.swing.JLabel();
        C15 = new javax.swing.JLabel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        B6 = new javax.swing.JLabel();
        B7 = new javax.swing.JLabel();
        B8 = new javax.swing.JLabel();
        B9 = new javax.swing.JLabel();
        B10 = new javax.swing.JLabel();
        B11 = new javax.swing.JLabel();
        B12 = new javax.swing.JLabel();
        B13 = new javax.swing.JLabel();
        B14 = new javax.swing.JLabel();
        B15 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        A3 = new javax.swing.JLabel();
        A4 = new javax.swing.JLabel();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        A7 = new javax.swing.JLabel();
        A8 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        A11 = new javax.swing.JLabel();
        A12 = new javax.swing.JLabel();
        A13 = new javax.swing.JLabel();
        A14 = new javax.swing.JLabel();
        A15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math-com Theater");

        jPanel2.setBackground(new java.awt.Color(0, 181, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel1.setText("F");

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel2.setText("E");

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel3.setText("D");

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel4.setText("C");

        jLabel5.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 26)); // NOI18N
        jLabel6.setText("A");

        F1.setBackground(new java.awt.Color(255, 153, 102));
        F1.setOpaque(true);
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F1MouseClicked(evt);
            }
        });

        F2.setBackground(new java.awt.Color(255, 153, 102));
        F2.setOpaque(true);
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F2MouseClicked(evt);
            }
        });

        F3.setBackground(new java.awt.Color(255, 153, 102));
        F3.setOpaque(true);
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F3MouseClicked(evt);
            }
        });

        F4.setBackground(new java.awt.Color(255, 153, 102));
        F4.setOpaque(true);
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F4MouseClicked(evt);
            }
        });

        F5.setBackground(new java.awt.Color(255, 153, 102));
        F5.setOpaque(true);
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });

        F6.setBackground(new java.awt.Color(255, 153, 102));
        F6.setOpaque(true);
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F6MouseClicked(evt);
            }
        });

        F7.setBackground(new java.awt.Color(255, 153, 102));
        F7.setOpaque(true);
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F7MouseClicked(evt);
            }
        });

        F8.setBackground(new java.awt.Color(255, 153, 102));
        F8.setOpaque(true);
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F8MouseClicked(evt);
            }
        });

        F9.setBackground(new java.awt.Color(255, 153, 102));
        F9.setOpaque(true);
        F9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F9MouseClicked(evt);
            }
        });

        F10.setBackground(new java.awt.Color(255, 153, 102));
        F10.setOpaque(true);
        F10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F10MouseClicked(evt);
            }
        });

        F11.setBackground(new java.awt.Color(255, 153, 102));
        F11.setOpaque(true);
        F11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F11MouseClicked(evt);
            }
        });

        F12.setBackground(new java.awt.Color(255, 153, 102));
        F12.setOpaque(true);
        F12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F12MouseClicked(evt);
            }
        });

        F13.setBackground(new java.awt.Color(255, 153, 102));
        F13.setOpaque(true);
        F13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F13MouseClicked(evt);
            }
        });

        F14.setBackground(new java.awt.Color(255, 153, 102));
        F14.setOpaque(true);
        F14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F14MouseClicked(evt);
            }
        });

        F15.setBackground(new java.awt.Color(255, 153, 102));
        F15.setOpaque(true);
        F15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F15MouseClicked(evt);
            }
        });

        E1.setBackground(new java.awt.Color(255, 153, 102));
        E1.setOpaque(true);
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });

        E2.setBackground(new java.awt.Color(255, 153, 102));
        E2.setOpaque(true);
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });

        E3.setBackground(new java.awt.Color(255, 153, 102));
        E3.setOpaque(true);
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });

        E4.setBackground(new java.awt.Color(255, 153, 102));
        E4.setOpaque(true);
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });

        E5.setBackground(new java.awt.Color(255, 153, 102));
        E5.setOpaque(true);
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });

        E6.setBackground(new java.awt.Color(255, 153, 102));
        E6.setOpaque(true);
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });

        E7.setBackground(new java.awt.Color(255, 153, 102));
        E7.setOpaque(true);
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });

        E8.setBackground(new java.awt.Color(255, 153, 102));
        E8.setOpaque(true);
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });

        E9.setBackground(new java.awt.Color(255, 153, 102));
        E9.setOpaque(true);
        E9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E9MouseClicked(evt);
            }
        });

        E10.setBackground(new java.awt.Color(255, 153, 102));
        E10.setOpaque(true);
        E10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E10MouseClicked(evt);
            }
        });

        E11.setBackground(new java.awt.Color(255, 153, 102));
        E11.setOpaque(true);
        E11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E11MouseClicked(evt);
            }
        });

        E12.setBackground(new java.awt.Color(255, 153, 102));
        E12.setOpaque(true);
        E12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E12MouseClicked(evt);
            }
        });

        E13.setBackground(new java.awt.Color(255, 153, 102));
        E13.setOpaque(true);
        E13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E13MouseClicked(evt);
            }
        });

        E14.setBackground(new java.awt.Color(255, 153, 102));
        E14.setOpaque(true);
        E14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E14MouseClicked(evt);
            }
        });

        E15.setBackground(new java.awt.Color(255, 153, 102));
        E15.setOpaque(true);
        E15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E15MouseClicked(evt);
            }
        });

        D1.setBackground(new java.awt.Color(255, 153, 102));
        D1.setOpaque(true);
        D1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D1MouseClicked(evt);
            }
        });

        D2.setBackground(new java.awt.Color(255, 153, 102));
        D2.setOpaque(true);
        D2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D2MouseClicked(evt);
            }
        });

        D3.setBackground(new java.awt.Color(255, 153, 102));
        D3.setOpaque(true);
        D3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D3MouseClicked(evt);
            }
        });

        D4.setBackground(new java.awt.Color(255, 153, 102));
        D4.setOpaque(true);
        D4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D4MouseClicked(evt);
            }
        });

        D5.setBackground(new java.awt.Color(255, 153, 102));
        D5.setOpaque(true);
        D5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D5MouseClicked(evt);
            }
        });

        D6.setBackground(new java.awt.Color(255, 153, 102));
        D6.setOpaque(true);
        D6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D6MouseClicked(evt);
            }
        });

        D7.setBackground(new java.awt.Color(255, 153, 102));
        D7.setOpaque(true);
        D7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D7MouseClicked(evt);
            }
        });

        D8.setBackground(new java.awt.Color(255, 153, 102));
        D8.setOpaque(true);
        D8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D8MouseClicked(evt);
            }
        });

        D9.setBackground(new java.awt.Color(255, 153, 102));
        D9.setOpaque(true);
        D9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D9MouseClicked(evt);
            }
        });

        D10.setBackground(new java.awt.Color(255, 153, 102));
        D10.setOpaque(true);
        D10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D10MouseClicked(evt);
            }
        });

        D11.setBackground(new java.awt.Color(255, 153, 102));
        D11.setOpaque(true);
        D11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D11MouseClicked(evt);
            }
        });

        D12.setBackground(new java.awt.Color(255, 153, 102));
        D12.setOpaque(true);
        D12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D12MouseClicked(evt);
            }
        });

        D13.setBackground(new java.awt.Color(255, 153, 102));
        D13.setOpaque(true);
        D13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D13MouseClicked(evt);
            }
        });

        D14.setBackground(new java.awt.Color(255, 153, 102));
        D14.setOpaque(true);
        D14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D14MouseClicked(evt);
            }
        });

        D15.setBackground(new java.awt.Color(255, 153, 102));
        D15.setOpaque(true);
        D15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D15MouseClicked(evt);
            }
        });

        C1.setBackground(new java.awt.Color(255, 153, 102));
        C1.setOpaque(true);
        C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C1MouseClicked(evt);
            }
        });

        C2.setBackground(new java.awt.Color(255, 153, 102));
        C2.setOpaque(true);
        C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C2MouseClicked(evt);
            }
        });

        C3.setBackground(new java.awt.Color(255, 153, 102));
        C3.setOpaque(true);
        C3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C3MouseClicked(evt);
            }
        });

        C4.setBackground(new java.awt.Color(255, 153, 102));
        C4.setOpaque(true);
        C4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C4MouseClicked(evt);
            }
        });

        C5.setBackground(new java.awt.Color(255, 153, 102));
        C5.setOpaque(true);
        C5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C5MouseClicked(evt);
            }
        });

        C6.setBackground(new java.awt.Color(255, 153, 102));
        C6.setOpaque(true);
        C6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C6MouseClicked(evt);
            }
        });

        C7.setBackground(new java.awt.Color(255, 153, 102));
        C7.setOpaque(true);
        C7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C7MouseClicked(evt);
            }
        });

        C8.setBackground(new java.awt.Color(255, 153, 102));
        C8.setOpaque(true);
        C8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C8MouseClicked(evt);
            }
        });

        C9.setBackground(new java.awt.Color(255, 153, 102));
        C9.setOpaque(true);
        C9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C9MouseClicked(evt);
            }
        });

        C10.setBackground(new java.awt.Color(255, 153, 102));
        C10.setOpaque(true);
        C10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C10MouseClicked(evt);
            }
        });

        C11.setBackground(new java.awt.Color(255, 153, 102));
        C11.setOpaque(true);
        C11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C11MouseClicked(evt);
            }
        });

        C12.setBackground(new java.awt.Color(255, 153, 102));
        C12.setOpaque(true);
        C12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C12MouseClicked(evt);
            }
        });

        C13.setBackground(new java.awt.Color(255, 153, 102));
        C13.setOpaque(true);
        C13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C13MouseClicked(evt);
            }
        });

        C14.setBackground(new java.awt.Color(255, 153, 102));
        C14.setOpaque(true);
        C14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C14MouseClicked(evt);
            }
        });

        C15.setBackground(new java.awt.Color(255, 153, 102));
        C15.setOpaque(true);
        C15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C15MouseClicked(evt);
            }
        });

        B1.setBackground(new java.awt.Color(51, 51, 255));
        B1.setOpaque(true);
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B1MouseClicked(evt);
            }
        });

        B2.setBackground(new java.awt.Color(51, 51, 255));
        B2.setOpaque(true);
        B2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B2MouseClicked(evt);
            }
        });

        B3.setBackground(new java.awt.Color(51, 51, 255));
        B3.setOpaque(true);
        B3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B3MouseClicked(evt);
            }
        });

        B4.setBackground(new java.awt.Color(51, 51, 255));
        B4.setOpaque(true);
        B4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B4MouseClicked(evt);
            }
        });

        B5.setBackground(new java.awt.Color(51, 51, 255));
        B5.setOpaque(true);
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });

        B6.setBackground(new java.awt.Color(51, 51, 255));
        B6.setOpaque(true);
        B6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B6MouseClicked(evt);
            }
        });

        B7.setBackground(new java.awt.Color(51, 51, 255));
        B7.setOpaque(true);
        B7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B7MouseClicked(evt);
            }
        });

        B8.setBackground(new java.awt.Color(51, 51, 255));
        B8.setOpaque(true);
        B8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B8MouseClicked(evt);
            }
        });

        B9.setBackground(new java.awt.Color(51, 51, 255));
        B9.setOpaque(true);
        B9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B9MouseClicked(evt);
            }
        });

        B10.setBackground(new java.awt.Color(51, 51, 255));
        B10.setOpaque(true);
        B10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B10MouseClicked(evt);
            }
        });

        B11.setBackground(new java.awt.Color(51, 51, 255));
        B11.setOpaque(true);
        B11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B11MouseClicked(evt);
            }
        });

        B12.setBackground(new java.awt.Color(51, 51, 255));
        B12.setOpaque(true);
        B12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B12MouseClicked(evt);
            }
        });

        B13.setBackground(new java.awt.Color(51, 51, 255));
        B13.setOpaque(true);
        B13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B13MouseClicked(evt);
            }
        });

        B14.setBackground(new java.awt.Color(51, 51, 255));
        B14.setOpaque(true);
        B14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B14MouseClicked(evt);
            }
        });

        B15.setBackground(new java.awt.Color(51, 51, 255));
        B15.setOpaque(true);
        B15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B15MouseClicked(evt);
            }
        });

        A1.setBackground(new java.awt.Color(51, 51, 255));
        A1.setOpaque(true);
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A2.setBackground(new java.awt.Color(51, 51, 255));
        A2.setOpaque(true);
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });

        A3.setBackground(new java.awt.Color(51, 51, 255));
        A3.setOpaque(true);
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });

        A4.setBackground(new java.awt.Color(51, 51, 255));
        A4.setOpaque(true);
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });

        A5.setBackground(new java.awt.Color(51, 51, 255));
        A5.setOpaque(true);
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });

        A6.setBackground(new java.awt.Color(51, 51, 255));
        A6.setOpaque(true);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A6MouseClicked(evt);
            }
        });

        A7.setBackground(new java.awt.Color(51, 51, 255));
        A7.setOpaque(true);
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A7MouseClicked(evt);
            }
        });

        A8.setBackground(new java.awt.Color(51, 51, 255));
        A8.setOpaque(true);
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A8MouseClicked(evt);
            }
        });

        A9.setBackground(new java.awt.Color(51, 51, 255));
        A9.setOpaque(true);
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A9MouseClicked(evt);
            }
        });

        A10.setBackground(new java.awt.Color(51, 51, 255));
        A10.setOpaque(true);
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10MouseClicked(evt);
            }
        });

        A11.setBackground(new java.awt.Color(51, 51, 255));
        A11.setOpaque(true);
        A11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A11MouseClicked(evt);
            }
        });

        A12.setBackground(new java.awt.Color(51, 51, 255));
        A12.setOpaque(true);
        A12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A12MouseClicked(evt);
            }
        });

        A13.setBackground(new java.awt.Color(51, 51, 255));
        A13.setOpaque(true);
        A13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A13MouseClicked(evt);
            }
        });

        A14.setBackground(new java.awt.Color(51, 51, 255));
        A14.setOpaque(true);
        A14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A14MouseClicked(evt);
            }
        });

        A15.setBackground(new java.awt.Color(51, 51, 255));
        A15.setOpaque(true);
        A15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A15MouseClicked(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Screen");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Forte", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Please select your seat : ");

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel98.setBackground(new java.awt.Color(255, 153, 102));
        jLabel98.setOpaque(true);

        jLabel99.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(240, 240, 240));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel99.setText("Normal  150  baht");

        jLabel100.setBackground(new java.awt.Color(51, 51, 255));
        jLabel100.setOpaque(true);

        jLabel101.setFont(new java.awt.Font("Forte", 0, 20)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(240, 240, 240));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel101.setText("Special  200  baht");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel99)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel101)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Theater1 theater1 = new  Theater1();
        this.dispose();
        theater1.mainMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int cnt = 0;
        JLabel test1 = new JLabel();
        test1.setBackground(new java.awt.Color(255,0,0));
        for(int i = 0;i<theater1Seat.size();i++){
            if(theater1Seat.get(i).getBackground().equals(test1.getBackground())){
                cnt++;
            }
        }
        if(theater1Seat.size()==0 || cnt == 0 ){
            JOptionPane.showMessageDialog(null, "Please select your seat.");
        }
        else{
            for(JLabel label : theater1Seat){
                if(label.getBackground().equals(test1.getBackground())){
                     label.setBackground(Color.GRAY);
                }
            }   
            cntRed = 0;
            first = null;
            second = null;
            calculation();
            Theater1 theater1 = new Theater1();
            this.dispose();
            theater1.ticket();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void F1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseClicked
        setColor(F1);       
    }//GEN-LAST:event_F1MouseClicked

    private void F2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseClicked
        setColor(F2);
    }//GEN-LAST:event_F2MouseClicked

    private void F3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseClicked
        setColor(F3);
    }//GEN-LAST:event_F3MouseClicked

    private void F4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseClicked
        
        setColor(F4);
    }//GEN-LAST:event_F4MouseClicked

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        
        setColor(F5);
    }//GEN-LAST:event_F5MouseClicked

    private void F6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseClicked
        
        setColor(F6);
    }//GEN-LAST:event_F6MouseClicked

    private void F7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseClicked
        
        setColor(F7);
    }//GEN-LAST:event_F7MouseClicked

    private void F8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseClicked
        
        setColor(F8);
    }//GEN-LAST:event_F8MouseClicked

    private void F9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F9MouseClicked
        
        setColor(F9);
    }//GEN-LAST:event_F9MouseClicked

    private void F10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F10MouseClicked
        
        setColor(F10);
    }//GEN-LAST:event_F10MouseClicked

    private void F11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F11MouseClicked
        
        setColor(F11);
    }//GEN-LAST:event_F11MouseClicked

    private void F12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F12MouseClicked
        
        setColor(F12);
    }//GEN-LAST:event_F12MouseClicked

    private void F13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F13MouseClicked
        
        setColor(F13);
    }//GEN-LAST:event_F13MouseClicked

    private void F14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F14MouseClicked
        
        setColor(F14);
    }//GEN-LAST:event_F14MouseClicked

    private void F15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F15MouseClicked
        
        setColor(F15);
    }//GEN-LAST:event_F15MouseClicked

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        
        setColor(E1);
    }//GEN-LAST:event_E1MouseClicked

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        
        setColor(E2);
    }//GEN-LAST:event_E2MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        
        setColor(E3);
    }//GEN-LAST:event_E3MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        
        setColor(E4);
    }//GEN-LAST:event_E4MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        
        setColor(E5);
    }//GEN-LAST:event_E5MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        
        setColor(E6);
    }//GEN-LAST:event_E6MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        
        setColor(E7);
    }//GEN-LAST:event_E7MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        
        setColor(E8);
    }//GEN-LAST:event_E8MouseClicked

    private void E9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E9MouseClicked
        
        setColor(E9);
    }//GEN-LAST:event_E9MouseClicked

    private void E10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E10MouseClicked
        
        setColor(E10);
    }//GEN-LAST:event_E10MouseClicked

    private void E11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E11MouseClicked
        
        setColor(E11);
    }//GEN-LAST:event_E11MouseClicked

    private void E12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E12MouseClicked
        
        setColor(E12);
    }//GEN-LAST:event_E12MouseClicked

    private void E13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E13MouseClicked
       
        setColor(E13);
    }//GEN-LAST:event_E13MouseClicked

    private void E14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E14MouseClicked
       
        setColor(E14);
    }//GEN-LAST:event_E14MouseClicked

    private void E15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E15MouseClicked
        
        setColor(E15);
    }//GEN-LAST:event_E15MouseClicked

    private void D1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D1MouseClicked
        
        setColor(D1);
    }//GEN-LAST:event_D1MouseClicked

    private void D2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D2MouseClicked
        
        setColor(D2);
    }//GEN-LAST:event_D2MouseClicked

    private void D3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D3MouseClicked
        
        setColor(D3);
    }//GEN-LAST:event_D3MouseClicked

    private void D4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D4MouseClicked
        
        setColor(D4);
    }//GEN-LAST:event_D4MouseClicked

    private void D5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D5MouseClicked
        
        setColor(D5);
    }//GEN-LAST:event_D5MouseClicked

    private void D6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D6MouseClicked
        
        setColor(D6);
    }//GEN-LAST:event_D6MouseClicked

    private void D7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D7MouseClicked
        
        setColor(D7);
    }//GEN-LAST:event_D7MouseClicked

    private void D8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D8MouseClicked
        
        setColor(D8);
    }//GEN-LAST:event_D8MouseClicked

    private void D9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D9MouseClicked
       
        setColor(D9);
    }//GEN-LAST:event_D9MouseClicked

    private void D10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D10MouseClicked
        
        setColor(D10);
    }//GEN-LAST:event_D10MouseClicked

    private void D11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D11MouseClicked
        
        setColor(D11);
    }//GEN-LAST:event_D11MouseClicked

    private void D12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D12MouseClicked
        
        setColor(D12);
    }//GEN-LAST:event_D12MouseClicked

    private void D13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D13MouseClicked
        
        setColor(D13);
    }//GEN-LAST:event_D13MouseClicked

    private void D14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D14MouseClicked
        
        setColor(D14);
    }//GEN-LAST:event_D14MouseClicked

    private void D15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D15MouseClicked
        
        setColor(D15);
    }//GEN-LAST:event_D15MouseClicked

    private void C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C1MouseClicked
        
        setColor(C1);
    }//GEN-LAST:event_C1MouseClicked

    private void C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C2MouseClicked
        
        setColor(C2);
    }//GEN-LAST:event_C2MouseClicked

    private void C3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C3MouseClicked
        
        setColor(C3);
    }//GEN-LAST:event_C3MouseClicked

    private void C4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C4MouseClicked
        
        setColor(C4);
    }//GEN-LAST:event_C4MouseClicked

    private void C5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C5MouseClicked
        
        setColor(C5);
    }//GEN-LAST:event_C5MouseClicked

    private void C6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C6MouseClicked
        
        setColor(C6);
    }//GEN-LAST:event_C6MouseClicked

    private void C7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C7MouseClicked
        
        setColor(C7);
    }//GEN-LAST:event_C7MouseClicked

    private void C8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C8MouseClicked
        
        setColor(C8);
    }//GEN-LAST:event_C8MouseClicked

    private void C9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C9MouseClicked
        
        setColor(C9);
    }//GEN-LAST:event_C9MouseClicked

    private void C10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C10MouseClicked
        
        setColor(C10);
    }//GEN-LAST:event_C10MouseClicked

    private void C11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C11MouseClicked
        
        setColor(C11);
    }//GEN-LAST:event_C11MouseClicked

    private void C12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C12MouseClicked
        
        setColor(C12);
    }//GEN-LAST:event_C12MouseClicked

    private void C13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C13MouseClicked
        
        setColor(C13);
    }//GEN-LAST:event_C13MouseClicked

    private void C14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C14MouseClicked
        
        setColor(C14);
    }//GEN-LAST:event_C14MouseClicked

    private void C15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C15MouseClicked
        
        setColor(C15);
    }//GEN-LAST:event_C15MouseClicked

    private void B1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B1MouseClicked
        
        setColor(B1);
    }//GEN-LAST:event_B1MouseClicked

    private void B2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B2MouseClicked
        
        setColor(B2);
    }//GEN-LAST:event_B2MouseClicked

    private void B3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B3MouseClicked
        
        setColor(B3);
    }//GEN-LAST:event_B3MouseClicked

    private void B4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B4MouseClicked
        
        setColor(B4);
    }//GEN-LAST:event_B4MouseClicked

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        
        setColor(B5);
    }//GEN-LAST:event_B5MouseClicked

    private void B6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B6MouseClicked
        
        setColor(B6);
    }//GEN-LAST:event_B6MouseClicked

    private void B7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B7MouseClicked
        
        setColor(B7);
    }//GEN-LAST:event_B7MouseClicked

    private void B8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B8MouseClicked
       
        setColor(B8);
    }//GEN-LAST:event_B8MouseClicked

    private void B9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B9MouseClicked
        
        setColor(B9);
    }//GEN-LAST:event_B9MouseClicked

    private void B10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B10MouseClicked
        
        setColor(B10);
    }//GEN-LAST:event_B10MouseClicked

    private void B11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B11MouseClicked
        
        setColor(B11);
    }//GEN-LAST:event_B11MouseClicked

    private void B12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B12MouseClicked
        
        setColor(B12);
    }//GEN-LAST:event_B12MouseClicked

    private void B13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B13MouseClicked
        
        setColor(B13);
    }//GEN-LAST:event_B13MouseClicked

    private void B14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B14MouseClicked
        
        setColor(B14);
    }//GEN-LAST:event_B14MouseClicked

    private void B15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B15MouseClicked
        
        setColor(B15);
    }//GEN-LAST:event_B15MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        
        setColor(A1);
    }//GEN-LAST:event_A1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
        
        setColor(A2);
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
        
        setColor(A3);
    }//GEN-LAST:event_A3MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
        
        setColor(A4);
    }//GEN-LAST:event_A4MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
        
        setColor(A5);
    }//GEN-LAST:event_A5MouseClicked

    private void A6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MouseClicked
        
        setColor(A6);
    }//GEN-LAST:event_A6MouseClicked

    private void A7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MouseClicked
        
        setColor(A7);
    }//GEN-LAST:event_A7MouseClicked

    private void A8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MouseClicked
        
        setColor(A8);
    }//GEN-LAST:event_A8MouseClicked

    private void A9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MouseClicked
        
        setColor(A9);
    }//GEN-LAST:event_A9MouseClicked

    private void A10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseClicked
        
        setColor(A10);
    }//GEN-LAST:event_A10MouseClicked

    private void A11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A11MouseClicked
        
        setColor(A11);
    }//GEN-LAST:event_A11MouseClicked

    private void A12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A12MouseClicked
        
        setColor(A12);
    }//GEN-LAST:event_A12MouseClicked

    private void A13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A13MouseClicked
        
        setColor(A13);
    }//GEN-LAST:event_A13MouseClicked

    private void A14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A14MouseClicked
        
        setColor(A14);
    }//GEN-LAST:event_A14MouseClicked

    private void A15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A15MouseClicked
        
        setColor(A15);
    }//GEN-LAST:event_A15MouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Theater1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Theater1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Theater1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Theater1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Theater1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A10;
    private javax.swing.JLabel A11;
    private javax.swing.JLabel A12;
    private javax.swing.JLabel A13;
    private javax.swing.JLabel A14;
    private javax.swing.JLabel A15;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel A3;
    private javax.swing.JLabel A4;
    private javax.swing.JLabel A5;
    private javax.swing.JLabel A6;
    private javax.swing.JLabel A7;
    private javax.swing.JLabel A8;
    private javax.swing.JLabel A9;
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B10;
    private javax.swing.JLabel B11;
    private javax.swing.JLabel B12;
    private javax.swing.JLabel B13;
    private javax.swing.JLabel B14;
    private javax.swing.JLabel B15;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JLabel B6;
    private javax.swing.JLabel B7;
    private javax.swing.JLabel B8;
    private javax.swing.JLabel B9;
    private javax.swing.JLabel C1;
    private javax.swing.JLabel C10;
    private javax.swing.JLabel C11;
    private javax.swing.JLabel C12;
    private javax.swing.JLabel C13;
    private javax.swing.JLabel C14;
    private javax.swing.JLabel C15;
    private javax.swing.JLabel C2;
    private javax.swing.JLabel C3;
    private javax.swing.JLabel C4;
    private javax.swing.JLabel C5;
    private javax.swing.JLabel C6;
    private javax.swing.JLabel C7;
    private javax.swing.JLabel C8;
    private javax.swing.JLabel C9;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D10;
    private javax.swing.JLabel D11;
    private javax.swing.JLabel D12;
    private javax.swing.JLabel D13;
    private javax.swing.JLabel D14;
    private javax.swing.JLabel D15;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JLabel D7;
    private javax.swing.JLabel D8;
    private javax.swing.JLabel D9;
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E10;
    private javax.swing.JLabel E11;
    private javax.swing.JLabel E12;
    private javax.swing.JLabel E13;
    private javax.swing.JLabel E14;
    private javax.swing.JLabel E15;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F12;
    private javax.swing.JLabel F13;
    private javax.swing.JLabel F14;
    private javax.swing.JLabel F15;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

   
}
