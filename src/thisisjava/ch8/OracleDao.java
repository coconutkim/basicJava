package thisisjava.ch8;

public class OracleDao implements DataAccessObject{

    @Override
    public void select() {
        System.out.println("select in oracle db");
    }

    @Override
    public void insert() {
        System.out.println("insert to oracle db");
    }

    @Override
    public void update() {
        System.out.println("update oracle db");
    }

    @Override
    public void delete() {
        System.out.println("delete in oracle db");
    }
}
