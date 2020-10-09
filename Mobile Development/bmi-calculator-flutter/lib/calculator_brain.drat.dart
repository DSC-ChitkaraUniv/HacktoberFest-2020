import 'dart:math';
class CalculatorBrain{
  CalculatorBrain({this.height,this.weight});
  final int height;
  final int weight;

  double _bmi;

  String calculateBMI(){
     _bmi=weight/pow(height/100,2);
    return _bmi.toStringAsFixed(1);
  }

  String getResult(){
    if(_bmi>=25){
      return 'OverWieght';
    }
    else if(_bmi>18.5){
      return 'Normal';
    }
    else{
      return 'UnderWieght';
    }
  }

  String getinterperation(){

    if(_bmi>=25){
      return 'You have a higher BMI than normal body weight. Try to exercise more.';
    }
    else if(_bmi>18.5){
      return 'You have a normal body weight. Good Job!';
    }
    else{
      return 'You have a lower than the normal body weight. You can eat a bit more.';
    }
  }
}
