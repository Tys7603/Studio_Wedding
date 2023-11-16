package com.example.studiowedding.view.activity.detail_contract;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.example.studiowedding.R;

public class UpdateContractServiceActivity extends AppCompatActivity {
    private EditText
            contractIdEditText,
            serviceSelectEditText,
            priceEditText,
            locationEditText,
            dateOfPerformEditText;
    private RelativeLayout updateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_contract_service);

        initView();
    }

    private void initView() {
        contractIdEditText = findViewById(R.id.contractIdEditText);
        serviceSelectEditText = findViewById(R.id.serviceSelectEditText);
        priceEditText = findViewById(R.id.priceEditText);
        locationEditText = findViewById(R.id.locationEditText);
        dateOfPerformEditText = findViewById(R.id.dateOfPerformEditText);
        updateButton = findViewById(R.id.updateButton);
    }
}