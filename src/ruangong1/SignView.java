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
			//���ñ���  
		       super("JFram���ñ���ͼƬ(Cannel_2020)");  
		       //���ô�С  
		       setSize(1000,600);  
		       //����λ��  
		       setLocation(20, 40);  
		       //����ͼƬ��·����
		       String path = "��ҳ.jpg";  
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
		    setResizable(false);     //������ק�����С
		    setLayout(null);
		    setTitle("���д�ȡ��ϵͳ");
		    police = new SelectListener();
		    JLabel title=new JLabel(" ��ӭ��ʹ�����д�ȡ��ϵͳ  ");
		    JLabel title1=new JLabel("�𾴵� "+RegisterWin.inputName.getText());
		   // JLabel title=new JLabel("Welcome "+RegisterWin.inputName.getText()+" to the English World");
		    xuanze = new JButton(new ImageIcon("11_����.png"));
		    yuedu = new JButton(new ImageIcon("13_����.png"));
		    tingli = new JButton(new ImageIcon("15_����.png"));
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
			title.setFont(new Font("�����п�",Font.BOLD,39));
			title1.setBounds(180,40,800,60);
			title1.setFont(new Font("�����п�",Font.BOLD,30));
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