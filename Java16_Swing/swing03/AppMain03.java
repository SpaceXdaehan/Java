package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain03 {

    private JFrame frame;
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JTextArea textResult;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain03 window = new AppMain03();
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
    public AppMain03() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(300, 200, 500, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel label1 = new JLabel("Number1");
        label1.setFont(new Font("D2Coding", Font.PLAIN, 32));
        label1.setBounds(12, 10, 120, 64);
        frame.getContentPane().add(label1);
        
        JLabel label2 = new JLabel("Number2");
        label2.setFont(new Font("D2Coding", Font.PLAIN, 32));
        label2.setBounds(12, 84, 120, 64);
        frame.getContentPane().add(label2);
        
        textNumber1 = new JTextField();
        textNumber1.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textNumber1.setBounds(144, 10, 320, 64);
        frame.getContentPane().add(textNumber1);
        textNumber1.setColumns(10);
        
        textNumber2 = new JTextField();
        textNumber2.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textNumber2.setColumns(10);
        textNumber2.setBounds(144, 84, 320, 64);
        frame.getContentPane().add(textNumber2);
        
        btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(e);
            }
        });
        btnPlus.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnPlus.setBounds(12, 158, 64, 64);
        frame.getContentPane().add(btnPlus);
        
        btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(e);
            }
        });
        btnMinus.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnMinus.setBounds(88, 158, 64, 64);
        frame.getContentPane().add(btnMinus);
        
        btnMultiply = new JButton("x");
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(e);
            }
        });
        btnMultiply.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnMultiply.setBounds(164, 158, 64, 64);
        frame.getContentPane().add(btnMultiply);
        
        btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(e);
            }
        });
        btnDivide.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnDivide.setBounds(240, 158, 64, 64);
        frame.getContentPane().add(btnDivide);
        
        textResult = new JTextArea();
        textResult.setFont(new Font("D2Coding", Font.PLAIN, 32));
        textResult.setBounds(12, 236, 452, 195);
        frame.getContentPane().add(textResult);
    }

    private void handleButtonClick(ActionEvent event) {
//        System.out.println(event.getSource());
        //-> argument로 전달된 ActionEvent 객체에서 이벤트가 발생한 GUI 컴포넌트 정보를 알 수 있다.
         
        // JTextField에 입력된 문자열을 읽어서 double 타입으로 변환.
        double number1 = 0;
        double number2 = 0;
        try {
            number1 = Double.parseDouble(textNumber1.getText());
            number2 = Double.parseDouble(textNumber2.getText());
            
        } catch (NumberFormatException e) {
            textResult.setText("number1,2는 숫자로 입력하세요...");
            return; // 메서드 종료
        }
        
        double result = 0; // 사칙 연산 결과를 저장할 변수
        String op = ""; // 사칙 연산 연산자 문자열을 저장할 변수(+, -, x, /)
        
        Object source = event.getSource(); // 이벤트가 발생한 컴포넌트
        if (source == btnPlus) {
            result = number1 + number2;
            op = "+";
        } else if (source == btnMinus) {
            result = number1 - number2;
            op = "-";
        } else if (source == btnMultiply) {
            result = number1 * number2;
            op = "x";
        } else if (source == btnDivide) {
            result = number1 / number2;
            op = "/";
        }
        
        String msg = String.format("%f %s %f = %f", number1, op, number2, result);
        textResult.setText(msg);
    }
}