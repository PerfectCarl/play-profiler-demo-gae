package models;

import javax.persistence.Entity;

public class Data {

    public Data(long longData) {
        string = longData + "";
    }

    public String string;
}
