package com.example.zaiko;

import com.example.zaiko.ui.main.MainViewModel;

import dagger.Component;

//@Component //(modules = { ExampleModule.class })
public interface AppComponent {
    //ExampleViewModel getExampleViewModel();
    MainViewModel getMainViewModel();
}
