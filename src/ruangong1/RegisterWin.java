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
	   static JTextField inputNumber;     //���뿨��
	   static JTextField inputName;
	   static JPasswordField inputPassword;   //��������
	   JButton signIn;                //ȷ����ť
	   JButton logIn;
	   JButton forgetPassword;
	   JCheckBox remember;
	   AddActionListener listener; 
	   OperatorListener Itemlistener;
	   RegisterWin(){
		   //���ñ���  
	        super("JFram���ñ���ͼƬ(Cannel_2020)");  
	        //���ô�С  
	        setSize(600, 435);  
	        //����λ��  
	        setLocation(400, 200);  
	        //����ͼƬ��·����
	        String path = "��ҳ_����.jpg";  
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
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		   setLayout(null);
		   setTitle("���д�ȡ��ϵͳ");
		   inputNumber = new JTextField("",10);
		   inputName = new JTextField("",10);
		   inputPassword = new JPasswordField("",10);
		   signIn =  new JButton(new ImageIcon("0342.png"));
		   logIn = new JButton(new ImageIcon("0342_����.png"));
		   remember = new JCheckBox("��ס����");
		   remember.setContentAreaFilled(false); 
		   remember.setBorderPainted(false);
		   remember.setSelected(true);
		   Font font = new Font("΢���ź�",Font.BOLD,15);
		   forgetPassword = new JButton();
		   forgetPassword.setContentAreaFilled(false); 
		   forgetPassword.setBorderPainted(false);
		   forgetPassword.setIcon(new ImageIcon("update.png"));
		   JLabel product=new JLabel("producted by R��ѧ131 ���");
		   JLabel p=new JLabel("���д�ȡ��ϵͳ");
		   JLabel p1=new JLabel("����");
		   JLabel p2=new JLabel("����");
		   JLabel p3=new JLabel("����");
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
		   product.setFont(new Font("�����п�",Font.BOLD,15));
		   p.setBounds(170,40,200,30);
		   p.setFont(new Font("�����п�",Font.BOLD,25));
		   p1.setFont(new Font("�����п�",Font.BOLD,20));
		   p2.setFont(new Font("�����п�",Font.BOLD,20));
		   p3.setFont(new Font("�����п�",Font.BOLD,20));
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
		   setResizable(false);     //������ק�����С
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

