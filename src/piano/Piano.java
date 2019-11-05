/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Piano 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TestSounds test = new TestSounds();
        test.setVisible(true);
        test.setSize(1200, 450);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

