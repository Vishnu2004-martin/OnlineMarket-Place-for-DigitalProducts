import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom'; // Import the necessary hook
import { getData } from './Service/Api';

const Login = () => {
  const navigate = useNavigate(); // Declare navigate function
  const [formData, setFormData] = useState({
    username: "",
    password: "",
  });

  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState(null); // Add an error state

  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleLogin = () => {
    if (!username) {
      setError("Please enter your username."); // Set an error message for missing username
      return; // Return early to prevent further execution
    }
  
    console.log(formData);
    getData(formData)
      .then((result) => {
        console.log(result);
        // Assuming result includes authentication information
        if (result.success) {
          navigate('/Page'); // Navigate to the Home page when login is successful
        } else {
          setError("Invalid credentials. Please try again."); // Set an error message
          // Optionally, you can navigate to the home page when the error occurs
           // This will navigate to the home page regardless of success or failure
           navigate('/Page');
        }
      })
      .catch((err) => {
        console.log(err);
        setError("An error occurred while logging in."); // Set an error message
      });
  };
  
  const handleSignUp = () => {
    navigate('/signup');
  }

  return (
    <div className="login-container">
      <h2 className="h1">Online MarketPlace For DigitalProducts</h2>
      <form className="login-form">
       
        <div className="form-group">
          <label htmlFor="username">Username</label>
          <input
            type="text"
            id="username"
            value={username}
            onChange={handleUsernameChange}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="password">Password</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={handlePasswordChange}
            required
          />
        </div>
        {error && <p className="error">{error}</p>} {/* Display the error message if there is an error */}
        <button type="button" onClick={handleLogin}>Login</button>
        <button type="button" onClick={handleSignUp}>Sign Up</button>
      </form>
    </div>
  );
};

export default Login;
