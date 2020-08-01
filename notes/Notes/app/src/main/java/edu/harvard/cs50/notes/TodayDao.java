package edu.harvard.cs50.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TodayDao {
    @Query("INSERT INTO today (item, price, quantity, total, date) VALUES ('item1', 0,0,0,0)")
    void createToday();

    @Query("SELECT * FROM today WHERE date=:date")
    List<Today> gettoday(int date);

}
