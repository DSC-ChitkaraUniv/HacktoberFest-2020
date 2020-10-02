//
//
//  CalculatorViewController.swift
//  Tipsy
//
//  Created by Neeraj Gupta on 29/09/20.
//

import UIKit

class CalculatorViewController: UIViewController {
    var buttonPressed : String = "0%"
    var calculatorBrain = CalculatorBrain(bill: "0.0", persons: "0.0")
    @IBOutlet weak var billTextField: UITextField!
    @IBOutlet weak var zeroPercentButton: UIButton!
    @IBOutlet weak var tenPercentButton: UIButton!
    @IBOutlet weak var splitNumberLabel: UILabel!
    @IBOutlet weak var twentyPercentButton: UIButton!
    
    
    @IBAction func tipChanged(_ sender: UIButton) {
        buttonPressed = sender.currentTitle!
        if buttonPressed == "0%" {
            zeroPercentButton.isSelected = true
            tenPercentButton.isSelected = false
            twentyPercentButton.isSelected = false
        } else if buttonPressed == "10%" {
            zeroPercentButton.isSelected = false
            tenPercentButton.isSelected = true
            twentyPercentButton.isSelected = false
        } else {
            zeroPercentButton.isSelected = false
            tenPercentButton.isSelected = false
            twentyPercentButton.isSelected = true
        }
        billTextField.endEditing(true)
    }
    
    @IBAction func stepperValueChanged(_ sender: UIStepper) {
        splitNumberLabel.text = String(format: "%.0f", sender.value)
    }
    @IBAction func calculatePressed(_ sender: UIButton) {
        calculatorBrain = CalculatorBrain(bill: billTextField?.text ?? "0.0", persons: splitNumberLabel?.text ?? "2")
        calculatorBrain.getTip(buttonPressed : buttonPressed)
        print(calculatorBrain.getTotal())
        performSegue(withIdentifier: "goToResults", sender: self)
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "goToResults" {
            let destinationVC = segue.destination as! ResultsViewController
            destinationVC.total = calculatorBrain.getTotal()
            destinationVC.person = splitNumberLabel.text ?? "0.0"
            destinationVC.tip = buttonPressed
        }
    }
}

