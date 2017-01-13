package modnetwork.Fenetre;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class PanelRoutage extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanneauTableRoutage pan;

    
    public PanelRoutage(PanneauTableRoutage p){
        super();
        this.pan=p;
        Dimension d = new Dimension(500, 400);
        this.setBackground(new Color(238,234,232));
        this.setPreferredSize(d);
        pan.repaint();
    }
    
    
	    }