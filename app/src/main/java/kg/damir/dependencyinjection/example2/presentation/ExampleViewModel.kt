package kg.damir.dependencyinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import kg.damir.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    private val id : String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel","$this  $id")
    }
}
