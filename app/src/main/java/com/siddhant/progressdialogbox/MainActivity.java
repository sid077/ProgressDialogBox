package com.siddhant.progressdialogbox;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startProgressBar(View view) {
        progressDialog = progressDialog.show(this,"Progress Running","please wait",true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    progressDialog.dismiss();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
