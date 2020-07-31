package edu.harvard.cs50.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey
    public int id;
    //change made
    @ColumnInfo(name = "date")
    public int date;

    @ColumnInfo(name = "item1")
    public String item1;

    @ColumnInfo(name = "item2")
    public String item2;

    @ColumnInfo(name = "item3")
    public String item3;

    @ColumnInfo(name = "item4")
    public String item4;

    @ColumnInfo(name = "item5")
    public String item5;

    @ColumnInfo(name = "item6")
    public String item6;

    @ColumnInfo(name = "item7")
    public String item7;

    @ColumnInfo(name = "item8")
    public String item8;

    @ColumnInfo(name = "item1rs")
    public int item1rs;

    @ColumnInfo(name = "item2rs")
    public int item2rs;

    @ColumnInfo(name = "item3rs")
    public int item3rs;

    @ColumnInfo(name = "item4rs")
    public int item4rs;

    @ColumnInfo(name = "item5rs")
    public int item5rs;

    @ColumnInfo(name = "item6rs")
    public int item6rs;

    @ColumnInfo(name = "item7rs")
    public int item7rs;

    @ColumnInfo(name = "item8rs")
    public int item8rs;

    @ColumnInfo(name = "item1qty")
    public int item1qty;

    @ColumnInfo(name = "item2qty")
    public int item2qty;

    @ColumnInfo(name = "item3qty")
    public int item3qty;

    @ColumnInfo(name = "item4qty")
    public int item4qty;

    @ColumnInfo(name = "item5qty")
    public int item5qty;

    @ColumnInfo(name = "item6qty")
    public int item6qty;

    @ColumnInfo(name = "item7qty")
    public int item7qty;

    @ColumnInfo(name = "item8qty")
    public int item8qty;

    @ColumnInfo(name = "item1ttl")
    public int item1ttl;

    @ColumnInfo(name = "item2ttl")
    public int item2ttl;

    @ColumnInfo(name = "item3ttl")
    public int item3ttl;

    @ColumnInfo(name = "item4ttl")
    public int item4ttl;

    @ColumnInfo(name = "item5ttl")
    public int item5ttl;

    @ColumnInfo(name = "item6ttl")
    public int item6ttl;

    @ColumnInfo(name = "item7ttl")
    public int item7ttl;

    @ColumnInfo(name = "item8ttl")
    public int item8ttl;

    @ColumnInfo(name = "itemtotal")
    public int itemtotal;

//    @ColumnInfo(name = "item9")
//    public int item9;
//
//    @ColumnInfo(name = "item10")
//    public int item10;
//
//    @ColumnInfo(name = "item11")
//    public int item11;
//
//    @ColumnInfo(name = "item12")
//    public int item12;
//
//    @ColumnInfo(name = "item9amt")
//    public int item9amt;
//
//    @ColumnInfo(name = "item10amt")
//    public int item10amt;
//
//    @ColumnInfo(name = "item11amt")
//    public int item11amt;
//
//    @ColumnInfo(name = "item12amt")
//    public int item12amt;
//
//    @ColumnInfo(name = "extotal")
//    public String extotal;
//
//    @ColumnInfo(name = "item9desc")
//    public String item9desc;
//
//    @ColumnInfo(name = "item10desc")
//    public String item10desc;
//
//    @ColumnInfo(name = "item11desc")
//    public String item11desc;
//
//    @ColumnInfo(name = "item12desc")
//    public String item12desc;
//
//    @ColumnInfo(name = "item13")
//    public int item13;
//
//    @ColumnInfo(name = "item14")
//    public int item14;
//
//    @ColumnInfo(name = "item15")
//    public int item15;
//
//    @ColumnInfo(name = "item16")
//    public int item16;
//
//    @ColumnInfo(name = "item17")
//    public int item17;
//
//    @ColumnInfo(name = "item13ttl")
//    public int item13ttl;
//
//    @ColumnInfo(name = "item14ttl")
//    public int item14ttl;
//
//    @ColumnInfo(name = "item15ttl")
//    public int item15ttl;
//
//    @ColumnInfo(name = "item16ttl")
//    public int item16ttl;
//
//    @ColumnInfo(name = "item17ttl")
//    public int item17ttl;
//
//    @ColumnInfo(name = "item13lft")
//    public int item13lft;
//
//    @ColumnInfo(name = "item14lft")
//    public int item14lft;
//
//    @ColumnInfo(name = "item15lft")
//    public int item15lft;
//
//    @ColumnInfo(name = "item16lft")
//    public int item16lft;
//
//    @ColumnInfo(name = "item17lft")
//    public int item17lft;
}
