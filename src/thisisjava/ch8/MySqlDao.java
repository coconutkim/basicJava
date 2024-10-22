package thisisjava.ch8;

public class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("select in mysql db");
    }

    @Override
    public void insert() {
        System.out.println("insert to mysql db");
    }

    @Override
    public void update() {
        System.out.println("update mysql db");
    }

    @Override
    public void delete() {
        System.out.println("delete in mysql db");
    }
}
