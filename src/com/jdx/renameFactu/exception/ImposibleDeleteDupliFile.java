/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jdx.renameFactu.exception;

/**
 *
 * @author EQTIC_PROD_JFH
 */
public class ImposibleDeleteDupliFile extends RuntimeException{
    
    public ImposibleDeleteDupliFile(String message) {
        super(message);
    }    
}
