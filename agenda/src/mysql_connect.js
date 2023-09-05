import mysql from 'mysql'

// Creacion de la conexion

const conector = mysql.createConnection(
    {
        host: 'localhost',
        user: 'root',
        password: '',
        database: 'tester'
})

const conectar = () => {
    conector.connect(err => {
        if(err) throw err
        console.log('Conectado')
    })
}

export {conectar}