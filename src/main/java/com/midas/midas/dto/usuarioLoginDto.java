/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.midas.midas.dto;
public class usuarioLoginDto {
    
    
    private String correo;
    private String contraseña;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public usuarioLoginDto(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public usuarioLoginDto() {
    }
    
    
    
}
