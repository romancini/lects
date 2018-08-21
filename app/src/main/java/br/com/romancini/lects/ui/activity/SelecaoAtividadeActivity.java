package br.com.romancini.lects.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.romancini.lects.R;

public class SelecaoAtividadeActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "seleção de atividade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_atividade);

        setTitle(TITLE_APPBAR);
    }
}
