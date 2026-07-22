import React, { Component } from "react";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({
      isLoggedIn: true
    });
  };

  handleLogout = () => {
    this.setState({
      isLoggedIn: false
    });
  };

  render() {

    let button;
    let page;

    if (this.state.isLoggedIn) {
      button = <LogoutButton onClick={this.handleLogout} />;
      page = <UserPage />;
    } else {
      button = <LoginButton onClick={this.handleLogin} />;
      page = <GuestPage />;
    }

    return (
      <div style={{ textAlign: "center", marginTop: "30px" }}>
        <h1>Ticket Booking Application</h1>

        {button}

        <hr />

        {page}
      </div>
    );
  }
}

export default App;