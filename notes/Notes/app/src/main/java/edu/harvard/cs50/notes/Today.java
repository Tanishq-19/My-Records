package edu.harvard.cs50.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "today")
public class Today {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "item")
    public String item;

    @ColumnInfo(name = "price")
    public int price;

    @ColumnInfo(name = "quantity")
    public int quantity;

    @ColumnInfo(name = "total")
    public int total;

    @ColumnInfo(name = "date")
    public int date;

}
