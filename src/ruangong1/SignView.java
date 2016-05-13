package ruangong1;
import java.awt.*;

import javax.swing.*;

import ruangong1.RegisterWin;
public class SignView extends JFrame{
		JButton xuanze;
		JButton yuedu;
		JButton tingli;
		SelectListener police;
		//AddActionListener computer;
		SignView(){
			//设置标题  
		       super("JFram设置背景图片(Cannel_2020)");  
		       //设置大小  
		       setSize(1000,600);  
		       //设置位置  
		       setLocation(20, 40);  
		       //背景图片的路径。
		       String path = "内页.jpg";  
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
		    setResizable(false);     //不可拖拽界面大小
		    setLayout(null);
		    setTitle("银行存取款系统");
		    police = new SelectListener();
		    JLabel title=new JLabel(" 欢迎您使用银行存取款系统  ");
		    JLabel title1=new JLabel("尊敬的 "+RegisterWin.inputName.getText());
		   // JLabel title=new JLabel("Welcome "+RegisterWin.inputName.getText()+" to the English World");
		    xuanze = new JButton(new ImageIcon("11_副本.png"));
		    yuedu = new JButton(new ImageIcon("13_副本.png"));
		    tingli = new JButton(new ImageIcon("15_副本.png"));
		    //add(title);
		    add(xuanze);
		    add(yuedu);
		    add(tingli);
		    add(title);
		    add(title1);
		    setVisible(true);
			validate();
			setBounds(100,60,1000,600);
			title.setBounds(400,40,800,60);
			title.setFont(new Font("华文行楷",Font.BOLD,39));
			title1.setBounds(180,40,800,60);
			title1.setFont(new Font("华文行楷",Font.BOLD,30));
			xuanze.setBounds(620,160,160,40);
			yuedu.setBounds(620,260,160,40);
			tingli.setBounds(620,360,160,40);
			police.setTB2(xuanze,yuedu,tingli);
			xuanze.addActionListener(police);
			yuedu.addActionListener(police);
			tingli.addActionListener(police);
			//title.addActionListener(computer);
		}
}