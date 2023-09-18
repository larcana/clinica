import { useState } from "react"

const useInput = (validation) => {
  const [enteredInput, setEnteredInput] = useState("");
  const [inputIsTouched, setInputIsTouched] = useState(false);

  const inputIsValid = validation(enteredInput);
  const inputHasError = !inputIsValid && inputIsTouched;

  const inputChangeHandler = (event) => {
    setEnteredInput(event.target.value)
  }

  const inputBlurHandler = () => {
    setInputIsTouched(true);
  }

  const resetInput = () => {
    setEnteredInput("");
    setInputIsTouched(false);
  }

  return {
    enteredInput,
    inputIsValid,
    inputHasError,
    inputChangeHandler,
    inputBlurHandler,
    resetInput,
  }


}

export default useInput