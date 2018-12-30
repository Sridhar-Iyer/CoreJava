package statics;

public class StaticExample {

    static {
        int x = 7;
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println("Hello1111");
        getThisTooo();
    }


    public void getThis() {
        System.out.println("Hello oye");
        OtherThis();
    }


    public void OtherThis() {
        System.out.println("Hello oye oyer");
    }


    public static void getThisTooo() {
        System.out.println("Hello hahahhaha");
    }
}
