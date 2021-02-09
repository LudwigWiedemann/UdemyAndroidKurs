package de.panjutorials.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class QuizQuestionsActivity : AppCompatActivity() {

    // Variable für Nutzernamen
    private var userName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        // Liest den extra String aus dem Intent aus und speichert diesen
        // in der Variable userName
        userName = intent.getStringExtra(Constants.USER_NAME)

        // Liste mit Fragen holen
        val questionList = Constants.getQuestions()
        // Größe der Liste in LogCat mit dem Tag "Fragen" ausgeben
        Log.i("Fragen", "${questionList.size}")
    }
}