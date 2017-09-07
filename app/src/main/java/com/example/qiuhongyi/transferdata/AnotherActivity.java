package com.example.qiuhongyi.transferdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button btn=(Button)findViewById(R.id.buttonReturn) ;
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=getIntent();
                String name= intent.getStringExtra("name");
                Integer age=intent.getIntExtra("age",20);
                intent.putExtra("result","姓名"+name+"年龄"+age);
                setResult(0,intent);
                finish();
            }
        });
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age",20);
        Toast.makeText(this,name+age,Toast.LENGTH_SHORT).show();

    }
}
