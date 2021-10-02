package com.nauk0a.myrecorder.listRecord

import androidx.lifecycle.ViewModel
import com.nauk0a.myrecorder.database.RecordDatabaseDao

class ListRecordViewModel(
    dataSource: RecordDatabaseDao
) : ViewModel() {

    val database = dataSource
    val records = database.getAllRecords()
}