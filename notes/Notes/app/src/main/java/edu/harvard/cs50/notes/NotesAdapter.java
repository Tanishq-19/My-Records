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
                    intent.putExtra("id", note.id);
                    intent.putExtra("date", note.date);
                    intent.putExtra("item1", note.item1);
                    intent.putExtra("item2", note.item2);
                    intent.putExtra("item3", note.item3);
                    intent.putExtra("item4", note.item4);
                    intent.putExtra("item5", note.item5);
                    intent.putExtra("item6", note.item6);
                    intent.putExtra("item7", note.item7);
                    intent.putExtra("item8", note.item8);
//                    intent.putExtra("item9", note.item9);
//                    intent.putExtra("item10", note.item10);
//                    intent.putExtra("item11", note.item11);
//                    intent.putExtra("item12", note.item12);
//                    intent.putExtra("item13", note.item13);
//                    intent.putExtra("item14", note.item14);
//                    intent.putExtra("item15", note.item15);
//                    intent.putExtra("item16", note.item16);
//                    intent.putExtra("item17", note.item17);
                    intent.putExtra("item1rs", note.item1rs);
                    intent.putExtra("item2rs", note.item2rs);
                    intent.putExtra("item3rs", note.item3rs);
                    intent.putExtra("item4rs", note.item4rs);
                    intent.putExtra("item5rs", note.item5rs);
                    intent.putExtra("item6rs", note.item6rs);
                    intent.putExtra("item7rs", note.item7rs);
                    intent.putExtra("item8rs", note.item8rs);
                    intent.putExtra("item1qty", note.item1qty);
                    intent.putExtra("item2qty", note.item2qty);
                    intent.putExtra("item3qty", note.item3qty);
                    intent.putExtra("item4qty", note.item4qty);
                    intent.putExtra("item5qty", note.item5qty);
                    intent.putExtra("item6qty", note.item6qty);
                    intent.putExtra("item7qty", note.item7qty);
                    intent.putExtra("item8qty", note.item8qty);
                    intent.putExtra("item1ttl", note.item1ttl);
                    intent.putExtra("item2ttl", note.item2ttl);
                    intent.putExtra("item3ttl", note.item3ttl);
                    intent.putExtra("item4ttl", note.item4ttl);
                    intent.putExtra("item5ttl", note.item5ttl);
                    intent.putExtra("item6ttl", note.item6ttl);
                    intent.putExtra("item7ttl", note.item7ttl);
                    intent.putExtra("item8ttl", note.item8ttl);
                    intent.putExtra("itemtotal", note.itemtotal);
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