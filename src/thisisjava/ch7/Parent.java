package thisisjava.ch7;

public class Parent {

//    public String name;
//
//    public Parent(String name){
//        this.name = name;
//    }

    public String nation;

    public Parent(){
        this("korea");
        System.out.println("Parent() call");
    }

    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call ");
    }
}
