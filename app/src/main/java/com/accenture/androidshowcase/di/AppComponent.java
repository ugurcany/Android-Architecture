package com.accenture.androidshowcase.di;

import android.app.Application;

import com.accenture.androidshowcase.TheApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityModule.class,
        ViewModelModule.class,
        RepositoryModule.class
})
public interface AppComponent extends AndroidInjector<TheApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder app(Application app);

        AppComponent build();
    }
}