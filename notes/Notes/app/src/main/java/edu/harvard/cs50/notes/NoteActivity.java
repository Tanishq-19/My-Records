package edu.harvard.cs50.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private EditText item9;
    private EditText item10;
    private EditText item11;
    private EditText item12;
    private EditText item9rs;
    private EditText item10rs;
    private EditText item11rs;
    private EditText item12rs;
    private EditText item9desc;
    private EditText item10desc;
    private EditText item11desc;
    private EditText item12desc;
    private EditText item13;
    private EditText item14;
    private EditText item15;
    private EditText item16;
    private EditText item17;
    private EditText item13ttl;
    private EditText item14ttl;
    private EditText item15ttl;
    private EditText item16ttl;
    private EditText item17ttl;
    private EditText item13lft;
    private EditText item14lft;
    private EditText item15lft;
    private EditText item16lft;
    private EditText item17lft;
    private EditText total_dayend;
    private EditText total_exp;
    private Button delete_button;
    private int x = 0;


//    private EditText itemtotal;
    private String content;
    private String content_ex;
    private String content_stock;
    private int nu1;
    private int nu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();

        String CSV = intent.getStringExtra("content");  //note.content;
        System.out.println(CSV);
        String[] values = CSV.split(",");
//        for(int i =0; i < values.length; i++){
//            System.out.println(values[i]);
//        }
        String CSV_ex = intent.getStringExtra("expenditure");  //note.content;
        System.out.println(CSV);
        String[] values_ex = CSV_ex.split(",");
        String CSV_stock = intent.getStringExtra("stock");  //note.content;
        System.out.println(CSV);
        String[] values_stock = CSV_stock.split(",");



        date_editText = findViewById(R.id.date_editText);
        //item1 = findViewById(R.id.item1);
        date_editText.setText(intent.getStringExtra("date"));
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
        item2rs.setText(values[9]);    //intent.getStringExtra("item2rs"));
        item3rs = findViewById(R.id.item3rs);
        item3rs.setText(values[10]);       //intent.getStringExtra("item3rs"));
        item4rs = findViewById(R.id.item4rs);
        item4rs.setText(values[11]);     //intent.getStringExtra("item4rs"));
        item5rs = findViewById(R.id.item5rs);
        item5rs.setText(values[12]);    //intent.getStringExtra("item5rs"));
        item6rs = findViewById(R.id.item6rs);
        item6rs.setText(values[13]);         //intent.getStringExtra("item6rs"));
        item7rs = findViewById(R.id.item7rs);
        item7rs.setText(values[14]);          //intent.getStringExtra("item7rs"));
        item8rs = findViewById(R.id.item8rs);
        item8rs.setText(values[15]);      //intent.getStringExtra("item8rs"));
        item1qty = findViewById(R.id.item1qty);
        item1qty.setText(values[16]);     //intent.getStringExtra("item1qty"));
        item2qty = findViewById(R.id.item2qty);
        item2qty.setText(values[17]);    //intent.getStringExtra("item2qty"));
        item3qty = findViewById(R.id.item3qty);
        item3qty.setText(values[18]);     //intent.getStringExtra("item3qty"));
        item4qty = findViewById(R.id.item4qty);
        item4qty.setText(values[19]);     //intent.getStringExtra("item4qty"));
        item5qty = findViewById(R.id.item5qty);
        item5qty.setText(values[20]);     //intent.getStringExtra("item5qty"));
        item6qty = findViewById(R.id.item6qty);
        item6qty.setText(values[21]);     //intent.getStringExtra("item6qty"));
        item7qty = findViewById(R.id.item7qty);
        item7qty.setText(values[22]);     //intent.getStringExtra("item7qty"));
        item8qty = findViewById(R.id.item8qty);
        item8qty.setText(values[23]);      //intent.getStringExtra("item8qty"));
        item1ttl = findViewById(R.id.item1ttl);
        item1ttl.setText(values[24]);      //intent.getStringExtra("item1ttl"));
        item2ttl = findViewById(R.id.item2ttl);
        item2ttl.setText(values[25]);     //intent.getStringExtra("item2ttl"));
        item3ttl = findViewById(R.id.item3ttl);
        item3ttl.setText(values[26]);      //intent.getStringExtra("item3ttl"));
        item4ttl = findViewById(R.id.item4ttl);
        item4ttl.setText(values[27]);      //intent.getStringExtra("item4ttl"));
        item5ttl = findViewById(R.id.item5ttl);
        item5ttl.setText(values[28]);       //intent.getStringExtra("item5ttl"));
        item6ttl = findViewById(R.id.item6ttl);
        item6ttl.setText(values[29]);       //intent.getStringExtra("item6ttl"));
        item7ttl = findViewById(R.id.item7ttl);
        item7ttl.setText(values[30]);        //intent.getStringExtra("item7ttl"));
        item8ttl = findViewById(R.id.item8ttl);
        item8ttl.setText(values[31]);       //intent.getStringExtra("item8ttl"));
        item9 = findViewById(R.id.item9);
        item9.setText(values_ex[0]); //intent.getStringExtra("item1"));
        item10 = findViewById(R.id.item10);
        item10.setText(values_ex[1]);  //intent.getStringExtra("item2"));
        item11 = findViewById(R.id.item11);
        item11.setText(values_ex[2]);        //intent.getStringExtra("item3"));
        item12 = findViewById(R.id.item12);
        item12.setText(values_ex[3]);   //intent.getStringExtra("item4"));
        item9rs = findViewById(R.id.item9rs);
        item9rs.setText(values_ex[4]); //intent.getStringExtra("item1"));
        item10rs = findViewById(R.id.item10rs);
        item10rs.setText(values_ex[5]);  //intent.getStringExtra("item2"));
        item11rs = findViewById(R.id.item11rs);
        item11rs.setText(values_ex[6]);        //intent.getStringExtra("item3"));
        item12rs = findViewById(R.id.item12rs);
        item12rs.setText(values_ex[7]);   //intent.getStringExtra("item4"));
        item9desc = findViewById(R.id.item9desc);
        item9desc.setText(values_ex[8]); //intent.getStringExtra("item1"));
        item10desc = findViewById(R.id.item10desc);
        item10desc.setText(values_ex[9]);  //intent.getStringExtra("item2"));
        item11desc = findViewById(R.id.item11desc);
        item11desc.setText(values_ex[10]);        //intent.getStringExtra("item3"));
        item12desc = findViewById(R.id.item12desc);
        item12desc.setText(values_ex[11]);   //intent.getStringExtra("item4"));
        item13 = findViewById(R.id.item13);
        item13.setText(values_stock[0]); //intent.getStringExtra("item1"));
        item14 = findViewById(R.id.item14);
        item14.setText(values_stock[1]);  //intent.getStringExtra("item2"));
        item15 = findViewById(R.id.item15);
        item15.setText(values_stock[2]);        //intent.getStringExtra("item3"));
        item16 = findViewById(R.id.item16);
        item16.setText(values_stock[3]);   //intent.getStringExtra("item4"));
        item17 = findViewById(R.id.item17);
        item17.setText(values_stock[4]);  //intent.getStringExtra("item5"));
        item13ttl = findViewById(R.id.item13ttl);
        item13ttl.setText(values_stock[5]); //intent.getStringExtra("item1"));
        item14ttl = findViewById(R.id.item14ttl);
        item14ttl.setText(values_stock[6]);  //intent.getStringExtra("item2"));
        item15ttl = findViewById(R.id.item15ttl);
        item15ttl.setText(values_stock[7]);        //intent.getStringExtra("item3"));
        item16ttl = findViewById(R.id.item16ttl);
        item16ttl.setText(values_stock[8]);   //intent.getStringExtra("item4"));
        item17ttl = findViewById(R.id.item17ttl);
        item17ttl.setText(values_stock[9]);  //intent.getStringExtra("item5"));
        item13lft = findViewById(R.id.item13lft);
        item13lft.setText(values_stock[10]); //intent.getStringExtra("item1"));
        item14lft = findViewById(R.id.item14lft);
        item14lft.setText(values_stock[11]);  //intent.getStringExtra("item2"));
        item15lft = findViewById(R.id.item15lft);
        item15lft.setText(values_stock[12]);        //intent.getStringExtra("item3"));
        item16lft = findViewById(R.id.item16lft);
        item16lft.setText(values_stock[13]);   //intent.getStringExtra("item4"));
        item17lft = findViewById(R.id.item17lft);
        item17lft.setText(values_stock[14]);  //intent.getStringExtra("item5"));
        total_dayend = findViewById(R.id.itemtotal);
        total_dayend.setText(intent.getStringExtra("total_dayend"));
        total_exp = findViewById(R.id.total_exp);
        total_exp.setText(intent.getStringExtra("total_exp"));

        final int id_delete = intent.getIntExtra("id", 0);
        delete_button = findViewById(R.id.delete_button);
        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.database.noteDao().delete(id_delete);

                finish();
            }
        });

//        itemtotal = findViewById(R.id.itemtotal);
//        item1rs.setText(String.valueOf(intent.getIntExtra("itemtotal", 0)));

        //total_ammount = (Integer.valueOf(item1ttl.getText().toString()) + Integer.valueOf(item2ttl.getText().toString()) + Integer.valueOf(item3ttl.getText().toString()) + Integer.valueOf(item4ttl.getText().toString()) + Integer.valueOf(item5ttl.getText().toString()) + Integer.valueOf(item6ttl.getText().toString()) + Integer.valueOf(item7ttl.getText().toString()) + Integer.valueOf(item8ttl.getText().toString()));
        //itemtotal.setText(total_ammount);

    }

    @Override
    protected void onPause() {
        super.onPause();
        x = 0;
        content = (item1.getText().toString()+","+item2.getText().toString()+","+item3.getText().toString()+","+item4.getText().toString()+","+item5.getText().toString()+","+item6.getText().toString()+","+item7.getText().toString()+","+item8.getText().toString()+","+item1rs.getText().toString()+","+item2rs.getText().toString()+","+item3rs.getText().toString()+","+item4rs.getText().toString()+","+item5rs.getText().toString()+","+item6rs.getText().toString()+","+item7rs.getText().toString()+","+item8rs.getText().toString()+","+item1qty.getText().toString()+","+item2qty.getText().toString()+","+item3qty.getText().toString()+","+item4qty.getText().toString()+","+item5qty.getText().toString()+","+item6qty.getText().toString()+","+item7qty.getText().toString()+","+item8qty.getText().toString()+","+item1ttl.getText().toString()+","+item2ttl.getText().toString()+","+item3ttl.getText().toString()+","+item4ttl.getText().toString()+","+item5ttl.getText().toString()+","+item6ttl.getText().toString()+","+item7ttl.getText().toString()+","+item8ttl.getText().toString());
        content_ex = (item9.getText().toString()+","+item10.getText().toString()+","+item11.getText().toString()+","+item12.getText().toString()+","+item9rs.getText().toString()+","+item10rs.getText().toString()+","+item11rs.getText().toString()+","+item12rs.getText().toString()+","+item9desc.getText().toString()+","+item10desc.getText().toString()+","+item11desc.getText().toString()+","+item12desc.getText().toString());
        content_stock = (item13.getText().toString()+","+item14.getText().toString()+","+item15.getText().toString()+","+item16.getText().toString()+","+item17.getText().toString()+","+item13ttl.getText().toString()+","+item14ttl.getText().toString()+","+item15ttl.getText().toString()+","+item16ttl.getText().toString()+","+item17ttl.getText().toString()+","+item13lft.getText().toString()+","+item14lft.getText().toString()+","+item15lft.getText().toString()+","+item16lft.getText().toString()+","+item17lft.getText().toString());
        String[] check1 = content.split(",");
        String[] check2 = content_ex.split(",");
        String[] check3 = content_stock.split(",");
        if (check1.length < 32 || check2.length < 12 || check3.length < 15 ){
            x++;
        }


        if (x==0) {
            Intent intent = getIntent();
            int id = intent.getIntExtra("id", 0);
            MainActivity.database.noteDao().save(content, content_ex, content_stock, date_editText.getText().toString(), total_dayend.getText().toString(), total_exp.getText().toString(), id);
        }
    }
}
