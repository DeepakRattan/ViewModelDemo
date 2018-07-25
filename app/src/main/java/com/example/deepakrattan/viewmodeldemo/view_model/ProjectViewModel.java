package com.example.deepakrattan.viewmodeldemo.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.deepakrattan.viewmodeldemo.model.Project;
import com.example.deepakrattan.viewmodeldemo.model.ProjectListResponse;
import com.example.deepakrattan.viewmodeldemo.network.APIClient;
import com.example.deepakrattan.viewmodeldemo.network.APIInterface;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//ViewModels are entities that are free of the Activity/Fragment lifecycle.
//They can retain their state/data even during an orientation change.
//ViewModel's only responsibility is to manage the data for the UI.

public class ProjectViewModel extends ViewModel {
    private APIInterface apiInterface;

    //Data that will be fetched asynchronously
    private MutableLiveData<List<Project>> projectList;

    //to get data
   public LiveData<List<Project>> getProjects() {
        //if list is null
        if (projectList == null) {
            projectList = new MutableLiveData<List<Project>>();
            //Load data asynchronously from the server
            loadProjects();
        }
        //return the list
        return projectList;
    }

    //Laod data from URL
    public void loadProjects() {
        apiInterface = APIClient.getRetrofitInstance().create(APIInterface.class);
        Call<ProjectListResponse> call = apiInterface.getProjects();
        call.enqueue(new Callback<ProjectListResponse>() {
            @Override
            public void onResponse(Call<ProjectListResponse> call, Response<ProjectListResponse> response) {
                //projectListResponseMutableLiveData.setValue(response.body());
                ProjectListResponse projectListResponse = response.body();
                String message = projectListResponse.getMessage();
                //projectList = (MutableLiveData<List<Project>>) projectListResponse.getProject();
                projectList.setValue(projectListResponse.getProject());
            }

            @Override
            public void onFailure(Call<ProjectListResponse> call, Throwable t) {

            }
        });


    }
}
