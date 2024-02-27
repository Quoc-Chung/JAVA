public class Game{

    /* - Mong số lượng khung hình vẽ ra trong 1 giây là 60 -  */
    private static final int TARGET_FPS = 60; 
    private static final long  NANO_TIME = 1000000000; 

    /* - Tính toán thời gian để vẽ ra một frame  -  */
    private static final long NANO_PER_FRAME =  NANO_TIME / TARGET_FPS ;
    
    /* - Tổng tất cả thời gian vẽ ra 1 frame phải bằng 1 =  */
    private  long Cap_Nhat;

    public void UpDate(){
        while(true){
                long Time_Hien_Tai = System.nanoTime();
            /* Thời gian để vẽ một frame đã đủ -  */
                if(Time_Hien_Tai - Cap_Nhat >= NANO_PER_FRAME){
                    Cap_Nhat = Time_Hien_Tai;
                }
        }
    }
    public static void main(String[] args) {
        new Game().UpDate();;
    }
}