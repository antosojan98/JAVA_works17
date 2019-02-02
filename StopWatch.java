    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author ANTO AWESOME
     */
    public class StopWatch {
        private long startTime;
        private long endTime;
        private long elapsedTime;
        private double elaspsedTimeInSec;

        public StopWatch(){
            startTime = System.currentTimeMillis();
        }
         public long getStartTime() {
            return startTime;
        }

        public double getEndTime() {
            return endTime;
        }
        public double start(){
            startTime = (long)System.currentTimeMillis();
            return startTime;
        }
        public long stop(){
            endTime = (long)System.currentTimeMillis();
            return endTime;
        }
        public  void setElapsedTime(long elaspedTime){
            elapsedTime = endTime - startTime;
        }

        public long getElapsedTime(){
        return elapsedTime;
        }
       
        public double getElapsedTimeInSec(){
         double elapsedTimeInSec = (double)((endTime - startTime) * 0.001);
         return elaspsedTimeInSec;
        }

    }
