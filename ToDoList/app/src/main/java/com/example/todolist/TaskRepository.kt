package com.example.todolist

import androidx.lifecycle.LiveData

class TaskRepository(val taskDao: TaskDao) {

    suspend fun insert(taskEntry: TaskEntry) = taskDao.insert(taskEntry)

    suspend fun updateDate(taskEntry: TaskEntry) = taskDao.update(taskEntry)

    suspend fun delectItem(taskEntry: TaskEntry) = taskDao.delect(taskEntry)

    suspend fun delectAll() {
        taskDao.deleteAll()
    }

    fun getAllTasks() : LiveData<List<TaskEntry>> = taskDao.getAllTasks()
}