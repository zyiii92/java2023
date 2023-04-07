import java.util.*;

class animal{

    public String name;
    public double height;
    public int weight, speed;

    animal(String name, double height, int weight, int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show(){
        System.out.println("animal's name: "+ name+ "\theight= "+ height+ "\tweight= "+ weight+ "\tspeed= "+speed);
    }

    public double distance(int x, double y){
        return this.speed*x*y;
    }
    public int distance(int x){
        return this.speed*x;
    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{
    String gender;
    public human(String name, double height, int weight, int speed, String gender){
        super (name, height, weight, speed);
        this.gender = gender;
    }
    void show(){
        System.out.println("animal's name: "+ name+ "\theight= "+ height+ "\tweight= "+ weight+ "\tgender: "+ gender+ "\tspeed= "+speed);
    }
}

class snow extends human{
    String skill;
    public snow(String name, double height, int weight, int speed, String gender, String skill){
        super (name, height, weight, speed, gender);
        this.skill = skill;
    }
    void show(){
        System.out.println("animal's name: "+ name+ "\theight= "+ height+ "\tweight= "+ weight+ "\tgender: "+ gender+ "\tskill= "+ skill+ "\tspeed= "+speed);
    }
    public double distance(int x, double y){
        return this.speed*x*y*2;
    }
    public int distance(int x){
        return this.speed*x*2;
    }
}


public class A1113316_0331 {
    public static void main(String[] args)throws Exception {

        animal.showinfo();
        
        animal animal01 = new animal("雪寶", 1.1, 52, 100);
        animal animal02 = new animal("驢子", 1.5, 99, 200);
        animal01.show();
        animal02.show();

        int x;
        double y;
        Scanner input = new Scanner(System.in);
        System.out.print("input "+ animal01.name+ " running time: ");
        x = input.nextInt();
        System.out.print("input "+ animal01.name+ "running acceleration: ");
        y = input.nextInt();
        if (y==0){
            System.out.println("\t"+ animal01.name+ "running distance: "+ animal01.distance(x));
        }else{
            System.out.println("\t"+ animal01.name+ "running distance: "+ animal01.distance(x,y));
        }

        int x3;
        double y3;
        Scanner input3 = new Scanner(System.in);
        System.out.print("input "+ animal02.name+ " running time: ");
        x3 = input3.nextInt();
        System.out.print("input "+ animal02.name+ "running acceleration: ");
        y3 = input3.nextInt();
        if (y3==0){
            System.out.println("\t"+ animal02.name+ "running distance: "+ animal02.distance(x3));
        }else{
            System.out.println("\t"+ animal02.name+ "running distance: "+ animal02.distance(x3,y3)+ "\n");
        }

        human human01 = new human("阿克", 1.9, 80, 200, "男");
        human human02 = new human("漢斯", 1.8, 78, 130, "男");
        human01.show();
        human02.show();

        int x1;
        double y1;
        Scanner input1 = new Scanner(System.in);
        System.out.print("input "+ human01.name+ " running time: ");
        x1 = input1.nextInt();
        System.out.print("input "+ human01.name+ "running acceleration: ");
        y1 = input1.nextInt();
        if (y1==0){
            System.out.println("\t"+ human01.name+ "running distance: "+ human01.distance(x1));
        }else{
            System.out.println("\t"+ human01.name+ "running distance: "+ human01.distance(x1,y1));
        }

        int x4;
        double y4;
        Scanner input4 = new Scanner(System.in);
        System.out.print("input "+ human02.name+ " running time: ");
        x4 = input4.nextInt();
        System.out.print("input "+ human02.name+ "running acceleration: ");
        y4 = input4.nextInt();
        if (y4==0){
            System.out.println("\t"+ human02.name+ "running distance: "+ human02.distance(x4));
        }else{
            System.out.println("\t"+ human02.name+ "running distance: "+ human02.distance(x4,y4)+ "\n");
        }

        snow snow01 = new snow("安娜",1.7, 48, 120, "女", "no");
        snow snow02 = new snow("愛沙", 1.7, 50, 120, "女", "yes");
        snow01.show();
        snow02.show();

        int x2;
        double y2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("input "+ snow01.name+ " running time: ");
        x2 = input2.nextInt();
        System.out.print("input "+ snow01.name+ "running acceleration: ");
        y2 = input2.nextInt();
        if (y2==0){
            System.out.println("\t"+ snow01.name+ "running distance: "+ animal01.distance(x2));
        }else{
            System.out.println("\t"+ snow01.name+ "running distance: "+ animal01.distance(x2,y2));
        }

        int x5;
        double y5;
        Scanner input5 = new Scanner(System.in);
        System.out.print("input "+ snow02.name+ " running time: ");
        x5 = input5.nextInt();
        System.out.print("input "+ snow02.name+ "running acceleration: ");
        y5 = input5.nextInt();
        if (y5==0){
            System.out.println("\t"+ snow02.name+ "running distance: "+ snow02.distance(x5));
        }else{
            System.out.println("\t"+ snow02.name+ "running distance: "+ snow02.distance(x5,y5)+ "\n");
        }
    }
}
