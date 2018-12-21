public class Main {

    public static void papa(){
        System.out.println("Hello world !");
    }

    public static void main(String[] args) {

        Gun ak=new Gun(5.45,"AK-74",45);
        ak.point();
        ak.shoot();
        Gun ak47=new Gun(7.62,"AK-47",30);
        ak47.point();
        ak47.shoot();
    }
}
