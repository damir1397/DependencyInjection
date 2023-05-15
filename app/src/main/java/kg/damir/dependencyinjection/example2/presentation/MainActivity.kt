package kg.damir.dependencyinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.damir.dependencyinjection.R
import kg.damir.dependencyinjection.example1.Activity
import kg.damir.dependencyinjection.example2.di.DaggerApplicationComponent
import kg.damir.dependencyinjection.example2.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var exampleViewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder().dataModule(DataModule(this)).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exampleViewModel.method()
    }
}