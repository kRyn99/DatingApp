/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuce.datingApp.exceptions;

/**
 *
 * @author duckh
 */
public class DatingAppException extends RuntimeException{
    public DatingAppException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }
    
    public DatingAppException(String exMessage){
        super(exMessage);
    }
}
