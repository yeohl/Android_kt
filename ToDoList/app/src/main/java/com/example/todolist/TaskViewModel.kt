package com.example.todolist

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class TaskViewModel(application: Application) : AndroidViewModel(application){

    private val taskDao = TaskDatabase.getDatabase(application).taskDao()
    private val repository : TaskRepository


    init {
        repository = TaskRepository(taskDao)
        var getAllTasks = repository.getAllTasks()
    }
    fun insert(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert(taskEntry)
        }
    }
    fun delect(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.delectItem(taskEntry)
        }
    }
    fun update(taskEntry: TaskEntry){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateDate(taskEntry)
        }
    }
    fun delectAll(){
        viewModelScope.launch(Dispatchers.IO){
            repository.delectAll()
        }
    }
}