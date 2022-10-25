package ncs.test08;

public class User {
String id;
String password;

String name;
int age;
char gender;
String phone;


public User() {}


public User(String id, String password, String name,int age, char gender, String phone) {
	super();
	this.id = id;
	this.password = password;
	this.name = name;
	this.age=age;
	this.gender = gender;
	this.phone = phone;
}
@Override
public boolean equals (Object obj) {
	if(this==obj) 
		return true;
	if(obj==null)
		return false;
	if(getClass()!=obj.getClass())
		return false;
	User other=(User)obj;
	if(age !=other.age)
	return false;
	if(gender !=other.gender)
		return false;
		if(id==null) {
			if(other.id!=null)
				return false;
		}else if(!id.equals(other.id))
			return false;
		if(password==null) {
			if(other.password !=null)
				return false;
		}else if (!password.equals(other.password))
			return false;
			if(name ==null) {
				if(other.name!=null)
					return false;
			}else if(!name.equals(other.name))
				return false;
			if(phone ==null) {
				if(other.phone!=null)
					return false;
			}else if(!phone.equals(other.phone))
				return false;
			return true;
		}
	
	

@Override
public String toString() {
	return String.format("%s %s %s %d %c %s",id,password,name,age,gender,phone);
}
}
