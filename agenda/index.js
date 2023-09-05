import  express, { response }  from "express"; 
import { conectar } from "./src/mysql_connect.js";

const app = express()  //  Inicio Express

app.listen('8000', function(){
    console.log('Iniciado el puerto 8000')
})


/*Configuracion*/

app.set ('views', './vistas')
app.set ('view engine', 'pug')

// configuracion de archivos estaticos

app.use(express.static('./vistas'))
app.use(express.static('./src'))
app.use(express.static('./css'))
 



app.get('/', function(req, res){
   // res.send('aplicacion iniciada todo va bien')
   res.render('index', {titulo:'Aplicacion de Contactos', datos:"Esto es lo que habria en el parrafo"})
})

app.get('/agregar/:nombre/:numero', function(reg, res){
    let nombre = req.params.nombre
    let numero = req.params.numero
    console.log(nombre, numero)

})

