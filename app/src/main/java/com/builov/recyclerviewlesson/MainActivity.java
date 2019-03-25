package com.builov.recyclerviewlesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User_Info> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0; i<10; i++){

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);

        DataAdapter dataAdapter  = new DataAdapter(this, users);
        recyclerView.setAdapter(dataAdapter);
        }
    }

    private void setInitialData(){
        users.add(new User_Info("Александр", "Буйлов", 30,R.drawable.builov));
    }
}
