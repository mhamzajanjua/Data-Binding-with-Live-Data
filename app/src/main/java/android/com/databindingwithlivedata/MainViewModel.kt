package android.com.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var index:Int = 0
    val mutableLiveData:MutableLiveData<String> = MutableLiveData()
    init {
        mutableLiveData.value = "Hello World!"
    }

    fun increment() {
        ++index
        mutableLiveData.value = index.toString()
    }
}