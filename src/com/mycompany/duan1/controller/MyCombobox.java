/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duan1.controller;

/**
 *
 * @author Administrator
 */
public class MyCombobox {
    
    public Object Text;
    public Object Value;

    public MyCombobox(Object text, Object value) {
        Text = text;
        Value = value;
    }

    @Override
    public String toString() {
        return Text.toString();
    }
}
