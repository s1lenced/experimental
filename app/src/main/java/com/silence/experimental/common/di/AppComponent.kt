package com.silence.experimental.common.di

import com.silence.experimental.ExperimentalApplication
import com.silence.experimental.common.di.viewmodel.ViewModelModule
import com.silence.experimental.movies.di.MoviesComponent
import com.silence.experimental.movies.di.MoviesModule
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        ViewModelModule::class
    ]
)
@Singleton
interface AppComponent {
    fun inject(app: ExperimentalApplication)

    fun plusMoviesComponent(module: MoviesModule): MoviesComponent
}