package com.example.myapplication

import android.app.Application
import androidx.lifecycle.viewmodelScope
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskView(application: Application) : AndroidViewModel(application){

        val allTasks: LiveData<List<Task>>
        val repository: TaskRepository

        init {
            val dao = TaskDatabase.getDatabase(application).getTasksDao()
            repository= TaskRepository(dao)
            allTasks= repository.allTasks
        }

        fun deleteTask(task: Task) = viewmodelScope.launch (Dispatchers.IO){
            repository.delete(task)
        }
        fun updateTask(task: Task) = viewModelScope.launch (Dispatchers.IO){
            repository.update(task)
        }
        fun addTask(task: Task) = viewModelScope.launch (Dispatchers.IO){
            repository.insert(task)
        }

}

