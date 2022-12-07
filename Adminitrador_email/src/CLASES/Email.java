/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import javax.swing.JOptionPane;

/**
 *
 * @author EAPIIS-LABORATORIO
 */
public class Email {
    private String apellidos;
    private String nombres;
    private String password;
    private String departamento;
    private int  capacidadBuzon = 500;
    private String correo;
    private String compania = "Edsghot.com";
    
    //contructor
    public Email(String nombres,String apellidos){
        this.apellidos = apellidos;
        this.nombres = nombres;
        
    }
    
    public String setDepartamento(boolean radiobuton[]) {
    	if(radiobuton[0] == true) {
    		 this.departamento = "tien";
    		 this.capacidadBuzon = 1000;
    	}else if(radiobuton[1] == true) {
    		this.departamento = "dev";
    		this.capacidadBuzon = 1500;
    	}else if(radiobuton[2] == true) {
    		this.departamento = "cont";
    		this.capacidadBuzon = 800;
    	}else if(radiobuton[3] == true){
    		this.departamento = "";
    		this.capacidadBuzon = 500;
    	}else {
    		this.departamento = "error";
    	}
    	return this.departamento;
    }
    private String randomPassword() {
    	int tam = 10;
    	String passwordSet = "QWERTYUIOPLÑKJHGFDSAMNBVCXZ123456789!@#-$&?¿";
    	//vamos a generar el passowrd de 10 digitos o caracteres
    	char[] password = new char[10];
    	for(int i=0;i<tam;i++) {
    		//generamos la posicion del caracter qeu vamos a usar para nuestro passowrd
    		int rand = (int)(Math.random()*passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    		
    	}

    	return new String(password);
    }
    public String getPassword() {
    	this.password = randomPassword();
    	return password;
    }
    
    public String getEmail() {
    	this.correo = apellidos.toLowerCase()+nombres.toLowerCase()+"@"+this.departamento+compania;
    	return correo;
    }
    public int getCapacidadEmail() {
    	return this.capacidadBuzon;
    }
}
