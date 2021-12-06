/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.awt.Container;
import javax.swing.JFrame;


public class Picture extends JFrame {
    private static final int FRAME_WIDTH = 512;
    private static final int FRAME_HEIGHT = 512;
    private static final String FRAME_TITLE = "Picture";
    
    public Picture() {
        this.setSize( FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle( FRAME_TITLE );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();
        pane.add( new PicturePanel() );
        this.setVisible( true );
    } // Picture()
    
    public static void main( String [] args ) {
        Picture picture = new Picture();
    } // main( String [] )
} // Picture
