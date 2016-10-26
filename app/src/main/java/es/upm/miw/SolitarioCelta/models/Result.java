package es.upm.miw.SolitarioCelta.models;

import java.util.Date;

/**
 * Created by fabricioflores on 26/10/16.
 */

public class Result {
    private String name;
    private int score;
    private long time;

    public Result(String name, int score, long time){
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public Result(String data){
        String [] splitted = data.split("\t");
        this.name = splitted[0];
        this.score = Integer.parseInt(splitted[1]);
        this.time = Long.parseLong(splitted[0]);
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String toString(){
        Date time = new Date(this.time);
        return this.name + "\t" + this.score + "\t" + time.toString();
    }
}
