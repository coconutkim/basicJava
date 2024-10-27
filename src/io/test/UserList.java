package io.test;

public class UserList{
    public static void main(String[] args){
        User u1 = new User("alice", 25, "111-1111-1111");
        User u2 = new User("james", 65, "222-2222-2222");
        User u3 = new User("watson", 12, "333-3333-3333");

        System.out.println(u1.getUserInfo());
        System.out.println();
        
    }
}
