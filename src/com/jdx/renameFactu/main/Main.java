/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdx.renameFactu.main;

import com.jdx.renameFactu.view.FormView;

/**
 *
 * @author EQTIC_PROD_JFH
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormView().setVisible(true);
            }
        });
    }
}
