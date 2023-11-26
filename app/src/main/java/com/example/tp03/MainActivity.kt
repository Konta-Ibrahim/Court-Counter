package com.example.tp03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var scoreTeamA = 0
    private var scoreTeamB = 0

    private var savedNameA = "Team A"
    private var savedNameB = "Team B"

    private var savedScoreA = 0
    private var savedScoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayForTeamA(scoreTeamA)
    }

    /**
     * Displays the given score for Team A.
     */
    private fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.score_a_textview)
        scoreView.text = score.toString()
    }

    fun displayPoints3A(view: View) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }

    fun displayPoints2A(view: View) {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }

    fun displayPoints1A(view: View) {
        scoreTeamA++
        displayForTeamA(scoreTeamA)
    }

    private fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.score_b_textview)
        scoreView.text = score.toString()
    }

    fun displayPoints3B(view: View) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }

    fun displayPoints2B(view: View) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    fun displayPoints1B(view: View) {
        scoreTeamB++
        displayForTeamB(scoreTeamB)
    }

    fun reset(view: View) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)

        val teamA = findViewById<EditText>(R.id.team_a_textview)
        val teamB = findViewById<EditText>(R.id.team_b_textview)
        teamA.setText("Team A")
        teamB.setText("Team B")
    }

    fun save(view: View) {
        val teamA = findViewById<EditText>(R.id.team_a_textview)
        val teamB = findViewById<EditText>(R.id.team_b_textview)

        savedNameA = teamA.text.toString()
        savedNameB = teamB.text.toString()

        savedScoreA = scoreTeamA
        savedScoreB = scoreTeamB
    }

    fun load(view: View) {
        val teamA = findViewById<EditText>(R.id.team_a_textview)
        val teamB = findViewById<EditText>(R.id.team_b_textview)
        teamA.setText(savedNameA)
        teamB.setText(savedNameB)

        scoreTeamA = savedScoreA
        scoreTeamB = savedScoreB

        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }
}

