package ruangong1;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class RegisterWin extends JFrame {
	   static JTextField inputNumber;     //输入卡号
	   static JTextField inputName;
	   static JPasswordField inputPassword;   //输入密码
	   JButton signIn;                //确定按钮
	   JButton logIn;
	   JButton forgetPassword;
	   JCheckBox remember;
	   AddActionListener listener; 
	   OperatorListener Itemlistener;
	   RegisterWin(){
		   //设置标题  
	        super("JFram设置背景图片(Cannel_2020)");  
	        //设置大小  
	        setSize(600, 435);  
	        //设置位置  
	        setLocation(400, 200);  
	        //背景图片的路径。
	        String path = "主页_副本.jpg";  
	        // 背景图片  
	        ImageIcon background = new ImageIcon(path);  
	        // 把背景图片显示在一个标签里面  
	        JLabel label = new JLabel(background);  
	        // 把标签的大小位置设置为图片刚好填充整个面板  
	        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
	        // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明  
	        JPanel imagePanel = (JPanel) this.getContentPane();  
	        imagePanel.setOpaque(false);  
	        // 把背景图片添加到分层窗格的最底层作为背景  
	        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));  
	        //设置可见  
	        setVisible(true);  
	        //点关闭按钮时退出  
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		   setLayout(null);
		   setTitle("银行存取款系统");
		   inputNumber = new JTextField("",10);
		   inputName = new JTextField("",10);
		   inputPassword = new JPasswordField("",10);
		   signIn =  new JButton(new ImageIcon("0342.png"));
		   logIn = new JButton(new ImageIcon("0342_副本.png"));
		   remember = new JCheckBox("记住密码");
		   remember.setContentAreaFilled(false); 
		   remember.setBorderPainted(false);
		   remember.setSelected(true);
		   Font font = new Font("微软雅黑",Font.BOLD,15);
		   forgetPassword = new JButton();
		   forgetPassword.setContentAreaFilled(false); 
		   forgetPassword.setBorderPainted(false);
		   forgetPassword.setIcon(new ImageIcon("update.png"));
		   JLabel product=new JLabel("producted by R数学131 田浩");
		   JLabel p=new JLabel("银行存取款系统");
		   JLabel p1=new JLabel("卡号");
		   JLabel p2=new JLabel("姓名");
		   JLabel p3=new JLabel("密码");
		   listener = new AddActionListener();
		   Itemlistener = new OperatorListener();
		   add(p);
		   add(p1);
		   add(p2);
		   add(p3);
		   add(product);
		   add(remember);
		   add(inputNumber);
		   add(inputName);
		   add(inputPassword);
		   add(signIn);
		   add(logIn);
		   add(forgetPassword);
		   product.setBounds(160,280,250,30);
		   product.setFont(new Font("华文行楷",Font.BOLD,15));
		   p.setBounds(170,40,200,30);
		   p.setFont(new Font("华文行楷",Font.BOLD,25));
		   p1.setFont(new Font("华文行楷",Font.BOLD,20));
		   p2.setFont(new Font("华文行楷",Font.BOLD,20));
		   p3.setFont(new Font("华文行楷",Font.BOLD,20));
		   p1.setBounds(130,100,70,30);
		   p2.setBounds(130,140,70,30);
		   p3.setBounds(130,180,70,30);
		   remember.setBounds(370,180,100,30);
		   signIn.setBounds(280,240,120,30);
		   logIn.setBounds(90,240,120,30);
		   forgetPassword.setBounds(100,220,100,30);
		   inputNumber.setBounds(200,100,170,30);
		   inputNumber.setFont(font);
		   inputName.setBounds(200,140,170,30);
		   inputName.setFont(font);
		   inputPassword.setBounds(200,180,170,30);
		   inputPassword.setFont(font);
		   setBounds(400,200,500,350);
		   setVisible(true);
		   validate();
		   setResizable(false);     //不可拖拽界面大小
		   listener.setJT(inputNumber,inputName);
		   listener.setBT(signIn,logIn,forgetPassword);
		   listener.setJP(inputPassword);
		  listener.setJC(remember);
		   listener.setJW(this);
		  Itemlistener.setJC(remember);
		  Itemlistener.setJP(inputPassword);
		  Itemlistener.setJT(inputNumber,inputName);
		  signIn.addActionListener(listener);
		  logIn.addActionListener(listener);
		  remember.addItemListener(Itemlistener);
	      OperatorListener.Duqu();
	   }
}

