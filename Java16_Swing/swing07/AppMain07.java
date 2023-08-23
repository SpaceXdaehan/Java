package edu.java.swing07;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.security.auth.callback.TextInputCallback;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {
	// JTable에서 사용할 컬럼 이름들
	private static final String[] COLUMN_NAMES = { "국어", "영어", "수학", "총점", "평균" };

	private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체.
	private JFrame frame;
    private JLabel lblKorean;
    private JTextField textKorean;
    private JTextField textEnglish;
    private JTextField textMath;
    private JLabel lblEnglish;
    private JLabel lblMath;
    private JButton btnInsert;
    private JButton btnDelete;
    private JScrollPane scrollPane;
    private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 frame = new JFrame();
	        frame.setBounds(100, 100, 514, 544);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(null);
	        
	        lblKorean = new JLabel("국어");
	        lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        lblKorean.setBounds(12, 10, 88, 61);
	        frame.getContentPane().add(lblKorean);
	        
	        textKorean = new JTextField();
	        textKorean.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        textKorean.setBounds(112, 10, 374, 61);
	        frame.getContentPane().add(textKorean);
	        textKorean.setColumns(10);
	        
	        lblEnglish = new JLabel("영어");
	        lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        lblEnglish.setBounds(12, 81, 88, 61);
	        frame.getContentPane().add(lblEnglish);
	        
	        textEnglish = new JTextField();
	        textEnglish.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        textEnglish.setColumns(10);
	        textEnglish.setBounds(112, 81, 374, 61);
	        frame.getContentPane().add(textEnglish);
	        
	        lblMath = new JLabel("수학");
	        lblMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        lblMath.setBounds(12, 152, 88, 61);
	        frame.getContentPane().add(lblMath);
	        
	        textMath = new JTextField();
	        textMath.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        textMath.setColumns(10);
	        textMath.setBounds(112, 152, 374, 61);
	        frame.getContentPane().add(textMath);
	        
	        btnInsert = new JButton("입력");
	        btnInsert.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		insertScoreToTable();
	        	}
	        });
	        btnInsert.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        btnInsert.setBounds(12, 223, 188, 61);
	        frame.getContentPane().add(btnInsert);
	        
	        btnDelete = new JButton("삭제");
	        btnDelete.addActionListener(new ActionListener() {
	        	@Override
	        	public void actionPerformed(ActionEvent e) {
	        		deleteRowFromTable();
	        	}
	        });
	        btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 28));
	        btnDelete.setBounds(212, 223, 188, 61);
	        frame.getContentPane().add(btnDelete);
	        
	        scrollPane = new JScrollPane();
	        scrollPane.setBounds(12, 294, 474, 201);
	        frame.getContentPane().add(scrollPane
	        		);

		table = new JTable();
		Object[][] data = {}; // 테이블에 사용할 데이터
		model = new DefaultTableModel(data, COLUMN_NAMES);
		Object[] row = {10, 20, 30, 60, 20}; // 두줄의 코드를 입력으로 연결
		model.addRow(row); // 1차원 배열을 넘겨야됨.
		model.removeRow(0); // int사용 삭제로 연결
		table.setModel(model);
		scrollPane.setViewportView(table);
	}

	private void deleteRowFromTable() {
		// 1. 테이블에서 삭제하기 위해 선택된 행의 인덱스를 찾는다.
		int index = table.getSelectedRow();
		if (index == -1) {	// 테이블에서 아무 행도 선택되지 않은 경우.
			
			JOptionPane.showMessageDialog(
					frame,
					"테이블에서 삭제할 행을 먼저 선택하세요",
					"경고!",
					JOptionPane.WARNING_MESSAGE);
			return; // 메서드 종료
		}
		
		// 2. 해당 인덱스에 행을 테이블 모델에서 삭제한다.
		int confirm = JOptionPane.showConfirmDialog(
				frame,
				index + " 인덱스 행을 정말 삭제할까요?",
				"삭제 확인",
				JOptionPane.YES_NO_OPTION);
		
		if (confirm == JOptionPane.YES_OPTION) {
			model.removeRow(index);
		}
		
	}

	private void insertScoreToTable() {
		// 1. JTextField에서 3과목의 점수를 읽음.
		int korean = 0;
		int english = 0;
		int math = 0;
		
		try {
			korean = Integer.parseInt(textKorean.getText());
			english = Integer.parseInt(textEnglish.getText());
			math = Integer.parseInt(textMath.getText());
			
		} catch (NumberFormatException e) {
			JOptionPane.showConfirmDialog(
					frame,
					"국어, 영어, 수학 점수는 정수로 입력" + e.getMessage(),
					"error",
					JOptionPane.ERROR_MESSAGE);
			return;		// 메서드 종료
		}
		
		// 2. Score 타입 객체 생성.
		Score score = new Score(korean, english, math);
		
		// 3. JTable에 행(row)을 추가.
		Object[] row = {
				score.getKorean(),
				score.getEnglish(),
				score.getMath(),
				score.getTotal(),
				score.getMean(),
		};
		model.addRow(row);
		
		// 모든 JTextField의 입력 내용을 지움.
		clearAllTextFields();
	}

	private void clearAllTextFields() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");
	}
	
	
}
