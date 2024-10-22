package oop.poly1;

public class Employee {

    protected String name;
    protected String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void getEmpInfo(Employee e) {
        Research res;
        if (e instanceof Account) {
            System.out.println("position: " + e.getJob());
        } else if (e instanceof Research) {
            res = (Research) e;
            System.out.println("job: " + res.getPosition());
        }
    }

    public void getEmpInfo (Research res){
        System.out.println("position: " + res.getPosition());
    }
}
