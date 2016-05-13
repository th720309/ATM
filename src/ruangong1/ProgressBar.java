package ruangong1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

 

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

 


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

 

public class ProgressBar implements ActionListener, ChangeListener {

    JFrame frame = null;

    JProgressBar progressbar;

    JLabel label;

    Timer timer;

    JButton b;

 

    public ProgressBar() {

       frame = new JFrame("交易进行中");

       frame.setBounds(450, 300, 400, 150);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setResizable(false);

       Container contentPanel = frame.getContentPane();

       label = new JLabel("正在交易中，请稍等", JLabel.CENTER);

       progressbar = new JProgressBar();

       progressbar.setOrientation(JProgressBar.HORIZONTAL);

       progressbar.setMinimum(0);

       progressbar.setMaximum(100);

       progressbar.setValue(0);

       progressbar.setStringPainted(true);

       progressbar.addChangeListener(this);

       progressbar.setPreferredSize(new Dimension(300, 20));

       progressbar.setBorderPainted(true);

       progressbar.setBackground(Color.pink);

 

       JPanel panel = new JPanel();

       b = new JButton("确认交易");

       b.setForeground(Color.blue);

       b.addActionListener(this);

       panel.add(b);

       timer = new Timer(100, this);

       contentPanel.add(panel, BorderLayout.NORTH);

       contentPanel.add(label, BorderLayout.CENTER);

       contentPanel.add(progressbar, BorderLayout.SOUTH);

       // frame.pack();

       frame.setVisible(true);

    }

 

    public void actionPerformed(ActionEvent e) {

       if (e.getSource() == b) {

           timer.start();

       }

       if (e.getSource() == timer) {

           int value = progressbar.getValue();
           
           int result = value + 10;
           if (value < 100)

              progressbar.setValue(++result);

           else {

              timer.stop();

              frame.dispose();
 
            JOptionPane.showMessageDialog
              (null,"交易成功","交易成功", JOptionPane.WARNING_MESSAGE);
           }

       }

 

    }

 

    public void stateChanged(ChangeEvent e1) {

       int value = progressbar.getValue();

       if (e1.getSource() == progressbar) {

           label.setText("目前已完成进度：" + Integer.toString(value) + "%");

           label.setForeground(Color.blue);

       }

 

    }

 

    public static void main(String[] args) {

       try {

           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

       } catch (Exception e) {

           Logger.getLogger(ProgressBar.class.getName()).log(Level.FINE,

                  e.getMessage());

           e.printStackTrace();

       }

       new ProgressBar();

    }

 

}