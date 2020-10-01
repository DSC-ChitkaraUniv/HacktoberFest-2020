import 'package:flutter/material.dart';
import 'package:flutterapp/widgets/calculatorPortrait.dart';
import 'package:flutterapp/widgets/calculatorLandscape.dart';
void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Simple Calcultor',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      darkTheme: ThemeData.dark(),
      home: Calculator(title: 'Calculator'),
    );
  }
}

class Calculator extends StatefulWidget {
  Calculator({Key key, this.title}) : super(key: key);
  final String title;

  @override
  _CalculatorState createState() => _CalculatorState();
}

class _CalculatorState extends State<Calculator> {
  String _str;
  @override
  void initState() {
    super.initState();
    _str = '0';
  }
  @override
  Widget build(BuildContext context) {
    final mediaquery = MediaQuery.of(context);
    if(mediaquery.orientation == Orientation.landscape){
      return CalculatorLandscape(key: widget.key, title: widget.title, str: this._str,);
    }
    return CalculatorPortrait(key: widget.key, title: widget.title, str: this._str,);
  }
}
