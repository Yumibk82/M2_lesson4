public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(){
        this.startTime=System.currentTimeMillis();
//        this.startTime=System.nanoTime();
    }
    public double start(){
        return this.startTime=System.currentTimeMillis();
//        return this.startTime=System.nanoTime();
    }
    public double stop(){
        return this.endTime=System.currentTimeMillis();
//        return this.endTime=System.nanoTime();
    }
    public double getElapsedTime(){
        return this.endTime-this.startTime;
    }



}
