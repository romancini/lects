package br.com.romancini.lects.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.romancini.lects.R;

public class SelectLessonActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Seleção de Atividade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lesson);

        setTitle(TITLE_APPBAR);
    }
}
