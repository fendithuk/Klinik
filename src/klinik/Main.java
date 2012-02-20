/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import klinik.form.FormLogin;
import usu.widget.util.WidgetUtilities;

/**
 *
 * @author fendi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] usu) {
        // TODO code application logic here
        WidgetUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    
                        FormLogin fl = new FormLogin();
                        fl.setVisible(true);
                   
                }


            }
        });
    }
}
