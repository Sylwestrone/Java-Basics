package domain;

import com.sun.xml.internal.ws.api.addressing.AddressingVersion;
import storage.EPackage;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by JSON on 2017-11-06.
 */

public class Package {
    private static int nextId = 0;
    public static final int MIN_PRIORITY = 1;
    public static final int MAX_PRIORITY = 5;

    private final int PRIORITY;

    private int id = 0;
    private String description;
    private int countOfMoves = 0;
    private Date date;
    private EPackage type;

    public Package(int priority, EPackage type) {
        this.PRIORITY = priority;
        id = nextId;
        date = Calendar.getInstance().getTime();
        nextId++;
    }

    public int getId(){
        return id;
    }

    public int getPriority() {
        return PRIORITY;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfMoves() {
        return countOfMoves;
    }

    public void setCountOfMoves(int countOfMoves) {
        this.countOfMoves = countOfMoves;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public EPackage getType(){
        return type;
    }

    public void setType(EPackage type){
        this.type = type;
    }
}