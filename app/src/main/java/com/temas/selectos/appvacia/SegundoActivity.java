package com.temas.selectos.appvacia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }
    public void onClick2(View v)
    {
        Toast.makeText(this,"Segundo Activity",Toast.LENGTH_LONG).show();
    }
}
