package exam02;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class Morimoto extends JPanel implements ActionListener{
	public Morinoto(){
		
		JPanel p = new JPanel();
		Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	    
	    Button b = new Button("赤");
	    b.addActionListener(this);
	    add(b);
	    setSize(100,50);
	    show();
	}
	public void actionPerfomed(ActionEvent e){
		p.setColor(Color.RED);
	}