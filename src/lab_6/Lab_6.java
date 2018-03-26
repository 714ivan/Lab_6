package lab_6;

public class Lab_6 {
    
    public static void main(String[] args) {
    Cat cat=new Cat(100,"Не определён", 1,"Кот");
    cat.ShowInformation();
    }
} 
    class Horse {
        private String Name;
        
        public String Name(){
         return Name;
        }
        
        public void Name(String a){
         Name=a;
        }
    }
    
  class Pegas extends Horse{
       private boolean flying;
       
       public Pegas() {
       flying=false;
      }
       
       public Pegas(boolean flying) {
       this.flying=flying;
      }
       
       public boolean flying(){
        return flying;
       }
        
        public void flying(boolean a){
         flying=a;
       }
   }
   
   class Pet {
       protected int weight;
       protected String gender;
       protected int age;
       
   }
   
   class Cat extends Pet{
       private String name;
       private int weight;
       private String gender;
       private int age;
       
        public String name(){
        return name;
       }
        
        public void name(String a){
         name=a;
       }
        
        public int weight(){
        return weight;
       }
        
        public void weiht(int a){
         weight=a;
       }
        
        public int age (){
        return age;
       }
        
        public void age(int a){
         age=a;
       }
        
        public String gender(){
        return gender;
       }
        
        public void gender(String a){
         gender=a;
       }
       
       public Cat(int a, String b, int c, String d) {
           weight=a;
           gender=b;
           age=c;
           name=d;
       }
       
       
       public void Set(int a, String b, int c, String d) {
           weight=a;
           gender=b;
           age=c;
           name=d;
       }
       public void ShowInformation() {
           System.out.println("Вес: "+weight);
           System.out.println("Пол: "+gender);
           System.out.println("Возраст: "+age);
           System.out.println("Имя: "+name);
       }
   }
   
   class Dog extends Pet{
       private String name;
       
       public Dog(int a, String b, int c, String d) {
           weight=a;
           gender=b;
           age=c;
           name=d;
       }
       
       
       public void Set(int a, String b, int c, String d) {
           weight=a;
           gender=b;
           age=c;
           name=d;
       }
       public void ShowInformation() {
           System.out.println("Вес: "+weight);
           System.out.println("Пол: "+gender);
           System.out.println("Возраст: "+age);
           System.out.println("Имя: "+name);
       }
   }


class Fish {
    protected int weight;
    protected boolean gender;
    protected int age;
    
    public Fish(int a, boolean b, int c) {
      weight=a;
      gender=b;
      age=c;
    }
    
    public Fish() {
      weight=0;
      gender=false;
      age=0;
    }
}

class Animal extends Fish{
    protected boolean wool;
    public Animal(int a, boolean b, int c, boolean d) {
      weight=a;
      gender=b;
      age=c;
      wool=d;
    }
    public Animal() {
      weight=0;
      gender=false;
      age=0;
      wool=false;
    }
    
}

class Ape extends Animal {
    public void work(){
    System.out.println("Вскрыт один кокос");
}
}

class Human extends Ape {
    protected boolean war;
    
     public Human(int a, boolean b, int c, boolean d, boolean e) {
      weight=a;
      gender=b;
      age=c;
      wool=d;
      war=e;
    }
    public Human() {
      weight=0;
      gender=false;
      age=0;
      wool=false;
      war=true;
    }
}


