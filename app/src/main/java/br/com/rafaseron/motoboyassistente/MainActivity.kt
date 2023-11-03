package br.com.rafaseron.motoboyassistente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //iniciando as variaveis que usaremos
    lateinit var ifoodTelefone : EditText
    lateinit var ifoodID : EditText
    lateinit var telefoneDDI : EditText
    lateinit var telefone : EditText

    //botoes para setOnClickListener
    lateinit var btnIfood : Button
    lateinit var btnWhatsapp : Button

    //TextView para voltar resultados
    lateinit var txtWhatsapp : TextView
    lateinit var txtIfood : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun setupViews(){
            ifoodTelefone = findViewById(R.id.edtIfood_telefone)
            ifoodID = findViewById(R.id.edtIfood_ID)
            telefoneDDI = findViewById(R.id.edtTelefone_DDI)
            telefone = findViewById(R.id.edtTelefone_numero)
            btnIfood = findViewById(R.id.btnIfoodLigar)
            btnWhatsapp = findViewById(R.id.btnMensagem)
            txtWhatsapp = findViewById(R.id.txtWhatsappCompleto)
            txtIfood = findViewById(R.id.txtIfoodTelefoneCompleto)
        }
        setupViews()

        fun ifoodCompleto(){
            val telefoneIfoodCompleto = "0800"+(ifoodTelefone.toString())+";"+(ifoodID.toString())
            txtIfood.text = telefoneIfoodCompleto
        }

        fun whatsappCompleto(){
            val telefoneWhatsappCompleto = "wa.me/"+(telefoneDDI.toString())+(telefone.toString())
            txtWhatsapp.text = telefoneWhatsappCompleto

        }

        fun setupListeners(){
            btnIfood.setOnClickListener(){ifoodCompleto()
            }
            btnWhatsapp.setOnClickListener(){whatsappCompleto()
            }

        }
        setupListeners()


    }
}