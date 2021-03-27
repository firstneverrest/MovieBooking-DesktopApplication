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
}
