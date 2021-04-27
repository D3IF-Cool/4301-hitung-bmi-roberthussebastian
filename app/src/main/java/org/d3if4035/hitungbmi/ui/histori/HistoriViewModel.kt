package org.d3if4035.hitungbmi.ui.histori

import androidx.lifecycle.*
import kotlinx.coroutines.*
import org.d3if4035.hitungbmi.db.BmiDao

class HistoriViewModel(private val db: BmiDao) : ViewModel() {

    val data = db.getLastBmi()

    fun hapusData() = viewModelScope.launch {
        withContext(Dispatchers.IO) {
            db.clearData()
        }
    }
}