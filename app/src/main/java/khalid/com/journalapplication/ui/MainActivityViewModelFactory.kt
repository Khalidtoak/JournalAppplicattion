package khalid.com.journalapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by ${KhalidToak} on 1/9/2019.
 */
@Suppress("UNCHECKED_CAST")
class MainActivityViewModelFactory : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainActivityViewModel() as T
    }
}