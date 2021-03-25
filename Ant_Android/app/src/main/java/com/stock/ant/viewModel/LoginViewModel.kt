package com.stock.ant.viewModel


import android.util.Log
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.stock.ant.base.BaseViewModel


class LoginViewModel : BaseViewModel() {

    //사용자 id 토큰을 가져와 firebase 인증벙보로 교환하고 해당 정보를 사용해 firebase에 인증
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
                    Log.e("로그인", "로그인에 실패했습니다.")
                }
            }
    }
}
