import 'package:flutter/material.dart';
import 'buttons.dart';
import 'cal.dart';
class CalculatorPortrait extends StatefulWidget {
  final String str;
  final String title;
  CalculatorPortrait({Key key, @required this.str, @required this.title}):super(key:key);
  @override
  _CalculatorPortraitState createState() => _CalculatorPortraitState(this.str);
}

class _CalculatorPortraitState extends State<CalculatorPortrait> {
  String _str;
  _CalculatorPortraitState(this._str);

  void _update(String val){
    Compute.add(val);
    setState(() {
      this._str=Compute.str;
    });
  }
  void _ac(){
    Compute.AC();
    setState(() {
      this._str = Compute.str;
    });
  }
  void _del(){
    Compute.del();
    setState(() {
      this._str = Compute.str;
    });
  }
  void _compute(){
    if(Compute.str.compareTo('0') != 0){
      setState(() {
        this._str = Compute.computer();
        Compute.str = this._str;
      });
    }
  }


  @override
  void initState() {
    super.initState();
    setState(() {
      this._str=Compute.str;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: [
          Expanded(
            child: Container(
              alignment: Alignment.bottomRight,
              child: Padding(
                padding: EdgeInsets.fromLTRB(15, 15, 15, 20),
                child: Text(
                  _str,
                  textScaleFactor: 3.0,
                  style: TextStyle(
                    fontSize: 20.0
                  ),
                  textAlign: TextAlign.right,
                ),
              ),
            ),
          ),
          Expanded(
            flex: 1,
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Button('AC',(){_ac();},3,Colors.red,20,Colors.white),
                Button('⌫',(){_del();},3,Colors.orangeAccent,30,Colors.white),
                Button('÷',(){_update('÷');},2,Colors.blueAccent,40,Colors.white),
              ],
            ),
          ),
          Expanded(
            flex: 1,
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Button('7',(){_update('7');},3,Colors.black,30,Colors.greenAccent),
                Button('8',(){_update('8');},3,Colors.black,30,Colors.greenAccent),
                Button('9',(){_update('9');},3,Colors.black,30,Colors.greenAccent),
                Button('⨯',(){_update('⨯');},3,Colors.blueAccent,50,Colors.white),
              ],
            ),
          ),
          Expanded(
            flex: 1,
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Button('4',(){_update('4');},3,Colors.black,30,Colors.greenAccent),
                Button('5',(){_update('5');},3,Colors.black,30,Colors.greenAccent),
                Button('6',(){_update('6');},3,Colors.black,30,Colors.greenAccent),
                Button('-',(){_update('-');},3,Colors.blueAccent,50,Colors.white),
              ],
            ),
          ),
          Expanded(
            flex: 1,
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Button('1',(){_update('1');},3,Colors.black,30,Colors.greenAccent),
                Button('2',(){_update('2');},3,Colors.black,30,Colors.greenAccent),
                Button('3',(){_update('3');},3,Colors.black,30,Colors.greenAccent),
                Button('+',(){_update('+');},3,Colors.blueAccent,40,Colors.white),
              ],
            ),
          ),
          Expanded(
            flex: 1,
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: [
                Button('0',(){_update('0');},6,Colors.black,30,Colors.greenAccent),
                Button('.',(){_update('.');},3,Colors.black,30,Colors.greenAccent),
                Button('=',(){_compute();},3,Colors.green,40,Colors.white),
              ],
            ),
          ),
        ],
      ),
    );
  }
}
