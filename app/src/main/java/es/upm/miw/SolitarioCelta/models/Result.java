package es.upm.miw.SolitarioCelta.models;

import java.util.Date;

/**
 * Created by fabricioflores on 26/10/16.
 */

public class Result {
    private String name;
    private int score;
    private String time;
    private String date;

    public Result(String name, String date, int score, String time){
        this.name = name;
        this.score = score;
        this.time = time;
        this.date = date;
    }

    public Result(String data){
        String [] splitted = data.split("\t");
        this.name = splitted[0];
        this.date = splitted[1];
        this.score = Integer.parseInt(splitted[2]);
        this.time = splitted[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getDate(){
        return date;
    }

    public String toString(){
        return this.name + "\t" + this.date + "\t" + this.score + "\t" + this.time;
    }
}
