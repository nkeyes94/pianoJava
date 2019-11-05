/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import java.util.*;                                                             //Importing our java utilities for scanners.
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nates Rig
 */
public class TestSounds extends JFrame
{
    private JButton A01;
    private JButton A01Sharp;
    private JButton B01;
    private JButton C01;
    private JButton C01Sharp;
    private JButton C02;
    private JButton D01;
    private JButton D01Sharp;
    private JButton E01;
    private JButton F01;
    private JButton F01Sharp;
    private JButton G01;
    private JButton G01Sharp;
    
    private JButton CMajChord;
    
    private JButton CMajScale;
    private JButton MorrowindTheme;
    
    public TestSounds()
    {
        super("Piano");
        setLayout(new FlowLayout());
        
        handler handle = new handler();
        
        ImageIcon whiteKey = new ImageIcon("whiteKey.png");
        ImageIcon blackKey = new ImageIcon("blackKey.png");
        ImageIcon rightSplit = new ImageIcon("C01Key.png");
        ImageIcon splitKey = new ImageIcon("splitKey.png");
        ImageIcon leftSplit = new ImageIcon("leftSplit.png");
        
        //EY CONFRIGURATION
        A01 = new JButton();
        A01.setIcon(splitKey);
        A01.setContentAreaFilled(false);
        A01.setFocusPainted(false);
        A01.setBorderPainted(true);
        A01.setFocusable(false);
        A01.addActionListener(handle);
        A01.setPreferredSize(new Dimension(55, 371));
        
        A01Sharp = new JButton();
        A01Sharp.setIcon(blackKey);
        A01Sharp.setContentAreaFilled(false);
        A01Sharp.setFocusPainted(false);
        A01Sharp.setBorderPainted(false);
        A01Sharp.setFocusable(false);
        A01Sharp.addActionListener(handle);
        A01Sharp.setPreferredSize(new Dimension(40, 243));
        
        B01 = new JButton();
        B01.setIcon(leftSplit);
        B01.setContentAreaFilled(false);
        B01.setFocusPainted(false);
        B01.setBorderPainted(true);
        B01.setFocusable(false);
        B01.addActionListener(handle);
        B01.setPreferredSize(new Dimension(55, 371));
        
        C01 = new JButton();
        C01.setIcon(rightSplit);
        C01.setContentAreaFilled(false);
        C01.setFocusPainted(false);
        C01.setBorderPainted(true);
        C01.setFocusable(false);
        C01.addActionListener(handle);
        C01.setPreferredSize(new Dimension(55, 371));
        
        C01Sharp = new JButton();
        C01Sharp.setIcon(blackKey);
        C01Sharp.setContentAreaFilled(false);
        C01Sharp.setFocusPainted(false);
        C01Sharp.setBorderPainted(true);
        C01Sharp.setFocusable(false);
        C01Sharp.addActionListener(handle);
        C01Sharp.setPreferredSize(new Dimension(40, 243));
        
        C02 = new JButton();
        C02.setIcon(whiteKey);
        C02.setContentAreaFilled(false);
        C02.setFocusPainted(false);
        C02.setBorderPainted(true);
        C02.setFocusable(false);
        C02.addActionListener(handle);
        C02.setPreferredSize(new Dimension(55, 371));
        
        D01 = new JButton();
        D01.setIcon(splitKey);
        D01.setContentAreaFilled(false);
        D01.setFocusPainted(false);
        D01.setBorderPainted(true);
        D01.setFocusable(false);
        D01.addActionListener(handle);
        D01.setPreferredSize(new Dimension(55, 371));
        
        D01Sharp = new JButton();
        D01Sharp.setIcon(blackKey);
        D01Sharp.setContentAreaFilled(false);
        D01Sharp.setFocusPainted(false);
        D01Sharp.setBorderPainted(false);
        D01Sharp.setFocusable(false);
        D01Sharp.addActionListener(handle);
        D01Sharp.setPreferredSize(new Dimension(40, 243));
        
        E01 = new JButton();
        E01.setIcon(leftSplit);
        E01.setContentAreaFilled(false);
        E01.setFocusPainted(false);
        E01.setBorderPainted(true);
        E01.setFocusable(false);
        E01.addActionListener(handle);
        E01.setPreferredSize(new Dimension(55, 371));
        
        F01 = new JButton();
        F01.setIcon(rightSplit);
        F01.setContentAreaFilled(false);
        F01.setFocusPainted(false);
        F01.setBorderPainted(true);
        F01.setFocusable(false);
        F01.addActionListener(handle);
        F01.setPreferredSize(new Dimension(55, 371));
        
        F01Sharp = new JButton();
        F01Sharp.setIcon(blackKey);
        F01Sharp.setContentAreaFilled(false);
        F01Sharp.setFocusPainted(false);
        F01Sharp.setBorderPainted(false);
        F01Sharp.setFocusable(false);
        F01Sharp.addActionListener(handle);
        F01Sharp.setPreferredSize(new Dimension(40, 243));
        
        G01 = new JButton();
        G01.setIcon(splitKey);
        G01.setContentAreaFilled(false);
        G01.setFocusPainted(false);
        G01.setBorderPainted(true);
        G01.setFocusable(false);
        G01.addActionListener(handle);
        G01.setPreferredSize(new Dimension(55, 371));
        
        G01Sharp = new JButton();
        G01Sharp.setIcon(blackKey);
        G01Sharp.setContentAreaFilled(false);
        G01Sharp.setFocusPainted(false);
        G01Sharp.setBorderPainted(true);
        G01Sharp.setFocusable(false);
        G01Sharp.addActionListener(handle);
        G01Sharp.setPreferredSize(new Dimension(40, 243));
        
        add(C01);
        add(C01Sharp);
        add(D01);
        add(D01Sharp);
        add(E01);
        add(F01);
        add(F01Sharp);
        add(G01);
        add(G01Sharp);
        add(A01);
        add(A01Sharp);
        add(B01);
        add(C02);
        
        //PREPROGRAMMED CONFIG
        CMajScale = new JButton("C-Maj Scale");
        CMajScale.setFocusable(false);
        CMajScale.addActionListener(handle);
        
        add(CMajScale);
        
        MorrowindTheme = new JButton("Morrwind");
        MorrowindTheme.setFocusable(false);
        MorrowindTheme.addActionListener(handle);
        
        add(MorrowindTheme);
        
        //PREPROGRAMMED CHORDS
        CMajChord = new JButton("C-Maj Chord");
        CMajChord.setFocusable(false);
        CMajChord.addActionListener(handle);
        
        add(CMajChord);
        
    }
    public void playSound(String soundName)
    {
        try 
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
        }
    }
    
    private class handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==A01)
            {
                System.out.println("A01");
                playSound("A01.wav");
            }
            else if (e.getSource()==A01Sharp)
            {
                System.out.println("A01Sharp");
                playSound("A01Sharp.wav");
            }
            else if(e.getSource()==B01)
            {
                System.out.println("B01");
                playSound("B01.wav");
            }
            else if(e.getSource()==C01)
            {
                System.out.println("C01");
                playSound("C01.wav");
            }
            else if(e.getSource()==C01Sharp)
            {
                System.out.println("C01Sharp");
                playSound("C01Sharp.wav");
            }
            else if(e.getSource()==C02)
            {
                System.out.println("C02");
                playSound("C02.wav");
            }
            else if(e.getSource()==D01)
            {
                System.out.println("D01");
                playSound("D01.wav");
            }
            else if(e.getSource()==D01Sharp)
            {
                System.out.println("D01Sharp");
                playSound("D01Sharp.wav");
            }
            else if(e.getSource()==E01)
            {
                System.out.println("E01");
                playSound("E01.wav");
            }
            else if(e.getSource()==F01)
            {
                System.out.println("F01");
                playSound("F01.wav");
            }
            else if(e.getSource()==F01Sharp)
            {
                System.out.println("F01Sharp");
                playSound("F01Sharp.wav");
            }
            else if(e.getSource()==G01)
            {
                System.out.println("G01");
                playSound("G01.wav");
            }
            else if(e.getSource()==G01Sharp)
            {
                System.out.println("G01Sharp");
                playSound("G01Sharp.wav");
            }
            else if(e.getSource()==CMajScale)
            {
                System.out.println("CMajScale");
                playSound("C01.wav");
                try 
                {
                    TimeUnit.SECONDS.sleep(1);
                
                    playSound("D01.wav");
                    TimeUnit.SECONDS.sleep(1);
                
                    playSound("E01.wav");
                    TimeUnit.SECONDS.sleep(1);
                           
                    playSound("F01.wav");
                    TimeUnit.SECONDS.sleep(1);
                
                    playSound("G01.wav");
                    TimeUnit.SECONDS.sleep(1);
              
                    playSound("A01.wav");
                    TimeUnit.SECONDS.sleep(1);
              
                    playSound("B01.wav");
                    TimeUnit.SECONDS.sleep(1);
               
                    playSound("C02.wav"); 
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestSounds.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            else if(e.getSource()==MorrowindTheme)
            {
                try{
                playSound("C01.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("D01.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("D01Sharp.wav");
                TimeUnit.SECONDS.sleep(1);
                
                playSound("D01Sharp.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("F01.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("G01.wav");
                TimeUnit.MILLISECONDS.sleep(1000);
                
                playSound("G01.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("A01Sharp.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("F01.wav");
                TimeUnit.MILLISECONDS.sleep(1000);
                
                playSound("G01.wav");
                TimeUnit.MILLISECONDS.sleep(350);
                
                playSound("F01.wav");
                TimeUnit.MILLISECONDS.sleep(350);
                
                playSound("D01Sharp.wav");
                TimeUnit.MILLISECONDS.sleep(350);
                
                playSound("D01.wav");
                TimeUnit.MILLISECONDS.sleep(500);
                
                playSound("C01.wav");
                }
                catch (InterruptedException ex)
                {
                    Logger.getLogger(TestSounds.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(e.getSource()==CMajChord)
            {
                playSound("C01.wav");
                playSound("E01.wav");
                playSound("G01.wav");
            }
        }
    }
    
    private class Tempo
    {
        public void Temp(int time)
        {
            int tempo = time;
            int whole = time;
            int half = time/2;
            int quarter = time/4;
            int eighth = time/8;
            int sixteeth = time/16;
        }
    }
}
