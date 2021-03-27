package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class adminEdit extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    private String time = "10.00";
    public adminEdit() {
        initComponents();       
        this.setLocationRelativeTo(null);
        
    }
    public void adminLogin(){
        Starter.admL.setVisible(true); 
        
    }
    public void mainMenu(){
        Starter.menu.setVisible(true);
    }
    public void setTimeAuto1(){
            String keep = Duration1.getText();
            int min = Integer.parseInt(keep);
            int hour = min / 60;
            int min2 = min % 60;
            int cnth = 10;
            int cntm = 0;  
            int cnt = 1;
            while(cnth <= 24){
                cnth += hour;
                cntm += min2;   
                int k = cnth + ((cntm + 45)/60);
                if(k+hour >= 24 ){
                    break;   
                }
                cntm += 45;
                if (cntm >= 60 || cntm == 0){
                    int i = cntm / 60;
                    if(i>1){
                        cntm = cntm % 60;
                        cnth+=i;
                    }
                    else if(i == 1){
                        cntm = cntm % 60;
                        cnth++;
                    }
                    
                    if(cntm % 60 == 0){
                       time += "  "+""+cnth+"."+cntm+"0";  
                    }
                    else if(cntm < 10){
                       time += "  "+""+cnth+"."+"0"+cntm; 
                    }
                    else{
                       time += "  "+""+cnth+"."+cntm;
                    }
                }
                else{
                    time += "  "+""+cnth+"."+cntm;
                }          
            }
                Starter.menu.jComboBox1.removeAllItems();  
                Starter.menu.Show1.setText(time);
                String[] timebox = time.split("  ");
                for(String s : timebox){
                    Starter.menu.jComboBox1.addItem(s);           
            }
    }
    public void setTimeAuto2(){
            String keep = Duration2.getText();
            int min = Integer.parseInt(keep);
            int hour = min / 60;
            int min2 = min % 60;
            int cnth = 10;
            int cntm = 0;  
            int cnt = 1;
            while(cnth <= 24){
                cnth += hour;
                cntm += min2;   
                int k = cnth + ((cntm + 45)/60);
                if(k+hour >= 24 ){
                    break;   
                }
                cntm += 45;
                if (cntm >= 60 || cntm == 0){
                    cntm = cntm % 60;
                    cnth++;
                    if(cntm % 60 == 0){
                       time += "  "+""+cnth+"."+cntm+"0";  
                    }
                    else{
                       time += "  "+""+cnth+"."+cntm;
                    }
                }
                else{
                    time += "  "+""+cnth+"."+cntm;
                }          
            }
                Starter.menu.jComboBox2.removeAllItems();  
                Starter.menu.Show2.setText(time);
                String[] timebox = time.split("  ");
                for(String s : timebox){
                    Starter.menu.jComboBox2.addItem(s);           
            }
    }
    public void setTimeAuto3(){
            String keep = Duration3.getText();
            int min = Integer.parseInt(keep);
            int hour = min / 60;
            int min2 = min % 60;
            int cnth = 10;
            int cntm = 0;  
            int cnt = 1;
            while(cnth <= 24){
                cnth += hour;
                cntm += min2;   
                int k = cnth + ((cntm + 45)/60);
                if(k+hour >= 24 ){
                    break;   
                }
                cntm += 45;
                if (cntm >= 60 || cntm == 0){
                    cntm = cntm % 60;
                    cnth++;
                    if(cntm % 60 == 0){
                       time += "  "+""+cnth+"."+cntm+"0";  
                    }
                    else{
                       time += "  "+""+cnth+"."+cntm;
                    }
                }
                else{
                    time += "  "+""+cnth+"."+cntm;
                }          
            }
                Starter.menu.jComboBox3.removeAllItems();  
                Starter.menu.Show3.setText(time);
                String[] timebox = time.split("  ");
                for(String s : timebox){
                    Starter.menu.jComboBox3.addItem(s);           
            }
    }
    public void setTime1(){
        Starter.menu.jComboBox1.removeAllItems();  
        Starter.menu.Show1.setText(this.Start1.getText());
        String[] timebox = this.Start1.getText().split("  ");
        for(String s : timebox){
            Starter.menu.jComboBox1.addItem(s);
        }
    }
     public void setTime2(){
        Starter.menu.jComboBox2.removeAllItems();  
        Starter.menu.Show2.setText(this.Start2.getText());
        String[] timebox = this.Start2.getText().split("  ");
        for(String s : timebox){
            Starter.menu.jComboBox2.addItem(s);
        }
    }
     public void setTime3(){
        Starter.menu.jComboBox3.removeAllItems();  
        Starter.menu.Show3.setText(this.Start3.getText());
        String[] timebox = this.Start3.getText().split("  ");
        for(String s : timebox){
            Starter.menu.jComboBox3.addItem(s);
        }
    } 
    public String getTimeForSetText(){
        return time;
    }
     public void setText(){
        time = "10.00";
    }
}