package ruangong1;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
public class SelectListener implements ActionListener {
	JButton xuanze;
	JButton yuedu;
	JButton tingli;
	public void setTB2(JButton ...s){
		xuanze=s[0];
		yuedu=s[1];
		tingli=s[2];
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==xuanze){
			chaxunview xuanzewin = new chaxunview();
		}
		if(e.getSource()==yuedu){
			cunkuanview yueduwin = new cunkuanview();
		}
		if(e.getSource()==tingli){
			qukuanview win = new qukuanview();
		}
	}
}
