import Card from "../UI/Card";

import { useState, useEffect } from "react";
import useInput from "../../Hooks/useInput";
import styles from "./LoginForm.module.css";


/*
  REMPLAZO DEL HTTP RESPONSE
*/

const usuarios = [
  {
    email: "test@esDoctor.com",
    password: "test_test",
  },
  {
    email: "test@noEsDoctor.com",
    password: "test_test",
  },
];

/* 
  COMPONENTE DE REACT PARA EL RENDER DE EL LOGIN INICIAL
*/

const LoginForm = (props) => {
  const [empleados, setEmpleados] = useState(usuarios);
  const [formIsValid, setFormIsValid] = useState(false);

  const {
    enteredInput: enteredEmail,
    inputIsValid: emailIsValid,
    inputHasError: emailHasError,
    inputChangeHandler: emailChangeHandler,
    inputBlurHandler: emailBlurHandler,
    resetInput: resetEmailInput,
  } = useInput((value) => value.trim() !== "" && value.includes("@"));

  const {
    enteredInput: enteredPassword,
    inputIsValid: passwordIsValid,
    inputHasError: passwordHasError,
    inputChangeHandler: passwordChangeHandler,
    inputBlurHandler: passwordBlurHandler,
    resetInput: resetPasswordInput,
  } = useInput((value) => value.trim().length > 7);

  useEffect(() => {
    if (emailIsValid && passwordIsValid) {
      setFormIsValid(true);
    } else {
      setFormIsValid(false);
    }
  }, [emailIsValid, passwordIsValid]);

  const submitHandler = (event) => {
    event.preventDefault();

    if (!passwordIsValid || !emailIsValid) return;

    /*
      AQUI IRIA LA LOGICA DE LLAMAR A LA API Y VER SI EXISTEN EL FORM ES VALIDA
      SI LA RESPUESTA ES NEGATIVA DESPLEGAR UN OVERLAY CON EL MENSAJE CORRESPONDIENTE
      EN CASO CONTRARIO CONTINUAR Y AVANZAR ACTUALIZANDO EL SETEMPLEADOS
    */

    /* CODIGO DE PRUEBA */

    const validateUser = { email: enteredEmail, password: enteredPassword };
    const isValidUser = empleados.find(
      (user) =>
        user.email === validateUser.email &&
        user.password === validateUser.password
    );

    if (isValidUser) {
      resetPasswordInput();
      resetEmailInput();
      props.onLoggedIn();
    } else {
      resetPasswordInput();
      resetEmailInput();
      props.onFailedValidation();
    }
  };

  return (
    <Card>
      <form onSubmit={submitHandler}>
        <h1>Ingresar:</h1>
        <div>
          <label htmlFor="email">Correo: </label>
          <input
            id="email"
            type="email"
            onChange={emailChangeHandler}
            onBlur={emailBlurHandler}
            value={enteredEmail}
          />
          {emailHasError && (
            <p className={styles.error_text}>Email is not valid!!.</p>
          )}
        </div>
        <div>
          <label htmlFor="contraseña">Contraseña: </label>
          <input
            id="contraseña"
            type="password"
            onChange={passwordChangeHandler}
            onBlur={passwordBlurHandler}
            value={enteredPassword}
          />
          {passwordHasError && (
            <p className={styles.error_text}>Password is not Valid!!.</p>
          )}
        </div>
        <button className={styles.button} type="submit" disabled={!formIsValid}>
          Ingresar
        </button>
      </form>
    </Card>
  );
};

export default LoginForm;
