package com.example.ps_raccoon_andre_fortes

interface UpdateAndDelete{
    fun modifyItem(itemUID :String, isDone: Boolean)
    fun onItemDelete(itemUID: String)
}