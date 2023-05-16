package kg.damir.dependencyinjection.example2.data.database

import android.content.Context
import android.util.Log
import kg.damir.dependencyinjection.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val system: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)}  ${system} ")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
