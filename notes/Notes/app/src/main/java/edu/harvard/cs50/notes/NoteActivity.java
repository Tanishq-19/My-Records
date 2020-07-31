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
    private EditText itemtotal;
    private int total_ammount;
    private int nu1;
    private int nu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();
        date_editText = findViewById(R.id.date_editText);
        //item1 = findViewById(R.id.item1);
        date_editText.setText(String.valueOf(intent.getIntExtra("date", 000000)));
        item1 = findViewById(R.id.item1);
        item1.setText(intent.getStringExtra("item1"));
        item2 = findViewById(R.id.item2);
        item2.setText(intent.getStringExtra("item2"));
        item3 = findViewById(R.id.item3);
        item3.setText(intent.getStringExtra("item3"));
        item4 = findViewById(R.id.item4);
        item4.setText(intent.getStringExtra("item4"));
        item5 = findViewById(R.id.item5);
        item5.setText(intent.getStringExtra("item5"));
        item6 = findViewById(R.id.item6);
        item6.setText(intent.getStringExtra("item6"));
        item7 = findViewById(R.id.item7);
        item7.setText(intent.getStringExtra("item7"));
        item8 = findViewById(R.id.item8);
        item8.setText(intent.getStringExtra("item8"));
        item1rs = findViewById(R.id.item1rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item1rs", 0)));
        item2rs = findViewById(R.id.item2rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item2rs", 0)));
        item3rs = findViewById(R.id.item3rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item3rs", 0)));
        item4rs = findViewById(R.id.item4rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item4rs", 0)));
        item5rs = findViewById(R.id.item5rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item5rs", 0)));
        item6rs = findViewById(R.id.item6rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item6rs", 0)));
        item7rs = findViewById(R.id.item7rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item7rs", 0)));
        item8rs = findViewById(R.id.item8rs);
        item1rs.setText(String.valueOf(intent.getIntExtra("item8rs", 0)));
        item1qty = findViewById(R.id.item1qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item1qty", 0)));
        item2qty = findViewById(R.id.item2qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item2qty", 0)));
        item3qty = findViewById(R.id.item3qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item3qty", 0)));
        item4qty = findViewById(R.id.item4qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item4qty", 0)));
        item5qty = findViewById(R.id.item5qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item5qty", 0)));
        item6qty = findViewById(R.id.item6qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item6qty", 0)));
        item7qty = findViewById(R.id.item7qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item7qty", 0)));
        item8qty = findViewById(R.id.item8qty);
        item1rs.setText(String.valueOf(intent.getIntExtra("item8qty", 0)));
        item1ttl = findViewById(R.id.item1ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item1ttl", 0)));
        item2ttl = findViewById(R.id.item2ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item2ttl", 0)));
        item3ttl = findViewById(R.id.item3ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item3ttl", 0)));
        item4ttl = findViewById(R.id.item4ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item4ttl", 0)));
        item5ttl = findViewById(R.id.item5ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item5ttl", 0)));
        item6ttl = findViewById(R.id.item6ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item6ttl", 0)));
        item7ttl = findViewById(R.id.item7ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item7ttl", 0)));
        item8ttl = findViewById(R.id.item8ttl);
        item1rs.setText(String.valueOf(intent.getIntExtra("item8ttl", 0)));
        itemtotal = findViewById(R.id.itemtotal);
        item1rs.setText(String.valueOf(intent.getIntExtra("itemtotal", 0)));

        //total_ammount = (Integer.valueOf(item1ttl.getText().toString()) + Integer.valueOf(item2ttl.getText().toString()) + Integer.valueOf(item3ttl.getText().toString()) + Integer.valueOf(item4ttl.getText().toString()) + Integer.valueOf(item5ttl.getText().toString()) + Integer.valueOf(item6ttl.getText().toString()) + Integer.valueOf(item7ttl.getText().toString()) + Integer.valueOf(item8ttl.getText().toString()));
        //itemtotal.setText(total_ammount);

    }

    @Override
    protected void onPause() {
        super.onPause();

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        MainActivity.database.noteDao().save(Integer.parseInt(date_editText.getText().toString()), item1.getText().toString(), item2.getText().toString(), item3.getText().toString(), item4.getText().toString(), item5.getText().toString(), item6.getText().toString(), item7.getText().toString(), item8.getText().toString(),Integer.parseInt(item1rs.getText().toString()),Integer.parseInt(item2rs.getText().toString()),Integer.parseInt(item3rs.getText().toString()),Integer.parseInt(item4rs.getText().toString()),Integer.parseInt(item5rs.getText().toString()),Integer.parseInt(item6rs.getText().toString()),Integer.parseInt(item7rs.getText().toString()),Integer.parseInt(item8rs.getText().toString()),Integer.parseInt(item1qty.getText().toString()),Integer.parseInt(item2qty.getText().toString()),Integer.parseInt(item3qty.getText().toString()),Integer.parseInt(item4qty.getText().toString()),Integer.parseInt(item5qty.getText().toString()),Integer.parseInt(item6qty.getText().toString()),Integer.parseInt(item7qty.getText().toString()),Integer.parseInt(item8qty.getText().toString()),Integer.parseInt(item1ttl.getText().toString()),Integer.parseInt(item2ttl.getText().toString()),Integer.parseInt(item3ttl.getText().toString()),Integer.parseInt(item4ttl.getText().toString()),Integer.parseInt(item5ttl.getText().toString()),Integer.parseInt(item6ttl.getText().toString()),Integer.parseInt(item7ttl.getText().toString()),Integer.parseInt(item8ttl.getText().toString()),Integer.parseInt(itemtotal.getText().toString()), id);
    }
}
