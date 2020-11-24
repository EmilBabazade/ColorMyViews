package babazade.emil.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val views = listOf<View>(
            box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, constr_layout,
            button_green, button_red, button_yellow
        )

        for (view in views)
            view.setOnClickListener(::setListener)
    }

    private fun setListener(v: View) {
        when (v.id) {
            R.id.box_one_text -> v.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> v.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> v.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> v.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> v.setBackgroundResource(android.R.color.holo_green_light)
            R.id.button_green -> box_three_text.setBackgroundResource(R.color.my_green)
            R.id.button_red -> box_four_text.setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> box_five_text.setBackgroundResource(R.color.my_yellow)
            else -> v.setBackgroundColor(Color.LTGRAY)
        }
    }
}