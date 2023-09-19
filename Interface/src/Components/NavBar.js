import styles from "./NavBar.module.css";
import img from "./logo.png";

const NavBar = (props) => {
  return (
    <nav className={styles.nav}>
      <img src={img} alt="logo de la clinica" />
      <ul>
        <li>
          <a>Agenda</a>
        </li>
        <li>
          <a>Paciente</a>
        </li>
        <li>
          <a>Nuevo Paciente</a>
        </li>
        <li>
          <button onClick={props.onClose}>Salir</button>
        </li>
      </ul>
    </nav>
  );
};

export default NavBar;
