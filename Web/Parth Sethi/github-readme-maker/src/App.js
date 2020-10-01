import React from "react";
import marked from "marked";
import autosize from "autosize";
class App extends React.Component {
  state = {
    inputText: "",
  };
  updateTextArea = () => {
    this.textarea.focus();
    autosize(this.textarea);
  };
  updateOutput = () => {
    this.handleChange();
    const height = document.getElementById("output").clientHeight;
    document.getElementById("input").style.height = `${height}px`;
  };
  addProfile = () => {
    fetch("profile1.txt")
      .then((response) => response.text())
      .then((text) => {
        document.getElementById("input").value = text;
        this.updateOutput();
      });
  };
  sampleOne = () => {
    fetch("sample1.txt")
      .then((response) => response.text())
      .then((text) => {
        document.getElementById("input").value = text;
        this.updateOutput();
      });
  };
  sampleTwo = () => {
    fetch("sample2.txt")
      .then((response) => response.text())
      .then((text) => {
        document.getElementById("input").value = text;
        this.updateOutput();
      });
  };
  downloadReadMeFile = () => {
    const element = document.createElement("a");
    const file = new Blob([this.state.inputText], {
      type: "text/plain",
    });
    element.href = URL.createObjectURL(file);
    element.download = "README.md";
    document.body.appendChild(element); // Required for this to work in FireFox
    element.click();
  };
  componentDidMount() {
    this.updateTextArea();
  }
  handleChange = () => {
    const ele = document.getElementById("input");
    this.setState({
      inputText: ele.value,
    });
  };
  getMarkdownText() {
    var rawMarkup = marked(this.state.inputText, { sanitize: true });
    return { __html: rawMarkup };
  }
  render() {
    const { inputText } = this.state;
    return (
      <div className="App">
        <header>
          <nav className="nav-wrapper transparent">
            <div className="container">
              <a href="https://github.com/victorakaps/github-readme-maker" className="brand-logo">
                <h4>Github Readme Maker</h4>
              </a>
              <ul className="right hide-on-med-and-down">
                <li>
                  <button className="btn-color" onClick={this.sampleOne}>
                    TEMPLATE-1
                  </button>
                </li>
                <li>
                  <button className="btn-color" onClick={this.sampleTwo}>
                    TEMPLATE-2
                  </button>
                </li>
                <li>
                  <button className="btn-color" onClick={this.addProfile}>
                    PROFILE-1
                  </button>
                </li>
              </ul>
            </div>
          </nav>
        </header>
        <div className="main">
          <div className="row">
            <div className="col s12 l6">
              <textarea
                id="input"
                value={inputText}
                onChange={this.handleChange}
                placeholder="Write MarkDown Here..."
                ref={(c) => (this.textarea = c)}
              />
            </div>
            <div className="col s12 l6" id="output">
              <p dangerouslySetInnerHTML={this.getMarkdownText()}></p>
            </div>
          </div>
        </div>
        <center>
          <button
            className="btn-color btn-main center"
            onClick={this.downloadReadMeFile}
          >
            Download README.MD
          </button>
        </center>
      </div>
    );
  }
}

export default App;
