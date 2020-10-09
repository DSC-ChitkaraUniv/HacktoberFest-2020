import 'package:flutter/material.dart';
import 'constants.dart';
import 'package:bmi_calculator/Component/reusable_card.dart';
import 'package:bmi_calculator/Component/BottomContent.dart';

class ResultPage extends StatelessWidget {

  ResultPage({@required this.bmiResults,@required this.resultText,@required this.interpretation});

  final String bmiResults;
  final String resultText;
  final String interpretation;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('BMI CALCULATOR'),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: <Widget>[
          Expanded(
            child: Container(
              padding:EdgeInsets.all(15.0) ,
              alignment: Alignment.bottomLeft,
              child:Text('Your Result', style: kTitlteTExtstyle,
              ),
            ),
          ),
          Expanded(
            flex: 5,
            child:ReusableCard(colour: kActiveCardColour,
              cardChild: Column(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                crossAxisAlignment: CrossAxisAlignment.center,
                children: <Widget>[
                  Text(resultText.toUpperCase(), style: kResultTextStyle,),
                  Text(bmiResults,style: kBmiTextStyle,),
                  Text(
                    interpretation,
                    textAlign: TextAlign.center,
                    style: kBodyTextStyle,
                  ),
                ],

              ),
            ),

          ),

          BottomButton( buttonTitle: 'Recalculate',onTap: (){
            Navigator.pop(context);
          },)
        ],
      ),
    );
  }
}
