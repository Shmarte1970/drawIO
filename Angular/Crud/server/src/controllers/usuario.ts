import {Request, Response} from 'express';

export const getUsuarios = (req: Request, res: Response) => {

    res.json({
        msg: 'get Usuarios'
    })

}

export const getUsuario = (req: Request, res: Response) => {

    const {id} = req.params;

    res.json({
        msg: 'get Usuario',
        id
    })
 
}

export const deleteUsuario = (req: Request, res: Response) => {

    const {id} = req.params;

    res.json({
        msg: 'Borrado Usuario',
        id
    })
 
}

export const postUsuario = (req: Request, res: Response) => {

    const { body } = req;   
    console.log(body)

    res.json({
        msg: 'Post Usuario',   
        body
    })
 
}

export const updatetUsuario = (req: Request, res: Response) => {

    const {id} = req.params;
    const { body } = req;

    res.json({
        msg: 'Update Usuario',
        id,
        body
    })
 
}