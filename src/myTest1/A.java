package myTest1;

import java.util.TreeSet;

public class A {
	public static void main(String[] args) {
//		String a = "a";
//		String b = "abb";
//		int k =0;
//		if(b.length() > a.length()){
//			k = b.length() - a.length();
//		}
//		else k =a.length() - b.length();
//
//		for (int i=1;i<=k;i++){
//			a= a.concat(" ");
//		}
//		
//		System.out.println(a);
		TreeSet<Cats> tree = new TreeSet<>();
		tree.add(new Cats("haung",3,"dislike mouse"));
		tree.add(new Cats("bai",5,"dislike fish"));
		tree.add(new Cats("bei",1,"like mouse"));
		for (Cats obj : tree) {
			System.out.println(obj.getName().substring(0, 1).hashCode()+":"+obj.getName().substring(1, 2).hashCode()+":"+obj);
		}
	}
}

class Cats implements Comparable<Cats>{
	private String name;
	private int age;
	private String detail;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Cats(String name,int age,String detail) {
		this.name = name;
		this.age = age;
		this.detail = detail;
	}
	public Cats() {
		// TODO 自动生成的构造函数存根
	}
	public String toString(){
		return "Cat:name="+name+" age="+age+" detail:"+detail;
	}
	public int compareTo(Cats o){
		
		return age;
		
	}
	private int compared(String name1,String name2){
		String index1="";
		String index2="";
		int k =0;
		if(name1.length() > name2.length()){
			k = name1.length() - name2.length();
			for (int i=1;i<=k;i++){
				name2= name2.concat("");
			}
		}
		else {
			k =name2.length() - name1.length();
			for (int i=1;i<=k;i++){
				name1= name1.concat(" ");
			}
		}
		
		
//		if (name1.length() >= 1 && name2.length() >=1){
//			index1=name1.substring(0, 1);
//			index2=name2.substring(0, 1);
//			if(index1.hashCode() < index2.hashCode()){
//				return -1;
//			}else if(index1.hashCode() > index2.hashCode()){
//				return 1;
//			}else {
//				String newName1 = "";
//				String newName2 = "";
//				if(name1.length() == 1){
//					newName1 = "";
//				
//				}
//				newName1=name1.substring(1,name1.length());
//				newName2=name2.substring(1,name2.length());
//				return compared(newName1,newName2);
//			}
//			else{
//				return 0;
//			}
		return 0;
		}
}
