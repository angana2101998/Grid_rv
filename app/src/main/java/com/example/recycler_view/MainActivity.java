package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.example.recycler_view.adapetrs.RecipeAdapter;
import com.example.recycler_view.models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        ArrayList<RecipeModel> list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.iamge7,"Caeser"));
        list.add(new RecipeModel(R.drawable.image1,"Princess"));
        list.add(new RecipeModel(R.drawable.image3,"Iykia"));
        list.add(new RecipeModel(R.drawable.image4,"Mango"));
        list.add(new RecipeModel(R.drawable.iamge5,"Eva"));
        list.add(new RecipeModel(R.drawable.iamge7,"Levi"));
        list.add(new RecipeModel(R.drawable.iamge5,"lasha"));
        RecipeAdapter adapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);
        //scroll
        //LinearLayoutManager layoutManager=new LinearLayoutManager(this);
       // recyclerView.setLayoutManager(layoutManager);

//horizontal scroll
        /*LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(layoutManager);*/

        //grid layout
        //GridLayout gridLayout=new GridLayout(this,2);
        //GridLayout gridLayout=new GridLayout(this, 2);
      GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}