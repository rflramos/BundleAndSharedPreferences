package br.com.dsc.bundleandsharedpreferences

import android.os.Bundle
import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_recuperando_dados_bundle.*
import org.w3c.dom.Text

class RecuperandoDadosBundle : AppCompatActivity() {

    //Declarando os dados que estão no layout

    var nome: TextView? = null
    var telefone: TextView? = null
    var endereco: TextView? = null
    var rg: TextView? = null
    var cpf: TextView? = null


    //recuperando os dados digitados
    var myNome: String? = null
    var myTelefone: String? = null
    var myEndereco: String? = null
    var myRg: String? = null
    var myCpf: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperando_dados_bundle)

        //Capturando os dados na tela
        nome = findViewById(R.id.nome) as TextView
        telefone = findViewById(R.id.telefone) as TextView
        endereco = findViewById(R.id.endereco) as TextView
        rg = findViewById(R.id.rg) as TextView
        cpf = findViewById(R.id.cpf) as TextView

        val bundle = intent.extras
        myNome = bundle.get("nome").toString()
        myTelefone = bundle.get("telefone").toString()
        myEndereco = bundle.get("endereco").toString()
        myRg = bundle.get("rg").toString()
        myCpf = bundle.get("cpf").toString()

        nome!!.setText(myNome)
        telefone!!.setText(myTelefone)
        endereco!!.setText(myEndereco)
        rg!!.setText(myRg)
        cpf!!.setText(myCpf)

    }

}
