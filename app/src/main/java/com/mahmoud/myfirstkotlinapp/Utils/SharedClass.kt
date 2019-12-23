package com.mahmoud.myfirstkotlinapp.Utils

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Toast
import com.mahmoud.myfirstkotlinapp.R
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class SharedClass {

    private var progressDialog: Dialog? = null

    companion object {
        private var mContext: Context? = null
        private var mInstance: SharedClass? = null
        @Synchronized
        fun getInstance(context: Context): SharedClass? {
            mContext = context
            if (mInstance == null) {
                mInstance = SharedClass()
            }
            return mInstance
        }

    }
    fun handleException(t: Throwable) {
        if (t is SocketTimeoutException)
            makeToast("Internet error")
        else if (t is UnknownHostException)
            makeToast("connection error")
        else if (t is ConnectException)
            makeToast("connection error")
        else
            makeToast(t.localizedMessage)

    }


    fun makeToast(msg: String) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }

    fun showWaiting() {
        progressDialog = Dialog(mContext!!)
        progressDialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        progressDialog!!.setContentView(R.layout.view_waiting)
        progressDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        progressDialog!!.setCancelable(false)
        progressDialog!!.show()
    }

    fun dismissDialog() {
        progressDialog!!.dismiss()
    }


}