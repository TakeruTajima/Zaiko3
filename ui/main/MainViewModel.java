package com.example.zaiko.ui.main;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.zaiko.MainRepository;
import com.example.zaiko.MyApplication;
import com.example.zaiko.domain.outside.product.Product;
import com.example.zaiko.use_case.ExampleUseCase;

import java.util.List;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {
    MyApplication app;
    ExampleUseCase useCase;
// TODO: Implement the ViewModel

    public MutableLiveData<String> liveDataString = new MutableLiveData<>();
    public MutableLiveData<List<Product>> productList = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
        app = (MyApplication) application;
    }

    public void onCreate(){
        new Thread(()->{
            productList.postValue(useCase.fetchAllItemListSource());

        }).start();
    }
}
