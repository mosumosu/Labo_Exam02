package exam02;

import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		// フレームの設定
		setTitle("Labo_Exam02");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// レイアウト設定
		MigLayout growLayout = new MigLayout("", "[grow]", "[grow]");
		getContentPane().setLayout(growLayout);
		
		// 各個人で制作するJPanelをListにまとめる
		List<JPanel> panels = null;
		try {
			panels = Arrays.asList(
					new Anzai(),
					new Ishikawa(),
					new Kadowaki(),
					new Takeuchi(),
					new Matsumoto(),
					new Murata(),
					new Morimoto()
			);
		} catch (RuntimeException e) {
			// あいやくんのRuntimeExceptionを受け取る
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);
		}
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		// JTabbedPaneに追加
		for(JPanel p : panels) {
			tabbedPane.addTab(p.getClass().getSimpleName(), p);
		}
		
		getContentPane().add(tabbedPane, "grow");
	}

	public static void main(String[] args) {

		JFrame frame = new MainFrame();
		frame.setVisible(true);
	}

}
