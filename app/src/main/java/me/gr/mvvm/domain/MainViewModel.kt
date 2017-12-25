package me.gr.mvvm.domain

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import me.gr.mvvm.data.MainRepository

/**
 * Created by GR on 2017/12/25.
 */
class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    val text = ObservableField("original data")
    val isLoading = ObservableBoolean(false)

    fun loadData() {
        isLoading.set(true)
        repository.getText {
            isLoading.set(false)
            text.set(it)
        }
    }
}