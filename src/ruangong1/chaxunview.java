package ruangong1;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ruangong1.AddActionListener;
import ruangong1.RegisterWin;
import ruangong1.RemainMoney;
public class chaxunview extends JFrame{
	   chaxunview(){
		   //设置标题  
	        super("JFram设置背景图片(Cannel_2020)");  
	        //设置大小  
	        setSize(500, 335);  
	        //设置位置  
	        setLocation(400, 200);  
	        //背景图片的路径。
	        String path = "person.jpg";  
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
		   setTitle("个人信息");
		   RemainMoney re = new RemainMoney();
		   JLabel p=new JLabel("我的个人信息");
		   JLabel p1=new JLabel("卡号 : "+RegisterWin.inputNumber.getText());
		   JLabel p2=new JLabel("姓名 : "+RegisterWin.inputName.getText());
		   JLabel p3=new JLabel("余额 : "+re.getRemainMoney());
		   add(p);
		   add(p1);
		   add(p2);
		   add(p3);
		   p.setBounds(220,40,200,30);
		   p.setFont(new Font("华文行楷",Font.BOLD,25));
		   p1.setFont(new Font("华文行楷",Font.BOLD,20));
		   p2.setFont(new Font("华文行楷",Font.BOLD,20));
		   p3.setFont(new Font("华文行楷",Font.BOLD,20));
		   p1.setBounds(200,100,250,30);
		   p2.setBounds(200,150,150,30);
		   p3.setBounds(200,200,150,30);
	   }
}
