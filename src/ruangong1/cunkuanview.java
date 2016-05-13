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

import ruangong1.AddActionListener;
import ruangong1.RegisterWin;
public class cunkuanview extends JFrame {
	   static JTextField inputMoney;     //输入预存金额
	   JButton signIn;                //确定按钮
	   CunquListener listener; 
	  // OperatorListener Itemlistener;
	  // InsertHandleData work;
	   //AddActionListener listener2;//按钮监视器
	   cunkuanview(){
		   //设置标题  
	        super("JFram设置背景图片(Cannel_2020)");  
	        //设置大小  
	        setSize(600, 435);  
	        //设置位置  
	        setLocation(400, 200);  
	        //背景图片的路径。
	        String path = "存取.jpg";  
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
	        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       
		   setLayout(null);
		   setTitle("存款系统");
		   inputMoney = new JTextField("",10);
		   signIn =  new JButton(new ImageIcon("0343_副本.png"));
		   Font font = new Font("微软雅黑",Font.BOLD,15);
		   JLabel p=new JLabel("银行存款系统");
		   JLabel p1=new JLabel("预存金额：");
		   JLabel p3=new JLabel("卡号 : "+RegisterWin.inputNumber.getText());
		   JLabel p2=new JLabel("姓名 : "+RegisterWin.inputName.getText());
		   listener = new CunquListener();
		 //  Itemlistener = new OperatorListener();
		   add(p);
		   add(p1);
		   add(p2);
		   add(p3);
		   add(inputMoney);
		   add(signIn);
		   p.setBounds(170,40,200,30);
		   p.setFont(new Font("华文行楷",Font.BOLD,25));
		   p1.setBounds(130,200,200,30);
		   p3.setBounds(125,100,250,30);
		   p2.setBounds(185,150,150,30);
		   p1.setFont(new Font("华文行楷",Font.BOLD,25));
		   p3.setFont(new Font("华文行楷",Font.BOLD,20));
		   p2.setFont(new Font("华文行楷",Font.BOLD,20));
		   
		   signIn.setBounds(180,260,120,30);
		   inputMoney.setBounds(270,200,120,30);
		   inputMoney.setFont(font);
		   setBounds(400,200,500,350);
		   setVisible(true);
		   validate();
		   setResizable(false);     //不可拖拽界面大小
		   listener.setTB2(signIn);
		   listener.setTJ(inputMoney);
		   listener.setW(this);
		   //listener.setJW(this);
		  // Itemlistener.setJC(remember);
		  // Itemlistener.setJP(inputPassword);
		 //  Itemlistener.setJT(inputNumber,inputName,inputName);
		   //Itemlistener.setJComboBox(choiceid);
		   //Itemlistener.setWorkTogether2(listener);
		   //Itemlistener.setJComboBox(choice);
		   //Itemlistener.setWorkTogether(work);
		   signIn.addActionListener(listener);
		//	   OperatorListener.Duqu();
	   }
}