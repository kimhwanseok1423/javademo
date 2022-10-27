package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int inventoryAmount;
	
public Inventory() {}

public Inventory(String productName,Date putDate,int putAmount) {
	this.productName=productName;
	this.putDate=putDate;
	this.putAmount=putAmount;
	this.inventoryAmount=putAmount;
}
public String toString() {
	SimpleDateFormat sd= new SimpleDateFormat("yyyy년 m월 dd일");
	String rdate=getDate==null? null:sd.format(getDate);
	return String.format("%s,%s 입고,%d개,%s,%d개,재고 %d개",productName, sd.format(putDate), putAmount,rdate, getAmount, inventoryAmount);}
}
