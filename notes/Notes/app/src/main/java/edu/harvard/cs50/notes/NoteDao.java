package edu.harvard.cs50.notes;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("INSERT INTO notes (date, item1, item2, item3, item4, item5, item6, item7, item8, item1rs, item2rs, item3rs, item4rs, item5rs, item6rs, item7rs, item8rs, item1qty, item2qty, item3qty, item4qty, item5qty, item6qty, item7qty, item8qty, item1ttl, item2ttl, item3ttl, item4ttl, item5ttl, item6ttl, item7ttl, item8ttl, itemtotal) VALUES (00000000, 'Item1','Item2','Item3','Item4','Item5','Item6','Item7','Item8', 0, 0, 0,0,0, 0, 0, 0,0,0, 0, 0, 0,0,0, 0, 0, 0,0,0, 0, 0, 0,0,0 )")
    void create();

    @Query("SELECT * FROM notes")
    List<Note> getAll();

    @Query("UPDATE notes SET date = :date, item1 = :item1, item2 = :item2, item3 = :item3, item4=:item4, item5=:item5, item6=:item6, item7=:item7, item8=:item8, item2rs=:item2rs, item1rs=:item1rs, item3rs=:item3rs, item4rs=:item4rs, item5rs=:item5rs, item6rs=:item6rs, item7rs=:item7rs, item8rs=:item8rs, item1qty=:item1qty, item2qty=:item2qty, item3qty=:item3qty, item4qty=:item4qty, item5qty=:item5qty, item6qty=:item6qty, item7qty=:item7qty, item8qty=:item8qty, item1ttl=:item1ttl, item2ttl=:item2ttl, item3ttl=:item3ttl, item4ttl=:item4ttl, item5ttl=:item5ttl, item6ttl=:item6ttl, item7ttl=:item7ttl, item8ttl=:item8ttl, itemtotal=:itemtotal  WHERE id = :id")
    void save(int date, String item1, String item2, String item3, String item4, String item5, String item6, String item7, String item8, int item2rs, int item1rs,  int item3rs, int item4rs, int item5rs, int item6rs, int item7rs, int item8rs, int item1qty, int item2qty, int item3qty, int item4qty, int item5qty, int item6qty, int item7qty, int item8qty, int item1ttl, int item2ttl, int item3ttl, int item4ttl, int item5ttl, int item6ttl, int item7ttl, int item8ttl, int itemtotal, int id);
}
