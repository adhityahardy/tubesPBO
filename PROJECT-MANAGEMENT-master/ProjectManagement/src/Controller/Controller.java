/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ProjectManagement.DriverLogin;
import ProjectManagement.Client;
import ProjectManagement.ManajerProyek;
import ProjectManagement.Programmer;
import ProjectManagement.Proyek;
import ProjectManagement.Tugas;
import View_GUI.ClientMenu;
import View_GUI.LoginGUI;
import View_GUI.MainMenu_GUI;
import View_GUI.MainMenu_Manajer;
import View_GUI.MainMenu_Programmer;
import View_GUI.ManajerMenu;
import View_GUI.ProgrammerMenu;
import View_GUI.ProyekMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Controller extends MouseAdapter implements ActionListener{
    
    LoginGUI viewlogin;
    MainMenu_GUI viewMenu= new MainMenu_GUI();
    MainMenu_Programmer viewpro= new MainMenu_Programmer();
    MainMenu_Manajer viewman = new MainMenu_Manajer();
    LoginGUI viewLogin = new LoginGUI();
    ClientMenu ClientMenu = new ClientMenu();
    ManajerMenu ManajerMenu = new ManajerMenu();
    ProgrammerMenu ProgrammerMenu = new ProgrammerMenu();
    ProyekMenu ProyekMenu = new ProyekMenu();
    
    public Controller(){
        viewlogin = new LoginGUI();
        viewlogin.addActionListener(this);
        viewlogin.setVisible(true);
        viewlogin.resetView();
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        Object source = ae.getSource();
        if(source.equals(viewlogin.getBtnLogin())){
            if(viewlogin.getUsernameLogin().equals("admin") && viewlogin.getPasswordLogin().equals("12345")){
                viewMenu.setVisible(true);
                viewlogin.resetView();
            } else if(viewlogin.getUsernameLogin().equals("programmer") && viewlogin.getPasswordLogin().equals("12345")){
                viewpro.setVisible(true);
                viewlogin.resetView();
            } else if(viewlogin.getUsernameLogin().equals("manajer") && viewlogin.getPasswordLogin().equals("12345")){
                viewman.setVisible(true);
                viewlogin.resetView();
            } else {
                JOptionPane.showMessageDialog(null,"Username / Password Salah","Login Error",2);
            }
        }
    }
}
