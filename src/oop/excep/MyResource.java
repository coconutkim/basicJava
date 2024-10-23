package oop.excep;

public class MyResource implements AutoCloseable{

    private String name;

    public MyResource(String name){
        this.name = name;
        System.out.println("open my resource "+name);
    }

    public String read1(){
        System.out.println("read my resource "+name);
        return "100"; //get
    }

    public String read2(){
        System.out.println("read my resource "+name);
        return "abc";
    }

    @Override
    public void close() throws Exception{
        System.out.println("close my resource "+name);
    }
}
