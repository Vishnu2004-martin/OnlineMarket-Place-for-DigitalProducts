import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Signup from "./Signup";
import Login from "./Login";
import Page from "./Page";
import './App.css';

function App() {
  return (
    <div className="App background-cover">
      <Router>
        <Routes>
          <Route exact path="/" element={<Login />} />
          <Route path="/signup" element={<Signup />} />
          <Route path="/Page" element={<Page />} /> {/* Add this route for the Home page */}
        </Routes>
      </Router>
    </div>
  );
}

export default App;
