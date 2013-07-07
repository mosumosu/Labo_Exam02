package exam02;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Morimoto extends JPanel implements ActionListener{
	 JLabel l = new JLabel("あかさたな");
	 JButton b = new JButton("赤");
	public Morinoto(){
		this.setLayout(new MigLayout("", "[grow]", "[grow]"));
		//ラベル作成
		l.setForeground(Color.BLACK);
	    this.add(l);
		//ボタン作成
	     b = new JButton("赤");
	    b.addActionListener(this);
	    add(b);
	    setSize(100,50);
	    this.add(b);
	}
	public void actionPerfomed(ActionEvent e){
		l.setBackground(Color.RED);
	}
	
}