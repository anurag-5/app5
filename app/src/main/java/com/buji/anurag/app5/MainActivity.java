package com.buji.anurag.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    String getname,getroll,getadmno,getcollege;
    Button bt1;
    StudentModel studentModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentModel=new StudentModel();
        bt1=(Button)findViewById(R.id.b1);
        et2=(EditText)findViewById(R.id.e2);
        et3=(EditText)findViewById(R.id.e3);
        et4=(EditText)findViewById(R.id.e4);
        et1=(EditText)findViewById(R.id.e1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=et1.getText().toString();
                getroll=et2.getText().toString();
                getadmno=et3.getText().toString();
                getcollege=et4.getText().toString();
                studentModel.setName(getname);
                studentModel.setRollno(getroll);
                studentModel.setAdmno(getadmno);
                studentModel.setCollege(getcollege);

                String s2=studentModel.getName();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_LONG).show();


            }
        });
    }
}
