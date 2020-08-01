package edu.harvard.cs50.notes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {
    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout containerView;
        public TextView nameTextView;

        public NoteViewHolder(View view) {
            super(view);
            this.containerView = view.findViewById(R.id.note_row);
            this.nameTextView = view.findViewById(R.id.note_row_name);

            this.containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Note note = (Note) containerView.getTag();
                    Intent intent = new Intent(v.getContext(), NoteActivity.class);

//                    String CSV = note.content;
//                    String[] values = CSV.split(",");

                    intent.putExtra("id", note.id);
                    intent.putExtra("date", note.date);
                    intent.putExtra("content", note.content);
//                    intent.putExtra("item1", values[0]);
//                    intent.putExtra("item2", values[1]);
//                    intent.putExtra("item3", values[2]);
//                    intent.putExtra("item4", values[3]);
//                    intent.putExtra("item5", values[4]);
//                    intent.putExtra("item6", values[5]);
//                    intent.putExtra("item7", values[6]);
//                    intent.putExtra("item8", values[7]);
//                    intent.putExtra("item9", note.item9);
//                    intent.putExtra("item10", note.item10);
//                    intent.putExtra("item11", note.item11);
//                    intent.putExtra("item12", note.item12);
//                    intent.putExtra("item13", note.item13);
//                    intent.putExtra("item14", note.item14);
//                    intent.putExtra("item15", note.item15);
//                    intent.putExtra("item16", note.item16);
//                    intent.putExtra("item17", note.item17);
//                    intent.putExtra("item1rs", values[8]);
//                    intent.putExtra("item2rs", values[9]);
//                    intent.putExtra("item3rs", values[10]);
//                    intent.putExtra("item4rs", values[11]);
//                    intent.putExtra("item5rs", values[12]);
//                    intent.putExtra("item6rs", values[13]);
//                    intent.putExtra("item7rs", values[14]);
//                    intent.putExtra("item8rs", values[15]);
//                    intent.putExtra("item1qty", values[16]);
//                    intent.putExtra("item2qty", values[17]);
//                    intent.putExtra("item3qty", values[18]);
//                    intent.putExtra("item4qty", values[19]);
//                    intent.putExtra("item5qty", values[20]);
//                    intent.putExtra("item6qty", values[21]);
//                    intent.putExtra("item7qty", values[22]);
//                    intent.putExtra("item8qty", values[23]);
//                    intent.putExtra("item1ttl", values[24]);
//                    intent.putExtra("item2ttl", values[25]);
//                    intent.putExtra("item3ttl", values[26]);
//                    intent.putExtra("item4ttl", values[27]);
//                    intent.putExtra("item5ttl", values[28]);
//                    intent.putExtra("item6ttl", values[29]);
//                    intent.putExtra("item7ttl", values[30]);
//                    intent.putExtra("item8ttl", values[31]);
//                    intent.putExtra("itemtotal", note.itemtotal);
//                    intent.putExtra("item9amt", note.item9amt);
//                    intent.putExtra("item10amt", note.item10amt);
//                    intent.putExtra("item11amt", note.item11amt);
//                    intent.putExtra("item12amt", note.item12amt);
//                    intent.putExtra("item9desc", note.item9desc);
//                    intent.putExtra("item10desc", note.item10desc);
//                    intent.putExtra("item11desc", note.item11desc);
//                    intent.putExtra("item12desc", note.item12desc);
//                    intent.putExtra("extotal", note.extotal);
//                    intent.putExtra("item13ttl", note.item13ttl);
//                    intent.putExtra("item14ttl", note.item14ttl);
//                    intent.putExtra("item15ttl", note.item15ttl);
//                    intent.putExtra("item16ttl", note.item16ttl);
//                    intent.putExtra("item17ttl", note.item17ttl);
//                    intent.putExtra("item13lft", note.item13lft);
//                    intent.putExtra("item14lft", note.item14lft);
//                    intent.putExtra("item15lft", note.item15lft);
//                    intent.putExtra("item16lft", note.item16lft);
//                    intent.putExtra("item17lft", note.item17lft);

                    context.startActivity(intent);
                }
            });
        }
    }

    private List<Note> notes = new ArrayList<>();

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_row, parent, false);

        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        Note current = notes.get(position);
        holder.containerView.setTag(current);
        holder.nameTextView.setText(String.valueOf(current.date));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public void reload() {
        notes = MainActivity.database.noteDao().getAll();
        notifyDataSetChanged();
    }
}