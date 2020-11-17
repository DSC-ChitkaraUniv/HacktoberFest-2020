import 'package:flutter/material.dart';
class Button extends StatelessWidget {
  final String _value;
  final Function _func;
  final num _flex;
  final Color _bgcolor;
  final Color _fcolor;
  final double _fsize;

  Button(this._value,this._func,this._flex,this._bgcolor,this._fsize, this._fcolor);

  @override
  Widget build(BuildContext context) {
    return Expanded(
      flex: this._flex,
      child: Container(
        padding: EdgeInsets.all(5),
        child: FlatButton(
          shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(1000)),
          child: Text(
            this._value,
            style: TextStyle(
              color: this._fcolor,
              fontSize: this._fsize,
            ),
          ),
          onPressed: this._func,
          color:this._bgcolor,
        ),
      ),
    );
  }
}
