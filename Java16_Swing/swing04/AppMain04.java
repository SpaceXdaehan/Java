package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain04 {
    // 이미지 파일의 경로들을 저장하는 배열.
    private static final String[] IMAGES = {
            "image/1069-400x400.jpg",
            "image/114-400x400.jpg",
            "image/374-400x400.jpg",
            "image/82-400x400.jpg",
            "image/96-400x400.jpg",
    };

    private int curIndex; // 현재 화면에 보여지는 이미지 파일의 인덱스
    private JFrame frame;
    private JLabel lblImage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain04 window = new AppMain04();
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
    public AppMain04() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 480, 520);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        lblImage = new JLabel(new ImageIcon(IMAGES[curIndex])); //new ImageIcon("images/img1.jpg")
        lblImage.setBounds(12, 10, 400, 400);
        frame.getContentPane().add(lblImage);
        
        JButton btnPrev = new JButton("<");
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // btnPrev 버튼이 클릭됐을 때 할 일을 작성.
                showPrevImage();
            }
        });
        btnPrev.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnPrev.setBounds(12, 420, 97, 40);
        frame.getContentPane().add(btnPrev);
        
        JButton btnNext = new JButton(">");
        btnNext.addActionListener((e) -> showNextImage());
        btnNext.setFont(new Font("D2Coding", Font.PLAIN, 32));
        btnNext.setBounds(315, 420, 97, 40);
        frame.getContentPane().add(btnNext);
    }

    private void showNextImage() {
        if (curIndex < IMAGES.length - 1) {
            curIndex++;
        } else {
            curIndex = 0;
        }
        lblImage.setIcon(new ImageIcon(IMAGES[curIndex]));
    }

    private void showPrevImage() {
        if (curIndex > 0) {
            curIndex--;
        } else {
            curIndex = IMAGES.length - 1;
        }
        lblImage.setIcon(new ImageIcon(IMAGES[curIndex]));
    }

}