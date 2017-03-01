package fr.esiea.puig.gnondoli.Front;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import fr.esiea.puig.gnondoli.Plateau.LettresPlateau;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenetre{

	private JFrame frame;
	
	public Fenetre(){
	
		this.frame = new JFrame();
		this.frame.setContentPane(buildContentPane());
		this.frame.setTitle("Scrable"); 
		this.frame.setSize(600,400); 
		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false); 
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
	}
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		GridLayout position = new GridLayout(3, 4, 20, 20);
		panel.setLayout(position);
		
		JButton passer=new JButton("Passer");
		passer.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){				
		        
		      }
		    });
		
		JButton nouveau=new JButton("nouveau");
		nouveau.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){				
		        
		      }
		    });
		
		JButton voler=new JButton("voler");
		voler.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){				
		        
		      }
		    });
		
		JButton modifier=new JButton("modifier");
		modifier.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){				
		        
		      }
		    });
		
		JButton valider=new JButton("ok");
		modifier.addActionListener(new ActionListener(){
		      public void actionPerformed(ActionEvent event){				
		        
		      }
		    });
		
		JLabel potcommun=new JLabel();
		String printletter="";
		potcommun.setText(LettresPlateau.CommunPot.forEach(lettre ->));
		
		
		JLabel textplayer1=new JLabel();
		JLabel action=new JLabel();
		JLabel reponse=new JLabel();
		
		JLabel textplayer2=new JLabel();
		JLabel currentuplayer=new JLabel();
		JTextArea word=new JTextArea();
		panel.add(passer);
		panel.add(nouveau);
		panel.add(voler);
		panel.add(modifier);
		panel.add(textplayer1);
		panel.add(potcommun);
		panel.add(textplayer2);
		panel.add(currentuplayer);
		panel.add(action);
		panel.add(word);
		panel.add(valider);
		panel.add(reponse); 
		return panel;
	}

}
