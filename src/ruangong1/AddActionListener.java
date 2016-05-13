package ruangong1;
import java.awt.event.*;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AddActionListener implements ActionListener {
	  JTextField inputNumber;     
	  JTextField inputName;
	  JPasswordField inputPassword;
	  JFrame win;
	  JCheckBox remember;
	  JButton signIn;                //登录按钮
	  JButton logIn;                 //注册按钮
	  JButton forgetPassword;       //
	  JButton Score;
	  JLabel title;
	  int m;
	  PreQuery query;                
	  AddActionListener(){
		  query=new PreQuery();
	  }
	  void setBT(JButton ... b){
		  signIn = b[0];
		  logIn = b[1];
		  forgetPassword = b[2];
	  }
	  void setBM(JButton ... s){
		  Score=s[0];
	  }
	  void setJT(JTextField ...  t) {
		     inputNumber = t[0];
		     inputName = t[1];
	  }
	  void setJW(JFrame p){
		  win=p;
	  }
	  void setJL(JLabel ...m){
		  title=m[0];
	  }
	  void setJP(JPasswordField ... s){
		  inputPassword = s[0];
	  }
	  void setJC(JCheckBox m){
		  remember=m;
	  }
	  public void actionPerformed(ActionEvent e) {
		  if(e.getSource()==logIn){
			  JOptionPane.showMessageDialog(null, "忘记密码或办理银行卡服务请拨 010-2457899或到周边银行办理"
			  		+ " ,  谢谢使用 ", "消息提示框", JOptionPane.WARNING_MESSAGE);
		  }
		  if(e.getSource()==signIn){
			  //SignView win1 = new SignView();
         	  //win.dispose();
		       PreparedStatement sql;  
		       String number = inputNumber.getText(); //得到学号
		       String name = inputName.getText(); //得到姓名
		       String password = inputPassword.getText(); //得到密码
		       try { 
		             String SQL=
		            "select *from  information "
		            + "where ID='"+number+"'";
		             query.setDatabaseName("客户信息表");
		             query.setSQL(SQL);
		             query.startQuery();
		             String ziduan[] =query.getColumnName();
		             String [][]record=query.getRecord();
		             if(password.trim().equals(record[0][2].trim())){
		            		 SignView win1 = new SignView();
			            	 win.dispose();
			            	 //OperatorListener.Duqu();
			            	 //title="Welcome +"+name+"to the English World";
		             }	
		             
		             else {
		            	 JOptionPane.showMessageDialog(null, "请输入正确的密码", "密码错误", JOptionPane.WARNING_MESSAGE);
		             }
		       }    	 
		       
		       catch(Exception exp) { 
		    	   JOptionPane.showMessageDialog(null, "该账号未被注册", "消息提示框", JOptionPane.WARNING_MESSAGE);
		       }  
		       if(remember.isSelected()){
		    	   OperatorListener.savaFile();
		    	   //OperatorListener.Duqu();
		       }else{
		    	   OperatorListener.savaFile1();
		    	  // OperatorListener.Duqu();
		       }
		     
		  }
	
	  }
	private void dispose() {
		// TODO Auto-generated method stub
		
	}
	private void setVisable(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
