import Card from "./Card";

import styles from "./ErrorModal.module.css";

const ErrorModal = (props) => {
  return (
    <div className={styles.backdrop} onClick={props.onClose}>
      <div className={styles.modal}>
        <Card>
          <header>Error al ingresar</header>
          <p>El usuario o contraseña es incorrecto</p>
          <button onClick={props.onClose}>Cerrar</button>
        </Card>
      </div>
    </div>
  );
};

export default ErrorModal;
