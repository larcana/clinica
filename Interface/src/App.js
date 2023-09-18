import { useState } from "react";
import HomeScreen from "./Components/Home/HomeScreen";
import Card from "./Components/UI/Card";
import LoginForm from "./Components/Login/LoginForm";
import ErrorModal from "./Components/UI/ErrorModal"

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
    <Card>
      {!isValid && <ErrorModal onClose={isValidHandler}/>}
      {isLoggedIn ? (
        <HomeScreen onExit={isNotLoggedInHandler} />
      ) : (
        <LoginForm
          onLoggedIn={loggedInHandler}
          onFailedValidation={isNotValidHandler}
        />
      )}
    </Card>
  );
}

export default App;
