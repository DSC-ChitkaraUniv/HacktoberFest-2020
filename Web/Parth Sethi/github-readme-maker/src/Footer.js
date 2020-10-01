import React from "react";

export default function Footer() {
  return (
    <footer className="page-footer grey darken-3">
      <div className="container">
        <div className="row">
          <div className="col s12 l6">
            <h5>About Github Readme Maker</h5>
            <p>
              Github Readme Maker provides very handy formatting buttons and
              shortcuts, based on the WYSIWYG-style Markdown editor used by
              Stack Overflow.
            </p>
          </div>
          <div className="col s12 l4 offset-l2">
            <h5>Features</h5>
            <ul>
              <li>
                <p className="grey-text text-lighten-3">Inbuilt Templates</p>
              </li>
              <li>
                <p className="grey-text text-lighten-3">
                  GitHub Flavored Markdown
                </p>
              </li>
              <li>
                <p className="grey-text text-lighten-3">
                  Live preview with Scroll Sync
                </p>
              </li>
              <li>
                <p className="grey-text text-lighten-3">Emojis Support</p>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div className="footer-copyright grey darken-4">
        <div className="container center-align">&copy; 2020 <a href="https://github.com/victorakaps">Victorakaps</a></div>
      </div>
    </footer>
  );
}
