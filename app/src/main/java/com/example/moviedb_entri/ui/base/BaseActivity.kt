//package com.sheraz.listrepos.ui.modules.base
//
//import android.app.Activity
//import android.app.Dialog
//import android.os.Bundle
//import androidx.annotation.LayoutRes
//import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
//import androidx.databinding.ViewDataBinding
//import androidx.lifecycle.ViewModelProvider
//import com.example.moviedb_entri.Injector
//
//
//
//
//abstract class BaseActivity() :AppCompatActivity()
//    {
//
//
//        protected val viewModelFactory: ViewModelProvider.Factory
//
//    init {
//
//        viewModelFactory = Injector.get().viewModelFactory()
//
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//
//    }
//
//
//
//    companion object {
//        private val TAG = BaseActivity::class.java.simpleName
//    }
//}