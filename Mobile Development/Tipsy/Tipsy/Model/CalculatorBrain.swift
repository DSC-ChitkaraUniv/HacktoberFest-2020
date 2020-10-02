//
//  CalculatorBrain.swift
//  Tipsy
//
//  Created by Neeraj Gupta on 29/09/20.
//

import Foundation

struct CalculatorBrain {
    
    var tip : Float = 0.0
    var bill : String
    var persons : String
    mutating func getTip( buttonPressed : String) {
        if buttonPressed == "0%" {
            tip = 0.0
//            print("0")
        } else if buttonPressed == "10%" {
            tip = 0.1
//            print("0.1")
        } else if buttonPressed == "20%" {
            tip = 0.2
//            print("0.2")
        }
    }
    
    func getTotal() -> Float {
        let billInFloat : Float = (bill as NSString).floatValue
        let personsInFloat : Float = (persons as NSString).floatValue
        print(billInFloat)
        print(personsInFloat)
        print(tip)
        return (billInFloat + (billInFloat * tip))/personsInFloat
    }
    
}
