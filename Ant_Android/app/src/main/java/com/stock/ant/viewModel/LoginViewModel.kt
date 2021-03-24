package com.stock.ant.viewModel

import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.stock.ant.base.BaseViewModel



class LoginViewModel : BaseViewModel() {
    private val RC_SIGN_IN = 99
    private lateinit var firebaseAuth: FirebaseAuth



     fun firebaseAuthWithGoogle(acct: GoogleSignInAccount, firebaseAuth: FirebaseAuth) {
        Log.d("LoginActivity", "firebaseAuthWithGoogle:" + acct.id!!)

        val credential = GoogleAuthProvider.getCredential(acct.idToken, null)
        firebaseAuth.signInWithCredential(credential)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.w("LoginActivity", "firebaseAuthWithGoogle 성공", task.exception)
                    val user = firebaseAuth.currentUser
                    Log.d("account", "account : ${user!!.email}")

                } else {
                    Log.w("LoginActivity", "firebaseAuthWithGoogle 실패", task.exception)
                     Log.e("로그인","로그인에 실패했습니다.")
                }
            }
    }
}
