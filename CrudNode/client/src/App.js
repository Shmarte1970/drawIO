import "./App.css";
import {useState} from "react"
import Axios from "axios"



function App() {


  const [nombre,setNombre] = useState("");
  const [nacimiento,setNacimiento] = useState(Date);
  const [pais,setPais] = useState("");
  const [cargo,setCargo] = useState("");

  const add = ()=>{
    Axios.post("http://ddbbcrud.c00tjquuyvht.eu-north-1.rds.amazonaws.com:3006/create",{
      nombre:nombre,
      nacimiento:nacimiento,
      pais:pais,
      cargo:cargo
    }).then(()=>{
      alert("Usuario registrado");
    });
  }
  

  return (
    <div className="App">
      <div className="datos">
        <label>Nombre: <input onChange={(event)=>setNombre(event.target.value)} type="text" /></label>
        <label>Nacimiento <input onChange={(event)=>setNacimiento(event.target.value)} type="date" /></label>
        <label>Pais <input onChange={(event)=>setPais(event.target.value)} type="text" /></label>        
        <label>Cargo: <input onChange={(event)=>setCargo(event.target.value)} type="text" /></label>               
        <button onClick={mostrarDatos}>Guardar</button>
      </div>
    </div>
  );
}

export default App;
