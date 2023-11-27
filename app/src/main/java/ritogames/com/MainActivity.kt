package ritogames.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<ImageButton>(R.id.login)
        login.setOnClickListener {
            val Intent= Intent(this,menu::class.java)
            startActivity(Intent)
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val Intent= Intent(this,CrearCuenta::class.java)
            startActivity(Intent)
        }
    }

}