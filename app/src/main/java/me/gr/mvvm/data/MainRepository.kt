package me.gr.mvvm.data

import android.os.Handler
import java.util.*

/**
 * Created by GR on 2017/12/25.
 */
class MainRepository {
    private val handler = Handler()

    fun getText(callback: (text: String) -> Unit) {
        handler.postDelayed({ callback.invoke(UUID.randomUUID().toString()) }, 2000)
    }
}