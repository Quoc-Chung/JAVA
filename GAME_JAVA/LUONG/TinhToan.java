public class TinhToan extends Thread{
    public void run(){
        System.out.println("THREAD 1 :");
        for(int i=0;i<=5;i++){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        TinhToan thread1 = new TinhToan();
        System.out.println("CUA HAM MAIN :");
        thread1.start();
         
        for(int i=0;i<=5;i++){
            System.out.print(i+"  ");
        }
    }
}
