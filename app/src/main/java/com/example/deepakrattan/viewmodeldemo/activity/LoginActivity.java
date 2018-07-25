package com.example.deepakrattan.viewmodeldemo.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.deepakrattan.viewmodeldemo.R;
import com.example.deepakrattan.viewmodeldemo.model.LoginData;
import com.example.deepakrattan.viewmodeldemo.model.LoginResponse;
import com.example.deepakrattan.viewmodeldemo.network.APIClient;
import com.example.deepakrattan.viewmodeldemo.network.APIInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    private EditText edtName, edtPassword;
    private Button btnLogin;
    private APIInterface apiInterface;
    public static final String TAG = "login";
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtName = findViewById(R.id.edtName);
        edtPassword = findViewById(R.id.edtPassword);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        progressDialog = new ProgressDialog(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.setMessage("Please wait...");
                String email = edtName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                apiInterface = APIClient.getRetrofitInstance().create(APIInterface.class);
                Call<LoginResponse> call = apiInterface.getLogin(new LoginData(email, password));
                call.enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        progressDialog.dismiss();
                        LoginResponse loginResponse = response.body();
                        String name = loginResponse.getFName();
                        Toast.makeText(LoginActivity.this, "name is " + name, Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, ProjectListActivity.class));
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {

                    }
                });

            }
        });


    }
}
