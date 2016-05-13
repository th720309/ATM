package ruangong1;
import java.awt.event.*;
import ruangong1.AddActionListener;
import ruangong1.RegisterWin;

import javax.swing.*;

import java.awt.*;
import java.sql.PreparedStatement;
public class RemainMoney {
	  PreQuery query;  
	  RemainMoney(){
		  query=new PreQuery();
	  }
	  public double getRemainMoney(){
		  PreparedStatement sql;  
            String SQL=
           "select *from  information "
           + "where ID='"+RegisterWin.inputNumber.getText()+"'";
            query.setDatabaseName("客户信息表");
            query.setSQL(SQL);
            query.startQuery();
            double remain;
            String ziduan[] =query.getColumnName();
            String [][]record=query.getRecord();
            remain = Double.parseDouble(record[0][3].trim());
            return remain;
	  }

}
