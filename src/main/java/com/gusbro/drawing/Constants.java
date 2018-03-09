/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gusbro.drawing;

/**
 *
 * @author gusbro
 */
public class Constants
{
    public static final String PROMPT_MSG = "enter command:";
    
    // Error messages
    public static final String ERR_LINE_STRAIGHT = "Line should be either horizontal or vertical";
    public static final String ERR_LINE_BOUNDARIES = "Line outside canvas boundaries";
    public static final String ERR_FILL_BOUNDARIES = "Fill starting location outside canvas boundaries";
    public static final String ERR_POINT_BOUNDARIES = "Point outside canvas boundaries";
        
    // Commands
    public static final String CMD_CREATE = "C";
    public static final String CMD_LINE = "L";
    public static final String CMD_RECT = "R";
    public static final String CMD_FILL = "B";
    public static final String CMD_QUIT = "Q";
}
