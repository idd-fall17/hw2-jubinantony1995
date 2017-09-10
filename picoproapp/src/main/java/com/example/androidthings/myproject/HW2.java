package com.example.androidthings.myproject;

import com.google.android.things.pio.Gpio;
import android.util.Log;
import android.os.Handler;

/**
 * Template for IDD Fall 2017 HW2 (text entry device)
 * Created by bjoern on 9/5/17.
 */

public class HW2 extends SimplePicoPro {

    Boolean pin1 = false;
    Boolean pin2 = false;
    Boolean pin3 = false;
    Boolean pin4 = false;
    Boolean pin5 = false;
    Boolean pin6 = false;
    Boolean pin7 = false;
    Boolean pin8 = false;
    Boolean pin9 = false;
    Boolean pin10 = false;

    Boolean trigger = false;
    Boolean read = true;

    String button1 = "";
    String button2 = "";

    String input = "";
    String newInput = "";
    String result = "";

    Boolean capslock = false;

    @Override
    public void setup() {
        //set two GPIOs to input
        pinMode(GPIO_128,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_128,Gpio.EDGE_BOTH);

        pinMode(GPIO_39,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_39,Gpio.EDGE_BOTH);

        pinMode(GPIO_37,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_37,Gpio.EDGE_BOTH);

        pinMode(GPIO_35,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_35,Gpio.EDGE_BOTH);

        pinMode(GPIO_34,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_34,Gpio.EDGE_BOTH);

        pinMode(GPIO_33,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_33,Gpio.EDGE_BOTH);

        pinMode(GPIO_32,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_32,Gpio.EDGE_BOTH);

        pinMode(GPIO_10,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_10,Gpio.EDGE_BOTH);

        pinMode(GPIO_172,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_172,Gpio.EDGE_BOTH);

        pinMode(GPIO_173,Gpio.DIRECTION_IN);
        //setEdgeTrigger(GPIO_173,Gpio.EDGE_BOTH);
    }

    @Override
    public void loop() {
        //nothing to do here

        if(digitalRead(GPIO_128) == LOW) {
            if (read){
                pin1 = true;
                trigger = true;
                assignButton("pin1");
            }
        }else{
            if (pin1 == true){
                pin1 = false;
                deleteButton("pin1");
                reset();
            }
        }

        if(digitalRead(GPIO_39)==LOW) {
            if (read) {
                pin2 = true;
                trigger = true;
                assignButton("pin2");
            }

        }else{
            if (pin2 == true){
                pin2 = false;
                deleteButton("pin2");
                reset();
            }

        }

        if(digitalRead(GPIO_37)==LOW) {
            if (read) {
                pin3 = true;
                trigger = true;
                assignButton("pin3");
            }

        }else{
            if (pin3 == true){
                pin3 = false;
                deleteButton("pin3");
                reset();
            }

        }

        if(digitalRead(GPIO_35)==LOW) {
            if (read) {
                pin4 = true;
                trigger = true;
                assignButton("pin4");
            }

        }else{
            if (pin4 == true){
                pin4 = false;
                deleteButton("pin4");
                reset();
            }

        }

        if(digitalRead(GPIO_34)==LOW) {
            if (read) {
                pin5 = true;
                trigger = true;
                assignButton("pin5");
            }

        }else{
            if (pin5 == true){
                pin5 = false;
                deleteButton("pin5");
                reset();
            }

        }

        if(digitalRead(GPIO_33)==LOW) {
            if (read) {
                pin6 = true;
                trigger = true;
                assignButton("pin6");
            }

        }else{
            if (pin6 == true){
                pin6 = false;
                deleteButton("pin6");
                reset();
            }

        }

        if(digitalRead(GPIO_32)==LOW) {
            if (read) {
                pin7 = true;
                trigger = true;
                assignButton("pin7");
            }

        }else{
            if (pin7 == true){
                pin7 = false;
                deleteButton("pin7");
                reset();
            }

        }

        if(digitalRead(GPIO_10)==LOW) {
            if (read) {
                pin8 = true;
                trigger = true;
                assignButton("pin8");
            }

        }else{
            if (pin8 == true){
                pin8 = false;
                deleteButton("pin8");
                reset();
            }

        }

        if(digitalRead(GPIO_172)==LOW) {
            if (read) {
                pin9 = true;
                trigger = true;
                assignButton("pin9");
            }

        }else{
            if (pin9 == true){
                pin9 = false;
                deleteButton("pin9");
                reset();
            }

        }

        if(digitalRead(GPIO_173)==LOW) {
            if (read) {
                pin10 = true;
                trigger = true;
                assignButton("pin10");
            }

        }else{
            if (pin10 == true){
                pin10 = false;
                deleteButton("pin10");
                reset();
            }

        }


        if (trigger == true){
            inputAction();
            trigger = false;
        }

        if (read==false){
            if (button1=="" && button2==""){
                read = true;
            }else {
                read = false;
            }
        }

        delay(40);

    }

    public void inputAction() {
        if (pin1==true){
            if (pin2==true){
                newInput = "b";
            }else if (pin4==true){
                newInput = "f";
            }else if (pin5==true){
                newInput = "g";
            }else {
                newInput = "a";
            }
            change();
        }else if (pin2==true){
            if (pin1==true){
                newInput = "b";
            }else if (pin3==true){
                newInput = "d";
            }else if (pin4==true){
                newInput = "g";
            }else if (pin5==true){
                newInput = "h";
            }else if (pin6==true){
                newInput = "i";
            }else {
                newInput = "c";
            }
            change();
        }else if (pin3==true){
            if (pin2==true){
                newInput = "d";
            }else if (pin5==true){
                newInput = "i";
            }else if (pin6==true){
                newInput = "j";
            }else {
                newInput = "e";
            }
            change();
        }else if (pin4==true){
            if (pin1==true){
                newInput = "f";
            }else if (pin2==true){
                newInput = "g";
            }else if (pin5==true){
                newInput = "l";
            }else if (pin7==true){
                newInput = "p";
            }else if (pin8==true){
                newInput = "q";
            }else {
                newInput = "k";
            }
            change();
        }else if (pin5==true){
            if (pin1==true){
                newInput = "g";
            }else if (pin2==true){
                newInput = "h";
            }else if (pin3==true){
                newInput = "i";
            }else if (pin4==true){
                newInput = "l";
            }else if (pin6==true){
                newInput = "n";
            }else if (pin7==true){
                newInput = "q";
            }else if (pin8==true){
                newInput = "r";
            }else if (pin9==true){
                newInput = "s";
            }else {
                newInput = "m";
            }
            change();
        }else if (pin6==true){
            if (pin2==true){
                newInput = "i";
            }else if (pin3==true){
                newInput = "j";
            }else if (pin5==true){
                newInput = "n";
            }else if (pin8==true){
                newInput = "s";
            }else if (pin9==true){
                newInput = "t";
            }else {
                newInput = "o";
            }
            change();
        }else if (pin7==true){
            if (pin4==true){
                newInput = "p";
            }else if (pin5==true){
                newInput = "q";
            }else if (pin8==true){
                newInput = "v";
            }else if (pin10==true){
                newInput = "capslock";
            }else {
                newInput = "u";
            }
            change();
        }else if (pin8==true){
            if (pin4==true){
                newInput = "q";
            }else if (pin5==true){
                newInput = "r";
            }else if (pin6==true){
                newInput = "s";
            }else if (pin7==true){
                newInput = "v";
            }else if (pin9==true){
                newInput = "x";
            }else if (pin10==true){
                newInput = "z";
            }else {
                newInput = "w";
            }
            change();
        }else if (pin9==true){
            if (pin5==true){
                newInput = "s";
            }else if (pin6==true){
                newInput = "t";
            }else if (pin8==true){
                newInput = "x";
            }else if (pin10==true){
                newInput = "backspace";
            }else {
                newInput = "y";
            }
            change();
        }else if (pin10==true){
            if (pin7==true){
                newInput = "capslock";
            }else if (pin8==true){
                newInput = "z";
            }else if (pin9==true){
                newInput = "backspace";
            }else {
                newInput = " ";
            }
            change();
        }

    }

    public void change() {
        if (input!="" && result!="" && input!="capslock" && input!="backspace"){
            if (result.length()==1){
                result = "";
            }else{
                result = result.substring(0, result.length() - 1);
            }
        }

        if (newInput!="capslock" && newInput!="backspace"){
            if (capslock) {
                String str = newInput.toUpperCase();
                result += str;
            } else {
                result += newInput;
            }
        }else if (newInput=="capslock"){
            if (input!="capslock"){
                if (capslock){
                    capslock = false;
                }else {
                    capslock = true;
                }
            }
        }else if (newInput=="backspace" && result!=""){
            if (input!="backspace"){
                if (result.length()==1){
                    result = "";
                }else{
                    result = result.substring(0, result.length() - 1);
                }
            }
        }

        input = newInput;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                println("Word Character: " + result);

                clearStringOnScreen();
                printStringToScreen(result);
            }
        }, 100);


    }

    public void reset() {
        if (button1=="" && button2==""){
            read = true;
        }else {
            read = false;
        }

        input = "";
        newInput = "";

        println("Word Character: " + result);
    }

    public void assignButton(String button) {
        if (button1==button || button2==button){
            return;
        }else if (button1==""){
            button1 = button;
        }else {
            button2 = button;
        }
    }

    public void deleteButton(String button) {
        trigger = false;
        int i = 0;

        if (button1==button){
            button1 = "";
            i += 1;
        }else if (button1==""){
            i += 1;
        }

        if (button2==button){
            button2 = "";
            i += 1;
        }else if (button2==""){
            i += 1;
        }

        if (i==2){
            read = true;
        }else {
            read = false;
        }
    }
}
