
import 'dart:async';

import 'package:flutter/services.dart';

class Hello {
  static const MethodChannel _channel = MethodChannel('com.example.teste_mappedin');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future callActivity() async {
     await _channel.invokeMethod('mapa');
  }
}
