package com.utn.model.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Fragment1ViewModel : ViewModel() {

    val name = MutableLiveData<String>()

    fun changeName (){
        name.postValue("pepe")
    }

}
