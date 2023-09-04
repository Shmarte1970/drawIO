const express = require('express');
const app = express()
const port = 3006
const mysql = require("mysql");

const db =mysql.createConnection({
    host:"ddbbcrud.c00tjquuyvht.eu-north-1.rds.amazonaws.com",
    user:"root",
    password:"root2023",
    database:"userCrud",
});

app.post("/create",(req, res)=>{
    const nombre = req.body.nombre;
    const nacimiento = req.body.nacimiento;
    const pais = req.body.pais;
    const cargo = req.body.cargo;

    db.query('INSERT INTO userCrud (nombre, nacimiento, pais, cargo) VALUES (?,?,?,?)',[nombre, nacimiento,pais,cargo],
    (err,result)=>{
        if(err){
            console.log(err);
        }else{
            res.send("Datos guardatos");
        }
    }
    );
});


app.listen(port, () => console.log(`Corriendo servidor en el puerto ${port}!`))