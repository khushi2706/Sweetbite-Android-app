package com.example.sweetbite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.example.sweetbite.Adapters.MainAdapter;
import com.example.sweetbite.Models.MainModel;
import com.example.sweetbite.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        Log.d("true","creating the list");
        list.add(new MainModel(R.drawable.choco, "Choco" ,  "50" , "Ball of Choco build with hershes and dairymilk so refreshing" ));
        list.add(new MainModel(R.drawable.pencake, "Pen Cake" ,  "99" , "Pen Cake build with hershes and dairymilk so refreshing" ));
        list.add(new MainModel(R.drawable.donuts, "Donut" ,  "199" , "Doremnon favraite build with hershes and dairymilk so refreshing" ));
        list.add(new MainModel(R.drawable.coldcoffee, "Cold Coffee" ,  "70" , "Cold Choffe build with hershes and dairymilk so refreshing" ));

        Log.d("true","created list");

        Log.d("true","Adding main adapter");
        MainAdapter adapter = new MainAdapter(list , this);
        binding.recyclerview.setAdapter(adapter);

        Log.d("","linear Layout manger");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}