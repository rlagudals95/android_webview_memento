//package com.example.webview_boillerplate.service
//
//import android.annotation.SuppressLint
//import android.content.pm.PackageInfo
//import android.content.pm.PackageManager
//import android.util.Base64
//import android.util.Log
//import com.google.android.material.internal.ContextUtils.getActivity
//import java.security.MessageDigest
//import java.security.NoSuchAlgorithmException
//
//class getHashkey {
//
//    @SuppressLint("RestrictedApi")
//    fun getHashKey() {
//        //var packageManager : PackageManager =  getActivity().getPackageManager();
//
//        var packageInfo: PackageInfo? = null
//        try {
//            packageInfo = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
//        } catch (e: PackageManager.NameNotFoundException) {
//            e.printStackTrace()
//        }
//        if (packageInfo == null) Log.e("KeyHash", "KeyHash:null")
//        for (signature in packageInfo!!.signatures) {
//            try {
//                val md: MessageDigest = MessageDigest.getInstance("SHA")
//                md.update(signature.toByteArray())
//                Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT))
//            } catch (e: NoSuchAlgorithmException) {
//                Log.e("KeyHash", "Unable to get MessageDigest. signature=$signature", e)
//            }
//        }
//    }
//}