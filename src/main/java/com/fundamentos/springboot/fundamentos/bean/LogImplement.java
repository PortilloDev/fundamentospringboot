package com.fundamentos.springboot.fundamentos.bean;

public class LogImplement implements LoginInterface{
    @Override
    public String welcome(String name) {
        return "Bienvenido " + name;
    }

    public void printWelcome() {
        String name = "Pepe";
        String welcome = this.welcome(name);
        System.out.println(welcome);
    }
}
