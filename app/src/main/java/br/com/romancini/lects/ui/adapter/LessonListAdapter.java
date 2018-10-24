package br.com.romancini.lects.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.romancini.lects.R;
import br.com.romancini.lects.model.Lesson;

public class LessonListAdapter extends BaseAdapter {

    private final List<Lesson> lessons;
    private final Context context;

    public LessonListAdapter(List<Lesson> lessons, Context context) {
        this.lessons = lessons;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lessons.size();
    }

    @Override
    public Object getItem(int position) {
        return lessons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View createdView = LayoutInflater
                .from(context)
                .inflate(R.layout.item_lesson, parent, false);

        Lesson lesson = lessons.get(position);
        setSubject(lesson, createdView);
        setOwner(lesson, createdView);
        setDescription(lesson, createdView);

        return null;
    }

    private void setSubject(Lesson lesson, View view){
        TextView textViewSubject = view.findViewById(R.id.item_lesson_subject);
        textViewSubject.setText(lesson.getDescription());
    }

    private void setOwner(Lesson lesson, View view){
        TextView textViewOwner = view.findViewById(R.id.item_lesson_tecaher);
        textViewOwner.setText(lesson.getOwner());
    }

    private void setDescription(Lesson lesson, View view){
        TextView textViewDescription = view.findViewById(R.id.item_lesson_description);
        textViewDescription.setText(lesson.getDescription());
    }
}
