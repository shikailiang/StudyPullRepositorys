package com.example.livemodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class LiveingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liveing);
        String id = getIntent().getStringExtra("id");
        if (id!=null&&!id.equals("")){
            Toast.makeText(this,"id是null",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,id,Toast.LENGTH_LONG).show();
        }
        Log.e("zzz","id:"+id);
    }
}