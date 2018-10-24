package br.com.romancini.lects.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.romancini.lects.LectsConfig;
import br.com.romancini.lects.R;
import br.com.romancini.lects.dao.LessonDAO;
import br.com.romancini.lects.model.Lesson;
import br.com.romancini.lects.model.User;
import br.com.romancini.lects.retrofit.RetrofitInicializer;
import br.com.romancini.lects.ui.adapter.LessonListAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SelectLessonActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Seleção de Atividade";
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lesson);
        setTitle(TITLE_APPBAR);

        getUserFromLogin();
        updateLessons();
    }

    private void getUserFromLogin() {
        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra(String.valueOf(R.string.USER));
        // TODO get user from loginActivity
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_get_lessons:
                updateLessons();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void updateLessons() {
        Call call = new RetrofitInicializer().lessonService().list(getToken());
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    // TODO persist on database

                    // TODO Remove this ADMIN with userClass
                    updateLessonsListView("ADMIN");
                } else {
                    Log.i(getString(R.string.LESSONS), getString(R.string.ALERT) + response.toString());
                    Toast.makeText(SelectLessonActivity.this, R.string.ERROR_REQUEST_LESSONS, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.e(getString(R.string.LESSONS), getString(R.string.ERROR) + t.toString());
                Toast.makeText(SelectLessonActivity.this, R.string.REQUEST_ERROR, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateLessonsListView(String userClass) {
        ListView lessonsList = findViewById(R.id.select_activity_listview);
        final List<Lesson> lessons = new LessonDAO().list(userClass);
        lessonsList.setAdapter(new LessonListAdapter(lessons, this));
    }

    private String getToken() {
        return ((LectsConfig) this.getApplication()).getToken();
    }
}
