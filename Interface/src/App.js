import { useState } from "react";
import HomeScreen from "./Components/Home/HomeScreen";
import LoginForm from "./Components/Login/LoginForm";
import ErrorModal from "./Components/UI/ErrorModal";
import NavBar from "./Components/NavBar";

import styles from "./App.module.css";

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [isValid, setIsValid] = useState(true);

  const loggedInHandler = () => {
    setIsLoggedIn(true);
  };

  const isNotLoggedInHandler = () => {
    setIsLoggedIn(false);
  };

  const isValidHandler = () => {
    setIsValid(true);
  };

  const isNotValidHandler = () => {
    setIsValid(false);
  };

  return (
    <>
    {isLoggedIn && <NavBar onClose={isNotLoggedInHandler}/>}
      <div className={styles.container}>
        {!isValid && <ErrorModal onClose={isValidHandler} />}
        {isLoggedIn ? (
          <HomeScreen onExit={isNotLoggedInHandler} />
        ) : (
          <LoginForm
            onLoggedIn={loggedInHandler}
            onFailedValidation={isNotValidHandler}
          />
        )}
      </div>
    </>
  );
}

export default App;
