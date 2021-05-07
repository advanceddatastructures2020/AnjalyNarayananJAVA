class Dog
{
String name;
int age;
public Dog(String name, int age)
{
this.name = name;
this.age = age;
}
public void getName()
{
System.out.println(name);
}
public void getAge()
{
System.out.println(age);
}
public static void main(String a[])
{
Dog s1=new Dog("tuffy",5);
Dog s2=new Dog("Anu",4);
Dog s3=new Dog("Achu",15);
s1.getName();
s1.getAge();
s2.getName();
s2.getAge();
s3.getName();
s3.getAge();
}
}
