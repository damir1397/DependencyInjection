package kg.damir.dependencyinjection.example2.presentation

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kg.damir.dependencyinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val viewModels: @JvmSuppressWildcards Map<String, ViewModel>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModels[modelClass.simpleName] as T
    }

}
