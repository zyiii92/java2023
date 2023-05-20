// ＊＊＊務必寫作業＊＊＊
// 丁丁退休之後打算開一間水餃店，店裡每天預計準備5000顆豬肉水餃，3000顆牛肉水餃以及1000顆蔬菜
//水餃，請您幫丁丁的水餃店設計一個銷售的模擬器。
// (1) 請使用多執行緒來設計此模擬器，並考慮同步的問題。
// (2) 使用者可以輸入同時光顧的顧客數目。
// (3) 每位顧客每次可同時點10到50顆水餃，模擬點水餃數請以亂數產生。
// (4) 請亂數選取顧客點餐的水餃種類(豬肉水餃, 牛肉水餃或蔬菜水餃)。
// (5) 水餃售完為止。
// (6) 當顧客點餐後，在下一位顧客開始點餐前必須有等待服務生的時間，此等待的暫停時間為3秒。

import java.util.*;

class dumpThread extends Thread {
    static int pork = 5000, beef = 3000, vegetable = 1000; 

    public synchronized void run(){

        if(pork <=0 && beef <=0 && vegetable <= 0){
            System.exit(0);
        }else{
            int quantity=(int)(Math.random()*41)+10;
            int dumpling=(int)(Math.random()*3)+1;

            if(dumpling==1){

                if(pork<=0){
                    System.out.println("豬肉水餃已售完");
                }else{
                    pork=pork-quantity;
                    System.out.println("豬肉水餃還有"+pork+"顆");
                }

            }else if(dumpling==2){

                if(beef<=0){
                    System.out.println("牛肉水餃已售完");
                }else{
                    beef=beef-quantity;
                    System.out.println("牛肉水餃還有"+beef+"顆");
                }

            }else if(dumpling==3){

                if(vegetable<=0){
                    System.out.println("蔬菜水餃已售完");
                }
                else{
                    vegetable=vegetable-quantity;
                    System.out.println("蔬菜水餃還有"+vegetable+"顆");
                }
            }

            try{
                sleep(3000);
            }catch(InterruptedException e){
    
            }
        }   
    }
}

public class A1113316_0512 {
    public static void main(String[] args) throws Exception{
        
        System.out.println("請輸入同時光顧的顧客數目:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            dumpThread customer = new dumpThread();
            customer.start();
        }
    }
}
