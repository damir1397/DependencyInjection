package kg.damir.dependencyinjection.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kg.damir.dependencyinjection.R
import kg.damir.dependencyinjection.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var exampleViewModel: ExampleViewModel

    private val component by lazy { (application as ExampleApp).component }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exampleViewModel.method()
    }
}