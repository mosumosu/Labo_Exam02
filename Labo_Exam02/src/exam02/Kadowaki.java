package exam02;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class Kadowaki extends JPanel {

	public Kadowaki() {

		// 自身を表示領域いっぱいに広げる
		this.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		// JTable設定
		String[] colName = { "hoge", "foo" };
		DefaultTableModel model = new DefaultTableModel(colName, 10);
		JTable table = new JTable(model);
		model.setValueAt("Sample", 0, 0);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		
		// 自身に追加
		this.add(scrollPane, "grow");
	}
}
