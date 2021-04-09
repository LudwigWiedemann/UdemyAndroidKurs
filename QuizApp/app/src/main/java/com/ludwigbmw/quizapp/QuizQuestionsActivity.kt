package com.ludwigbmw.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mUserName: String? = null
    private var mCurrentPosition = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        mUserName = intent.getStringExtra(Constants.USER_NAME)

        // lade neue Frage
        setQuestion()

        // OnClickListener für die vier Fragen und submitbutton
        tvOptionOne.setOnClickListener(this)
        tvOptionTwo.setOnClickListener(this)
        tvOptionThree.setOnClickListener(this)
        tvOptionFour.setOnClickListener(this)
        btnSubmit.setOnClickListener(this)

    }
    private fun setQuestion() {
        mQuestionList = Constants.getQuestions()
        if(mCurrentPosition == mQuestionList!!.size) {
            btnSubmit.text = "BEENDEN"
        }
        btnSubmit.text = "BESTÄTIGEN"
        defaultOptionsView()

        val question = mQuestionList!![mCurrentPosition-1]

        progressBar.progress = mCurrentPosition
        tvProgress.text = "$mCurrentPosition/" + progressBar.max

        tvQuestion.text = question!!.question
        ivFlag.setImageResource(question.image)
        tvOptionOne.text = question.optionOne
        tvOptionTwo.text = question.optionTwo
        tvOptionThree.text = question.optionThree
        tvOptionFour.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tvOptionOne)
        options.add(1, tvOptionTwo)
        options.add(2, tvOptionThree)
        options.add(3, tvOptionFour)

        for(option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.tvOptionOne -> {
                selectedOptionView(tvOptionOne, 1)
            }
            R.id.tvOptionTwo -> {
                selectedOptionView(tvOptionTwo, 2)
            }
            R.id.tvOptionThree -> {
                selectedOptionView(tvOptionThree, 3)
            }
            R.id.tvOptionFour -> {
                selectedOptionView(tvOptionFour, 4)
            }
            R.id.btnSubmit -> {
                if(mSelectedOption == 0) {
                   mCurrentPosition++
                    when{
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, mUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition-1)
                    if(mSelectedOption != question!!.correctAnswer) {
                        answerView(mSelectedOption, R.drawable.wrong_option_border)
                    } else {
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border)
                    if(mCurrentPosition == mQuestionList!!.size) {
                        btnSubmit.text = "BEENDEN"
                    }
                    btnSubmit.text = "NÄCHSTE FRAGE"
                    mSelectedOption = 0

                }
            }

        }
    }

    private fun answerView(answer: Int,drawableView: Int) {
       when(answer) {
           1 -> {
               tvOptionOne.background = ContextCompat.getDrawable(this, drawableView)
           }

           2 -> {
               tvOptionTwo.background = ContextCompat.getDrawable(this, drawableView)
           }

           3 -> {
               tvOptionThree.background = ContextCompat.getDrawable(this, drawableView)
           }

           4 -> {
               tvOptionFour.background = ContextCompat.getDrawable(this, drawableView)
           }
       }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOption = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border
        )
    }
}