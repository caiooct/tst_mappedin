package com.example.hello_example

import android.content.Intent
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, "com.example.teste_mappedin").setMethodCallHandler {
            call, _ ->
            when(call.method) {
                "mapa" -> {
                    val intent = Intent(this@MainActivity, MapaActivity::class.java)
                    startActivity(intent)
                }
                else -> {

                }
            }

        }
    }

}
