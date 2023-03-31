
import java.util.*;


class Animal{
    String name;
    double height;
    int weight;
    int speed;

    void show(){
        System.out.println("animal called "+name+"\n\theight:"+height+"\n\tweight:"+weight+"\n\tspeed:"+speed);
    }
    double distance(int x, double y){
        return this.speed*y*x;
    }
    int distance(int x){
        return this.speed*x;
    }

}


public class A1113316_0324_1 {
    public static void main(String[] args) {

        Animal animal01,animal02,animal03,animal04;
        animal01 = new Animal();
        animal02 = new Animal();
        animal03 = new Animal();
        animal04 = new Animal();   
        
        animal01.name="雪寶";
        animal02.name="驢子";
        animal03.name="安娜";
        animal04.name="愛沙";
        
        animal01.height=1.1;
        animal02.height=1.5;
        animal03.height=1.7;
        animal04.height=1.7;
        
        animal01.weight=52;
        animal02.weight=99;
        animal03.weight=48;
        animal04.weight=50;
        
        animal01.speed=100;
        animal02.speed=200;
        animal03.speed=120;
        animal04.speed=120;
        
        //System.out.println("name\theight\tweight\tspeed");
        animal01.show();
        animal02.show();
        animal03.show();
        animal04.show();
        
        int x;
        double y;
        Scanner input = new Scanner(System.in);
        
        System.out.print("input "+animal01.name+" running time: ");
        x=input.nextInt();
        System.out.print("input "+animal01.name+" running acceleration: ");
        y=input.nextInt();
            
        if(y==0){
            System.out.print("\t"+animal01.name+" running distance: "+ animal01.distance(x));
        }else{
            System.out.println("\t"+animal01.name+" running distance: "+animal01.distance(x, y));
        }
        

        System.out.print("input "+animal02.name+" running time: ");
        x=input.nextInt();
        System.out.print("input "+animal02.name+" running acceleration: ");
        y=input.nextInt();
        
        if(y==0){
            System.out.print("\t"+animal02.name+" running distance: "+ animal02.distance(x));
        }else{
            System.out.println("\t"+animal02.name+" running distance: "+animal02.distance(x, y));
        }
        
        System.out.print("input "+animal03.name+" running time: ");
        x=input.nextInt();
        System.out.print("input "+animal03.name+" running acceleration: ");
        y=input.nextInt();
        
        if(y==0){
            System.out.print("\t"+animal03.name+" running distance: "+ animal03.distance(x));
        }else{
            System.out.println("\t"+animal03.name+" running distance: "+animal03.distance(x, y));
        }
        
        System.out.print("input "+animal04.name+" running time: ");
        x=input.nextInt();
        System.out.print("input "+animal04.name+" running acceleration: ");
        y=input.nextInt();
        
        if(y==0){
            System.out.print("\t"+animal04.name+" running distance: "+ animal04.distance(x));
        }else{
            System.out.println("\t"+animal04.name+" running distance: "+animal04.distance(x, y));
        }
    }
}
