public class Gun {
    double calibr;
    String name;
    Magazine magazine;

    Gun(double cal,String some,int cap){
        calibr = cal;
        name =some;
        magazine= new Magazine(cap);

    }

    void shoot(){
        System.out.println("shoot from "+name);

    }
    void point (){
        System.out.println("check magazine "+magazine.capacity);
            magazine.reload();
        System.out.println("fuck . i am cant point with calibr "+calibr);
    }
}
