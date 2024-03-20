/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiacominterfacegrafica;
/**
 *
 * @author Fernanda
 */
public class Cliente {
    public static float CalculaMensalidade(int idadeHomem, int idadeMulher){
        
        if(idadeHomem <=15 && idadeMulher <=18){
            return 60;
        }
        else if(idadeHomem<=18){
            return 75;
        }
        else if(idadeHomem<=30 && idadeMulher<=25){
            return 90;
        }
        
        else if(idadeHomem<=40 && idadeMulher<=40){
            return 85;
        }
        else if(idadeHomem<=30 ){
            return 80;
        }
        return 0;
    }
    
    
}
