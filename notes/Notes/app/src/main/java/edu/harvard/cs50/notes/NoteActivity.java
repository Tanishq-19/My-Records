package edu.harvard.cs50.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {
    private EditText date_editText;
    private EditText item1;
    private EditText item2;
    private EditText item3;
    private EditText item4;
    private EditText item5;
    private EditText item6;
    private EditText item7;
    private EditText item8;
    private EditText item1rs;
    private EditText item2rs;
    private EditText item3rs;
    private EditText item4rs;
    private EditText item5rs;
    private EditText item6rs;
    private EditText item7rs;
    private EditText item8rs;
    private EditText item1qty;
    private EditText item2qty;
    private EditText item3qty;
    private EditText item4qty;
    private EditText item5qty;
    private EditText item6qty;
    private EditText item7qty;
    private EditText item8qty;
    private EditText item1ttl;
    private EditText item2ttl;
    private EditText item3ttl;
    private EditText item4ttl;
    private EditText item5ttl;
    private EditText item6ttl;
    private EditText item7ttl;
    private EditText item8ttl;
//    private EditText itemtotal;
    private String content;
    private int nu1;
    private int nu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();

        String CSV = intent.getStringExtra("content");  //note.content;
        String[] values = CSV.split(",");

        date_editText = findViewById(R.id.date_editText);
        //item1 = findViewById(R.id.item1);
        date_editText.setText(String.valueOf(intent.getIntExtra("date", 000000)));
        item1 = findViewById(R.id.item1);
        item1.setText(values[0]); //intent.getStringExtra("item1"));
        item2 = findViewById(R.id.item2);
        item2.setText(values[1]);  //intent.getStringExtra("item2"));
        item3 = findViewById(R.id.item3);
        item3.setText(values[2]);        //intent.getStringExtra("item3"));
        item4 = findViewById(R.id.item4);
        item4.setText(values[3]);   //intent.getStringExtra("item4"));
        item5 = findViewById(R.id.item5);
        item5.setText(values[4]);  //intent.getStringExtra("item5"));
        item6 = findViewById(R.id.item6);
        item6.setText(values[5]);   //intent.getStringExtra("item6"));
        item7 = findViewById(R.id.item7);
        item7.setText(values[6]);   //intent.getStringExtra("item7"));
        item8 = findViewById(R.id.item8);
        item8.setText(values[7]);           //intent.getStringExtra("item8"));
        item1rs = findViewById(R.id.item1rs);
        item1rs.setText(values[8]);    //intent.getStringExtra("item1rs"));
        item2rs = findViewById(R.id.item2rs);
        item1rs.setText(values[9]);    //intent.getStringExtra("item2rs"));
        item3rs = findViewById(R.id.item3rs);
        item1rs.setText(values[10]);       //intent.getStringExtra("item3rs"));
        item4rs = findViewById(R.id.item4rs);
        item1rs.setText(values[11]);     //intent.getStringExtra("item4rs"));
        item5rs = findViewById(R.id.item5rs);
        item1rs.setText(values[12]);    //intent.getStringExtra("item5rs"));
        item6rs = findViewById(R.id.item6rs);
        item1rs.setText(values[13]);         //intent.getStringExtra("item6rs"));
        item7rs = findViewById(R.id.item7rs);
        item1rs.setText(values[14]);          //intent.getStringExtra("item7rs"));
        item8rs = findViewById(R.id.item8rs);
        item1rs.setText(values[15]);      //intent.getStringExtra("item8rs"));
        item1qty = findViewById(R.id.item1qty);
        item1rs.setText(values[16]);     //intent.getStringExtra("item1qty"));
        item2qty = findViewById(R.id.item2qty);
        item1rs.setText(values[17]);    //intent.getStringExtra("item2qty"));
        item3qty = findViewById(R.id.item3qty);
        item1rs.setText(values[18]);     //intent.getStringExtra("item3qty"));
        item4qty = findViewById(R.id.item4qty);
        item1rs.setText(values[19]);     //intent.getStringExtra("item4qty"));
        item5qty = findViewById(R.id.item5qty);
        item1rs.setText(values[20]);     //intent.getStringExtra("item5qty"));
        item6qty = findViewById(R.id.item6qty);
        item1rs.setText(values[21]);     //intent.getStringExtra("item6qty"));
        item7qty = findViewById(R.id.item7qty);
        item1rs.setText(values[22]);     //intent.getStringExtra("item7qty"));
        item8qty = findViewById(R.id.item8qty);
        item1rs.setText(values[23]);      //intent.getStringExtra("item8qty"));
        item1ttl = findViewById(R.id.item1ttl);
        item1rs.setText(values[24]);      //intent.getStringExtra("item1ttl"));
        item2ttl = findViewById(R.id.item2ttl);
        item1rs.setText(values[25]);     //intent.getStringExtra("item2ttl"));
        item3ttl = findViewById(R.id.item3ttl);
        item1rs.setText(values[26]);      //intent.getStringExtra("item3ttl"));
        item4ttl = findViewById(R.id.item4ttl);
        item1rs.setText(values[27]);      //intent.getStringExtra("item4ttl"));
        item5ttl = findViewById(R.id.item5ttl);
        item1rs.setText(values[28]);       //intent.getStringExtra("item5ttl"));
        item6ttl = findViewById(R.id.item6ttl);
        item1rs.setText(values[29]);       //intent.getStringExtra("item6ttl"));
        item7ttl = findViewById(R.id.item7ttl);
        item1rs.setText(values[30]);        //intent.getStringExtra("item7ttl"));
        item8ttl = findViewById(R.id.item8ttl);
        item1rs.setText(values[31]);       //intent.getStringExtra("item8ttl"));
//        itemtotal = findViewById(R.id.itemtotal);
//        item1rs.setText(String.valueOf(intent.getIntExtra("itemtotal", 0)));
        content = (item1.getText().toString()+","+item2.getText().toString()+","+item3.getText().toString()+","+item4.getText().toString()+","+item5.getText().toString()+","+item6.getText().toString()+","+item7.getText().toString()+","+item8.getText().toString()+","+item1rs.getText().toString()+","+item2rs.getText().toString()+","+item3rs.getText().toString()+","+item4rs.getText().toString()+","+item5rs.getText().toString()+","+item6rs.getText().toString()+","+item7rs.getText().toString()+","+item8rs.getText().toString()+","+item1qty.getText().toString()+","+item2qty.getText().toString()+","+item3qty.getText().toString()+","+item4qty.getText().toString()+","+item5qty.getText().toString()+","+item6qty.getText().toString()+","+item7qty.getText().toString()+","+item8qty.getText().toString()+","+item1ttl.getText().toString()+","+item2ttl.getText().toString()+","+item3ttl.getText().toString()+","+item4ttl.getText().toString()+","+item5ttl.getText().toString()+","+item6ttl.getText().toString()+","+item7ttl.getText().toString()+","+item8ttl.getText().toString());
        //total_ammount = (Integer.valueOf(item1ttl.getText().toString()) + Integer.valueOf(item2ttl.getText().toString()) + Integer.valueOf(item3ttl.getText().toString()) + Integer.valueOf(item4ttl.getText().toString()) + Integer.valueOf(item5ttl.getText().toString()) + Integer.valueOf(item6ttl.getText().toString()) + Integer.valueOf(item7ttl.getText().toString()) + Integer.valueOf(item8ttl.getText().toString()));
        //itemtotal.setText(total_ammount);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        MainActivity.database.noteDao().save(content, Integer.parseInt(date_editText.getText().toString()), id);
    }
}
