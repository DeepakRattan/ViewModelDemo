package com.example.deepakrattan.viewmodeldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProjectListResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("responseData")
    @Expose
    private List<Project> project = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> responseData) {
        this.project = responseData;
    }

}
