package br.com.fiap.a21game

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    lateinit var ivLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ivLogo = findViewById(R.id.ivLogo)
        
        carregar()
    }

    fun carregar(){
        val animacao = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)
        ivLogo.clearAnimation()
        ivLogo.startAnimation(animacao)
    }
}
