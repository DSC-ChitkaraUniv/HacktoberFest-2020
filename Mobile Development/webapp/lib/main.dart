import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'web_view.dart';

void main() => runApp(MaterialApp(home: Mainpage()));



class Mainpage extends StatefulWidget {
  @override
  _MainpageState createState() => _MainpageState();
}

class _MainpageState extends State<Mainpage> {
  TextEditingController _controller=new TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
          backgroundColor: Colors.white,
          appBar: AppBar(
            title: Text("WebView"),
          ),
          body: Center(
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[


                     Padding(
                      padding: EdgeInsets.only(left:120),
                      child: TextField(
                        controller: _controller,
                        autocorrect: true,
                        decoration: InputDecoration(
                          border: InputBorder.none,
                          hintText: "Website Name",
                          hintStyle:  GoogleFonts.robotoCondensed(
                            textStyle:TextStyle(color: Color(0xFFE1E1E1), fontSize: 20),),


                        ),
                      ),
                    ),
                Padding(
                  padding: EdgeInsets.only(left:MediaQuery.of(context).size.height / 20,right:MediaQuery.of(context).size.height / 20),
                  child: Divider(
                    height: 2.0,
                    color: Colors.black87,
                  ),
                ),
                FlatButton(
                  onPressed: () async {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context)=>MyApp(name:_controller.text),),);
                  },
                  color: Colors.blueAccent,
                  child: Text(
                    "Go To Website",style:  GoogleFonts.robotoCondensed(
                    textStyle:TextStyle(
                      color: Colors.black87,
                      fontWeight: FontWeight.bold,
                      fontSize: 20,
                    ),),
                  ),

                ),
              ],
            ),
          )
    );
  }
}

