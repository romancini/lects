package br.com.romancini.lects.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.romancini.lects.LectsConfig;
import br.com.romancini.lects.R;
import br.com.romancini.lects.retrofit.RetrofitInicializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SelectLessonActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Seleção de Atividade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lesson);

        setTitle(TITLE_APPBAR);

        updateLessons();
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
                    Log.i(getString(R.string.LESSONS), "OK: " + response.toString());
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

    private String getToken() {
        return ((LectsConfig) this.getApplication()).getToken();
    }
}
