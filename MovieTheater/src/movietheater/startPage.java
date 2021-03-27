package movietheater;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class startPage extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    public startPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public void adminLogin(){
        Starter.admL.setVisible(true);   
    }
    public void mainMenu(){
        Starter.menu.setVisible(true);
    }
    public void setTextFromFile(){
        File file1 = new File("EditTheater1.txt");
        try (Scanner sc = new Scanner(file1)) {
                int j = 1;
                while (sc.hasNextLine()) {
                    String i = sc.nextLine();
                    switch(j){
                        case 1:
                            Starter.menu.MTitle1.setText(i);
                        case 2:
                            Starter.menu.MDuration1.setText(i);  
                        case 3:
                            Starter.menu.MRate1.setText(i); 
                        case 4:
                            Starter.menu.Show1.setText(i); 
                        case 5:
                            Starter.menu.Category1.setText(i); 
                    }
                    j++;
                }   
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }catch (Exception e) {
            System.out.println("File problem");
        }
        
        
        File file2 = new File("EditTheater2.txt");
        try (Scanner sc = new Scanner(file2)) {
                int j = 1;
                while (sc.hasNextLine()) {
                    String i = sc.nextLine();
                    switch(j){
                        case 1:
                            Starter.menu.MTitle2.setText(i);
                        case 2:
                            Starter.menu.MDuration2.setText(i);  
                        case 3:
                            Starter.menu.MRate2.setText(i); 
                        case 4:
                            Starter.menu.Show2.setText(i); 
                        case 5:
                            Starter.menu.Category2.setText(i); 
                    }
                    j++;
                }   
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }catch (Exception e) {
            System.out.println("File problem");
        }
        File file3 = new File("EditTheater3.txt");
        try (Scanner sc = new Scanner(file3)) {
                int j = 1;
                while (sc.hasNextLine()) {
                    String i = sc.nextLine();
                    switch(j){
                        case 1:
                            Starter.menu.MTitle3.setText(i);
                        case 2:
                            Starter.menu.MDuration3.setText(i);  
                        case 3:
                            Starter.menu.MRate3.setText(i); 
                        case 4:
                            Starter.menu.Show3.setText(i); 
                        case 5:
                            Starter.menu.Category3.setText(i); 
                    }
                    j++;
                }   
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }catch (Exception e) {
            System.out.println("File problem");
        }       
    }
    public void setEditText(){
        Starter.admE.Title1.setText(Starter.menu.MTitle1.getText());
        Starter.admE.Title2.setText(Starter.menu.MTitle2.getText());
        Starter.admE.Title3.setText(Starter.menu.MTitle3.getText());
        Starter.admE.Duration1.setText(Starter.menu.MDuration1.getText());
        Starter.admE.Duration2.setText(Starter.menu.MDuration2.getText());
        Starter.admE.Duration3.setText(Starter.menu.MDuration3.getText());
        Starter.admE.Catagory1.setText(Starter.menu.Category1.getText());
        Starter.admE.Catagory2.setText(Starter.menu.Category2.getText());
        Starter.admE.Catagory3.setText(Starter.menu.Category3.getText());
        Starter.admE.Start1.setText(Starter.menu.Show1.getText());
        Starter.admE.Start2.setText(Starter.menu.Show2.getText());
        Starter.admE.Start3.setText(Starter.menu.Show3.getText()); 
    }
}
