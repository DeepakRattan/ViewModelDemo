package com.example.deepakrattan.viewmodeldemo.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.deepakrattan.viewmodeldemo.R;
import com.example.deepakrattan.viewmodeldemo.adapter.ProjectListAdapter;
import com.example.deepakrattan.viewmodeldemo.model.Project;
import com.example.deepakrattan.viewmodeldemo.network.APIInterface;
import com.example.deepakrattan.viewmodeldemo.view_model.ProjectViewModel;

import java.util.List;

public class ProjectListActivity extends AppCompatActivity {
    private RecyclerView rv;
    ProjectListAdapter adapter;
    ProjectViewModel projectViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        projectViewModel = ViewModelProviders.of(this).get(ProjectViewModel.class);

        projectViewModel.getProjects().observe(this, new Observer<List<Project>>() {
            @Override
            public void onChanged(@Nullable List<Project> projectList) {
                adapter = new ProjectListAdapter(ProjectListActivity.this,projectList);
                rv.setAdapter(adapter);
            }
        });





    }
}
