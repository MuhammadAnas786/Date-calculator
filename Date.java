/*-------M.Anas------*/
/*-----Simple Date Calculator-----*/


public class Date{
private int day;
private int month;
private int year;

private static int Limit[]= {0,31,28,31,30,31,30,31,30,31,30,31,30,31};


public Date(int d,int m,int y){

	this.setYear(y);
	this.setMonth(m);
	this.setDay(d);
	
	
 
	}
public Date(Date dat){
	this.setDay(dat.getDay());
	this.setMonth(dat.getMonth());
	this.setYear(dat.getYear());
}

public void setMonth(int M){
	
	while(M>12){
		M-=12;
		
		this.incrementY(1);
		
		}
this.month=M;

	
}
public void setDay(int d){
	int M=this.getMonth();
	while(d>Limit[M]){
	d-=Limit[M];	
	this.incrementM(1);
	M=this.getMonth();
	
	}
	
	this.day=d;
	
	
}
public void setYear(int Y){
	

this.year=Y;
if(this.year%4==0)
Limit[2]=29;
else{
	Limit[2]=28;
}	

	}
	
public int getDay(){
	
	return this.day;
}

public int getMonth(){
	
	return this.month;
}
public int getYear(){
	
	return this.year;
}
public void incrementD(int d){
	
	d+=this.getDay();
this.setDay(d);

	}
public void incrementM(int M){

	M+=this.getMonth();
	this.setMonth(M);
	}

public void incrementY(int Y){

	Y+=this.getYear();
	this.setYear(Y);
	
}
	public void DisplayDate(){
		
System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
		
	}
	
	
}