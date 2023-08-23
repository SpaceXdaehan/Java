package edu.java.swing06;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Component parent;

	/**
	 * Launch the application.
	 */
	public static void showMyDialog (Component parent) {
		try {
			MyDialog dialog = new MyDialog(parent);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	private MyDialog(Component parent) {
		this.parent = parent;
		initialize();
	}
	
	public void initialize() {
		setTitle("My Dialog");	// 다이얼로그의 타이틀
		
		int x = 100;	// 부모 컴포넌트가 null인 경우에 사용할 x좌표 기본값.
		int y = 100;	// 부모 컴포넌트가 null인 경우에 사용할 y좌표 기본값.
		if (parent != null) {
			x = parent.getX(); 	// 부모 컴포넌트의 x좌표.
			y = parent.getY();	// 부모 컴포넌트의 y좌표.
		}
		setBounds(x, y, 486, 519);	// 다이얼로그 좌표(x, y), 크기(가로,세로)
		
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		
		getContentPane().setLayout(new BorderLayout());
        contentPanel.setLayout(new FlowLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);

        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        JButton okButton = new JButton("OK");
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
		
}

	

}
