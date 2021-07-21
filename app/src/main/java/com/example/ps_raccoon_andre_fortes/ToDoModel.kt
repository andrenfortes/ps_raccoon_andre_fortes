package com.example.ps_raccoon_andre_fortes
import android.os.health.UidHealthStats

class ToDoModel{
    companion object Factory{
        fun createList() : ToDoModel = ToDoModel()
    }

    var UID : String? = null
    var itemDataText: String? = null
    var done: Boolean? = false
}