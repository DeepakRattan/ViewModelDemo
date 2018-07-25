package com.example.deepakrattan.viewmodeldemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deepakrattan.viewmodeldemo.R;
import com.example.deepakrattan.viewmodeldemo.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.ProjectViewHolder> {
    private Context context;
    private List<Project> projectList;

    public ProjectListAdapter(Context context, List<Project> projectList) {
        this.context = context;
        this.projectList = projectList;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_project_list, parent, false);
        ProjectViewHolder viewHolder = new ProjectViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project = projectList.get(position);
        if (project.getTitle() != null && project.getDescription() != null) {
            holder.txtProjectName.setText(project.getTitle());
            holder.txtProjectDesc.setText(project.getDescription());
        }
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    class ProjectViewHolder extends RecyclerView.ViewHolder {
        TextView txtProjectName, txtProjectDesc;

        public ProjectViewHolder(View itemView) {
            super(itemView);
            txtProjectName = itemView.findViewById(R.id.txtProjectName);
            txtProjectDesc = itemView.findViewById(R.id.txtProjectDescription);
        }
    }
}
