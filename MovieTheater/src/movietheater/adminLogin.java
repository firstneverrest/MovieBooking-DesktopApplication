package movietheater;

import javax.swing.JOptionPane;

public class adminLogin extends javax.swing.JFrame {
    public adminLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void startPage(){
        Starter.start.setVisible(true);         
    }
    public void adminEdit(){
        Starter.admE.setVisible(true);
    }
}
