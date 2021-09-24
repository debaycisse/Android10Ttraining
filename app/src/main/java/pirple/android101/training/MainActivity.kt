package pirple.android101.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // get the input elements
    lateinit var insertText : EditText
    lateinit var displayInsertedText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // linkup text elements
        displayInsertedText = findViewById(R.id.textDisplayed)
        insertText = findViewById(R.id.insertTextInput)
    }

    fun displayInsertedTextButton(view : View){
        // get text from the edit text element
        val textFromInput = insertText.text.toString()

        // display the text, gotten from edit text
        displayInsertedText.text = textFromInput
    }
}