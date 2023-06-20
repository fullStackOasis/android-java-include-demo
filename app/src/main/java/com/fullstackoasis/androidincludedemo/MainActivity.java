package com.fullstackoasis.androidincludedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;

import com.fullstackoasis.androidincludedemo.databinding.ActivityMainBindingImpl;
import com.fullstackoasis.androidincludedemo.databinding.ReuseMeBinding;

/**
 * "Simple" example of using data binding to build reusable component.
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        View view = binding.getRoot();
        setContentView(view);
    }
}