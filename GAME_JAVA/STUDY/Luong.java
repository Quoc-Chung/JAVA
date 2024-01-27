public class Luong {
    private Thread t;

    private String TenLuong;

    public Luong(String name){
        TenLuong = name;
        System.out.println("Creating : " + TenLuong);
    }

    public void run(){
        System.out.println("Running : "+ TenLuong);

        try{
            for (int i=4;i > 0;i--){
                System.out.println("Ten luong : "+ TenLuong+ " ");
                // Để cho miên ngừng trong chốc lát 

                Thread.sleep(50);

            }
        }
        catch(InterruptedException e){
            System.out.println("Thread " + TenLuong+ " interrupted.");

        }
        System.out.println("Thread " +  TenLuong+ " exiting.");
        }
    
        public void start(){
            System.out.println(" Starting : " + TenLuong);

            if( t == null){
                t =new Thread(this.TenLuong);
                t.start();
            }
        }
}



