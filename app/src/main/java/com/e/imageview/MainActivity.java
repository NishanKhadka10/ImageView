package com.e.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.PriorityQueue;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioGroup rdogroup;
    private RadioButton rdoanmol,rdosaugat,rdopal;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdoanmol = findViewById(R.id.rdoanmol);
        rdopal = findViewById(R.id.rdopal);
        rdosaugat = findViewById(R.id.rdosaugat);
        imageView = findViewById(R.id.imageview);

        rdosaugat.setOnClickListener(this);
        rdopal.setOnClickListener(this);
        rdoanmol.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        //Switch for Single condition
        //if for multiple condition on same line
        switch (v.getId())
        {
            case R.id.rdoanmol:

//                Toast toast = Toast.makeText(this,"Anmol",Toast.LENGTH_LONG);
//                toast.show();
                imageView.setImageResource(R.drawable.anmol);

//                Toast.makeText(this,"Anmol",Toast.LENGTH_LONG);
                break;

            case R.id.rdopal:
                imageView.setImageResource(R.drawable.pal);
//                Toast toastpal = Toast.makeText(this,"Pal",Toast.LENGTH_LONG);
//                toastpal.show();
                break;

            case R.id.rdosaugat:
                imageView.setImageResource(R.drawable.saugat);
//                Toast toastsaugat = Toast.makeText(this,"Saugat",Toast.LENGTH_LONG);
//                toastsaugat.show();
                break;


        }


    }
}
