public class Student{
	public int age;
	public int sex;
	public String name;
	public Student(String name, int sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void setAge(int newAge){
		this.age = newAge;
	}
	public int getAge(){
		return this.age;
	}
}
