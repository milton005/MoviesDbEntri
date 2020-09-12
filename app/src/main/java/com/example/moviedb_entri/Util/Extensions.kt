package com.example.moviedb_entri.Util

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

import java.io.IOException


/**
 * AppCompatActivity Extension functions
 */

inline fun <reified T : Fragment> AppCompatActivity.findFragmentByTag(tag: String) : T? = supportFragmentManager.findFragmentByTag(tag) as? T

inline fun <reified T : Fragment> AppCompatActivity.findFragmentByTagWithAutoDismiss(tag: String) : T? {
    val fragment = supportFragmentManager.findFragmentByTag(tag) as? T
    when (fragment) {
        is DialogFragment -> fragment.dismiss()
    }
    return fragment
}

inline fun <reified V : ViewModel> AppCompatActivity.bindViewModel(viewModelFactory: ViewModelProvider.Factory) = lazy { ViewModelProviders.of(this, viewModelFactory).get(V::class.java) }


/**
 * Network Utility Extension functions  
 */
suspend fun safeApiCall(networkBlock: suspend () -> Unit, failureBlock: (Exception) -> Unit, errorMessage: String) {
    return try {
        networkBlock()
    } catch (e: Exception) {

        failureBlock(IOException(errorMessage, e))
    }
}