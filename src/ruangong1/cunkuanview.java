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
	   static JTextField inputMoney;     //����Ԥ����
	   JButton signIn;                //ȷ����ť
	   CunquListener listener; 
	  // OperatorListener Itemlistener;
	  // InsertHandleData work;
	   //AddActionListener listener2;//��ť������
	   cunkuanview(){
		   //���ñ���  
	        super("JFram���ñ���ͼƬ(Cannel_2020)");  
	        //���ô�С  
	        setSize(600, 435);  
	        //����λ��  
	        setLocation(400, 200);  
	        //����ͼƬ��·����
	        String path = "��ȡ.jpg";  
	        // ����ͼƬ  
	        ImageIcon background = new ImageIcon(path);  
	        // �ѱ���ͼƬ��ʾ��һ����ǩ����  
	        JLabel label = new JLabel(background);  
	        // �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������  
	        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
	        // �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��  
	        JPanel imagePanel = (JPanel) this.getContentPane();  
	        imagePanel.setOpaque(false);  
	        // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����  
	        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));  
	        //���ÿɼ�  
	        setVisible(true);  
	        //��رհ�ťʱ�˳�  
	        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);       
		   setLayout(null);
		   setTitle("���ϵͳ");
		   inputMoney = new JTextField("",10);
		   signIn =  new JButton(new ImageIcon("0343_����.png"));
		   Font font = new Font("΢���ź�",Font.BOLD,15);
		   JLabel p=new JLabel("���д��ϵͳ");
		   JLabel p1=new JLabel("Ԥ���");
		   JLabel p3=new JLabel("���� : "+RegisterWin.inputNumber.getText());
		   JLabel p2=new JLabel("���� : "+RegisterWin.inputName.getText());
		   listener = new CunquListener();
		 //  Itemlistener = new OperatorListener();
		   add(p);
		   add(p1);
		   add(p2);
		   add(p3);
		   add(inputMoney);
		   add(signIn);
		   p.setBounds(170,40,200,30);
		   p.setFont(new Font("�����п�",Font.BOLD,25));
		   p1.setBounds(130,200,200,30);
		   p3.setBounds(125,100,250,30);
		   p2.setBounds(185,150,150,30);
		   p1.setFont(new Font("�����п�",Font.BOLD,25));
		   p3.setFont(new Font("�����п�",Font.BOLD,20));
		   p2.setFont(new Font("�����п�",Font.BOLD,20));
		   
		   signIn.setBounds(180,260,120,30);
		   inputMoney.setBounds(270,200,120,30);
		   inputMoney.setFont(font);
		   setBounds(400,200,500,350);
		   setVisible(true);
		   validate();
		   setResizable(false);     //������ק�����С
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