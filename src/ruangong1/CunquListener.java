package ruangong1;

import java.awt.event.*;

import ruangong1.AddActionListener;
import ruangong1.RegisterWin;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class CunquListener implements ActionListener {
	   JTextField inputMoney;     //输入学号
	   JButton signIn; 
	   JFrame win;
	   PreQuery query;      
	   int m;
		  CunquListener(){
			  query=new PreQuery();
		  }
	public void setTB2(JButton ...s){
		signIn=s[0];
	}
	public void setW(JFrame ...p){
		win=p[0];
	}
	public void setTJ(JTextField ...t){
		inputMoney=t[0];
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==signIn){
				
			         Connection con;
			         ResultSet rs;
		             PreparedStatement sql;   
		             try { 
		            	 if (inputMoney.getText().equals("")) {    // 文本框再次获得焦点   
		            		 inputMoney.requestFocusInWindow();     
		            		 JOptionPane.showMessageDialog(null, "请输入预存金额");
		            	 }
		            	 else{
		            	 String money = inputMoney.getText(); //得到预存金额
		            	 String uri="jdbc:derby:客户信息表;create=true"; 
		                 con=DriverManager.getConnection(uri);
		                 String SQL=
		     		            "select *from  information "
		     		            + "where ID='"+RegisterWin.inputNumber.getText()+"'";
		     		             query.setDatabaseName("客户信息表");
		     		             query.setSQL(SQL);
		     		             query.startQuery();
		     		             String ziduan[] =query.getColumnName();
		     		             String [][]record=query.getRecord();
		     		             double remain = Double.parseDouble(record[0][3]);
		     		             double cunmoney = Double.parseDouble(money);
		     		             remain = remain + cunmoney;
		                   String SQL2=
		        "update information set ID=? ,name=?,password=?,money=? where ID ='"+RegisterWin.inputNumber.getText()+"'";
		                   query.setSQL(SQL2);
		                   sql=con.prepareStatement(SQL2);		                				       
		                   sql.setString(1,query.record[0][0]);
		                   sql.setString(2,query.record[0][1]);
		                   sql.setString(3,query.record[0][2]);
		                   sql.setDouble(4,remain);		                 		                   
		                   m=sql.executeUpdate();
		                   con.close();
		            	 }
		             }
		             catch(SQLException e1) { 
		               JOptionPane.showMessageDialog
		               (null,""+e1,"存款失败", JOptionPane.WARNING_MESSAGE);
		             }   
		             if(m!=0){
		             	 ProgressBar win1 = new ProgressBar();
		            	 //JOptionPane.showMessageDialog
		                 //(null,"存款成功","存款成功", JOptionPane.WARNING_MESSAGE);
		             	//win.dispose();
		               }    	         	        
		       
		    //   catch(Exception exp) { 
		    	//   JOptionPane.showMessageDialog(null, "该账号未被注册", "消息提示框", JOptionPane.WARNING_MESSAGE);
		       //}  
		}
	}
}
