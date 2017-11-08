/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author root
 */
public class teste {
    private String time;
    class time {
        private int hora;
        private int min;
        private int sec;
    //construtor
    /*public time (int hora, int min, int sec){
        this.hora = hora;
        this.min = min;
        this.sec = sec;
    }*/
        public void setHora (int hora){
        this.hora = hora;   
    }
    }
    public void setMin (int min){
        this.min = min;
    }
    public void setSec (int sec){
        this.sec = sec;
    }
    public int getTime(){
        return time;
    }
    public String calcTime(String hora){
        time = hora;
        return time;
    }
}   