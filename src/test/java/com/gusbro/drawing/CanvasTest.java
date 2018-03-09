/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gusbro.drawing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gusbro
 */
public class CanvasTest
{
    
    public CanvasTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    public static final int WIDTH = 20;
    public static final int HEIGHT = 10;
    public Canvas getInstance()
    {
        return new Canvas(WIDTH,HEIGHT);
    }

    /**
     * Test of getWidth method, of class Canvas.
     */
    @Test
    public void testGetWidth()
    {
        System.out.println("getWidth");
        Canvas instance = getInstance();
        int expResult = WIDTH;
        int result = instance.getWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeight method, of class Canvas.
     */
    @Test
    public void testGetHeight()
    {
        System.out.println("getHeight");
        Canvas instance = getInstance();
        int expResult = HEIGHT;
        int result = instance.getHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of paint method, of class Canvas.
     */
    @Test
    public void testPaint()
    {
        System.out.println("paint");
        Canvas instance = getInstance();
        instance.paint();
    }

    /**
     * Test of drawLine method, of class Canvas.
     */
    @Test
    public void testDrawLine()
    {
        System.out.println("drawLine");
        int [] x1 = new int[]{0,100,1, 1, 2, 5};
        int [] y1 = new int[]{0,100,2, 1, 3, 6};
        int [] x2 = new int[]{0,120,3, 1, 2, 10};
        int [] y2 = new int[]{0,120,4, 1, 10, 6};
        boolean [] shouldRaiseError = new boolean[]{true, true, true, false, false, false};
        Canvas instance = getInstance();
        for(int idx = 0; idx < shouldRaiseError.length; idx++)
        {   
            try{
                instance.drawLine(x1[idx], y1[idx], x2[idx], y2[idx]);
                assertEquals(shouldRaiseError[idx], false);
            }catch(IllegalArgumentException e)
            {
                assertEquals(shouldRaiseError[idx], true);
            }
        }        
    }

    /**
     * Test of drawRect method, of class Canvas.
     */
    @Test
    public void testDrawRect()
    {
        System.out.println("drawRect");
        int [] x1 = new int[]{0,100,1, 1, 2, 5};
        int [] y1 = new int[]{0,100,2, 1, 3, 6};
        int [] x2 = new int[]{0,120,3, 1, 2, 10};
        int [] y2 = new int[]{0,120,4, 1, 10, 6};
        boolean [] shouldRaiseError = new boolean[]{true, true, false, false, false, false};
        Canvas instance = getInstance();
        for(int idx = 0; idx < shouldRaiseError.length; idx++)
        {   
            try{
                instance.drawRect(x1[idx], y1[idx], x2[idx], y2[idx]);
                assertEquals(shouldRaiseError[idx], false);
            }catch(IllegalArgumentException e)
            {
                assertEquals(shouldRaiseError[idx], true);
            }
        }        
    }

    /**
     * Test of fill method, of class Canvas.
     */
    @Test
    public void testFill()
    {
        System.out.println("fill");
        int x = 0;
        int y = 0;
        char color = ' ';
        Canvas instance = getInstance();;
        instance.fill(2, 3, 'a');
        instance.fill(3, 4, 'b');
        try{
            instance.fill(103, 3, 'c');
        }catch(IllegalArgumentException e){}
        try{
            instance.fill(6, -6, 'd');
        }catch(IllegalArgumentException e){}
    }    
}
