package com.nauk0a.myrecorder.listRecord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nauk0a.myrecorder.database.RecordDatabaseDao

class ListRecordViewModelFactory(
    private val databaseDao: RecordDatabaseDao
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListRecordViewModel::class.java)) {
            return ListRecordViewModel(databaseDao) as T
        }
        throw IllegalAccessException("Unknown ViewModel class")
    }
}