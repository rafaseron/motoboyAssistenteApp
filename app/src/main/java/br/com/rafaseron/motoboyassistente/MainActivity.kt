package br.com.rafaseron.motoboyassistente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //iniciando as variaveis que usaremos
    lateinit var ifoodTelefone : EditText
    lateinit var ifoodID : EditText
    lateinit var telefoneDDI : EditText
    lateinit var telefone : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun setupViews(){
            ifoodTelefone = findViewById(R.id.edtIfood_telefone)
            ifoodID = findViewById(R.id.edtIfood_ID)
            telefoneDDI = findViewById(R.id.edtTelefone_DDI)
            telefone = findViewById(R.id.edtTelefone_numero)
        }
        setupViews()
        fun botaoIfood(){
            val telefoneIfoodCompleto = (ifoodTelefone.toString())+";"+(ifoodID.toString())
        }
        botaoIfood()


    }
}