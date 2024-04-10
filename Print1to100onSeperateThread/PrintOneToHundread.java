package Print1to100onSeperateThread;

public class PrintOneToHundread implements Runnable{
    private int number ;
    public PrintOneToHundread(Integer number){
        this.number = number;
    }    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Number that we received to run :"+ this.number);
    }
}
