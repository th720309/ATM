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
		   //���ñ���  
	        super("JFram���ñ���ͼƬ(Cannel_2020)");  
	        //���ô�С  
	        setSize(500, 335);  
	        //����λ��  
	        setLocation(400, 200);  
	        //����ͼƬ��·����
	        String path = "person.jpg";  
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
		   setTitle("������Ϣ");
		   RemainMoney re = new RemainMoney();
		   JLabel p=new JLabel("�ҵĸ�����Ϣ");
		   JLabel p1=new JLabel("���� : "+RegisterWin.inputNumber.getText());
		   JLabel p2=new JLabel("���� : "+RegisterWin.inputName.getText());
		   JLabel p3=new JLabel("��� : "+re.getRemainMoney());
		   add(p);
		   add(p1);
		   add(p2);
		   add(p3);
		   p.setBounds(220,40,200,30);
		   p.setFont(new Font("�����п�",Font.BOLD,25));
		   p1.setFont(new Font("�����п�",Font.BOLD,20));
		   p2.setFont(new Font("�����п�",Font.BOLD,20));
		   p3.setFont(new Font("�����п�",Font.BOLD,20));
		   p1.setBounds(200,100,250,30);
		   p2.setBounds(200,150,150,30);
		   p3.setBounds(200,200,150,30);
	   }
}
