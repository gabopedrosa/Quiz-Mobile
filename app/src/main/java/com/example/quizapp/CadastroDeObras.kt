package com.example.quizapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.quizapp.databinding.ActivityCadastroDeObrasBinding

class CadastroDeObras : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroDeObrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroDeObrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}