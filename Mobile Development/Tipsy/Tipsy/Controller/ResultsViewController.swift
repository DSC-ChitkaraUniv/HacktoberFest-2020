//
//  ResultsViewController.swift
//  Tipsy
//
//  Created by Neeraj Gupta on 29/09/20.s
//

import UIKit

class ResultsViewController: UIViewController {
    var total : Float = 0.0
    var person : String = "0.0"
    var tip : String = "0.0"
    @IBOutlet weak var settingsLabel: UILabel!
    @IBOutlet weak var totalLabel: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        totalLabel.text = String(format : "%0.1f" , total)
        settingsLabel.text = "Split between \(person) persons, with \(tip) tip."
        
    }
    @IBAction func recalculatePressed(_ sender: UIButton) {
        dismiss(animated: true, completion: nil)
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
