package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.entity.Jogadores
import com.example.quizapp.quiz.Constants
import com.example.quizapp.quiz.MainActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ResultActivity : AppCompatActivity() {
    private lateinit var firebaseReference: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        
        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val score = intent.getIntExtra(Constants.SCORE, 0)

        val congratulationsTv: TextView = findViewById(R.id.congratulationsTv)
        val scoreTv: TextView = findViewById(R.id.scoreTv)
        val btnRestart: Button = findViewById(R.id.btnRestart)

        congratulationsTv.text = "Parabéns, $userName!"
        scoreTv.text = "Seu score foi $score de $totalQuestions"

        firebaseReference = FirebaseDatabase.getInstance().getReference("jogadores")

        // Concatenação IDs únicos
        val jogadorId = firebaseReference.push().key!!
        val jogadores = Jogadores(jogadorId, userName, score)
        firebaseReference.child(jogadorId).setValue(jogadores)

        // Jogador Recente
        firebaseReference = FirebaseDatabase.getInstance().getReference("jogador_recente")
        firebaseReference.setValue("O usuário $userName atingiu um SCORE de $score pontos e acertou $score de 10 questões do Quiz!")

        btnRestart.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}