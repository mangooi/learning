package Aug16.Thread.pra.practice;

/**
 * Created by Administrator on 2016/8/16.
 */
public class PraFour {
    public static void main(String[] args) {
        User user1=new User("张三",500);
        User user2=new User("李四",300);
        user1.start();
        user2.start();
    }
}

class User extends Thread{
    private int money;
    public User(String name,int money){
        super(name);
        this.money=money;
    }

    @Override
    public void run() {
        for (int i=0;i<3;i++) {
            save();
        }
    }

    private void save() {
        money+=100;
        System.out.println(getName()+":"+money);
    }
}
