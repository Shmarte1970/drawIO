"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.updatetUsuario = exports.postUsuario = exports.deleteUsuario = exports.getUsuario = exports.getUsuarios = void 0;
const getUsuarios = (req, res) => {
    res.json({
        msg: 'get Usuarios'
    });
};
exports.getUsuarios = getUsuarios;
const getUsuario = (req, res) => {
    const { id } = req.params;
    res.json({
        msg: 'get Usuario',
        id
    });
};
exports.getUsuario = getUsuario;
const deleteUsuario = (req, res) => {
    const { id } = req.params;
    res.json({
        msg: 'Borrado Usuario',
        id
    });
};
exports.deleteUsuario = deleteUsuario;
const postUsuario = (req, res) => {
    const { body } = req;
    console.log(body);
    res.json({
        msg: 'Post Usuario',
        body
    });
};
exports.postUsuario = postUsuario;
const updatetUsuario = (req, res) => {
    const { id } = req.params;
    const { body } = req;
    res.json({
        msg: 'Update Usuario',
        id,
        body
    });
};
exports.updatetUsuario = updatetUsuario;
