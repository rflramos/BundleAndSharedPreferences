package br.com.dsc.bundleandsharedpreferences

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.nio.file.Files.find

class MainActivity : AppCompatActivity() {

    //Declarar os componentes que estão no layout
    var nome: EditText? = null
    var telefone: EditText? = null
    var endereco: EditText? = null
    var rg: EditText? = null
    var cpf: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Capturar os dados digitados
        nome = findViewById(R.id.nome) as EditText
        telefone = findViewById(R.id.telefone) as EditText
        endereco = findViewById(R.id.endereco) as EditText
        rg = findViewById(R.id.rg) as EditText
        cpf = findViewById(R.id.cpf) as EditText

        //inserindo dados nas variaveis
        nome!!.setText("Rafael")
        telefone!!.setText("971034280")
        endereco!!.setText("Juan Vicente")
        rg!!.setText("xxxxxxx")
        cpf!!.setText("xxxxxxxxxx")

    }

    fun usarBundle(view: View) {

        //Recuperar dados digitados

        var myNome = nome!!.text
        var myTelefone = telefone!!.text
        var myEndereco = endereco!!.text
        var myRg = rg!!.text
        var myCpf = cpf!!.text

        //Verificar se todos os compos foram preenchidos
        if (myNome.isNotEmpty() && myTelefone.isNotEmpty()&& myEndereco.isNotEmpty()&& myRg.isNotEmpty()&& myCpf.isNotEmpty()) {

            val intent = Intent(this, RecuperandoDadosBundle::class.java)
            intent.putExtra("nome", myNome)
            intent.putExtra("telefone",myTelefone)
            intent.putExtra("endereco",myEndereco)
            intent.putExtra("rg", myRg)
            intent.putExtra("cpf", myCpf)
            startActivity(intent)

            //Mensagem a ser exibida na tela
            Toast.makeText(applicationContext,"Dados Armazenados", Toast.LENGTH_LONG).show()

        }else {
            Toast.makeText(applicationContext,"Dados obrigatórios",Toast.LENGTH_LONG).show()
        }
    }
}