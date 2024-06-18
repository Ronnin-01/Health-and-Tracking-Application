package com.bldsht.runnnboyrun

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.bldsht.runnnboyrun.DataClass.Run
import com.bldsht.runnnboyrun.DataClass.RunDAO
import dagger.android.AndroidInjection
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
     lateinit var runDao: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Log.d("runDao","RunDao: ${runDao}")


    }
}