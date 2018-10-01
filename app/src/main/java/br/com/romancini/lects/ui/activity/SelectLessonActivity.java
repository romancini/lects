package br.com.romancini.lects.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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

        Call call = new RetrofitInicializer().getLessonService().list();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                Log.i("LECTS", "Requisição OK");
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                //Toast.makeText(SelectLessonActivity.class, "Falha na conexão", Toast.LENGTH_LONG).show();
                Log.e("LECTS", "Erro na requisição");
            }
        });
    }
}
