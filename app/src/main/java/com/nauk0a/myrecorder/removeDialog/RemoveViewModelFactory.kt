package com.nauk0a.myrecorder.removeDialog

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nauk0a.myrecorder.database.RecordDatabaseDao
import com.nauk0a.myrecorder.listRecord.ListRecordViewModel

class RemoveViewModelFactory(
    private val databaseDao: RecordDatabaseDao,
    private val application: Application
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RemoveViewModel::class.java)) {
            return RemoveViewModel(databaseDao, application) as T
        }
        throw IllegalAccessException("Unknown ViewModel class")
    }
}